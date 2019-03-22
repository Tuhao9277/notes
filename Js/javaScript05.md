# Math对象
Math.ceil(); 向上取整
    floor   向下取整
    round   四舍五入
    abs 返回绝对值
Math.random();  //生成0~1  浮点数

```JavaScript
<p>生成随机数</p>
	<script>
		function getRandom(n,m) {
			var choise = m-n+1;
			return  Math.floor(Math.random()*choise+n);
		}
		var num1 = getRandom(0,100);
		document.write(num1);
```


```JavaScript
<p>输出n天后的今天是星期几</p>
	<script>
		var weeks = ["1","2","3","4","5","6","7"];
		var date = new Date(),
			year = date.getFullYear(),
			month = date.getMonth(),
			today = date.getDate();
			//time = "year:"+year+"month:"+month+"day:"+day+"week:"+week;
		//document.write(time);
		//第一种做法
		//date.setDate(date.getDate()+100);
		//document.write(date.getDay());
		//第二种做法
		var temp = new Date(year,month,today+1);
		document.write(temp.getFullYear()+"-"+(temp.getMonth()+1)+"-"+temp.getDate()+"-"+weeks[temp.getDay()-1]);
	</script>
```
