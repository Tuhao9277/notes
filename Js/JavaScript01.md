# JavaScript基本数据类型
简单数据类型：Undefined 、Null、Boolean、Number、String
复杂数据类型：Object
##typeof操作符
功能：检验变量类型
语法： typeof(变量)
返回值 undefined boolean、number、string 、object 、function
如：
var name = "marry"
typeof(name);
typeof name;

##undefined
一般不显式设置一个变量为undefined
如var address;   //没有对变量赋值
    typeof(address);//返回值为undefined
    
##null
1.null值表示一个空对象指针
2.如果定义的变量将来用于保存对象，那么最好将改变量初始化为null而不是其他
    var settings = null; 
    var settings = "";
注：undefined值是派生自null值的，所以undefined==null的返回值是true。

##Number 
表示整数和浮点数
var age = 18; //整型
var distance = 18.0214; //浮点型

###NaN
Not a Number    :非数值，是一个特殊的数值
当Number型变量与其他类型的变量运算时会返回NaN
当非数值型变量尝试转换成数值变量时会返回NaN
例：
var age = 18;
Console.log(age-"abc") // 返回NaN
typeof(age-"abc") //返回Number

注：
1.任何涉及NaN的操作（例如NaN/10)都会返回NaN
2.NaN与任何值都不相等,包括NaN本身。

##isNaN()
语法：isNaN(n);
功能：检测n是否为"非数值"
返回值：boolean 
返回 false 即为数值 ;true 非数值

当变量为字符串型的"数值"时，会尝试转换成数值型，接着返回false

#数值转换
三个函数可以将非数值转换为数值
Number();

如
var id= "18"
Number(id);  //返回Number类型
//以下二者专门转换字符串为数值
parseInt(); 
parseFloat();

如
var tops = parseInt("123abc"); 
typeof(tops) 为Number，且Console.log(tops)为123
注：转换的字符串必须以数字开头才能提取，若ParseInt("abc123")则返回NaN
parseInt(待转换的字符串,转换的进制);
如 console.log(parseInt("0xf",16));   //返回15
*16进制数以0x开头，8进制以0开头*

parseFloat 截取字符串第一个带小数点的小数为止
如parseFloat("12.21.32adc") //输出12.21

##String
String 类型用于表示字符串,加上引号
toString()方法，将其他类型转换为字符串
String(变量) //函数
var str = 123;  
var str1 = str.tostring();
var str2  = String(str);
var m;
undefined转字符串，String(m），返回为"undefined"
##Boolean 布尔型
var isStudent = true;
isStudent.toString();
*注：重要！*
强制转换为布尔型，用Boolean(变量);

1.除0以外的所有数字，转换后都为true
2.除空字符串""，其余字符串转换后都为true
3.null,undefined 转换为布尔型为false




