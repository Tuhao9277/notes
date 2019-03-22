# XSS
Cross Site Scripting
跨站脚本攻击
自己的网站上的逻辑都来自本站
若运行了其他网站的东西，则出现跨站脚本攻击

http://localhost:1521/?from=聊城
http://localhost:1521/?from=<script>alert("a")</script>聊城
访问该地址会出现弹窗

通常使用alert测试能否进行XSS
##攻击原理
程序+数据=结果
当数据中包含程序时，原有的程序逻辑将被改变
源程序
<div>#{content}</div>
数据
content :Hello World
结果：
<div>Hello World</div>
若数据
content :<script>alert("a")</script>
则数据变为了程序

##XSS攻击可以做到什么
* 获取页面数据
* 获取cookies ,通过 document.getCookie
* 劫持前端逻辑，导致页面混乱。
* 发送请求。可以通过form img 将数据发送到攻击者服务器
* 偷取用户资料
* 偷取密码和登录态
* 欺骗用户

案例
在搜索框中添加script代码段，就可以执行
url中也可以执行。获取用户信息，登录态
某商城编辑个人信息
提交的数据也可以嵌入脚本，得到cookie，盗取后台地址，进入后台。

#防御方法
##在html节点内容
防止页面中嵌入html标签，script标签，
1.对内容进行转义，使用转义字符
*     在用户发表时，进入数据库之前进行转义
*     在显示的时候就进行转义
方法：替换尖括号,将输入进的标签转义成普通文本

```JavaScript
对内容标签转义
var escapeHtml = function(str){
	str = str.replace(/</g,'&lt;'); // 替换小于号
	str = str.replace(/>/g,'&gt;'); //替换大于号
	return str;
};
对属性转义
var escapeHtmlProperty=function(str){
	if(!str) return '';
	str = str.replace(/"/g,'&quto;'); //转义双引号
	str = str.replace(/'/g,'&#39;');  //转义单引号
	str = str.replace(/ /g,'&#32;');  //转义空格
};
对空格转义会出现显示问题

对Js进行转义
添加JSON.stringify
fromForJS:JSON.stringify(ctx.query.from),
```

#XSS攻击分类
（危害性小）反射型：url参数直接注入，攻击者通过url带过一段代码，页面直接显示这段代码
（危害性大）存储型：存储到DB后读取，会被保存到数据中，访问到这条记录的时候，代码会显示到页面上。

