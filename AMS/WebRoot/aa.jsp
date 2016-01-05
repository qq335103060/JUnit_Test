<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>AMS申请单管理系统</title>
    
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
<s:if test="%{apply.appdesc==null}"> 
<td colspan="3">无</td>
</s:if>
<s:else>
<td  colspan="3">${apply.appdesc }</td>
</s:else>
</tr>
</table>			
</body>
</html>
