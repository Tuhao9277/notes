# 字符串方法
##charAt();
stringObject.charAt(index);
返回stringObject中索引的值，越界返回空
###charCodeAt();
返回字符串编码
###indexOf
搜索一个字符串中的子字符串，返回子字符串位置
如果不存在，返回-1
###lastIndexOf();
从后往前搜索
##字符串截取
slice(start,end);
参数若为负值， 则参数值与字符串长度相加。
substrig();
两个参数若为负值，自动将其转化为0；

方法会将较小位置作为截取的开始位置。

substr(start,count);

##split 字符串拆分
var str = "welcome-to-here";
var arr = str.split('-');
拆分后存入数组,参数为拆分的标志。
##replace()
stringObject.replace(目标,替换后);
替换目标字符串中的指定内容
返回修改后的内容，不修改原字符串的内容
##toUpperCase   
转为大写
##toLowerCase
转为小写


```JavaScript
<p>将一个字符串修改为驼峰命名</p>
	<script>
		function camelBack(arr) {
			var str = arr.split("-"),	//将传入的字符串拆分成数组
				newStr = str[0];		//保存修改后数组首元素（字符串）
			for (var i = 1; i < str.length; i++) {

				newStr += str[i].charAt(0).toUpperCase() + str[i].substr(1);
				//连接上所有元素，
				//修改从第二个字符串开始的首字母为大写，修改后仅保留首字母
				//首字母加上剩余字符串
			}
			return newStr;
		}
		var afterCamel = camelBack("get-element-id");
		document.write(afterCamel);
	</script>
```