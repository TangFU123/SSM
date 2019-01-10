<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>

<button class="btn btn-danger">枪炮与玫瑰</button>

<img alt="dimebag" src="static/img/dimebag.jpg" class="img-rounded" style="width:150px;height:150px">

<table class="table table-hover">
<tr>
<td>编号</td>
<td>姓名</td>
<td>密码</td>
</tr>
<tr>
<td>1</td>
<td>aaa</td>
<td>111</td>
</tr>
<tr>
<td>1</td>
<td>aaa</td>
<td>111</td>
</tr>
<tr>
<td>1</td>
<td>aaa</td>
<td>111</td>
</tr>
<tr>
<td>1</td>
<td>aaa</td>
<td>111</td>
</tr>
<tr>
<td>1</td>
<td>aaa</td>
<td>111</td>
</tr>
</table>


<form action="register" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">账号</label>
    <input name="name" class="form-control"  placeholder="请输入账号" >
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input name="password" type="password" class="form-control"  placeholder="请输入密码">
  </div>

  <button type="submit" class="btn btn-default">注册</button>
</form>

</body>
</html>
