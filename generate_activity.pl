# 
# 根据布局文件生成XXActivity.java
# 自动将所有带@+id的控件初始化
#

$activity_ext = "Activity";
$file_ext = ".java";
$template_filename = "activity_template.java";

#Activity名称
print "输入Activity名称：";
$activity_name = <STDIN>;
chomp($activity_name);
print "输入package名称：";
$package_name = <STDIN>;
chomp($package_name);
print "输入布局文件名称：";
$layout_name = <STDIN>;
chomp($layout_name);
$layout_filename = $layout_name.".xml";

#打开文件
$filename = $activity_name.$activity_ext.$file_ext;
open(FILE,">",$filename) or die "open file $filename failed,$!\n";

#存储输出字符串的信息
my $template_content;

open (TEMPLATE,"<",$template_filename ) or die "open file $template_filename failed,$!\n";
{
    local $/=undef;
    $template_content = <TEMPLATE>;
    close TEMPLATE;
}

#读取layout文件，识别出@+id的控件名称
my @control_name_arr;
my $layout_content;
open (LAYOUT,"<",$layout_filename ) or die "open file $layout_filename failed,$!\n";
{
    local $/=undef;
    $layout_content = <LAYOUT>;
    close LAYOUT;
}

#匹配控件类型和id
my (@control_type_arr,@name_id_arr);
while( $layout_content =~ /<(\w+)\s+android:id="@\+id\/(\w+)"/isg )
{
    #print $2,"\n";
    if($1 ne "include"){
        push @control_type_arr, $1;
        push @name_id_arr, $2;
    }
}

#点击按钮的字符串
$click_string = '.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //TODO 按钮点击处理
                
            }
        });';

#初始化控件
my $control_init_string;
my $control_define_string;
for($i=0;$i<@control_type_arr;$i++){
    $control_define_string .= (" " x 4).$control_type_arr[$i]." ".$name_id_arr[$i].";\n";
    $control_init_string .= (" " x 8).$name_id_arr[$i]." = (".$control_type_arr[$i].") findViewById(R.id.".$name_id_arr[$i].");\n";
    if($control_type_arr[$i] eq "Spinner"){
        $control_init_string .= (" " x 8).$name_id_arr[$i].$click_string."\n";
    }
}
#image = (ImageView) findViewById(R.id.image);

$template_content =~ s/\#PACKAGE_NAME\#/$package_name/;
$template_content =~ s/\#ACTIVITY_NAME\#/$activity_name$activity_ext/;
$template_content =~ s/\#LAYOUT_NAME\#/$layout_name/;
$template_content =~ s/\#DEFINE_AREA\#/$control_define_string/;
$template_content =~ s/\#INIT_AREA\#/$control_init_string/;

print FILE $template_content;
print "\n--------- 成功生成$filename -----------\n\n";

close TEMPLATE;
close LAYOUT;
close FILE;







