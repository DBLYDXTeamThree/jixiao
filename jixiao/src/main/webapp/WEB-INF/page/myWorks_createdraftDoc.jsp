<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>无标题文档</title>
		<link href="css/css.css" rel="stylesheet" type="text/css">
		<link href="css/tree.css" rel="stylesheet" type="text/css" />
		<link href="sample-css/page.css" rel="stylesheet" type="text/css" />

		<style type="text/css">
body {
	color: #000; /* MAIN BODY TEXT COLOR */
	font-family: "Lucida Grande", "Lucida Sans Unicode", Arial, Verdana,
		sans-serif; /* MAIN BODY FONTS */
}

.demo {
	float: left;
	width: 260px;
}

.docs {
	margin-left: 265px;
}

a.button {
	font-size: 0.8em;
	margin-right: 4px;
}
</style>


		<script src="highlighter/scripts/shCore.js" type="text/javascript"></script>
		<script src="highlighter/scripts/shBrushJScript.js"
			type="text/javascript"></script>
		<script src="highlighter/scripts/shBrushCss.js" type="text/javascript"></script>
		<link href="highlighter/styles/shCore.css" rel="stylesheet"
			type="text/css" />
		<link href="highlighter/styles/shThemeDefault.css" rel="stylesheet"
			type="text/css" />

		<script src="src/jquery.js" type="text/javascript"></script>
		<script src="src/Plugins/jquery.tree.js" type="text/javascript"></script>
		
		<script type="text/javascript">
        SyntaxHighlighter.config.clipboardSwf = 'highlighter/scripts/clipboard.swf';
    	  SyntaxHighlighter.all();
	  </script>

		<script>
	   var userAgent = window.navigator.userAgent.toLowerCase();
        $.browser.msie8 = $.browser.msie && /msie 8\.0/i.test(userAgent);
        $.browser.msie7 = $.browser.msie && /msie 7\.0/i.test(userAgent);
        $.browser.msie6 = !$.browser.msie8 && !$.browser.msie7 && $.browser.msie && /msie 6\.0/i.test(userAgent);
        function load(root) {        
            var o = { showcheck: true
            };
            
       //   o.data = root;  
            o=root;                
            $("#tree").treeview(o);            
        }   
	  
	  </script>

		<script>
	  	$(function(){
	  		$.post("dept.do?flag=second",null,function(data){
	  			load(data);
	  		},"json");
	  		
	  		//提交表单
	  		$("#btn_submit").click(function(){
	  			var s=$("#tree").getCheckedNodes();
                if(s !=null){
                  alert(s.join(","));
                  $("#checkedAccount").val(s.join(","));
                }else{
                	alert("至少选择一个考核人！");
                	return;
                } 
                $("#form1")[0].submit();
                    
	  		});
	  		
	  	});
	  
	  </script>

	</head>

	<body class="txt-gray">
		<table width="98%" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td height="41" background="images/table/right-top-bg.jpg">
					<img src="images/ico/home-ico.jpg" width="4" height="10"
						hspace="10" align="absmiddle">
					<span class="txt-blue">我的工作&gt;&gt;起草考核</span>
				</td>
			</tr>
		</table>
		<form action="checkDoc.do?flag=insert" method="post" id="form1">
		<table width="50%" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td>
					考核名称
				</td>
				<td>
					<input type="text" name="docName"/>
					<input type="hidden" name="checkedAccount" id="checkedAccount"/>
				</td>
			</tr>
			<tr>
				<td>
					考核日期
				</td>
				<td>
					<input type="text" name="checkTime" value="2014-5-5">
				</td>
			</tr>

			<tr>
				<td>
					结束日期
				</td>
				<td>
					<input type="text" name="stopTime" value="2014-5-20">
				</td>
			</tr>

			<tr>
				<td>
					描述
				</td>
				<td>
					<input type="text" name="descript" style="width: 300px;">
				</td>
			</tr>
			<tr>
				<td>
					考核人员
				</td>
				<td>
					<div class="demo">

						<div
							style="border-bottom: #c3daf9 1px solid; border-left: #c3daf9 1px solid; width: 250px; height: 200px; overflow: auto; border-top: #c3daf9 1px solid; border-right: #c3daf9 1px solid;">
							<div id="tree">

							</div>

						</div>
					</div>
				</td>
			</tr>

			<tr>
				<td colspan="2">
					<input type="button" id="btn_submit" value="提交"/>
				</td>
			</tr>

		</table>

		</form>











	</body>
</html>

