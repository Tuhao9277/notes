# 算数操作符
+ 、 - 、 * 、 / 、%

隐式类型转换
如计算
var a = 10,b="8";
console.log(a+b) ,返回18 


#赋值操作符
简单 ：= 
复合 ：+=  *=  /=  %= 
str = "hello"
str +="world"

#比较操作符
`== 之比较值是否相等 
=== 比较值和数据类型是否想到
!=  1 反之
!== 2 反之
` 
均返回Boolean型

#三元操作符
condition？result_1:result_2
代替if

#逻辑操作符
##逻辑与 && 
    condition && condition
1.只要有一个条件不成立，返回false
2.若有一个操作数不是布尔值的情况，逻辑与的操作就不一定返回值
此时遵循下列规则：
    如果第一个操作数隐式类型转换后为true，则返回最后一个操作数
    如果第一个转换后为false，则返回第一个操作数
    如果有一个操作数为null，NaN，undefined ,则返回该操作数。
var str = "welcome",
    num3 = 30,
    bool = true,
    n = null，
    m;
    
console.log(str && num3);   //str转为布尔型为true,返回30
console.log(80 && 55);      //返回55;
console.log("hello"  && 65 && "abc") // 返回abc
console.log(0 && 99)   //返回0
console.log("" && 304) //返回空
console.log(n && num3) //返回null
console.log(55 && true && 33 *"abc");   //返回NaN
console.log(m && true); //undefined

##逻辑或 ||
   condition && condition
1.只要有一个条件成立，返回true
2.若有一个操作数不是布尔值的情况，逻辑与的操作就不一定返回值
此时遵循下列规则：
    如果第一个操作数隐式类型转换后为true，则返回一个操作数
    如果第一个操作数隐式类型转换后为false，则返回第二个操作数，若第二个仍为false，存在第三个操作数，则返回第三个 
    (null || null)返回null ，两个NaN,两个undefined同
    
    console.log("hello" || 0) //hello
    console.log(99 || 0) //99
    console.log(0 || 93 || 23) //93
    console.log("" || 0 || abc) //abc
    console.log（”“ || 0 || null) //null
     console.log(null || null) //null。NaN，undefined 同 null的情况
