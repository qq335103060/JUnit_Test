<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fenpei.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
table{
	width: 100%;
	border: 1px #8AC2FF solid;
	background-color:FFFFFF;
	margin-left: 2px;
	margin-right: 1px;
	margin-top: 1px;
	
}
table tr th{
	border: 1px #8AC2FF solid;
	font-size: 18;
}

table tr td{
	border: 1px #8AC2FF solid;
	text-align: center;
}

</style>
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jBox-1.0.0.0.js" type="text/javascript"></script>
<SCRIPT type="text/javascript" src="js/jquery-1.8.3.js"></SCRIPT>
<SCRIPT type="text/javascript">
$(function(){
	$("#btn").live("click",function(){
	var appid = $("#apphiddenid").val();
	var chuli = $("#chuli").val();
			$.ajax({ 
					dataType : "json",
					type : "POST",
					url: "app!findAllot.action", 
					data:{"apply.appid":appid,"apply.userinfoByDealby.userid":chuli,"apply.dictinfo.dictid":5},
					success: function(data){
						alert("分配成功！");
						window.parent.window.jBox.close(); 
						}
					});
		});
});
</SCRIPT>
  </head>
  
  <body>
  <table align="left" border="1px" >
<tr>
<td bgcolor="#FFF00">申请单编号: </td>
<td>${apply.appid}</td>
<td bgcolor="#FFF00">申请单标题:</td>
<td>${apply.apptitle }</td>
</tr><tr>
<td bgcolor="#FFF00">申请部门:</td>
<td>${apply.userinfoByUserid.deptinfo.deptname }</td>
<td bgcolor="#FFF00">申请单类型:</td>
<td>${apply.allpkinfo.typeinfo.typename }</td>
</tr><tr>
<td bgcolor="#FFF00">申请单状态:</td>
<td>${apply.dictinfo.dictitem}</td>
<td bgcolor="#FFF00">申请原因:</td>
<td>${apply.appreason}</td>
</tr>
<tr>
<td bgcolor="#FFF00">申请人:</td>
<td>${apply.userinfoByUserid.username}</td>
<td bgcolor="#FFF00">申请时间:</td>
<td>${apply.appdate}</td>
</tr><tr>
<td  bgcolor="#FFF00">备注:</td>
<td colspan="3">
<s:select list="userlist" listKey="userid" listValue="username" theme="simple" id="chuli">

</s:select>
						<input type='submit' id='btn' value='分配'>
						<input type='hidden' id='apphiddenid' value="${apply.appid }" >
						</td>
</tr>
</table>			
    
  </body>
</html>
