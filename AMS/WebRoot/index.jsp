<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>申请单管理系统 by www.865171.cn</title>
<style type="text/css">
* { 
	margin:0px; 
	padding:0px;
}
INPUT,SELECT
{
	border: 1px solid #999999;
	font-size: 12px;
	color: #002d71;
}
html, body{	
	height:100%;
	overflow: hidden;

}
html>body{		/*-- for !IE6.0 --*/
	width: auto;
	height: auto;
	position: absolute;
	top: 0px;
	left: 0px;
	right: 0px;
	bottom: 0px;
	
}
body {
	border:8px solid #ffffff;
	background-color: #ffffff;min-width:230px;
}
#mainDiv {
	width: 100%;
	height: 100%;
    padding:60px 0px 25px 0px;;
	
	
}
#centerDiv{
	width: 100%;
	height: 100%;
	background-color:#00CCFF;
	padding-left:158px;
}
#mainDiv>#centerDiv{		/*-- for !IE6.0 --*/	
	width: auto;
	height: auto;
	position: absolute;
	top: 56px;
	left: 0px;
	right: 0px;
	bottom: 20px;
	
}
#left{
width:158px;
height:100%;
background:url(images/slide.jpg) repeat-y;
position:absolute;
left:0px;
}
#lhead{
background:url(images/left-head.jpg) left top no-repeat;
height:25px;
	font-size:14px;
	color:#FF9933;
    text-align:center;
	line-height:25px;
}
#right{
width:100%;
height:100%;
background:#ffffff;
position:absolute;
overflow-y:auto;
border:1px #003366 solid;
padding:20px 0 0 10px;
font-size:12px;
font-family:"宋体";
}
#centerDiv>#right{
width:auto;
height:auto;
position:absolute;
top:0px;
right:0px;
left:158px;
bottom:0px;
}
#topDiv{
	width:100%;
	height:56px;

	background:url(images/head-bg.jpg) repeat-x;
	position:absolute;
	top:0px;
	overflow:hidden;
}
#topDiv ul{
list-style:none;
font-size:12px;

width:100%;
margin:0;
padding:0;
}
#topDiv ul li{
float:left;
width:15%
}
#topDiv ul li a {
display:block;
width:100%;
height:25px;
line-height:25px;
background:url(images/menu-bg.jpg) repeat-x;
color:#FFFFFF;
direction:none;
text-align:center;
border-bottom:1px #000066 solid;
border:1px #06597D solid;
text-decoration: none;
}
#topDiv ul li a:hover{
background:url(images/menu-bg.jpg) 0px 25px;
color:8,81,124;
direction:none;
text-align:center;
border-bottom:1px 8,81,124 solid;
}
#tmenu{
width:100%;
position:absolute;
left:12%;
bottom:0;
padding-left:15%;
margin-left:-15%;
}
#current{
background:#ccc;
height:25px;
line-height:25px;
margin:-20px 0 0 -10;
overflow:hidden;
}
#bottomDiv{
	width:100%;
	height:20px;
	background:url(images/bottom.jpg) repeat-x;
	position:absolute;
	bottom:0px;
	bottom:-1px;		 /*-- for IE6.0 --*/
}
#left ul{
list-style:none;
font-size:12px;
margin:50px 0 0 8px;
margin-top: 20px;
}
#left ul li a{
display:block;
width:140px;
height:25px;
line-height:25px;
background:url(images/menu-bg.jpg) repeat-x;
color:#FFFFFF;
direction:none;
text-align:center;
border-bottom:1px #000066 solid;
border:1px #06597D solid;
text-decoration: none;
}
#left ul li a:hover{

background:url(images/menu-bg.jpg) 0px 25px;
color:8,81,124;
direction:none;
text-align:center;
border-bottom:1px 8,81,124 solid;
}
#form{
width:80%;
height:99%;
margin:0 auto;
_margin-left:20%;

}
fieldset{
width:100%;
margin:20 auto;
line-height:35px;
padding-left:20PX;
}
#h2{
	color: red;
	margin-left: 40%;
	margin-right: 40%;
	margin-top: 50px;
	size: 20px;

}
a{
text-decoration: none;
}
#myemps{
	border: 1px solid ;
}
#myemps2{
    margin-left:50px;
    margin-right:50px;
	background-color: #C4EEFE;
	border: 1px solid ;
}

#rightMain table{
width: 80%;
border: 1px #8AC2FF solid;
}

#showAll{
  margin-left:-6px;
}
#showAll table{
	width: 80%;
	border: 1px #8AC2FF solid;
	background-color:FFFFFF;
	margin-left: 3px;
	margin-right: 10%;
	margin-top: 1%;
	
}
#showAll table tr th{
	border: 1px #8AC2FF solid;
	font-size: 18;
}

#showAll table tr td{
	border: 1px #8AC2FF solid;
	text-align: center;
}
.trbgcolor{
background-color:#C4EEFE;
}
#wushuju{
margin-top: 30px;

}



.awokeWord{
	color: red;
}
#page{
margin-left: 830px;
size: 15px;
}
</style>
<style type="text/css" media="all">
@import "js/jBox.css";
</style>
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jBox-1.0.0.0.js" type="text/javascript"></script>
<script type="text/javascript" src="myDate/WdatePicker.js"></script>

<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#myApps>tr").live("mouseover",function(){
				$(this).addClass("trbgcolor");
			
			});
			$("#myApps>tr").live("mouseout",function(){
				$(this).removeClass("trbgcolor");
			});
		});
		
	</script>
		
	
	<script type="text/javascript">
	$(function(){
	//审批管理
		$("#ma").click(function(){
		$("#page").html("");
			var a = ${user.isdirector};
		
			if(a==0){
					$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();	
				$("#rightMain").html("");
				$("#rightMain").append("<img src='images/100.jpg' /><h2 id='h2'>抱歉，您没有此权限!</h2>");
				
			}
			else{
			var b = ${user.deptinfo.deptid};
			$.ajax({ 
					dataType : "json",
					type : "POST",
					url: "app!findApplyrove.action", 
					data:{"apply.dictinfo.dictid":1,"apply.userinfoByUserid.deptinfo.deptid":b},
					success: function(data){
					$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();
					$("#rightMain").html("");
					if(data.applist.length!=0){
					var tableElement = $("<table align='center' ><thead id='myemps2'><th>序号</th><th>编号</th><th>类别</th><th>申请标题</th><th>申请部门</th><th>申请时间</th><th>状态</th><th>管理</th></thead></table>");
					var tableBody = $("<tbody id='myemps'></tbody>");
					$.each(data.applist,function(i,app){
						var trElement = $("<tr></tr>");
						trElement.append("<td>" + (i+1) +"</td>")
						.append("<td>" + app.appid +"</td>")
						.append("<td>"+app.allpkinfo.typeinfo.typename+"</td>")
						.append("<td>" + app.apptitle +"</td>")
						.append("<td>"+app.userinfoByUserid.deptinfo.deptname+"</td>")
						.append("<td>" + app.appdate+"</td>")
						.append("<td>"+app.dictinfo.dictitem+"</td>")
						.append("<td><a><img src='images/icon/edit2.png' alt='审批' /></a> </td>");
						tableBody.append(trElement);
					}); 
					tableElement.append(tableBody);
					
					$("#rightMain").append(tableElement);
					}else{
						$("#rightMain").append("<div id='wushuju' align='center'><img src='images/6.jpg' /></div>");
					}
		 		}
			});
				}
		});
		

});
//分配
$(function distri(){

	$("#fenpei").click(function(){
	$("#page").html("");
			var a = ${user.isallotman};
			if(a==0){
					$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();
				$("#rightMain").html("");
				$("#rightMain").append("<h2 id='h2'>抱歉，您没有此权限!</h2>");
				}
			else{
			var b = ${user.userid};
		
			$.ajax({ 
					dataType : "json",
					type : "POST",
					url: "app!findApplyFenpei.action", 
					data:{"apply.dictinfo.dictid":4,"apply.userinfoByUserid.userid":b},
					success: function(data){
					$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();
					$("#rightMain").html("");
					if(data.applist.length!=0){
					var tableElement = $("<table align='center' width='800px' ><thead id='myemps2'><th>序号</th><th>编号</th><th>类别</th><th>申请标题</th><th>申请部门</th><th>申请时间</th><th>状态</th><th>管理</th></thead></table>");
					var tableBody = $("<tbody id='myemps1'></tbody>");
					$.each(data.applist,function(i,app){
						
						var trElement = $("<tr></tr>");
						trElement.append("<td>" + (i+1) +"</td>")
						.append("<td>" + app.appid +"</td>")
						.append("<td>"+app.allpkinfo.typeinfo.typename+"</td>")
						.append("<td>" + app.apptitle +"</td>")
						.append("<td>"+app.userinfoByUserid.deptinfo.deptname+"</td>")
						.append("<td>" + app.appdate +"</td>")
						.append("<td>"+app.dictinfo.dictitem+"</td>")
						.append("<td><a><img src='images/icon/edit.png' alt='分配' /></a> </td>");
						tableBody.append(trElement);
					}); 
					tableElement.append(tableBody);
					
					$("#rightMain").append(tableElement);
					}else{
					$("#rightMain").append("<div id='wushuju' align='center'><img src='images/6.jpg' /></div>");
					}
		 		}
			});
				}
		});

	

});
	//审批
$(function(){
		$('#myemps tr td a').live("click",function(){
		$("#page").html("");
		//获得当前行的用户Id
		var appId=$(this).parent().parent().find("td").eq(1).text();
		jBox.open("iframe-jBoxID","iframe","<%=path %>/findapp!findApplyById.action?apply.appid="+appId,"审批申请单","width=500,height=300,center=true,minimizable=true,resize=true,draggable=true,model=true,scrolling=true");
		/*$.ajax({ 
					dataType : "json",
					type : "POST",
					url: "app!findApplyById.action", 
					data:{"apply.appid":appId},
					success: function(data){
					$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();
						$("#rightMain").html("");
						var tableElement = $("<table align='center' width='800px' ></table>");
						var tableBody = $("<tbody ></tbody>");
						var trElement = $("<tr></tr>");
						
						trElement.append("<td>申请单编号 :</td>")
						.append("<td>"+data.apply.appid+"</td>")
						.append("<td>申请单标题:</td>")
						.append("<td>"+data.apply.apptitle+"</td>")
						.append("<td>申请部门:</td>")
						.append("<td>"+data.apply.userinfoByUserid.deptinfo.deptname+"</td>")
						.append("<td>申请单类型:</td>")
						.append("<td>"+data.apply.allpkinfo.typeinfo.typename+"</td>")
						.append("<td>审批:</td>")
						.append("<td>"+
								" <input type='hidden' id='apphiddenid' value="+data.apply.appid+" >"+
								"<select id='se'>"+
								"<option>--请选择--</option>"+
								"<option value="+4+">审批通过</option>"+
								"<option value="+2+">审批否决</option>"+
								"<option value="+3+">审批驳回</option>"+
						"</select>"+
						"<input type='submit' id='btn' value='审批'>"
								+"</td>");
						tableBody.append(trElement);
						tableElement.append(tableBody);
						$("#rightMain").append(tableElement);
					}
					});*/
		});
		});
//审批
/*$(function(){
	$("#btn").live("click",function(){
	var appid = $("#apphiddenid").val();
	var selId = $("#se").val();
			$.ajax({ 
					dataType : "json",
					type : "POST",
					url: "app!update.action", 
					data:{"apply.appid":appid,"apply.dictinfo.dictid":selId},
					success: function(data){
					alert("成功！");
					$("#ma").click();
					}
				});
	
	});

});*/
		
		
		
		
//分配管理
$(function (){
		$('#myemps1 tr td a').live("click",function(){
		$("#page").html("");
		//获得当前行的用户Id
		var appId=$(this).parent().parent().find("td").eq(1).text();
		jBox.open("iframe-jBoxID","iframe","<%=path %>/userAllot!findAlluser.action?apply.appid="+appId+"&&apply.userinfoByUserid.deptinfo.deptid="+2,"审批申请单","width=500,height=300,center=true,minimizable=true,resize=true,draggable=true,model=true,scrolling=true");
		/*$.ajax({ 
					dataType : "json",
					type : "POST",
					url: "app!findAlluser.action", 
					data:{"apply.appid":appId,"apply.userinfoByUserid.deptinfo.deptid":2},
					success: function(data){
					$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();
						$("#rightMain").html("");
						var tableElement = $("<table align='center' width='800px' ></table>");
						var tableBody = $("<tbody ></tbody>");
						var trElement = $("<tr></tr>");
						trElement.append("<td>申请单编号 :</td>")
						.append("<td>"+data.apply.appid+"</td>")
						.append("<td>申请单标题:</td>")
						.append("<td>"+data.apply.apptitle+"</td>")
						.append("<td>申请部门:</td>")
						.append("<td>"+data.apply.userinfoByUserid.deptinfo.deptname+"</td>")
						.append("<td>申请单类型:</td>")
						.append("<td>"+data.apply.allpkinfo.typeinfo.typename+"</td>")
						.append("<td>分配:</td>");
						
						var s = $("<select id='sel'></select>");
						s.append("<option>---请选择---</option>");
						$.each(data.userlist,function(i,user){
							s.append("<option value='"+user.userid+"'>"+user.username+"</option>");
						});
						
						var ttd = $("<td></td>")
						ttd.append(s);
						trElement.append(ttd);
						trElement.append("<td><input type='button' id='fenpeichuli' value='分配' /></td>");
						tableBody.append(trElement);
						tableElement.append(tableBody);
						$("#rightMain").append(tableElement);
					}
					});*/
		});
		
		});
//分配给处理人
/*$(function(){
	$("#fenpeichuli").live("click",function(){
		var appId=$(this).parent().parent().find("td").eq(1).text();
		var chuli = $(this).parent().parent().find("#sel").val();
		$.ajax({ 
					dataType : "json",
					type : "POST",
					url: "app!findAllot.action", 
					data:{"apply.appid":appId,"apply.userinfoByDealby.userid":chuli,"apply.dictinfo.dictid":5},
					success: function(data){
						alert("分配成功！");
						$("#fenpei").click();
						
						}
					});
	});
});*/
//处理管理  处理申请单中 查询所有
$(function(){
	$("#chuli").click(function(){
	$("#page").html("");
	var deptid = ${user.deptinfo.deptid};
	var userid=${user.userid};
	if(deptid==2){
		$.ajax({ 
			dataType : "json",
			type : "POST",
			url: "app!findAllchuli.action", 
			data:{"apply.userinfoByDealby.userid":userid,"apply.dictinfo.dictid":5},
			success: function(data){
				$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();
				$("#rightMain").html("");
				if(data.applist.length!=0){
					var tableElement = $("<table align='center' width='800px' ><thead id='myemps2'><th>序号</th><th>编号</th><th>类别</th><th>申请标题</th><th>申请部门</th><th>申请时间</th><th>状态</th><th>管理</th></thead></table>");
					var tableBody = $("<tbody id='myemps3'></tbody>");
					$.each(data.applist,function(i,app){
						var trElement = $("<tr></tr>");
						trElement.append("<td>" + (i+1) +"</td>")
						.append("<td>" + app.appid +"</td>")
						.append("<td>"+app.allpkinfo.typeinfo.typename+"</td>")
						.append("<td>" + app.apptitle +"</td>")
						.append("<td>"+app.userinfoByUserid.deptinfo.deptname+"</td>")
						.append("<td>" + app.appdate +"</td>")
						.append("<td>"+app.dictinfo.dictitem+"</td>")
						.append("<td><a><img src='images/chuli.GIF' alt='处理' /></a> </td>");
						tableBody.append(trElement);
					}); 
					tableElement.append(tableBody);
					
					$("#rightMain").append(tableElement);	
					}else{
				$("#rightMain").append("<div id='wushuju' align='center'><img src='images/6.jpg' /></div>");
					}
			}
			});
		
		}
	else{
					$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();
		$("#rightMain").html("");
		$("#rightMain").append("<h2 id='h2'>抱歉，您没有此权限！</h2>");
		}
	});
});
//处理人  进行处理 前的查询
$(function(){
		$('#myemps3 tr td a').live("click",function(){
		//获得当前行的用户Id
	var appId=$(this).parent().parent().find("td").eq(1).text();
	$.ajax({ 
			dataType : "json",
			type : "POST",
			url: "app!chuliupdate.action", 
			data:{"apply.appid":appId,"apply.dictinfo.dictid":6},
			success: function(data){
					alert("处理成功啦！");
					$("#chuli").click();
					}
			});
		});
		
});



//个人设置=====================================
//个人设置的查询  显示所有自己的信息
$(function(){
	$("#indint").click(function(){
			var userid = ${user.userid};
			$.ajax({ 
			dataType : "json",
			type : "POST",
			url: "induser!findByuserid.action", 
			data:{"user.userid":userid},
			success: function(data){
					$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();
					$("#rightMain").html("");	
						var tableElement = $("<table align='center' width='800px' ></table>");
						var tableBody = $("<tbody ></tbody>");
						var trElement = $("<tr></tr>");
						var trElement2 = $("<tr></tr>");
						var trElement3 = $("<tr></tr>");
						var trElement4 = $("<tr></tr>");
						
						trElement.append("<td>用户名:</td><td><input type='text' id='username1' id='' name='user.username' value="+data.user.username+" /></td>")
						.append("<td>密码：</td><td><input type='password' id='pwd' name='user.userpwd' value="+data.user.userpwd+" /></td>");
						trElement2.append("<td>地址:</td><td><input type='text' id='add' name='user.useradd' value="+data.user.useradd+"></td>")
						.append("<td>电话:</td><td><input type='text' id='tel' name='user.usertel' value="+data.user.usertel+" /></td>")	;
						trElement3.append("<td>性别：</td>");
						trElement4.append("<td colspan='4'><img id='upuser' src='images/xiugai.GIF' alt='修改个人信息' /></td>");
						var select = $("<SELECT id='sex'></SELECT>"); 
						if(data.user.usersex=='男'){
						select.append("<option value='男'>男</option><option value='女'>女</option>");
						}else{
						select.append("<option value='女'>女</option><option value='男'>男</option>");
						}
						var td = $("<td colspan='3'></td>");
						td.append(select);
						trElement3.append(td);
						
						tableBody.append(trElement);
						tableBody.append(trElement2);
						tableBody.append(trElement3);
						tableBody.append(trElement4);
						
						tableElement.append(tableBody);
						$("#rightMain").append(tableElement);
					}
			});
	});
});
//个人设置的修改
$(function(){
	$('#upuser').live('click',function(){
		var userid = ${user.userid};
		var username = $("#username1").val();
		var userpwd = $("#pwd").val();
		var useradd = $("#add").val();
		var usertel = $("#tel").val();
		var usersex = $("#sex").val();		
		$.ajax({ 
			dataType : "json",
			type : "POST",
			url: "induser!updateforuserId.action", 
			data:{"user.userid":userid,"user.username":username,"user.userpwd":userpwd,"user.useradd":useradd,"user.usertel":usertel,"user.usersex":usersex},
			success: function(data){
					alert("修改成功啦!");
					$("#indint").click();
					}
			});
		
	
	});
});


//===========================
//申请单的创建=======================================
	//ip申请单
$(function(){
	$("#ipApp").click(function(){
	$("#page").html("");
		$("#rightMain").empty();
		$("#mailDiv").hide();
		$("#telDiv").hide();
		$("#commDiv").hide();
		$("#strDiv").hide();
		$("#otherDiv").hide();
		$("#ipDiv").show();
		$("#ipUp").hide();
		$("#ipAdd").show();
		$("#ipRe").show();
		$("#ipAdd").removeAttr("disabled");
		$("#ipRe").removeAttr("disabled");
		$("#ipId").attr("disabled","true");
		$("#ipName").val("ip地址申请单");
		$("#ipName").attr("readonly","readonly");
		
		$("#ipAdd").click(function(){
			var typeid = 1;//申请单类型编号
			var appnumber = $("#appNumber").val();//请求数量
			var userid = ${user.userid};//用户
			var ipUseAddr = $("#ipUseAddr").val();//用户地址
			var ipUseTime = $("#ipUseTime").val();//使用时间
			var netNum = $("#netNum").val();//网口号码
			var ipDesc = $("#ipDesc").val();//说明
			var dictid = 1;//申请单状态
			var stru = $("#ipTitle").val();//申请单标题
			var reason = $("#ipReason").val();//申请原因	
			
			var re=/^[\u4e00-\u9fa5]{1,}$/;
			
			//申请单标题
			if(stru.length==0){
				$("#ipTit").empty();
				$("#ipTit").append("(*申请单标题不能为空 哦!*)");
				$("#ipTitle").focus();
				return false;
			}
			else{
				$("#ipTit").empty();
			}
		
		
			if(re.test(stru)==false){
				$("#ipTit").append("(*申请标题只能填中文哦!*)");
				$("#ipTitle").focus();
				return false;
			}
			else{
				$("#ipTit").empty();
			}
			
			
			
			
			//申请原因
			if(reason.length==0){
				$("#ipRea").empty();
				$("#ipRea").append("(*申请原因不能为空哦*)");
				$("#ipReason").focus();
				return false;
			}
			else{
				$("#ipRea").empty();
			}
			
		
			if(re.test(reason)==false){
				$("#ipRea").append("(*申请原因只能填中文哦!*)");
				$("#ipReason").focus();
				return false;
			}
			else{
				$("#ipRea").empty();
			}
			
			
			
			//请求数量
			if(appnumber.length==0){
				$("#ipasknum").empty();
				$("#ipasknum").append("(*请求数量不能为空哦!*)");
				$("#appNumber").focus();
				return false;
			}
			else{
				$("#ipasknum").empty();
			}
	
			var re1=/^\d{1,}$/;
			if(re1.test(appnumber)==false){
				$("#ipasknum").empty();
				$("#ipasknum").append("(*请求数量必须是数字哦!*)");
				$("#appNumber").focus();
				return false;
			}
			else{
				$("#ipasknum").empty();
			}
			
			if(appnumber==0){
				$("#ipasknum").empty();
				$("#ipasknum").append("(*请求数量要大于0哦!*)");
				$("#appNumber").focus();
				return false;
			}
			else{
				$("#ipasknum").empty();
			}
		
		
			//使用地址
			if(ipUseAddr.length==0){
				$("#ipuseadd").empty();
				$("#ipuseadd").append("(*使用地址不能够为空哦!*)");
				$("#ipUseAddr").focus();
				return false;
			}
			else{
				$("#ipuseadd").empty();
			}

			if(re.test(ipUseAddr)==false){
				$("#ipuseadd").empty();
				$("#ipuseadd").append("(*使用地址只能填中文哦!*)");
				$("#ipUseAddr").focus();
				return false;
			}
			else{
				$("#ipuseadd").empty();
			}
			
			
			//使用时间
			if(ipUseTime.length==0){
				$("#ipusetime").empty();
				$("#ipusetime").append("(*使用时间不能够为空哦!*)");
				$("#ipUseTime").focus();
				return false;
			}
			else{
				$("#ipusetime").empty();
			}
		
			
			//网口号码
			if(netNum.length==0){
				$("#ipnetnum").empty();
				$("#ipnetnum").append("(*网口号码不能够为空哦!*)");
				$("#netNum").focus();
				return false;
			}
			else{
				$("#ipnetnum").empty();
			}
			//网口号码格式
			/*var re2=/^$/;
			if(re2.test(netNum)==false){
				$("#ipnetnum").empty();
				$("#ipnetnum").append("(*网口格式不符合[0~255.0~255.0~255.0~255]!*)");
				$("#netNum").focus();
				return false;
			}
			else{
				$("#ipnetnum").empty();
			}*/
			
			//进行添加
			$.ajax({ 
				dataType : "json",
				type : "POST",
				url: "applyIp!AddIpadd.action", 
				data:{"ipadd.appnumber":appnumber,"ipadd.iddesc":ipDesc,
					"ipadd.netnum":netNum,"ipadd.useaddr":ipUseAddr,
					"ipadd.usetime":ipUseTime,"apply.userinfoByUserid.userid":userid,
					"apply.dictinfo.dictid":dictid,"apply.apptitle":stru,
					"apply.appreason":reason,"apply.allpkinfo.typeinfo.typeid":typeid},
				success: function(data){
						alert("添加成功啦!");
						$("#myApply").click();
				}
			});
		});
	});
});

//mailApp邮件地址申请单
$(function(){

	$("#mailApp").click(function(){
		$("#rightMain").empty();
		$("#page").html("");
		$("#telDiv").hide();
		$("#commDiv").hide();
		$("#strDiv").hide();
		$("#otherDiv").hide();
		$("#ipDiv").hide();
		$("#mailDiv").show();
		$("#mailUp").hide();
		$("#mailAdd").show();
		$("#mailRe").show();
		$("#mailAdd").removeAttr("disabled");
		$("#mailRe").removeAttr("disabled");
		$("#mialId").attr("disabled","true");
		$("#mailName").val("邮箱地址申请单");
		$("#mailName").attr("readonly","readonly");
		$("#mailAdd").click(function(){
			var typeid = 3;//申请单类型编号
			var userid = ${user.userid};//用户
			var dictid = 1;//申请单状态
			var mailTitle = $("#mailTitle").val();//申请单标题
			var mailReason = $("#mailReason").val();//申请原因	
			
			var mailUseAddr = $("#mailUseAddr").val();//使用地址
			var mailUseTime = $("#mailUseTime").val();//使用时间
			var mialAppType = $("#mialAppType").val();//类型
			var mailDesc = $("#mailDesc").val();//说明
			var mailSize = $("#mailSize").val();//大小
			var mialUser = $("#mialUser").val();//使用人
			var mailUserSpell = $("#mailUserSpell").val();//使用人全拼
			var mialUpReason =$("#mialUpReason").val();//申请类型原因
			
			//中文正则 
			var re=/^[\u4e00-\u9fa5]{1,}$/;
			
			
			//申请标题
			if(mailTitle.length==0){
				$("#mailTit").empty();
				$("#mailTit").append("(申请原因不能为空哦!)");
				$("#mailTitle").focus();
				return false;
			}
			else{
				$("#mailTit").empty();
			}
			
			if(re.test(mailTitle)==false){
					$("#mailTit").empty();
					$("#mailTit").append("(*申请标题只能填中文哦!*)");
					$("#mailTitle").focus();
					return false;
			}
			else{
				$("#mailTit").empty();
			}
				
				
				
				
			//申请原因
			if(mailReason.length==0){
				$("#mailRea").empty();
				$("#mailRea").append("(*申请原因不能为空哦!*)");
				$("#mailReason").focus();
				return false;
			}
			else{
				$("#mailRea").empty();
			}
				
			if(re.test(mailReason)==false){
				$("#mailRea").empty();
				$("#mailRea").append("(*申请原因只能填中文哦!*)");
				$("#mailReason").focus();
				return false;
			}
			else{
				$("#mailRea").empty();
			}
				
			
			//邮箱大小 mailcount   mailSize
			if(mailSize.length==0){
				$("#mailcount").empty();
				$("#mailcount").append("(*邮箱大小不能为空哦 !*)");
				$("#mailSize").focus();
				return false;
			}
			else{
				$("#mailcount").empty();
			}
		
			var re1=/^\d{1,}$/;
			if(re1.test(mailSize)==false){
				$("#mailcount").empty();
				$("#mailcount").append("(*邮箱大小必须是数字哦!*)");
				$("#mailSize").focus();
				return false;
			}
			else{
				$("#mailcount").empty();
			}
			
			
			if(mailSize==0){
				$("#mailcount").empty();
				$("#mailcount").append("(*邮箱大小必须要大于0哦!*)");
				$("#mailSize").focus();
				return false;
			}
			else{
				$("#mailcount").empty();
			}
		
			
			
			//使用地址 mailuseadd		 mailUseAddr
			if(mailUseAddr.length==0){
				$("#mailuseadd").empty();
				$("#mailuseadd").append("(*使用地址不能够为空哦!*)");
				$("#mailUseAddr").focus();
				return false;
			}
			else{
				$("#mailuseadd").empty();
			}

			if(re.test(mailUseAddr)==false){
				$("#mailuseadd").empty();
				$("#mailuseadd").append("(*使用地址只能填中文哦!*)");
				$("#mailUseAddr").focus();
				return false;
			}
			else{
				$("#mailuseadd").empty();
			}
			
			//使用者 mailuser mialUser
			if(mialUser.length==0){
				$("#mailuser").empty();
				$("#mailuser").append("(*使用者姓名不能够为空哦!*)");
				$("#mialUser").focus();
				return false;
			}
			else{
				$("#mailuser").empty();
			}

			if(re.test(mialUser)==false){
				$("#mailuser").empty();
				$("#mailuser").append("(*使用者姓名只能填中文哦!*)");
				$("#mialUser").focus();
				return false;
			}
			else{
				$("#mailuser").empty();
			}
			
			
			
			//使用者姓名全拼  mailuserspe  mailUserSpell
			if(mailUserSpell.length==0){
				$("#mailuserspe").empty();
				$("#mailuserspe").append("(*使用者姓名全拼不能够为空哦!*)");
				$("#mailUserSpell").focus();
				return false;
			}
			else{
				$("#mailuserspe").empty();
			}

			var re1=/^[a-z]{1,}$/;
			if(re1.test(mailUserSpell)==false){
				$("#mailuserspe").empty();
				$("#mailuserspe").append("(*使用者姓名全拼只能小写字母组成哦!*)");
				$("#mailUserSpell").focus();
				return false;
			}
			else{
				$("#mailuserspe").empty();
			}
		
		
			//使用期限 mailtime mailUseTime 
			if(mailUseTime.length==0){
				$("#mailtime").empty();
				$("#mailtime").append("(*使用期限不能够为空哦!*)");
				$("#mailUseTime").focus();
				return false;
			}
			else{
				$("#mailtime").empty();
			}
			
			
			//新增/更改原因 mailuprea mialUpReason
			if(mialUpReason.length==0){
				$("#mailuprea").empty();
				$("#mailuprea").append("(*新增/更改原因不能够为空哦!*)");
				$("#mialUpReason").focus();
				return false;
			}
			else{
				$("#mailuprea").empty();
			}
			
			if(re.test(mialUpReason)==false){
				$("#mailuprea").empty();
				$("#mailuprea").append("(*新增/更改原因 只能填中文哦!*)");
				$("#mialUpReason").focus();
				return false;
			}
			else{
				$("#mailuprea").empty();
			}
	
		
			//进行添加
			$.ajax({ 
				dataType : "json",
				type : "POST",
				url: "applyMail!Addmail.action", 
				data:{"mail.addamendreason":mialUpReason,"mail.useuser":mialUser,
					"mail.usetime":mailUseTime,"mail.namespell":mailUserSpell,
					"mail.roomsize":mailSize,"mail.maildesc":mailDesc,
					"mail.dictinfo.dictid":mialAppType,"mail.useadd":mailUseAddr,
					//公共字段传值
					"apply.appreason":mailReason,"apply.allpkinfo.typeinfo.typeid":typeid,"apply.apptitle":mailTitle,
					"apply.appreason":mailReason,"apply.userinfoByUserid.userid":userid,"apply.dictinfo.dictid":dictid
				},
				success: function(data){
					alert("添加成功啦!");
					$("#myApply").click();
				}
			});
			
			
		});
	});
});
//========
//电话会议申请单
$(function(){
	$("#telApp").click(function(){
	$("#page").html("");
		$("#rightMain").empty();
		$("#mailDiv").hide();
		
		$("#commDiv").hide();
		$("#strDiv").hide();
		$("#otherDiv").hide();
		$("#ipDiv").hide();
		$("#telDiv").show();
		$("#telUp").hide();
		$("#telAdd").show();
		$("#telRe").show();
		$("#telAdd").removeAttr("disabled");
		$("#telRe").removeAttr("disabled");
		$("#mialId").attr("disabled","true");
		$("#telName").val("电话会议申请单");
		$("#telName").attr("readonly","readonly");
		$("#telAdd").click(function(){
			var typeid = 4;//申请单类型编号
			var userid = ${user.userid};//用户
			var dictid = 1;//申请单状态
			var telTitle = $("#telTitle").val();//申请单标题
			var telReason = $("#telReason").val();//申请原因	
			
			var startDate = $("#startDate").val();//开始时间
			var endDate = $("#endDate").val();//结束时间
			var jionNum = $("#jionNum").val();//参加方数
			var idGived = $("#idGived").val();//是否给于技术设备
			var meetAdd = $("#meetAdd").val();//会议地点
			var espReq = $("#espReq").val();//特殊要求
			var telDesc =$("#telDesc").val();//备注
			
			
			//中文正则 
			var re=/^[\u4e00-\u9fa5]{1,}$/;
			
			
			//申请标题
			if(telTitle.length==0){
				$("#telTit").empty();
				$("#telTit").append("(申请原因不能为空哦!)");
				$("#telTitle").focus();
				return false;
			}
			else{
				$("#telTit").empty();
			}
			
			if(re.test(telTitle)==false){
					$("#telTit").empty();
					$("#telTit").append("(*申请标题只能填中文哦!*)");
					$("#telTitle").focus();
					return false;
			}
			else{
				$("#telTit").empty();
			}
				
				
				
				
			//申请原因
			if(telReason.length==0){
				$("#telRea").empty();
				$("#telRea").append("(*申请原因不能为空哦 !*)");
				$("#telReason").focus();
				return false;
			}
			else{
				$("#telRea").empty();
			}
				
			if(re.test(telReason)==false){
				$("#telRea").empty();
				$("#telRea").append("(*申请原因只能填中文哦!*)");
				$("#telReason").focus();
				return false;
			}
			else{
				$("#telRea").empty();
			}
			
			
			
			
			//开始时间 telst     startDate
			if(startDate.length==0){
				$("#telst").empty();
				$("#telst").append("(*开始时间不能为空哦!*)");
				$("#startDate").focus();
				return false;
			}
			else{
				$("#telst").empty();
			}
			
			
			
			//结束时间telet endDate
			if(endDate.length==0){
				$("#telet").empty();
				$("#telet").append("(*开始时间不能为空哦!*)");
				$("#endDate").focus();
				return false;
			}
			else{
				$("#telet").empty();
			}
			
			
			
			
			//参见者（方）总数：teljoinnum   jionNum
			if(jionNum.length==0){
				$("#teljoinnum").empty();
				$("#teljoinnum").append("(*参见者（方）总数不能为空 哦!*)");
				$("#jionNum").focus();
				return false;
			}
			else{
				$("#teljoinnum").empty();
			}
		
			var re1=/^\d{1,}$/;
			if(re1.test(jionNum)==false){
				$("#teljoinnum").empty();
				$("#teljoinnum").append("(*参见者（方）总数必须是数字哦!*)");
				$("#jionNum").focus();
				return false;
			}
			else{
				$("#teljoinnum").empty();
			}
			
			if(jionNum==0){
				$("#teljoinnum").empty();
				$("#teljoinnum").append("(*参见者（方）总数必须要大于0哦!*)");
				$("#jionNum").focus();
				return false;
			}
			else{
				$("#teljoinnum").empty();
			}
			
			
			//地点：teluseadd   meetAdd
			if(meetAdd.length==0){
				$("#teluseadd").empty();
				$("#teluseadd").append("(*地点不能够为空哦!*)");
				$("#meetAdd").focus();
				return false;
			}
			else{
				$("#teluseadd").empty();
			}

			if(re.test(meetAdd)==false){
				$("#teluseadd").empty();
				$("#teluseadd").append("(*地点只能填中文哦!*)");
				$("#meetAdd").focus();
				return false;
			}
			else{
				$("#teluseadd").empty();
			}
			
			
			//特殊要求：telspa  espReq
			if(espReq.length==0){
				$("#telspa").empty();
				$("#telspa").append("(*使用地址不能够为空哦!*)");
				$("#espReq").focus();
				return false;
			}
			else{
				$("#telspa").empty();
			}

			if(re.test(espReq)==false){
				$("#telspa").empty();
				$("#telspa").append("(*使用地址只能填中文哦!*)");
				$("#espReq").focus();
				return false;
			}
			else{
				$("#telspa").empty();
			}

			
			
			$.ajax({ 
				dataType : "json",
				type : "POST",
				url: "applyTel.action", 
				data:{'telmeeting.startdate':startDate,
					'telmeeting.enddate':endDate,'telmeeting.meetadd':meetAdd,
					'telmeeting.isgived':idGived,'telmeeting.especialrequest':espReq,
					'telmeeting.meetdesc':telDesc,'telmeeting.jionnum':jionNum,
					//公共字段传值
					"apply.appreason":telReason,"apply.allpkinfo.typeinfo.typeid":typeid,"apply.apptitle":telTitle,
					"apply.userinfoByUserid.userid":userid,"apply.dictinfo.dictid":dictid
					},
				success: function(data){
						alert("添加成功啦!");
						$("#myApply").click();
				}
			});
		
		});
	});
});
//=通讯业务申请单
$(function(){
	$("#commApp").click(function(){
	$("#page").html("");
		$("#rightMain").empty();
		$("#mailDiv").hide();
		$("#telDiv").hide();

		$("#strDiv").hide();
		$("#otherDiv").hide();
		$("#ipDiv").hide();
		$("#commDiv").show();
		$("#commUp").hide();
		$("#commAdd").show();
		$("#commRe").show();
		$("#commAdd").removeAttr("disabled");
		$("#commRe").removeAttr("disabled");
		$("#mialId").attr("disabled","true");
		$("#commName").val("通讯业务申请单");
		$("#commName").attr("readonly","readonly");
		$("#commAdd").click(function(){
			var typeid = 5;//申请单类型编号
			var userid = ${user.userid};//用户
			var dictid = 1;//申请单状态
			var commTitle = $("#commTitle").val();//申请单标题
			var commReason = $("#commReason").val();//申请原因	
			
		
			var finishedDate = $("#finishedDate").val();//完成时间
			var commAdd = $("#commUseAddr").val();//地点
			var userCount = $("#userCount").val();//数量
			var commDesc = $("#commDesc").val();//备注
			var property = $("#property").val();//属性
			var operateExplain = $("#operateExplain").val();//需求
			
			
			//中文正则 
			var re=/^[\u4e00-\u9fa5]{1,}$/;
			
			
			//申请标题
			if(commTitle.length==0){
				$("#commTit").empty();
				$("#commTit").append("(申请原因不能为空哦!)");
				$("#commTitle").focus();
				return false;
			}
			else{
				$("#commTit").empty();
			}
			
			if(re.test(commTitle)==false){
					$("#commTit").empty();
					$("#commTit").append("(*申请标题只能填中文哦!*)");
					$("#commTitle").focus();
					return false;
			}
			else{
				$("#commTit").empty();
			}
				
				
				
				
			//申请原因
			if(commReason.length==0){
				$("#commRea").empty();
				$("#commRea").append("(*申请原因不能为空哦!*)");
				$("#commReason").focus();
				return false;
			}
			else{
				$("#commRea").empty();
			}
				
			if(re.test(commReason)==false){
				$("#commRea").empty();
				$("#commRea").append("(*申请原因只能填中文哦!*)");
				$("#commReason").focus();
				return false;
			}
			else{
				$("#commRea").empty();
			}
			
			//完成时间 commFd    finishedDate  
			if(finishedDate.length==0){
				$("#commFd").empty();
				$("#commFd").append("(*完成时间不能为空哦 !*)");
				$("#finishedDate").focus();
				return false;
			}
			else{
				$("#commFd").empty();
			}
			
			//使用地址commadd commAdd
			if(commAdd.length==0){
				$("#commadd").empty();
				$("#commadd").append("(*使用地址不能为空哦!*)");
				$("#commAdd").focus();
				return false;
			}
			else{
				$("#commadd").empty();
			}
				
			if(re.test(commAdd)==false){
				$("#commadd").empty();
				$("#commadd").append("(*使用地址只能填中文哦!*)");
				$("#commAdd").focus();
				return false;
			}
			else{
				$("#commadd").empty();
			}
			
			//使用者数量commusercount userCount
			if(userCount.length==0){
				$("#commusercount").empty();
				$("#commusercount").append("(*使用者数量不能为空哦 !*)");
				$("#userCount").focus();
				return false;
			}
			else{
				$("#commusercount").empty();
			}
		
			var re1=/^\d{1,}$/;
			if(re1.test(userCount)==false){
				$("#commusercount").empty();
				$("#commusercount").append("(*使用者数量必须是数字哦!*)");
				$("#userCount").focus();
				return false;
			}
			else{
				$("#commusercount").empty();
			}
			
			if(userCount==0){
				$("#commusercount").empty();
				$("#commusercount").append("(*使用者数量必须要大于0哦!*)");
				$("#userCount").focus();
				return false;
			}
			else{
				$("#commusercount").empty();
			}
			
			//业务需求commex operateExplain
			if(operateExplain.length==0){
				$("#commex").empty();
				$("#commex").append("(*业务需求不能为空哦!*)");
				$("#operateExplain").focus();
				return false;
			}
			else{
				$("#commex").empty();
			}
				
			if(re.test(operateExplain)==false){
				$("#commex").empty();
				$("#commex").append("(*业务需求只能填中文哦!*)");
				$("#operateExplain").focus();
				return false;
			}
			else{
				$("#commex").empty();
			}
			
				
			$.ajax({ 
				dataType : "json",
				type : "POST",
				url: "applyComm.action",  
				data:{"comm.finishdate":finishedDate,"comm.useadd":commAdd,"comm.usercount":userCount,
					"comm.commdesc":commDesc,"comm.dictinfo.dictid":property,"comm.operateexplain":operateExplain,
					//公共字段传值
					"apply.appreason":commReason,"apply.allpkinfo.typeinfo.typeid":typeid,"apply.apptitle":commTitle,
					"apply.userinfoByUserid.userid":userid,"apply.dictinfo.dictid":dictid},
				success: function(data){
					alert("添加成功啦!");
					$("#myApply").click();
				}
			});
		
		});
	});
});

//=====存储空间申请单=====
$(function(){
	$("#strApp").click(function(){
	$("#page").html("");
		$("#rightMain").empty();
		$("#mailDiv").hide();
		$("#telDiv").hide();
		$("#commDiv").hide();

		$("#otherDiv").hide();
		$("#ipDiv").hide();
		$("#strDiv").show();
		$("#strUp").hide();
		$("#strAdd").show();
		$("#strRe").show();
		$("#strAdd").removeAttr("disabled");
		$("#strRe").removeAttr("disabled");
		$("#mialId").attr("disabled","true");
		$("#strName").val("存储空间申请单");
		$("#strName").attr("readonly","readonly");
		$("#strAdd").click(function(){
			var typeid = 2;//申请单类型编号
			var userid = ${user.userid};//用户
			var dictid = 1;//申请单状态
			var strTitle = $("#strTitle").val();//申请单标题
			var strReason = $("#strReason").val();//申请原因	
			
			var strUseAddr = $("#strUseAddr").val();//使用地址
			var strUseTime = $("#strUseTime").val();//使用时间
			var roomNeed = $("#roomNeed").val();//空间大小
			var strDesc = $("#strDesc").val();//说明
			
			//中文正则 
			var re=/^[\u4e00-\u9fa5]{1,}$/;
			
			
			//申请标题
			if(strTitle.length==0){
				$("#strTit").empty();
				$("#strTit").append("(申请原因不能为空哦!)");
				$("#strTitle").focus();
				return false;
			}
			else{
				$("#strTit").empty();
			}
			
			if(re.test(strTitle)==false){
					$("#strTit").empty();
					$("#strTit").append("(*申请标题只能填中文哦!*)");
					$("#strTitle").focus();
					return false;
			}
			else{
				$("#strTit").empty();
			}
				
				
			//申请原因
			if(strReason.length==0){
				$("#strRea").empty();
				$("#strRea").append("(*申请原因不能为空 哦!*)");
				$("#strReason").focus();
				return false;
			}
			else{
				$("#strRea").empty();
			}
				
			if(re.test(strReason)==false){
				$("#strRea").empty();
				$("#strRea").append("(*申请原因只能填中文哦!*)");
				$("#strReason").focus();
				return false;
			}
			else{
				$("#strRea").empty();
			}
			
			
			//空间需求大小
			if(roomNeed.length==0){
				$("#strsize").empty();
				$("#strsize").append("(*空间需求大小不能为空哦!*)");
				$("#roomNeed").focus();
				return false;
			}
			else{
				$("#strsize").empty();
			}
		
			var re1=/^\d{1,}$/;
			if(re1.test(roomNeed)==false){
				$("#strsize").empty();
				$("#strsize").append("(*空间需求大小必须是数字哦!*)");
				$("#roomNeed").focus();
				return false;
			}
			else{
				$("#strsize").empty();
			}
			
			if(roomNeed==0){
				$("#strsize").empty();
				$("#strsize").append("(*空间需求大小必须要大于0哦!*)");
				$("#roomNeed").focus();
				return false;
			}
			else{
				$("#strsize").empty();
			}
			
			//使用地址
			if(strUseAddr.length==0){
				$("#struseadd").empty();
				$("#struseadd").append("(*使用地址不能为空哦!*)");
				$("#strUseAddr").focus();
				return false;
			}
			else{
				$("#struseadd").empty();
			}
				
			if(re.test(strUseAddr)==false){
				$("#struseadd").empty();
				$("#struseadd").append("(*使用地址只能填中文哦!*)");
				$("#strUseAddr").focus();
				return false;
			}
			else{
				$("#struseadd").empty();
			}
			
			
			//使用时间
			if(strUseTime.length==0){
				$("#strusetime").empty();
				$("#strusetime").append("(*使用地址不能为空哦!*)");
				$("#strUseTime").focus();
				return false;
			}
			else{
				$("#strusetime").empty();
			}
			
			
			

			$.ajax({ 
				dataType : "json",
				type : "POST",
				url: "applyStr.action", 
				data:{"str.roomneed":roomNeed,"str.useradd":strUseAddr,"str.usetime":strUseTime,
					"str.strdesc":strDesc,
					//公共字段传值
					"apply.appreason":strReason,"apply.allpkinfo.typeinfo.typeid":typeid,"apply.apptitle":strTitle,
					"apply.userinfoByUserid.userid":userid,"apply.dictinfo.dictid":dictid
				},
				success: function(data){
						alert("添加成功啦!");
						$("#myApply").click();
				}
			});
		
		});
	});
});

//=====其他业务申请单=====
$(function(){
	$("#otherApp").click(function(){
	$("#page").html("");
		$("#rightMain").empty();
		$("#mailDiv").hide();
		$("#telDiv").hide();
		$("#commDiv").hide();
		$("#strDiv").hide();
		$("#ipDiv").hide();
		$("#otherDiv").show();
		$("#otherUp").hide();
		$("#otherAdd").show();
		$("#otherRe").show();
		$("#otherAdd").removeAttr("disabled");
		$("#otherRe").removeAttr("disabled");
		$("#mialId").attr("disabled","true");
		$("#otherName").val("其它业务申请单");
		$("#otherName").attr("readonly","readonly");
		
		
		$("#otherAdd").click(function(){
			var typeid = 6;//申类型编号
			var userid = ${user.userid};//用户
			var dictid = 1;//申请单状态
			var otherTitle = $("#otherTitle").val();//申请单标题
			var otherReason = $("#otherReason").val();//申请原因	
			
			var otherDetail = $("#otherDetail").val();//问题的详细描述
			var otherDesc = $("#otherDesc").val();//说明
			
			//中文正则 
			var re=/^[\u4e00-\u9fa5]{1,}$/;
			
			
			//申请标题
			if(otherTitle.length==0){
				$("#othTit").empty();
				$("#othTit").append("(申请标题不能为空哦!)");
				$("#otherTitle").focus();
				return false;
			}
			else{
				$("#othTit").empty();
			}
			
			if(re.test(otherTitle)==false){
					$("#othTit").empty();
					$("#othTit").append("(*申请标题只能填中文哦!*)");
					$("#otherTitle").focus();
					return false;
			}
			else{
				$("#othTit").empty();
			}
				
				
			//申请原因
			if(otherReason.length==0){
				$("#othRea").empty();
				$("#othRea").append("(*申请原因不能为空哦!*)");
				$("#otherReason").focus();
				return false;
			}
			else{
				$("#othRea").empty();
			}
				
			if(re.test(otherReason)==false){
				$("#othRea").empty();
				$("#othRea").append("(*申请原因只能填中文哦!*)");
				$("#otherReason").focus();
				return false;
			}
			else{
				$("#othRea").empty();
			}
			
			//问题详述
			if(otherDetail.length==0){
				$("#othdetail").empty();
				$("#othdetail").append("(*申请原因不能为空哦!*)");
				$("#otherDetail").focus();
				return false;
			}
			else{
				$("#othdetail").empty();
			}
				
			if(re.test(otherDetail)==false){
				$("#othdetail").empty();
				$("#othdetail").append("(*申请原因只能填中文哦!*)");
				$("#otherDetail").focus();
				return false;
			}
			else{
				$("#othdetail").empty();
			}
			
			$.ajax({ 
				dataType : "json",
				type : "POST",
				url: "applyOth.action", 
				data:{"oth.otherdetail":otherDetail,"oth.otherdesc":otherDesc,
					//公共字段传值
					"apply.appreason":otherReason,"apply.allpkinfo.typeinfo.typeid":typeid,"apply.apptitle":otherTitle,
					"apply.userinfoByUserid.userid":userid,"apply.dictinfo.dictid":dictid
				},
				success: function(data){
						alert("添加成功啦!");
						$("#myApply").click();
				}
			});
		});
	});
});
//======创建======
$(function(){
	$("#chuangjian").click(function(){
		$("#ipApp").click();
	});
	
});

//==========查看申请单的详细==============
$(function(){
	$("#chakan").live("click",function(){
		var appId=$(this).parent().parent().parent().parent().find("td").eq(1).text();
		jBox.open("iframe-jBoxID","iframe","<%=path %>/findAppforId.action?apply.appid="+appId,"查看申请单","width=500,height=300,center=true,minimizable=true,resize=true,draggable=true,model=true,scrolling=true");
	/*	$.ajax({ 
					dataType : "json",
					type : "POST",
					url: "app!findApplyById.action", 
					data:{"apply.appid":appId},
					success: function(data){
					$("#mailDiv").hide();
					$("#telDiv").hide();
					$("#commDiv").hide();
					$("#strDiv").hide();
					$("#otherDiv").hide();
					$("#ipDiv").hide();
						$("#rightMain").html("");
						var tableElement = $("<table align='center' boder='1' width='600px'></table>");
						var tableBody = $("<tbody ></tbody>");
						var trElement = $("<tr></tr>");
						var trElement2 = $("<tr></tr>");
						var trElement3 = $("<tr></tr>");
						trElement.append("<td>申请单编号: </td>")
						.append("<td>"+data.apply.appid+"</td>")
						.append("<td>申请单标题:</td>")
						.append("<td>"+data.apply.apptitle+"</td>")
						.append("<td>申请部门:</td>")
						.append("<td>"+data.apply.userinfoByUserid.deptinfo.deptname+"</td>");
						
						trElement2.append("<td>申请单类型:</td>")
						.append("<td>"+data.apply.allpkinfo.typeinfo.typename+"</td>")
						.append("<td>申请单状态:</td>")
						.append("<td>"+data.apply.dictinfo.dictitem+"</td>")
						.append("<td>申请原因:</td>")
						.append("<td>"+data.apply.appreason+"</td>");
						
						trElement3.append("<td>申请人:</td>")
						.append("<td>"+data.apply.userinfoByUserid.username+"</td>")
						.append("<td>申请时间:</td>")
						.append("<td>"+data.apply.appdate+"</td>")
						.append("<td>备注:</td>");
						if(data.apply.appdesc==null){
						trElement3.append("<td>无</td>");
						}else{
						trElement3.append("<td>"+data.apply.appdesc+"</td>");
						}
						
						tableBody.append(trElement);
						tableBody.append(trElement2);
						tableBody.append(trElement3);
						tableElement.append(tableBody);
						$("#rightMain").append(tableElement);
						
						$("#aa").click();
						
					}
			});*/
	});

});



//【我的申请单】=============================================================================================================
//查询当前用户所有的申请单
function page2(a,data){
    var currentPage = a;//当前页码
	var recordCount = data.applist.length;//总行数
	var pageSize =5;//每页的行数
	var pageCount = (recordCount - 1) /pageSize + 1;//总页数
	var firstIndex = (currentPage - 1)*pageSize;//当前页第一行
	var lastIndex = firstIndex + pageSize;//当前页最后一行
	
		$("#mailDiv").hide();
		$("#telDiv").hide();

		$("#otherDiv").hide();
		$("#ipDiv").hide();
		$("#strDiv").hide();
		$("#rightMain").show();
			$("#rightMain").html("");
			if(data.applist.length!=0){
			var tableElement = $("<table cellpadding='0'  cellspacing='0'><thead id='myemps2'><th>序号</th><th>编号</th><th>标题</th><th>资源编号</th><th>申请单类型名称</th><th>申请单状态</th><th>创建时间</th><th>查看</th><th>修改</th><th>反馈归档</th></thead></table>");
			var tableBody = $("<tbody id='myApps'></tbody>");
			
			$.each(data.applist,function(i,apply){
			     if(firstIndex<=i && i<lastIndex){
				var trElement = $("<tr></tr>");
				trElement.append("<td>" + (i+1) +"</td>")
				.append("<td>" +apply.appid +"</td>")
				.append("<td>" + apply.apptitle +"</td>")
				.append("<td>" + apply.allpkinfo.rid +"</td>")
				.append("<td>" + apply.allpkinfo.typeinfo.typename+"</td>")
				.append("<td>" + apply.dictinfo.dictitem +"</td>")
				.append("<td>" + apply.appdate +"</td>")
				.append("<td><p><a id='chakan' href='#'><img src='images/chakan2.GIF' alt='查看详细' /></a><p></td>");
				
				if(apply.dictinfo.dictitem=="退回"){
					trElement.append("<td><a href='#'><img src='images/xiugai.GIF' alt='修改' /><a></td>");
				}
				else{
					trElement.append("<td><img src='images/yisuo.GIF' alt='已锁,您不能操作' /></td>");
				}
				
				
				
				//判断是否是【否决】 【退回状态】 给删除按钮
				if(apply.dictinfo.dictitem=="已处理"){
					trElement.append("<td><span><a href='#'><img src='images/ico_04.gif' alt='归档' /></a></span></td>");
				}else{
					trElement.append("<td><img src='images/yisuo.GIF' alt='已锁,您不能操作' /></td>");
				}		
				tableBody.append(trElement);
				}
			}); 
			tableElement.append(tableBody);
			$("#rightMain").append(tableElement);
			  return pageCount;
			}
				
			else{
			$("#rightMain").append("<div id='wushuju' align='center'><img src='images/6.jpg' /></div>");
			}
	}

function findAllMyApp(){
	$("#rightMain").empty();
	var uid=${user.userid};
	
	$.ajax({
		dataType:'json',
		type:'POST',
		url:'<%=path%>/app!findAllById.action',
		data:{'apply.userinfoByUserid.userid':uid},
		success:function(data){
		    
		    	$("#page").html("");	
			
			 $("#rightMain").html("");
				 var pageCount = page2(1,data);
				 
				 
					$("#page").html("");
					
					$("#page").append("<a href='#' id='shouye'>首页</a><a href='#' id='shang'>上一页</a><a href='#' id='xia'>下一页</a>跳到第");
					
					var s = $("<select id='iter'></select>");
					
					for(var i=1;i<=pageCount;i++){
						s.append("<option>"+i+"</option>");
					}
					$("#page").append(s);
					$("#page").append("页");
					//-----------------------------		
					//跳页----------------
						$("#shouye").click(function(){	
						$("#rightMain").html("");			
					       page2(1,data);
					       $("#iter").val(1);
						});
					$("#iter").change(function(){				
						var currentPage = $("#iter").val();//当前页码
						 $("#rightMain").html("");
						page2(currentPage,data);
						});
					$("#shang").click(function(){
						 
						var currentPage = $("#iter").val();//当前页码
						currentPage--;
						$("#iter").val(currentPage);

						var currentPage = $("#iter").val();
						$("#rightMain").html("");
						page2(currentPage,data);
						});
					$("#xia").click(function(){
						 
						var currentPage = $("#iter").val();//当前页码
						currentPage++;
						$("#iter").val(currentPage);
						var currentPage = $("#iter").val();
						$("#rightMain").html("");
						page2(currentPage,data);
						});
		}
	});

}

//点击【myApply 我的申请单】
$(function(){
	$('#myApply').live('click',function(){
		findAllMyApp();
		$('#telDiv').hide();
		$('mailDiv').hide();
		$('#otherDiv').hide();
		$('#strDiv').hide();
		$('#ipDiv').hide();
		$('#commDiv').hide();
	});
	$('#myApply').click();
}

);



//点击反馈按钮
$(function(){
	$('#myApps tr td span').live('click',function(){

		
		//获得当前行的编号
		var appid=$(this).parent().parent().find('td').eq(1).text();
		var selId=7;

		$.ajax({ 
					dataType : "json",
					type : "POST",
					url: "app!update.action", 
					data:{"apply.appid":appid,"apply.dictinfo.dictid":selId},
					success: function(data){
					alert("归档成功啦！");
					$('#myApply').click();
					}
				});
	});
});



//显示修改页面
$(function(){
	$('#myApps tr td a').live('click',function(){

		//获得当前行的编号
		var appid=$(this).parent().parent().find('td').eq(1).text();

		//调用ajax 赋值
		$.ajax({
			dataType:'json',
			type:'POST',
			url:'app!findApplyById.action',
			data:{'apply.appid':appid},
			success:function(data){
				//判断当前行的申请【类型】
				var typeid=data.apply.allpkinfo.typeinfo.typeid;
	
				//清空rightMain 的内容
				$('#rightMain').empty();
				
				//去除【重置】
				$('#telRe').hide();
				$('#ipRe').hide();
				$('#mailRe').hide();
				$('#commRe').hide();
				$('#strRe').hide();
				$('#otherRe').hide();
				
				//去除 【添加】
				$('#telAdd').hide();
				$('#ipAdd').hide();
				$('#mailAdd').hide();
				$('#commAdd').hide();
				$('#strAdd').hide();
				$('#otherAdd').hide();
					
				
				if(typeid=='1'){
					$('#ipDiv').show();
					$("#ipUp").removeAttr("disabled");
					$("#ipUp").show();


					//文本框赋值
					$('#ipId').val(data.apply.appid).attr('readonly','readonly');
					$('#ipName').val(data.apply.allpkinfo.typeinfo.typename).attr('readonly','readonly');

					$('#ipTitle').val(data.apply.apptitle);
					$('#ipReason').val(data.apply.appreason);
					
					$('#appnumber').val(data.apply.allpkinfo.ipaddrinfo.appnumber);
					$('#ipUseAddr').val(data.apply.allpkinfo.ipaddrinfo.useaddr);
					
					$('#ipUseTime').val(data.apply.allpkinfo.ipaddrinfo.usetime);
					$('#netNum').val(data.apply.allpkinfo.ipaddrinfo.netnum);
					
					$('#ipDesc').val(data.apply.allpkinfo.ipaddrinfo.iddesc);
					
					//隐藏当前ipinfo编号
					$('#ipDiv').append("<table><tr><td colspan='4'><input type='hidden' id='ipSeq' value='"+data.apply.allpkinfo.ipaddrinfo.ipid+"'/></td></tr></table>");
				
					
				}
				else if(typeid=='2'){
					$('#strDiv').show();
					$("#strUp").removeAttr("disabled");


					//文本框赋值
					$('#strId').val(data.apply.appid).attr('readonly','readonly');
					$('#strName').val(data.apply.allpkinfo.typeinfo.typename).attr('readonly','readonly');

					$('#strTitle').val(data.apply.apptitle);
					$('#strReason').val(data.apply.appreason);
					
					$('#roomNeed').val(data.apply.allpkinfo.strroominfo.roomneed);
					$('#strUseAddr').val(data.apply.allpkinfo.strroominfo.useradd);
					$('#strUseTime').val(data.apply.allpkinfo.strroominfo.usetime);
					$('#strDesc').val(data.apply.allpkinfo.strroominfo.strdesc);

					//隐藏当前ipinfo编号
					$('#strDiv').append("<table><tr><td colspan='4'><input type='hidden' id='strSeq' value='"+data.apply.allpkinfo.strroominfo.roomid+"'/></td></tr></table>");
			
				}

				
				else if(typeid=='3'){
					$('#mailDiv').show();
					$("#mailUp").removeAttr("disabled");


					//文本框赋值
					$('#mailId').val(data.apply.appid).attr('readonly','readonly');
					$('#mailName').val(data.apply.allpkinfo.typeinfo.typename).attr('readonly','readonly');

					$('#mailTitle').val(data.apply.apptitle);
					$('#mailReason').val(data.apply.appreason);
					
					$('#mailSize').val(data.apply.allpkinfo.mailinfo.roomsize);
					$('#mailUseAddr').val(data.apply.allpkinfo.mailinfo.useuser);
					
					$('#mialUser').val(data.apply.allpkinfo.mailinfo.usetime);
					$('#mailUserSpell').val(data.apply.allpkinfo.mailinfo.namespell);

					$('#mailUseTime').val(data.apply.allpkinfo.mailinfo.usetime);


					//下拉列表  默认选择  				
					$(".mailtype").each(function(i){
						var a = $(this).val();
						if(data.apply.dictinfo.dictvalue==a){
							$(this).arrt('selected','selected');
						}	
					});
					

						
					$('#mialUpReason').val(data.apply.allpkinfo.mailinfo.addamendreason);			
					$('#mialDesc').val(data.apply.allpkinfo.mailinfo.maildesc);

					//隐藏当前ipinfo编号
					$('#mailDiv').append("<table><tr><td colspan='4'><input type='hidden' id='mailSeq' value='"+data.apply.allpkinfo.mailinfo.mailid+"'/></td></tr></table>");
		
				}
				else if(typeid=='4'){
					$('#commDiv').show();
					$("#commUp").removeAttr("disabled");


					//文本框赋值
					$('#commId').val(data.apply.appid).attr('readonly','readonly');
					$('#commName').val(data.apply.allpkinfo.typeinfo.typename).attr('readonly','readonly');

					$('#commTitle').val(data.apply.apptitle);
					$('#commReason').val(data.apply.appreason);
					
					$('#finishedDate').val(data.apply.allpkinfo.comminfo.finishdate);
					$('#commUseAddr').val(data.apply.allpkinfo.comminfo.useadd);

					
					//下拉列表  默认选择  
					$(".property").each(function(i){
						var a = $(this).val();
						if(data.apply.dictinfo.dictvalue==a){
							$(this).arrt('selected','selected');
						}	
					});
					
					
					$('#userCount').val(data.apply.allpkinfo.comminfo.usercount);
					
					
					$('#operateExplain').val(data.apply.allpkinfo.comminfo.operateexplain);
					$('#commDesc').val(data.apply.allpkinfo.comminfo.commdesc);

					//隐藏当前ipinfo编号
					$('#commDiv').append("<table><tr><td colspan='4'><input type='hidden' id='commSeq' value='"+data.apply.allpkinfo.comminfo.commid+"'/></td></tr></table>");

				}
				else if(typeid=='5'){
					$("#telDiv").show();
					$("#telUp").removeAttr("disabled");
					
					//文本框赋值
					$('#telId').val(data.apply.appid).attr('readonly','readonly');
					$('#telName').val(data.apply.allpkinfo.typeinfo.typename).attr('readonly','readonly');

					$('#telTitle').val(data.apply.apptitle);
					$('#telReason').val(data.apply.appreason);
					
					$('#startDate').val(data.apply.allpkinfo.telmeeting.startdate);
					$('#endDate').val(data.apply.allpkinfo.telmeeting.enddate);
					$('#jionNum').val(data.apply.allpkinfo.telmeeting.jionnum);
					
					if(data.apply.allpkinfo.telmeeting.isgived=='1'){
						$('#s1').attr('selected','selected');
					}
					else{
						$('#s2').attr('selected','selected');
					}
					$('#meetAdd').val(data.apply.allpkinfo.telmeeting.meetadd);
					
					$('#espReq').val(data.apply.allpkinfo.telmeeting.especialrequest);
					$('#telDesc').val(data.apply.allpkinfo.telmeeting.especialrequest);

						alert(data.apply.allpkinfo.telmeeting.telid);
					
					//隐藏当前ipinfo编号
					$('#telDiv').append("<table><tr><td colspan='4'><input type='hidden' name='telmeeting.telid' id='telSeq' value='"+data.apply.allpkinfo.telmeeting.telid+"' /></td></tr></table>");
					
				}
				else if(typeid=='6'){
					$("#otherDiv").show();
					$("#otherUp").removeAttr("disabled");
					
					//文本框赋值
					$('#otherId').val(data.apply.appid).attr('readonly','readonly');
					$('#otherName').val(data.apply.allpkinfo.typeinfo.typename).attr('readonly','readonly');

					$('#otherTitle').val(data.apply.apptitle);
					$('#otherReason').val(data.apply.appreason);

					$('#otherDetail').val(data.apply.allpkinfo.otherinfo.otherdetail);
					$('#otherDesc').val(data.apply.allpkinfo.otherinfo.otherdesc);

					//隐藏当前ipinfo编号
					$('#otherDiv').append("<table><tr><td colspan='4'><input type='hidden' id='otherSeq' value='"+data.apply.allpkinfo.otherinfo.otherid+"'/></td></tr></table>");
				}
			}
		});
		
	});
});



//【我的申请单 修改】====================================
//-------------------------ip修改
$(function(){
	$('#ipUp').click(function(){	
		var ipid=$('#ipSqe').val();
		var appnumber=$('#appnumber').val();
		var ipUseAddr=$('#ipUseAddr').val();
		var ipUseTime=$('#ipUseTime').val();
		var netNum=$('#netNum').val();
		var ipDesc=$('#ipDesc').val();
	
		$.ajax({
			type:'POST',
			url:'updateApp.action',
			data:{'ipaddrinfo.ipid':ipid,'ipaddrinfo.appnumber':appnumber,'ipaddrinfo.useaddr':ipUseAddr,'ipaddrinfo.usetime':ipUseTime,'ipaddrinfo.netnum':netNum,'ipaddrinfo.iddesc':ipDesc},
			success:function(){
				alert("修改成功啦！");
				findAllMyApp();
			}
		});
		
	});
});


//---------------------telmeeting修改
$(function(){
	$('#telUp').click(function(){	
		var telid=$('#telSeq').val();
		var startDate=$('#startDate').val();
		var endDate=$('#endDate').val();
		var idGived=$('#idGived').val();
		var jionNum=$('#jionNum').val();
		var meetAdd=$('#meetAdd').val();
		var espReq=$('#espReq').val();
		var telDesc=$('#telDesc').val();

		$.ajax({
			type:'POST',
			url:'updateApp!telUpdate.action',
			data:{'telmeeting.telid':telid,'telmeeting.startdate':startDate,
			'telmeeting.enddate':endDate,'telmeeting.meetadd':meetAdd,
			'telmeeting.isgived':idGived,'telmeeting.especialrequest':espReq,
			'telmeeting.meetdesc':telDesc,'telmeeting.jionnum':jionNum},
			success:function(){
				alert("修改成功！");
				findAllMyApp();
			}
		});
		
	});
});


//--------------------comminfo修改
$(function(){
	$('#commUp').click(function(){	
		var commid=$('#commSeq').val();
		var finishedDate=$('#finishedDate').val();
		var commUseAddr=$('#commUseAddr').val();
		var operateExplain=$('#operateExplain').val();
		var commDesc=$('#commDesc').val();
		var userCount=$('#userCount').val();
		var property=$('property').val();

		$.ajax({
			type:'POST',
			url:'updateApp!commUpdate.action',
			data:{'comminfo.commid':telid,'comminfo.finishdate':finishedDate,
			'comminfo.useadd':commUseAddr,'comminfo.operateexplain':operateExplain,
			'comminfo.usercount':userCount,'comminfo.dictinfo.dictitem':property,
			'comminfo.commDesc':commDesc},
			success:function(){
				alert("修改成功啦！");
				findAllMyApp();
			}
		});
		
	});
});


//---------------------------------otherinfo修改
$(function(){
	$('#otherUp').click(function(){	
		var otherid=$('#otherSeq').val();
		var otherDetail=$('#otherDetail').val();
		var otherDesc=$('#otherDesc').val();

		$.ajax({
			type:'POST',
			url:'updateApp!otherUpdate.action',
			data:{'otherinfo.otherid':telid,'otherinfo.otherdetail':otherDetail,
				'otherinfo.otherdesc':otherDesc
			},
			success:function(){
				alert("修改成功啦！");
				findAllMyApp();
			}
		});
		
	});
});


//----------------------------------strroominfo修改
$(function(){
	$('#strUp').click(function(){	
		var strid=$('#strSeq').val();
		var roomNeed=$('#roomNeed').val();
		var strUseAddr=$('#strUseAddr').val();
		var strUseTime=$('#strUseTime').val();
		var strDesc=$('#strDesc').val();

		$.ajax({
			type:'POST',
			url:'updateApp!strUpdate.action',
			data:{'strroominfo.roomid':strid,'strroominfo.roomneed':roomNeed,
				'strroominfo.usetime':strUseTime,'strroominfo.useradd':strUseAddr,
				'strroominfo.strdesc':strDesc
			},
			success:function(){
				alert("修改成功啦！");
				findAllMyApp();
			}
		});
		
	});
});



//-----------------------------------mailinfo修改
$(function(){
	$('#mailUp').click(function(){	
		var mailid=$('#mailSeq').val();
		var mailSize=$('#mailSize').val();
		var mailUseAddr=$('#mailUseAddr').val();
		var mialUser=$('#mialUser').val();
		var mailUseTime=$('#mailUseTime').val();
		var mialAppType=$('#mialAppType').val();
		var mailUserSpell=$('mailUserSpell').val();
		var mialUpReason=$('#mialUpReason').val();
		var mialDesc=$('mialDesc').val();


		$.ajax({
			type:'POST',
			url:'updateApp!mailUpdate.action',
			data:{'mailinfo.mailid':telid,'mailinfo.roomsize':mailSize,
			'mailinfo.useadd':mailUseAddr,'mailinfo.useuser':mialUser,
			'mailinfo.addamendreason':mialUpReason,'mailinfo.usetime':mailUseTime,
			'mailinfo.namespell':mailUserSpell,'mailinfo.dictinfo.dictitem':mialAppType,
			'mailinfo.mialdesc':mialDesc},
			success:function(){
				alert("修改成功啦！");
				findAllMyApp();
			}
		});
		
	});
});


//=====================================================
//给所有的下来列表赋值
$(function(){
	$.ajax({
		dataType:'json',
		type:'POST',
		url:'<%=path%>/dict.action',
		success:function(data){
			$.each(data.list,function(i,dict){
				if(dict.dictvalue=='3'){
					$('#mialAppType').append("<option class='mailtype' value='"+dict.dictid+"'>"+dict.dictitem+"</option>");
				}
				if(dict.dictvalue=='2'){
					$('#property').append("<option class='property' value='"+dict.dictid+"'>"+dict.dictitem+"</option>");
				}
			});	
		}
	});

	
});


</script>
</head>
<body>
<div id="mainDiv">
	<div id="topDiv">
	<div id="tmenu"><ul>
	<li ><a href="#" id='myApply'>我的申请单</a></li>
	<li ><a id="ma" href="#">审批管理</a></li>
	<li ><a id="fenpei" href="#">分配管理</a></li>
	<li ><a id="chuli" href="#">处理管理</a></li>
	<li ><a id="indint" href="#">个人设置</a></li>
	</ul></div></div>
	<div id="centerDiv">
	
	<div id="left">
		<div id="lhead">申请单创建</div>
		<ul>
		<li ><a id="ipApp" href="#">IP申请单</a></li>
		<li ><a id="mailApp" href="#">邮件地址申请单</a></li>
		<li ><a id="telApp" href="#">电话会议申请单</a></li>
		<li ><a id="commApp" href="#">通讯业务申请单</a></li>
		<li ><a id="strApp" href="#">存储空间申请单</a></li>
		<li ><a id="otherApp" href="#">其他业务申请单</a></li>
		</ul>
	</div>
	<div id="right"> 
	<div id="current">&nbsp;&nbsp;&nbsp;&nbsp;当前登录人:【<span style="font-size: 15;color: red">${user.username}</span>】</div>
	<div id="showAll">
	<div id="rightMain"></div>
	   <div id="page"></div>
		 <div id='ipDiv' style="display: none">

		 	<table cellpadding="0" cellspacing="0" width="100%">
		 		<tr>
		 			<td>申请单编号：</td><td><input id='ipId' type="text"/></td>
		 			<td>申请类型名：</td><td><input id='ipName' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td>申请标题：</td><td><input id='ipTitle' type="text"/><span class="awokeWord" id="ipTit"></span></td>
		 			<td>申请原因：</td><td><input id='ipReason' type="text"/><span class="awokeWord" id="ipRea"></span></td>
		 		</tr>
		 		<tr>
		 			<td>请求数量：</td><td><input id='appNumber' type="text"/><span class="awokeWord" id="ipasknum"></span></td>
		 			<td>使用地址：</td><td><input id='ipUseAddr' type="text"/><span class="awokeWord" id="ipuseadd"></span></td>
		 		</tr>
		 		<tr>
		 			<td>使用时间：</td><td><input id='ipUseTime' type="text"/><span class="awokeWord" id="ipusetime"></span></td>
		 			<td>网口号码：</td><td><input id='netNum' type="text"/><span class="awokeWord" id="ipnetnum"></span></td>
		 		</tr>
		 		<tr>	
					<td>备注：</td><td  colspan="3"><input id='ipDesc' type="text"/><span class="awokeWord" id="ipDe"></span></td>
		 		</tr>
		 		
		 		<tr>
		 			<td colspan="4">
		 			<input id='ipUp' type="button" value='修改' disabled="disabled"/>
		 			<input id='ipAdd' type="button" value='添加' disabled="disabled"/>
		 			<input id='ipRe' type="reset" value='重置' disabled="disabled"/>
		 			</td>
		 		</tr>
		 	</table>
		 </div>
		
		  
		 
		 <div id='mailDiv'  style="display: none">
		 		<table cellpadding="0" cellspacing="0" width="100%">
		 		<tr>
		 			<td>申请单编号：</td><td><input id='mialId' type="text"/></td>
		 			<td>申请类型名：</td><td colspan="3"><input id='mailName' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td>申请标题：</td><td><input id='mailTitle' type="text"/><span class="awokeWord" id="mailTit"></span></td>
		 			<td>申请原因：</td><td><input id='mailReason' type="text"/><span class="awokeWord" id="mailRea"></span></td>
		 		</tr>
		 		
		 		<tr>
		 			<td>邮箱大小：</td><td><input id='mailSize' type="text"/>(M)<span class="awokeWord" id="mailcount"></span></td>
		 			<td>使用地址：</td><td><input id='mailUseAddr' type="text"/><span class="awokeWord" id="mailuseadd"></span></td>
		 		</tr>
		 		<tr>
		 			<td>使用者姓名：</td><td><input id='mialUser' type="text"/><span class="awokeWord" id="mailuser"></span></td>
		 			<td>使用者姓名全拼：</td><td><input id='mailUserSpell' type="text"/><span class="awokeWord" id="mailuserspe"></span></td>
		 		</tr>
		 		<tr>
		 			<td>使用期限：</td><td><input id='mailUseTime' type="text"/><span class="awokeWord" id="mailtime"></span></td>
		 			<td>申请类型：</td>
		 			<td>
		 				<select id='mialAppType'></select>
		 			</td>	 
		 		</tr>
		 		<tr>
		 			<td>新增（更改）原因：</td><td><input id='mialUpReason' type="text"/><span class="awokeWord" id="mailuprea"></span></td>
		 			<td>备注：</td><td><input id='mailDesc' type="text"/>
		 			
		 			
		 			</td>
		 		</tr>
		 		<tr>
		 			<td colspan="4">
		 			<input id='mailUp' type="button" value='修改' disabled="disabled"/>
		 			<input id='mailAdd' type="button" value='添加' disabled="disabled"/>
		 			<input id='mailRe' type="reset" value='重置' disabled="disabled"/>
		 			</td>
		 		</tr>
		 	</table>
		 </div>
		 
		 
		 <div id='telDiv' style="display: none">
		 	<table cellpadding="0" cellspacing="0" width="100%">
		 		<tr>
		 			<td>申请单编号：</td><td><input id='telId' type="text"/></td>
		 			<td>申请类型名：</td><td><input id='telName' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td>申请标题：</td><td><input id='telTitle' type="text"/><span class="awokeWord" id="telTit"></span></td>
		 			<td>申请原因：</td><td><input id='telReason' type="text"/><span class="awokeWord" id="telRea"></span></td>
		 		</tr>
		 		
		 		<tr>
		 			<td>开始时间：</td>
		 			<td>
		 				<input type="text" id="startDate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" class="Wdate" />
		 				<span class="awokeWord" id="telst"></span>
		 			</td>
		 			<td>结束时间：</td>
		 			<td>
		 				<input type="text" id="endDate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" class="Wdate" />
		 				<span class="awokeWord" id="telet"></span>
		 			</td>
		 		</tr>
				<tr>
		 			<td>参见者（方）总数：</td><td><input id='jionNum' type='text' /><span class="awokeWord" id="teljoinnum"></span></td>
		 			<td>是否给予技术设备：</td>
		 			<td>
		 				<SELECT id='idGived'> 
		 					<option value=1 id='s1'>是</option>
		 					<option value=0 id='s2'>否</option>
		 				</SELECT>
		 			</td>
		 		</tr>
		 		<tr>
		 			<td>地点：</td><td><input id='meetAdd' type="text"/><span class="awokeWord" id="teluseadd"></span></td>
		 			<td>特殊要求：</td><td><input id='espReq' type="text"/><span class="awokeWord" id="telspa"></span></td>
		 		</tr>
		 		<tr>
		 			<td>备注：</td><td colspan="3"><input id='telDesc' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td colspan="4">
		 			<input id='telUp' type="button" value='修改'  disabled="disabled"/>
		 			<input id='telAdd' type="button" value='添加'  disabled="disabled"/>
		 			<input id='telRe' type="reset" value='重置'  disabled="disabled"/>
		 			</td>
		 		</tr>
		 	</table>
		 </div>
		 
		 <div id='strDiv' style="display: none">
		 	<table cellpadding="0" cellspacing="0" width="100%">
		 		<tr>
		 			<td>申请单编号：</td><td><input id='strId' type="text"/></td>
		 			<td>申请类型名：</td><td><input id='strName' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td>申请标题：</td><td><input id='strTitle' type="text"/><span class="awokeWord" id="strTit"></span></td>
		 			<td>申请原因：</td><td><input id='strReason' type="text"/><span class="awokeWord" id="strRea"></span></td>
		 		</tr>
		 		
		 		<tr>
		 			<td>空间需求大小：</td><td><input id='roomNeed' type="text"/>(M)<span class="awokeWord" id="strsize"></span></td>
		 			<td>使用地址：</td><td><input id='strUseAddr' type="text"/><span class="awokeWord" id="struseadd"></span></td>
		 		</tr>
		 		<tr>
		 			<td>使用时间：</td><td><input id='strUseTime' type="text"/><span class="awokeWord" id="strusetime"></span></td>
		 			<td>备注：</td><td><input id='strDesc' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td colspan="4">
		 			<input id='strUp' type="button" value='修改' disabled="disabled"/>
		 			<input id='strAdd' type="button" value='添加' disabled="disabled"/>
		 			<input id='strRe' type="reset" value='重置' disabled="disabled"/>
		 			</td>
		 		</tr>
		 	</table>
		 </div>


		 <div id='otherDiv' style="display: none">
		 		<table cellpadding="0" cellspacing="0" width="100%">
		 		<tr>
		 			<td>申请单编号：</td><td><input id='otherId' type="text"/></td>
		 			<td>申请类型名：</td><td><input id='otherName' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td>申请标题：</td><td><input id='otherTitle' type="text"/><span class="awokeWord" id="othTit"></span></td>
		 			<td>申请原因：</td><td><input id='otherReason' type="text"/><span class="awokeWord" id="othRea"></span></td>
		 		</tr>
		 		
		 		<tr>
		 			<td>问题详述：</td><td><input id='otherDetail' type="text"/><span class="awokeWord" id="othdetail"></span></td>
		 			<td>备注：</td><td><input id='otherDesc' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td colspan="4">
		 			<input id='otherUp' type="button" value='修改' disabled="disabled"/>
		 			<input id='otherAdd' type="button" value='添加' disabled="disabled"/>
		 			<input id='otherRe' type="reset" value='重置' disabled="disabled"/>
		 			</td>
		 		</tr>
		 	</table>
		 </div>
		  
		   
		   
		 <div id='commDiv' style="display: none">
		 		<table cellpadding="0" cellspacing="0" width="100%">
		 		<tr>
		 			<td>申请单编号：</td><td><input id='commId' type="text"/></td>
		 			<td>申请类型名：</td><td><input id='commName' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td>申请标题：</td><td><input id='commTitle' type="text"/><span class="awokeWord" id="commTit"></span></td>
		 			<td>申请原因：</td><td><input id='commReason' type="text"/><span class="awokeWord" id="commRea"></span></td>
		 		</tr>
		 		
		 		<tr>
		 			<td>完成时间：</td>
		 			<td>
		 				<input type="text" id="finishedDate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" class="Wdate" />
		 				<span class="awokeWord" id="commFd"></span>
		 			</td>
		 			<td>使用地址：</td><td><input id='commUseAddr' type="text"/><span class="awokeWord" id="commadd"></span></td>
		 		</tr>
		 		<tr>
		 			<td>使用者数量：</td><td><input id='userCount' type="text"/><span class="awokeWord" id="commusercount"></span></td>
		 			<td>属性：</td><td>
		 				<select id='property'></select>
		 			</td>
		 		</tr>
		 		<tr>
		 			<td>业务需求：</td><td><input id='operateExplain' type="text"/><span class="awokeWord" id="commex"></span></td>
		 			<td>备注：</td><td><input id='commDesc' type="text"/></td>
		 		</tr>
		 		<tr>
		 			<td colspan="4">
		 			<input id='commUp' type="button" value='修改' disabled="disabled"/>
		 			<input id='commAdd' type="button" value='添加' disabled="disabled"/>
		 			<input id='commRe' type="reset" value='重置' disabled="disabled"/>
		 			</td>
		 		</tr>
		 	</table>
		 	
		 </div>
	</div>
		<h2 id="h2"></h2>
	</div>
	</div>
	<div id="bottomDiv"></div>
</div>
</body>
</html>