# Js函数
##arguments

参数在一个函数的内部用一个数组来表示，函数体内通过arguments对象来访问这个数组参数。
说明:
1.arguments对象只是与数组类似，不是Array的实例
2.argument[index]访问指定参数
    
```JavaScript
function add(){     //可以不在括号内接收
			console.log(arguments[0]);
			document.write(arguments.length);
		}
		add(1,2,3);
```
```JavaScript
function add(num1,num2){     
			arguments[0] = 99;
			document.write(num1);    //第一个参数被赋值为99，故此时打印99
		}
		add(1,3);
```
arguments的作用：参数不固定时求解方便
例：求任意个数的数的平均值

```JavaScript
		function getAvg(num1,num2){
			var sum=0,
				len = arguments.length;
			for (var i = 0; i < len; i++) 
				sum+=arguments[i];
			document.write(sum);
			return sum/len;
		}
		var avg = getAvg(5,6,9,8,7);
		document.write("avg:"+avg);

```

##创建数组

1.使用Array构造函数
    new Array();
    var arr = new Array(1,2,3,4,5);
     console打印arr，返回[1.2.3.4.5]
2.直接赋值
    var arr2 = ["a","b","c"];
    console打印arr2，返回["a","b","c"];
    
###注：数组中的元素没有类型限制
一个数组可以混合各种类型的元素
越界的值为undefined

##数组创建方法
##栈方法
###push() 往数组后添加值
arrayObject.push("","");
返回值为添加后数组总长度
###unshift() 往数组前面添加值
arrayObject.unshift(99,66);
返回值为添加后数组总长度
###pop() 删除数组最后一个元素
arrayObject.pop();
###shift()  删除数组第一个值
*二者均返回删除的元素*
arrayObject.shift();
##转换方法
###join()
*将目标数组转换成字符串*
var arrayObject = [2,4,5];
arrayObject.join();
输出 2，4，5
arrayObject.join("-");
join中可以添加参数作为数组之间的连接符，不填默认逗号
###reverse()
*逆序数组*
###sort()
*排序*
排序前，已把数组元素转为字符串，根据首字母或首数字进行排序
可以接收一个比较函数的参数
arr.sort(function(a,b){return a<b})  //降序排列
arr.sort(function(a,b){return a>b})  //升序排列
###concat
*归并多个数组*
arr3 = arr1.concat(arr2,[],,...);
###slice
*截取数组元素*
arrayObject.slice(start,end)
start必需，若-1则用数组长度加上这个数
end不设的话，从start到最后
截取数组前闭后开，即arr[start,end)， //start！end-1


例题：实现数组b对数组a的拷贝
var a = [1,2,3],
    b;

b = new Array[];
for(var i = 0 ; i < a.length ; i++){
    b.push(a[i]]);  //方法1
}

方法2， 使用contat方法
b = [].contat(a);
方法3，使用slice();
b = a.slice(0);

##splice
start必需
###删除操作 
arrayObject.splice(start,count) 
省略count将删除从start开始的所有值
###插入操作
arrayObject.splice(start,0,value1,value2);
返回值为空
###替换操作
arrayObject.splice(start,count,value1,value2,...);

##indexOf(searhValue,startIndex);
功能:检测某个数在数组中的位置，没有返回-1，startIndex缺省，从头开始。若有重复元素，则只取第一次出现的位置。
##lastIndexOf(),
从末尾开始查找

封装一个方法实现indexOf的功能：
  
```javaScript
function searchIndexOf(arr,value){
    	for (var i = 0; i < arr.length; i++) {
    		if(arr[i] === value){
    			return i;
    		}
    		
    	}
    	return -1;
    }
    var index = searchIndexOf(nums,1);
    document.write(index);
```

