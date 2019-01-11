<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- Head -->
<head>

<title>登录注册表单</title>

<!-- Meta-Tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- //Meta-Tags -->

<!-- Style -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">

<!--  导入js-->
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- 写jq函数 -->
<script type="text/javascript">
	
	//注册
	function check(){
		var account=document.register.account.value;
		var password=document.register.password.value;
		var number=document.register.number.value;		
		var customer = { 
    			account : account,
		        password:password,
				number:number
			};
		$.ajax({
			//设置发送地址
			url:"http://localhost:8080/ssm_206_01/register",
			//设置发送方式
			type:"post",
			 //设置接收格式为JSON
            dataType:"json",
            //编码设置
            contentType:"application/json;charset=utf-8",
            //向后台发送的数据
            data:JSON.stringify(customer),
			success:function(data){
				//json转string
				var jsonStr = JSON.stringify(data);
				//string转json
				var json = eval("("+jsonStr+")");
				
				if(json.result=="0"){
					document.getElementById("rgsmsg").innerHTML="用户名已存在!";
					
				}
				else if(json.result=="1"){
					document.getElementById("rgsmsg").innerHTML="联系电话已存在!";
					
				}
				else{
					document.getElementById("rgsmsg").innerHTML="注册成功!";
				}				
			},
			error:function(){				
			}			
		});
		return false;
	}
	
	//登录
	function log(){
		
		var account=document.login.account.value;
		var password=document.login.password.value;
			
		var customer = { 
    			account : account,
		        password:password,
			};
		
		$.ajax({
			//设置发送地址
			url:"http://localhost:8080/ssm_206_01/login",
			//设置发送方式
			type:"post",
			 //设置接收格式为JSON
            dataType:"json",
            //编码设置
            contentType:"application/json;charset=utf-8",
            //向后台发送的数据
            data:JSON.stringify(customer),
			success:function(data){
				//json转string
				var jsonStr = JSON.stringify(data);
				//string转json
				var json = eval("("+jsonStr+")");
				
				if(json.result=="1"){				
					document.getElementById("logmsg").innerHTML="登录失败，用户名或密码错误!";				
				}
				else{				
					//成功时弹出提示框
					alert(jsonStr);
					alert("登录成功");
					/* 创建一个form表单 添加用户信息到相应input并提交 */
					var form = document.createElement('form');
					    form.action = 'index.jsp';
					    form.method = 'post';  
						var input = document.createElement('input');
					    input.type = 'hidden';
					    input.name = "account";
					    input.value = json.account;
					    form.appendChild(input);  
					    input = document.createElement('input');
					    input.type = 'hidden';
					    input.name = "uid";
					    input.value = json.id;
					    form.appendChild(input);  	   	
					    $(document.body).append(form);
					    form.submit();
					

				}				
			},
			error:function(){				
			}			
		});
		return false;
	}
	
</script>

</head>
<!-- //Head -->

<!-- Body -->
<body>

	<h1>登录注册表单</h1>

	<div class="container w3layouts agileits">

		<div class="login w3layouts agileits">
			<h2>登 录</h2>
			<form name="login" method="post" onsubmit="return log()">
				<input type="text" Name="account" placeholder="用户名" required="">
				<input type="password" Name="password" placeholder="密码" required="">
				<div class="send-button w3layouts agileits">

					<input type="submit"  value="登 录">

			</div>
			</form>
			<p id="logmsg"style="color:#CCC"></p>
			<div class="clear"></div>
			
		</div>
		<div class="register w3layouts agileits">
		
		
			<h2>注 册</h2>
			<form name="register" method="post" onsubmit="return check()">
				<input type="text" Name="account" placeholder="用户名" required="">

				<input type="password" Name="password" placeholder="密码" required="">
				<input type="text" Name="number" placeholder="手机号码"
					required="">
			<div class="send-button w3layouts agileits">
			
					<input type="submit" value="免费注册">
				
			</div>
			</form>
			
			<div class="clear"></div>
			<p id="rgsmsg"></p>
		</div>

		<div class="clear"></div>

	</div>

</body>
<!-- //Body -->

</html>