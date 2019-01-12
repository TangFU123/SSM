<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>

<!--  导入js-->
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- 写jq函数 -->
<script type="text/javascript">
	function check(){		
		alert(111);
		var key={
				type:"senior"
		};
		$.ajax({
			//设置发送地址
			url:"http://localhost:8080/ssm_206_01/searchRoom",
			//设置发送方式
			type:"post",
			 //设置接收格式为JSON
            dataType:"json",
            //编码设置
            contentType:"application/json;charset=utf-8",
            //向后台发送的数据
            data: JSON.stringify(key),
			success:function(data){
				//json转string
				var jsonStr = JSON.stringify(data);
				//string转json
				alert(jsonStr);				
			},
			error:function(){				
			}
		});			
	}
</script>
</head>
<body>
<input type="button" onclick="check()"value="111">
</body>
</html>