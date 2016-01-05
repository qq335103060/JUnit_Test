<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>后台管理系统 by www.865171.cn</title>
<style type="text/css" media="all">
@import "js/jBox.css";
</style>
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jBox-1.0.0.0.js" type="text/javascript"></script>
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
	padding-left:80px;
	padding-right:80px;
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




.high{
   	background-color : #00CCFF;
}

a{
   text-decoration: blink;
}

#rightMain{
  margin-left:-6px;
}
#rightMain table{
	margin-top:10px;
	width: 100%;
	border: 1px #CC00FF solid;
}
#rightMain table tr th{
	border: 1px #CC00FF solid;
	font-size: 18;
}

#rightMain table tr td{
	border: 1px #CC00FF solid;
	text-align: center;
}



#rightMain form{
	margin-top: 5px;
}





#rightCenter{
  margin-left:-3px;
  margin-top: 30px;
}

#rightCenter{
  margin-left:-3px;
  margin-top: 30px;
}

#rightBottom table{
	width:800px;
	margin-top:100px;
	border: 1px #00CCFF solid;
}
#rightBottom table tr th{
	border: 1px #00CCFF solid;
	font-size: 18;
	text-align: center;
}

#rightBottom table tr td{
	border: 1px #00CCFF solid;
	text-align: center;
}
.trbgcolor{
background-color:#C4EEFE;
}



legend{
	font-size: 15px;
	
}

fieldset{
	font-size: 15px;
}

<!--错误提示  样式-->
.errorClass{
	color: red;
}

span{
	color: red;
}


#myUsers{
	width: 100px;
	margin-left: 60px;
}

</style>

<script language="javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
		$(function(){
			$("#rightMain table tr").live("mouseover",function(){
				$(this).addClass("trbgcolor");
			
			});
			$("#rightMain table tr").live("mouseout",function(){
				$(this).removeClass("trbgcolor");
			});
		});
		
	</script>

<!-- yw  用户管理-->
<script type="text/javascript">

//点击  【用户管理】
$(function(){
	$('#usersManagement').click(function(){
		//清空【rightMain】 div 的所有元素
		$('#rightMain').empty();
		$('#rightCenter').empty();
		$('#rightBottom').empty();
		$("#page").empty();
		findAllUser();		
	});
});

//查询所有
function page2(a,data){
    var currentPage = a;//当前页码
	var recordCount = data.userList.length;//总行数
	var pageSize =3;//每页的行数
	var pageCount = (recordCount - 1) /pageSize + 1;//总页数
	var firstIndex = (currentPage - 1)*pageSize;//当前页第一行
	var lastIndex = firstIndex + pageSize;//当前页最后一行

				var From=$("<form></form>");
				
				var FileSet=$("<fieldset></fieldset>");
				FileSet.append("<legend>模糊查询</legend>").append("<label>用户名：</label>");
				
				var na=$("<input id='un' type='text'/>");
				
				FileSet.append(na)
				.append("<input id='mohu' type='button' value='模糊查询'/><br><div id='myUsers'></div>");
				
				From.append(FileSet);
				$("#rightMain").append(From);
				
				if(data.userList.length==0){
					alert("当前没有用户信息！");
				}
				else{
					var tableElement = $("<table cellpadding='0'  cellspacing='0'><thead><th>序号</th><th>编号</th><th>姓名</th><th>性别</th><th>部门</th><th>电话</th><th>查看</th><th>修改</th><th>删除</th></thead></table>");
					var tableBody = $("<tbody id='myusers'></tbody>");
					
					$.each(data.userList,function(i,user){
					if(firstIndex<=i && i<lastIndex){
						var trElement = $("<tr></tr>");
						trElement.append("<td>" + (i+1) +"</td>")
						.append("<td>" +user.userid +"</td>")
						.append("<td>" + user.username +"</td>")
						.append("<td>" + user.usersex +"</td>")
						.append("<td>" + user.deptinfo.deptname +"</td>")
						.append("<td>" + user.usertel +"</td>")
						.append("<td><a href='#' class='lookat'><img src='images/chakan2.GIF' /></a></td>")
						.append("<td><a href='#' class='upd'><img src='images/xiugai.GIF' /><a></td>")
						.append("<td><a href='#' class='del'><img src='images/delete.gif' /></a></td>");
									
						tableBody.append(trElement);
						}
					}); 
						
					tableElement.append(tableBody);
					$("#rightMain").append(tableElement).append("<input id='addUser' type='button' value='添加'/>");
					return pageCount;
				}
}

function findAllUser(){
	$.ajax({
		dataType : "json",
		type : "POST",
		url: "abled.action", 
		success: function(data){	
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

//自动补全
$(function(){
	$('#un').die('keyup').live("keyup",function(){
		var name=$("#un").val();
	
		$.ajax({
			dataType:'json',
			type:'POST',
			url:'mohu.action',
			data:{'user.username':name},
			success:function(data){
				var t=$("<table></table>");
				//循环 遍历集合
				$.each(data.userList,function(i,user){
					var tr=$("<tr></tr>");
					tr.append("<td>"+user.username+"</td>");
					t.append(tr);
				});
				
				$("#myUsers").empty();
				
				$("#myUsers").append(t);
			}
		});
		
	});
});


//模糊查询
$(function(){
	$("#mohu").live("click",function(){
		$("#page").empty();
		
		var name=$("#un").val();
		$.ajax({
			dataType:'json',
			type:'POST',
			url:'mohu.action',
			data:{'user.username':name},
			success:function(data){
				$("#rightMain").html("");

			
				if(data.userList.length==0){
					alert("当前没有匹配的用户信息！");
					findAllUser();
				}
				else{
					var From=$("<form></form>");
					
					var FileSet=$("<fieldset></fieldset>");
					FileSet.append("<legend>模糊查询</legend>").append("用户名：");
					var na=$("<input id='un' type='text'/>");
					FileSet.append(na)
					.append("<input id='mohu' type='button' value='模糊查询'/>");
					
					From.append(FileSet);
					$("#rightMain").append(From);
					
					var tableElement = $("<table cellpadding='0'  cellspacing='0'><thead><th>序号</th><th>编号</th><th>姓名</th><th>性别</th><th>部门</th><th>电话</th><th>查看</th><th>修改</th><th>删除</th></thead></table>");
					var tableBody = $("<tbody id='myusers'></tbody>");
			
					$.each(data.userList,function(i,user){
						var trElement = $("<tr></tr>");
						trElement.append("<td>" + (i+1) +"</td>")
						.append("<td>" +user.userid +"</td>")
						.append("<td>" + user.username +"</td>")
						.append("<td>" + user.usersex +"</td>")
						.append("<td>" + user.deptinfo.deptname +"</td>")
						.append("<td>" + user.usertel +"</td>")
						.append("<td><a href='#' class='lookat'><img src='images/chakan2.GIF' /></a></td>")
						.append("<td><a href='#' class='upd'><img src='images/xiugai.GIF' /><a></td>")
						.append("<td><a href='#' class='del'><img src='images/delete.gif' /></a></td>");
								
						tableBody.append(trElement);
					}); 

					tableElement.append(tableBody);
					$("#rightMain").append(tableElement).append("<input id='addUser' type='button' value='添加'/>");
				}
			}
		
		});
	});
});

//选择当前行
function selectUser(){
   		$("#myusers tr").live("click",function(){
   			$(this).addClass("high").siblings().removeClass("high");	
   		});
}


//删除
function aa(){
	$('.del').live("click",function(){
		//获得当前行的用户Id
		var uId=$(this).parent().parent().find("td").eq(1).text();
		
		$.ajax({
			type:"POST",
			url:'user!deleteById.action',
			data:{'user.userid':uId},
			success:function(){
				alert("员工删除成功!");
				findAllUser();
			}
		});
	});
	
};


//点击【查看】
detailone();
function detailone(){
	$(".lookat").live("click",function(){
		
		$("#rightCenter").empty();
		
		//获得当前行的用户Id
		var uId=$(this).parent().parent().find("td").eq(1).text();

		$.ajax({
			dataType : "json",
			type:"POST",
			url:'detail.action',
			data:{'user.userid':uId},
			success:function(data){
				$("#rightBottom").html("");
				var myTable=$("<table id='tab1' cellpadding='0' with='800' align='center'  cellspacing='0'></table>");

				var myt=$("<tr id='t'><th colspan='6'>当前用户详细信息如下</th></tr>");
				myTable.append(myt);
				
				var myt1=$("<tr id='t1'></tr>");
				
				myt1.append("<td>编号:</td>")
				.append("<td>"+data.user.userid+"</td>")
				.append("<td>用户名:</td>")
				.append("<td>"+data.user.username+"</td>")
				.append("<td>性别:</td>")
				.append("<td>"+data.user.usersex+"</td>");
				myTable.append(myt1);
								
				
				var myt2=$("<tr id='t2'></tr>");
				myt2.append("<td>地址:</td>")
				.append("<td>"+data.user.useradd+"</td>")
				.append("<td>电话:</td>")
				.append("<td>"+data.user.usertel+"</td>")
				.append("<td>等级:</td>");
	
				if(data.user.userlevel=='1'){
					myt2.append("<td>管理员</td>");
				}
				if(data.user.userlevel=='2'){
					myt2.append("<td>普通用户</td>");
				}
				myTable.append(myt2);


		
				var myt3=$("<tr id='t3'></tr>");
				
				myt3.append("<td>是否是部门分配人:</td>");
				if(data.user.isallotman=='1'){
					myt3.append("<td>是</td>");
				}
				else{
					myt3.append("<td>否</td>");
				}

				myt3.append("<td>是否是部门管理人:</td>");
				if(data.user.isdirector=='1'){
					myt3.append("<td>是</td>");
				}
				else{
					myt3.append("<td>否</td>");
				}
				
				myt3.append("<td>是否启用该用户:</td>");
				if(data.user.userstatus=='1'){
					myt3.append("<td>是</td>");
				}
				else{
					myt3.append("<td>否</td>");
				}
				myTable.append(myt3);

				
				
				var myt4=$("<tr id='t4'></tr>");
				
				myt4.append("<td colspan='3'>所在部门：</td>");
				myt4.append("<td colspan='3'>"+data.user.deptinfo.deptname+"</td>");

				myTable.append(myt4);
				
				$("#rightBottom").append(myTable);	
				
			}
		});
	});
	
};





//查询当前用户的信息
function detailInfo(){
	$(".upd").live("click",function(){
		$("#rightCenter").empty();
		
		
		//获得当前行的用户Id
		var uId=$(this).parent().parent().find("td").eq(1).text();

		$.ajax({
			dataType : "json",
			type:"POST",
			url:'detail.action',
			data:{'user.userid':uId},
			success:function(data){
				$("#rightBottom").html("");
				var myFrom=$("<form id='mff'></form>");
				
				var myFileSet=$("<fieldset id='mss'></fieldset>");

						
				myFileSet.append("<legend>用户信息修改</legend>")
				.append("<label>编号:</label><input id='num' type='text' name='user.userid' value='"+data.user.userid+"' readonly='readonly'/><br/>")
				.append("<label>用户名:</label><input id='name' type='text' name='user.username' value='"+data.user.username+"' readOnly='readOnly'/> <br/>")
				.append("<label>性别:</label><input id='sex' type='text' name='user.userpwd' value='"+data.user.usersex+"' readOnly='readOnly'/> <br/>")
				.append("<input id='pwd' type='hidden' name='user.userpwd' value='"+data.user.userpwd+"'/>")
				.append("<input id='addr' type='hidden' name='user.useradd' value='"+data.user.useradd+"'/>")
				.append("<input id='tel' type='hidden' name='user.usertel' value='"+data.user.usertel+"'/>")
				.append("<input id='level' type='hidden' name='user.userlevel' value='"+data.user.userlevel+"'/>")
				.append("<input id='allotman' type='hidden' name='user.isallotman' value='"+data.user.isallotman+"'/>")
				.append("<input id='director' type='hidden' name='user.isdirector' value='"+data.user.isdirector+"'/>")
				.append("<input id='deptno' type='hidden' name='user.deptinfo.deptid' value='"+data.user.deptinfo.deptid+"'/><br/><label>是否启用该用户：</lable>")
				
				var myUserStatus=$("<select id='status' name='user.userstatus'></select>");
				if(data.user.userstatus=="1"){
					myUserStatus.append("<option value=1 selected='selected'>是</option>");
					myUserStatus.append("<option value=0>否</option>");
				}
				else{
					myUserStatus.append("<option value=1 selected='selected'>否</option>");
					myUserStatus.append("<option value=0>是</option>");			
				}
				
				myFileSet.append(myUserStatus).append('<br/><label>部门:</label>');
				
				
						
				var mySelect=$("<select id='dept' name='user.deptinfo.deptid'></select>");

				
				//查询所有的部门   并默认选中当前的部门
				$.each(data.deptinfos,function(i,dept){
					if(dept.deptid==data.user.deptinfo.deptid){
						mySelect.append("<option value='"+dept.deptid+"' selected='selected'>"+dept.deptname+"</option>");
					}
					else{
						mySelect.append("<option value='"+dept.deptid+"'>"+dept.deptname+"</option>");
					}
					
				});
	
				myFileSet.append(mySelect)
				.append("<br/><input id='upUSerSub' type='button' value='修改'/>        ")
				.append("      <input id='upUSerRet' type='button' value='取消'/><br/>");

				myFrom.append(myFileSet);
			
				$("#rightBottom").append(myFrom);	
				
			}
		});
	});
	
};


//点击页面修改按钮
$(function(){
	$('#upUSerSub').live('click',function(){
		var id=$('#num').val();
		var name=$('#name').val();
		var pwd=$('#pwd').val();
		var sex=$('#sex').val();
		var addr=$('#addr').val();
		var tel=$('#tel').val();
		var level=$('#level').val();
		var allotman=$('#allotman').val();
		
		
		var director=$('#director').val();
				
		var deptno=$('#dept').val();
		var  status=$('#status').val();
		
				
		$.ajax({
			type:"POST",
			url:'detail!update.action',
			data:{'user.userid':id,'user.username':name,'user.userpwd':pwd,
				'user.usersex':sex,'user.useradd':addr,'user.usertel':tel,
				'user.userlevel':level,'user.isallotman':allotman,'user.deptinfo.deptid':deptno,
				'user.userstatus':status,'user.isdirector':director},
			success:function(){
				alert("修改成功");
				$('#rightBottom').empty();
				findAllUser();
			}
		});
	});
});

//点击【取消】
$(function(){
	$("#upUSerSub").live('click',function(){
		findAllUser();
	});
});


//点击添加
$(function(){
	$('#addUser').live('click',function(){
		$('#rightCenter').empty();
		$('#rightBottom').empty();
		$('#rightCenter').toggle();

		//查询所有的部门  并在添加页面显示所有的添加信息
		$.ajax({		
			dataType:"json",
			type:"POST",
			url:'allDept.action',
			success:function(data){			
				$("#rightCenter").html("");
				var tableElement = $("<table align='center' border='1px' width='930px'></table>");
				var tableBody = $("<tbody></tbody>");
				var trElement = $("<tr></tr>");
				var trElement2 = $("<tr></tr>");
				var trElement3 = $("<tr></tr>");
				var trElement4 = $("<tr></tr>");
				var trElement5 = $("<tr></tr>");
				var trElement6 = $("<tr></tr>");	
				var trElement7 = $("<tr></tr>");	
				trElement.append("<td align='center' colspan='4'>添加用户</td>");
				trElement2.append("<td align='right'>用户名:</td><td><input id='name1' type='text'><span id='nameError' class='errorClass'></span></td>")
				.append("<td align='right'>密码:</td><td><input id='pwd1' type='text' value='000000' readonly='readonly'/></td>");
				
				trElement3.append("<td align='right'>地址:</td><td><input id='addr1' type='text'/><span id='addrError' class='errorClass'></span></td>")
				.append("<td align='right'>电话:</td><td><input id='tel1' type='text'/><span id='telError' class='errorClass'></span></td>");
				trElement4.append("<td align='right'>性别:</td><td><select id='sex' name='user.usersex'><option value='男'>男</option><option value='女'>女</option></select></td>")
				.append("<input id='level' type='hidden' name='user.userlevel' value='2'/>")
				.append("<td align='right'>是否是分配人:</td><td><select id='allotman' name='user.isallotman'><option value='1'>是</option><option value='0'>否</option></select></td>");
				
				trElement5.append("<td align='right'>是否是部门管理人:</td><td><select id='director' name='user.isdirector'><option value='1'>是</option><option value='0'>否</option></select></td>")
				.append("<td align='right'>是否启用:</td><td><select id='status' name='user.userstatus'><option value='1'>是</option><option value='0'>否</option></select></td>");
				trElement6.append("<td align='right'>部门:</td>");
				var mySelect=$("<select id='deptno' name='user.deptinfo.deptid'></select>");
				//查询所有的部门 
				$.each(data.deptinfos,function(i,dept){
						mySelect.append("<option value='"+dept.deptid+"' selected='selected'>"+dept.deptname+"</option>");
				});
				var tda = $("<td align='left' colspan='3'></td>")
				tda.append(mySelect);
				trElement6.append(tda);
				trElement7.append("<td align='center' colspan='2'><input id='userAddSub' type='button' value='添加'/></td>")
				.append("<td align='center' colspan='2'><input id='userAddRet' type='reset' value='取消'/></td>");

				tableBody.append(trElement);
				tableBody.append(trElement2);
				tableBody.append(trElement3);
				tableBody.append(trElement4);
				tableBody.append(trElement5);
				tableBody.append(trElement6);
				tableBody.append(trElement7);
				tableElement.append(tableBody);
				$("#rightCenter").append(tableElement);	
				
				$('#addUser').hide();		
				
			}
		});
		
	});
});


//添加之前查询当前用户名是否存在
$('#name1').live('blur',function(){
	var name=$('#name1').val();
	$.ajax({
		dataType:'json',
		type:'POST',
		data:{'user.username':name},
		url:'isExist.action',
		success:function(data){
			if(data.userList.length>0){
				$('#nameError').empty();
				$('#nameError').append("(*当前用户名已经存在!*)").addClass(".errorClass");
				$("#name1").focus();
			}
			else{
				$('#nameError').empty();
			}
		}
	});
});

//点击添加按钮  添加用户
$(function(){
		$('#userAddSub').live('click',function(){
		var name=$('#name1').val();
		var pwd=$('#pwd1').val();
		var sex=$('#sex').val();
		var addr=$('#addr1').val();
		var tel=$('#tel1').val();
		var level=$('#level').val();
		var allotman=$('#allotman').val();
	
		var director=$('#director').val();
		
		var deptno=$('#deptno').val();
		var  status=$('#status').val();

		//用户名
		if(name.length==0){
			$('#nameError').empty();
			$('#nameError').append("(*用户名不能为空哦!*)").attr("class","errorClass");
			$("#name1").focus();
			return false;
		}
		else{
			$('#nameError').empty();
		}
		
		var re=/^([a-zA-Z]|[_])+(([a-zA-Z0-9][_]){1,})$/;
		if(re.test(name)==false){
			$('#nameError').empty();
			$('#nameError').append("(*用户名以字母、下划线开头，后跟字母、数字、下划线哦!*)").addClass("errorClass");
			$("#name1").focus();
			return false;
		}
		else{
			$('#nameError').empty();
		}

		//地址
	    if(addr.length==0){
			$('#addrError').empty();
			$('#addrError').append("(*地址不能为空哦!*)").addClass("errorClass");
			$("#addr1").focus();
			return false;
		}
		else{
			$('#addrError').empty();
		}
		
	    var re1=/^[\u4e00-\u9fa5]{1,}$/;
		if(re1.test(addr)==false){
			$('#addrError').empty();
			$('#addrError').append("(*地址只能填中文哦!*)").addClass("errorClass");
			$("#addr1").focus();
			return false;
		}
		else{
			$('#addrError').empty();
		}
		
		
		
		//电话号码
		if(tel.length==0){
			$('#telError').empty();
			$('#telError').append("(*电话号码不能为空哦!*)").addClass("errorClass");
			$("#tel1").focus();
			return false;
		}
		else{
			$('#telError').empty();
		}
		
		//验证正则表达式	13段、14段、15段、18段
		re2=/^(13([4]|[012356789])([0-9]|[0-8]|9)\d{7})|(14(7|5)\d{8})|(15[012356789]\d{8})|(18[0-9]\d{8})$/;
		if(re2.test(tel)==false){
			$('#telError').empty();
			$('#telError').append("(*电话号码填错啦!*)").addClass("errorClass");
			$("#tel1").focus();
			return false;
		}
		else{
			$('#telError').empty();
		}
		
		//验证通过
		$.ajax({
				type:"POST",
				url:'abled!addUser.action',
				data:{'user.username':name,'user.userpwd':pwd,
					'user.usersex':sex,'user.useradd':addr,'user.usertel':tel,
					'user.userlevel':level,'user.isallotman':allotman,'user.deptinfo.deptid':deptno,
					'user.userstatus':status,'user.isdirector':director},
				success:function(){
					alert("员工添加成功");
					$("#rightCenter").empty();
					findAllUser();
					$('#addUser').show('slow');
				}
		});
	});

});
		




// 调用   查询所有的用户
findAllUser();

//调用   选择当前行
selectUser();

//调用    删除
aa();


//点击修改
detailInfo();



//===========================================================================================================================
//点击  【部门管理】
$('#deptManagement').live("click",function(){
	//调用查询所有的部门
	Depts();
	
});


//查询所有的部门
function Depts(){
	//清空【rightMain】 div 的所有元素
	$('#rightMain').empty();
	$('#rightCenter').empty();
	$('#rightBottom').empty();
	$("#page").empty();
	
	$.ajax({
		dataType : "json",
		type:"POST",
		url:'allDept.action',
		success:function(data){
			$('#rightMain').html("");
			var tableElement = $("<table cellpadding='0'  cellspacing='0'><thead><th>序号</th><th>编号</th><th>名称</th><th>说明</th><th>是否可用</th><th>修改</th><th>删除</th></thead></table>");
			var tableBody = $("<tbody id='mydepts'></tbody>");
			
				$.each(data.deptinfos,function(i,dept){
					var trElement = $("<tr></tr>");
					trElement.append("<td>" + (i+1) +"</td>")
					.append("<td>" + dept.deptid +"</td>")
					.append("<td>" + dept.deptname +"</td>");
					
					if(dept.deptdesc==null){
						trElement.append("<td>无</td>");
					}
					else{
						trElement.append("<td>" + dept.deptdesc +"</td>");
					}
					
					if(dept.isabled=='1'){
						trElement.append("<td>是</td>")
					}
					else{
						trElement.append("<td>否</td>")
					}
					
					trElement.append("<td><a href='#'><img src='images/xiugai.GIF' /><a></td>")
					.append("<td><span><a href='#'><img src='images/delete.gif' /></a></span></td>");
							
					tableBody.append(trElement);
				}); 
			
				
				tableElement.append(tableBody);			
					
				$("#rightMain").append(tableElement).append("<input id='addDeptbtn' type='button' value='添加'/>");
			
		}
	});
}


//查询当前编号的部门信息
$(function(){
	$('#mydepts tr td a').live('click',function(){
		$("#rightCenter").empty();

		
		//获得当前部门编号
		var deptId=$(this).parent().parent().find('td').eq(1).text();
		
		//根据编号查询
		$.ajax({
			dataType:'json',
			type:'POST',
			url:'showDept.action',
			data:{'dept.deptid':deptId},
			success:function(data){
			
				$("#rightBottom").html("");
				var myFrom1=$("<form id='f1'></form>");
				
				var myFileSet1=$("<fieldset id='fd1'></fieldset>");

						
				myFileSet1.append("<legend>部门信息修改</legend>")
				.append("<label>编号:</label><input id='num'  type='text' readonly='readonly'/><br/>")
				.append("<label>名称:</label><input id='deptname1' type='text' value='"+data.dept.deptname+"'/> <br/>");

				if(data.dept.deptdesc==null){
					myFileSet1.append("<label>说明:</label><input id='desc' type='text' value='无'/> <br/><label>是否启用</label>");
				}
				else{
					myFileSet1.append("<label>说明:</label><input id='desc' type='text' value='"+data.dept.deptdesc+"'/> <br/><label>是否启用</label>");
				}
				
				var myDeptStatus=$("<select id='isabled' name='dept.isabled'></select>");
				
				if(data.dept.isabled=="1"){
					myDeptStatus.append("<option value=1 selected='selected'>是</option>");
					myDeptStatus.append("<option value=0>否</option>");
				}
				else{
					myDeptStatus.append("<option value=1 selected='selected'>否</option>");
					myDeptStatus.append("<option value=0>是</option>");			
				}
				
				
				myFileSet1.append(myDeptStatus)
				.append("<br/><input id='upDeptSub' type='button' value='修改'/>");

				myFrom1.append(myFileSet1);
			
				$("#rightBottom").append(myFrom1);	
			}
		});
		
	});
});

//修改
$(function(){
	$('#upDeptSub').live('click',function(){
		var num=$('#num').val();
		var name=$('#deptname').val();
		var desc=$('#desc').val();
		var isabled=$('#isabled').val(); 
		
		//调用修改的方法
		$.ajax({
			type:'POST',
			url:'allDept!updateDept.action',
			data:{'dept.deptid':num,'dept.deptname':name,'dept.deptdesc':desc,'dept.isabled':isabled},
			success:function(){
				alert('修改成功');
				Depts();
			},
			error:function(){
				alert('修改失败!');
			}
		});
	});
});



//删除
$(function(){
	$('#mydepts tr td span').live('click',function(){
		//获得当前部门编号
		var deptId=$(this).parent().parent().find('td').eq(1).text();
				
		//调用修改的方法
		$.ajax({
			type:'POST',
			url:'<%=path%>/allDept!deleteDeptById.action',
			data:{'dept.deptid':deptId},
			success:function(){
				alert('删除成功!');
				Depts();
			},
			error:function(){
				alert('删除失败！');
			}
		});
	});
});


//点击【添加】  显示要添加的信息
 $(function(){
   		$("#addDeptbtn").live('click',function(){
   		   		$('#rightBottom').empty();//清空修改页
   				$('#rightCenter').empty();//清空添加页
   				$('#rightCenter').show();

   				
				$("#rightCenter").html("");
				
				var myForm1=$("<form id='f1'></form>");
				
				var myFileSet1=$("<fieldset id='fd1'></fieldset>");

						
				myFileSet1.append("<legend>部门添加</legend>")
				.append("<label>编号:</label><input id='num' type='text' readonly='readonly'/><br/>")
				.append("<label>名称:</label><input id='deptname2' type='text'/><span id='deptnameError' class='errorClass'></span><br/>")
				.append("<label>说明:</label><input id='desc' type='text'/><br/><label>是否启用</label>");
				
				
				var myDeptStatus=$("<select id='isabled'></select>");
				
				
				myDeptStatus.append("<option value=1>是</option>").append("<option value=0>否</option>");
				
				myFileSet1.append(myDeptStatus)
				.append("<br/><input id='addDept' type='button' value='添加'/>      ")
				.append("     <input type='reset' value='重置' />");

				myForm1.append(myFileSet1);
				
				$('#rightCenter').append(myForm1);
			
   		});
 })
   

//添加部门
$(function(){
	$('#addDept').live('click',function(){
		var name=$("#deptname2").val();
		if(name.length==0){
			$("#deptnameError").empty();
			$("#deptnameError").append("部门名称不能为空哦！");
			$("#deptname2").focus();
			return false;
		}
		else{
			$("#deptnameError").empty();
		}
		
		//验证通过
		$.ajax({
			type:'POST',
			url:'allDept!addDept.action',
			data:{'dept.deptname':$('#deptname2').val(),'dept.deptdesc':$('#desc').val(),'dept.isabled':$('#isabled').val()},
			success:function(){
					alert("部门添加成功啦！");
					Depts();
			},
			error:function(){
				alert("哎，部门添加失败了，重新添加吧！");
			}
		});
	});
	
});


//=========================================================================================================================
//点击【申请类型管理】
$('#appTypeManagement').live("click",function(){
	Types();
});
//查询所有的可用的申请类型
function Types(){
	//清空【rightMain】 div 的所有元素
	$('#rightMain').empty();
	$('#rightCenter').empty();
	$('#rightBottom').empty();
	$("#page").empty();
	$.ajax({
		dataType : "json",
		type:"POST",
		url:'allType.action',
		success:function(data){
			$('#rightMain').html("");
			var tableElement = $("<table cellpadding='0'  cellspacing='0'><thead><th>序号</th><th>编号</th><th>类型名称</th><th>分配人</th><th>是否可用</th><th>说明</th><th>修改</th><th>删除</th></thead></table>");
			var tableBody = $("<tbody id='mytypes'></tbody>");
			
				$.each(data.typeList,function(i,type){
					var trElement = $("<tr></tr>");
					trElement.append("<td>" + (i+1) +"</td>")
					.append("<td>" + type.typeid +"</td>")
					.append("<td>" + type.typename +"</td>")
					.append("<td>"+type.userinfo.username+"</td>");
					
					
					if(type.isabled=="1"){
						trElement.append("<td>是</td>");
					}
					else{
						trElement.append("<td>否</td>");
					}
					if(type.typedesc==null){
						trElement.append("<td>无</td>");
					}
					else{
						trElement.append("<td>" + type.typedesc +"</td>");
					}
					
					trElement.append("<td><a href='#'><img src='images/xiugai.GIF' /><a></td>")
					.append("<td><span><a href='#'><img src='images/delete.gif' /></a></span></td>");
							
					tableBody.append(trElement);
				}); 
			
				
				tableElement.append(tableBody);			
					
				$("#rightMain").append(tableElement).append("<input id='addTypebtn' type='button' value='添加'/>");
			
		}
	});
}


//查询当前编号的申请类型信息
$(function(){
	$('#mytypes tr td a').live('click',function(){
		$('#rightCenter').empty();//清空添加页
			
		//获得当前部门编号
		var Id=$(this).parent().parent().find('td').eq(1).text();
		
		//根据编号查询
		$.ajax({
			dataType:'json',
			type:'POST',
			url:'showType.action',
			data:{'type.typeid':Id},
			success:function(data){
			
				$("#rightBottom").html("");
				var myFrom1=$("<form id='f1'></form>");
				
				var myFileSet1=$("<fieldset id='fd1'></fieldset>");

						
				myFileSet1.append("<legend>申请类型信息修改</legend>")
				.append("<label>编号:</label><input id='num'  type='text' name='type.typeid' value='"+data.type.typeid+"' readonly='readonly'/><br/>")
				.append("<label>名称:</label><input id='name' type='text' name='type.typename' value='"+data.type.typename+"'/><br/><label>分配人：</label>");
				
				
				
				var allotman=$("<select id='uid'></select>"); 
				$.each(data.userList,function(i,u){
					if(data.type.userinfo.userid=u.userid){
						allotman.append("<option value='"+u.userid+"' selected='selected'>"+u.username+"</option>");
					}
					else{
						allotman.append("<option value='"+u.userid+"'>"+u.username+"</option>");
					}
				});
				myFileSet1.append(allotman).append("<br><label>是否可用</label>");
				
				
				var myTypeStatus=$("<select id='isabled' name='type.isabled'></select>");
				
				if(data.type.isabled=="1"){
					myTypeStatus.append("<option value=1 selected='selected'>是</option>");
					myTypeStatus.append("<option value=0>否</option>");
				}
				else{
					myTypeStatus.append("<option value=1 selected='selected'>否</option>");
					myTypeStatus.append("<option value=0>是</option>");			
				}
				
				
				myFileSet1.append(myTypeStatus);
				if(data.type.typedesc==null){
					myFileSet1.append("<br/><label>说明:</label><input id='desc' type='text' name='type.deptdesc' value='无'/> <br/>");
				}
				else{
					myFileSet1.append("<br/><label>说明:</label><input id='desc' type='text' name='type.deptdesc' value='"+data.type.typedesc+"'/> <br/>");
				}
				
				myFileSet1.append("<br/><input id='upTypeSub' type='button' value='修改'/>");

				myFrom1.append(myFileSet1);
			
				$("#rightBottom").append(myFrom1);	
			}
		});
		
	});
});

//修改
$(function(){
	$('#upTypeSub').live('click',function(){
		var num=$('#num').val();
		var name=$('#name').val();
		var desc=$('#desc').val();
		var isabled=$('#isabled').val(); 
		var uid=$('#uid').val();
		
		alert(num+name+desc+isabled);
		//调用修改的方法
		$.ajax({
			type:'POST',
			url:'allType!updateType.action',
			data:{'type.typeid':num,'type.typename':name,'type.typedesc':desc,'type.isabled':isabled,'type.userinfo.userid':uid},
			success:function(){
				alert('修改成功');
				Types();
			},
			error:function(){
				alert('修改失败!');
			}
		});
	});
});



//删除
$(function(){
	$('#mytypes tr td span').live('click',function(){
		//获得当前申请编号
		var typeid=$(this).parent().parent().find('td').eq(1).text();
				
		//调用修改的方法
		$.ajax({
			type:'POST',
			url:'<%=path%>/allType!deleteTypeById.action',
			data:{'type.typeid':typeid},
			success:function(){
				alert('删除成功!');
				Types();
			},
			error:function(){
				alert('删除失败！');
			}
		});
	});
});


//点击【添加------申请单类型】  显示要添加的信息
 $(function(){
   		$("#addTypebtn").live('click',function(){
   		   		$('#rightBottom').empty();//清空修改页
   				$('#rightCenter').empty();//清空添加页
   				$('#rightCenter').show();
   				
				$.ajax({
					dataType:'json',
					type:'POST',
					url:'findDeptId.action',
					data:{'dept.deptid':'2'},
					success:function(data){
						
						$("#rightCenter").html("");
						var myForm1=$("<form id='f1'></form>");
						
						var myFileSet1=$("<fieldset id='fd1'></fieldset>");
					
						myFileSet1.append("<legend>申请单类型添加</legend>")
						.append("<label>编号:</label><input id='num' type='text' name='type.typeid' readonly='readonly'/><br/>")
						.append("<label>名称:</label><input id='typename1' type='text' name='type.typename'/><span id='typenameError' class='errorClass'></span><br/>")
						.append("<label>说明:</label><input id='desc' type='text' name='type.typedesc'/><br/><label>是否启用：</label>");
						
						
						var myTypeStatus=$("<select id='isabled' name='type.isabled'></select>");
						myTypeStatus.append("<option value=1>是</option>").append("<option value=0>否</option>");
						myFileSet1.append(myTypeStatus).append("<br/><lable>分配人：</label>");
				
						var allotman=$("<select id='uid'></select>"); 
						$.each(data.userList,function(i,u){
							allotman.append("<option value='"+u.userid+"'>"+u.username+"</option>");
						});
						myFileSet1.append(allotman);

						myFileSet1.append("<br/><input id='addTypeSub' type='button' value='添加'/>")
						.append("<input type='reset' value='重置' />");
	
						myForm1.append(myFileSet1);
						
						$('#rightCenter').append(myForm1);
					}
				});
   		});
 })
   

//添加申请类型
$(function(){
	$('#addTypeSub').live('click',function(){
		//
		var name=$("#typename1").val();
		if(name.length==0){
			$("#typenameError").empty();
			$("#typenameError").append("类型名称不能为空哦!");
			$("#typename1").focus();
			return false;
		}
		else{
			$("#typenameError").empty();
		}
		
		$.ajax({
			type:'POST',
			url:'allType!addType.action',
			data:{'type.typename':$('#name').val(),'type.typedesc':$('#desc').val(),'type.isabled':$('#isabled').val(),'type.userinfo.userid':$('#uid').val()},
			success:function(){
					alert("申请类型添加成功啦！");
					Types();
			},
			error:function(){
				alert("申请类型添加失败！");
			}
		});
	});
});





</script>


<!-- ljb 字典信息-->
<script type="text/javascript">
//查询所有字典信息
function page1(p,data){
	var currentPage = p;//当前页码
	var recordCount = data.list.length;//总行数
	var pageSize =5;//每页的行数
	var pageCount = (recordCount - 1) /pageSize + 1;//总页数
	var firstIndex = (currentPage - 1)*pageSize;//当前页第一行
	var lastIndex = firstIndex + pageSize;//当前页最后一行
	
    			var tableElement = $("<table><thead> <th>编号</th><th>序号</th><th>条目</th><th>字典值</th><th>是否启用 </th><th colspan='3'>操作</th></thead></table>");
				var tableBody = $("<tbody id='mydicts'></tbody>");
				$.each(data.list,function(i,dictinfo){
					if(firstIndex<=i && i<lastIndex){
					var trElement = $("<tr  align='center'></tr>");
					trElement.append("<td>" + (i+1) +"</td>")
					.append("<td>" + dictinfo.dictid +"</td>")
					.append("<td>" + dictinfo.dictitem +"</td>")
					.append("<td>" + dictinfo.dictvalue +"</td>");
					if(dictinfo.dictstatus=='1'){
						trElement.append("<td>是</td>");
					}
					else{
						trElement.append("<td>否</td>");
					}

					trElement.append("<td><a href='#' id='updateButton'><img src='images/xiugai.GIF' /><a></td>");

					//.append("<td><a href='#' id='delButton'>删除</a></td>"); 
					 tableBody.append(trElement);
					}
				}); 
				tableElement.append(tableBody);
				$("#rightMain").append(tableElement);
				return pageCount;
     	
		
}

function findAbledDict(){
		$.ajax({
			dataType : "json",
			type : "POST",
			url : "dict.action",
			success : function(data){	
			$("#page").html("");	
			
			 $("#rightMain").html("");
				 var pageCount = page1(1,data);

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
					       page1(1,data);
					       $("#iter").val(1);
					});
					
					$("#iter").change(function(){				
						var currentPage = $("#iter").val();//当前页码
						 $("#rightMain").html("");
						page1(currentPage,data);
					});
					
					$("#shang").click(function(){
						 
						var currentPage = $("#iter").val();//当前页码
						currentPage--;
						$("#iter").val(currentPage);

						var currentPage = $("#iter").val();
						$("#rightMain").html("");
						page1(currentPage,data);
						});
					$("#xia").click(function(){
						 
						var currentPage = $("#iter").val();//当前页码
						currentPage++;
						$("#iter").val(currentPage);
						var currentPage = $("#iter").val();
						$("#rightMain").html("");
						page1(currentPage,data);
						});
					//-------------------	
		}
		});
		
   	}
   	
function selectUser(){
   	$("#mydicts tr").live("click",function(){
   		$(this).addClass("high").siblings().removeClass("high");	
    });
}
//删除字典
/*
function bb(){
   		$("#delButton").live('click',function(){
   			
   			var Id=$(this).parent().parent().find("td").eq(1).text();
   			 $.ajax({
   				type : "POST",
   				url : "dict!delete.action",
   				data : {'dictinfo.dictid':Id},
   				success : function(){
   					alert("字典条目删除成功");
   					findAbledDict();			
   				
   				},
   				error:function(){
   					alert('删除失败！');
   				}
   			}); 
   		
   		});
   	}

*/
//修改字典前的文本取值
$(function(){
		$("#updateButton").live('click',function(){

		     //获得选项的值
		     var v=$(this).parent().parent().find('td').eq('1').text();
		    
		     $.ajax({
		       dataType:'json',
		       data:{'dictinfo.dictid':v},
		       url:'dict!findById.action',
		       success:function(data){
					$("#rightBottom").html("");
           
					var tableElement = $("<table align='center' border='1px' width='500px'></table>");
					var tableBody = $("<tbody></tbody>");
					var trElement = $("<tr></tr>");
					var trElement2 = $("<tr></tr>");
					var trElement3 = $("<tr></tr>");
					var trElement4 = $("<tr></tr>");
					trElement.append("<td  colspan='4'>字典信息修改</td>");
					trElement2.append("<td>序号:</td><td><input id='dictid' type='text' name='dictinfo.dictid' value='"+data.dictinfo.dictid+"' readonly='readonly'/></td>")
		    		.append("<td>条目:</td><td><input id='dictitem' type='text' name='dictinfo.dictitem' value='"+data.dictinfo.dictitem+"'/> </td>");
					trElement3.append("<td>字典值:</td><td><input id='dictvalue' type='text' name='dictinfo.dictvalue' value='"+data.dictinfo.dictvalue+"' readonly='readonly'/> </td>")
					.append('<td>字典状态:</td>');
				var myDictStatus=$("<select id='dictstatus' name='dictinfo.dictstatus'></select>");
		
				if(data.dictinfo.dictstatus=="1"){
					myDictStatus.append("<option value=1 selected='selected'>是</option>");
					myDictStatus.append("<option value=0>否</option>");
				}
				else{
					myDictStatus.append("<option value=1 selected='selected'>否</option>");
					myDictStatus.append("<option value=0>是</option>");			
				}
				var td = $("<td></td>");
				td.append(myDictStatus);
				trElement3.append(td);
				trElement4.append("<td align='center' colspan='4'><input id='upSub2' type='button' value='修改'/></td>");
				   
				   tableBody.append(trElement);
				   tableBody.append(trElement2);
				   tableBody.append(trElement3);
				   tableBody.append(trElement4);
				   tableElement.append(tableBody);
				
				$("#rightBottom").append(tableElement);
				}
			});		
			
			
		});
});
//执行修改
$(function(){
	$('#upSub2').live('click',function(){
		var dictid=$('#dictid').val();
		var dictitem=$('#dictitem').val();
		var dictvalue=$('#dictvalue').val();
		var dictstatus=$('#dictstatus').val();			
 
		$.ajax({
			type:"POST",
			url:'dict!update.action',
			data:{'dictinfo.dictid':dictid,
				  'dictinfo.dictitem':dictitem,
				'dictinfo.dictvalue':dictvalue,
				'dictinfo.dictstatus':dictstatus},
			success:function(){
				alert("修改成功");
				$('#rightBottom').empty();
				findAbledDict();
			}
		});
	});
});
  
  
//添加
 /* $(function(){
		$("#addButton").live('click',function(){
					$("#rightBottom").html("");
             
					var myFrom=$("<form id='mf'></form>");
					var myDictStatus=$("<select id='dictstatus' name='dictinfo.dictstatus'></select>");
					var myFileSet=$("<fieldset id='ms'></fieldset>");
			
					myFileSet.append("<legend>字典信息添加</legend>")
					.append("<label>序号:</label><input id='dictid' type='text' name='dictinfo.dictid'  readonly='readonly'/><br/>")
		    		.append("<label>条目:</label><input id='dictitem' type='text' name='dictinfo.dictitem'/> <br/>")
					.append("<label>字典值:</label><input id='dictvalue' type='text' name='dictinfo.dictvalue'/> <br/>")		 
				  	myDictStatus.append("<option value=1 selected='selected'>是</option>")
					.append("<option value=0>否</option>");
				    myFileSet.append(myDictStatus)
				         .append("<input id='addSub2' type='button' value='添加'/>");
					myFrom.append(myFileSet);
					$("#rightBottom").append(myFrom);
		            	
			
		});
});*/
//执行添加
/*
$(function(){
	$('#addSub2').live('click',function(){
		var dictid=$('#dictid').val();
		var dictitem=$('#dictitem').val();
		var dictvalue=$('#dictvalue').val();
		var dictstatus=$('#dictstatus').val();			

		$.ajax({
			type:"POST",
			url:'dict!save.action',
			data:{'dictinfo.dictid':dictid,
				  'dictinfo.dictitem':dictitem,
				'dictinfo.dictvalue':dictvalue,
				'dictinfo.dictstatus':dictstatus},
			success:function(){
				alert("添加成功");
				$('#rightBottom').empty();
				findAbledDict();
			}
		});
	});
});*/
  

$(function(){
	$('#DictManagement').click(function(){
		//清空【rightMain】 div 的所有元素
		$('#rightMain').empty();
	    $('#rightCenter').empty();
	    $('#rightBottom').empty();
		 findAbledDict();	
	});
});	

selectUser();

</script>


</head>
<body>
<div id="mainDiv">
	<div id="topDiv">
		<div id="tmenu">
			<ul>
			<li ><a href="#" id='usersManagement'>用户信息管理</a></li>
			<li ><a href="#" id='deptManagement'>部门管理</a></li>
			<li ><a href="#" id='appTypeManagement'>申请类型管理</a></li>
			<li ><a href="#" id='DictManagement'>数据字典管理</a></li>
		</ul>
		</div>
	</div>
	<div id="centerDiv">
		<div id="right"> 
			<div id="current">当前登录人：${u.username }</div>
			<div id="rightMain">
				<!-- 这里写改变后的页面内容  主页面 -->	
			</div>
			<div id="page" style="float: right;"></div>
			<div id="rightCenter" style="display: none">
				<!-- 这里显示【添加】的信息 -->
			</div>
			
			
			<div id="rightBottom">
				<!-- 这里显示附加【修改】信息 -->
			</div>
		</div>
	</div>
	<div id="bottomDiv"></div>
</div>
<script language="javascript">
	$("#test1").toggle(function(){$("#test").slideDown()},function(){$("#test").slideUp()})
</script>


</body>
</html>