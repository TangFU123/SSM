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

</head>
<!-- //Head -->

<!-- Body -->
<body>

	<h1>登录注册表单</h1>

	<div class="container w3layouts agileits">

		<div class="login w3layouts agileits">
			<h2>登 录</h2>
			<form action="login" method="post">
				<input type="text" Name="account" placeholder="用户名" required="">
				<input type="password" Name="Password" placeholder="密码" required="">
				<div class="send-button w3layouts agileits">

					<a href="login"><input type="submit"  value="登 录"></a>

			</div>
			</form>
			
			<div class="clear"></div>
		</div>
		<div class="register w3layouts agileits">
		
		
			<h2>注 册</h2>
			<form action="register" method="post">
				<input type="text" Name="account" placeholder="用户名" required="">

				<input type="password" Name="password" placeholder="密码" required="">
				<input type="text" Name="number" placeholder="手机号码"
					required="">
			<div class="send-button w3layouts agileits">
			
					<input type="submit" value="免费注册">
				
			</div>
			</form>
			
			<div class="clear"></div>
		</div>

		<div class="clear"></div>

	</div>

</body>
<!-- //Body -->

</html>