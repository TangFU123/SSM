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
<div class="container w3layouts agileits">

		<div class="login w3layouts agileits">
			<h2>预订</h2>
			<form action="search" method="post">
				<input type="text" Name="startdate" placeholder="开始时间" required="">
				<input type="text" Name="enddate" placeholder="结束时间" required="">
				<div class="send-button w3layouts agileits">
			
					<input type="submit" value="预订">
				
			</div>
			</form>
			
			<div class="clear"></div>
		</div>
		</div>

</body>