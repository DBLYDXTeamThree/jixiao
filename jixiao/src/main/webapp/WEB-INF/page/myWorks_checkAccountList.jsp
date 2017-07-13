<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>
<link href="css/css.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="src/jquery11.js"></script>

<script type="text/javascript">

	$(function(){
		
		$("#btn_submit").click(function(){
			
			var a=$("input[type='hidden']");
			var b="~";
			for(var i=0;i<a.length;i++){
		/*		b=b+a.eq(i).val().length+"-";
				if(i%15==0){
					alert(b);
					b="~";
				}*/
				if(a.eq(i).val().length==0){
					alert("请为所有人打分。");
					return;
				}
			}
			
			$("#form1")[0].submit();
			
		});
	});
	
	function checkAccount(index){
	//	alert(index);
		
	//	alert($("input[name='realname']").eq(index).val());

	//	alert($("div[name='sxszvalue']").eq(0).text());
	//将当前被考核人的信息传给新窗口
		var obj= new Object();
		obj.realName=$("input[name='realname']").eq(index).val();
		obj.orderid=$("input[name='orderid']").eq(index).val();
		obj.sxszvalue=$("input[name='sxszvalue']").eq(index).val();
		obj.ljzlvalue=$("input[name='ljzlvalue']").eq(index).val();
		obj.gzzfvalue=$("input[name='gzzfvalue']").eq(index).val();
		obj.jcnlvalue=$("input[name='jcnlvalue']").eq(index).val();
		obj.zzxtnlvalue=$("input[name='zzxtnlvalue']").eq(index).val();
		obj.cxnlvalue=$("input[name='cxnlvalue']").eq(index).val();
		obj.ldnlvalue=$("input[name='ldnlvalue']").eq(index).val();
		obj.zrxvalue=$("input[name='zrxvalue']").eq(index).val();
		obj.fwysvalue=$("input[name='fwysvalue']").eq(index).val();
		obj.mbdcvalue=$("input[name='mbdcvalue']").eq(index).val();
		obj.glxlvalue=$("input[name='glxlvalue']").eq(index).val();
		obj.xskfvalue=$("input[name='xskfvalue']").eq(index).val();

		
		
		
		var result=window.showModalDialog("wodegz-db-khpf.htm",obj,"center:yes;dialogHeight:540px; dialogWidth:1024px;");
		
		
		for(var property in result){
			if(property.indexOf("Text")==-1){
				$("input[name='"+property+"']").eq(result.orderid).val(result[property]);
			//	alert($("input[name='"+property+"']").val());
		//	alert("sss");
			}else{
				$("div[name='"+property+"']").eq(result.orderid).text(result[property]);
			}
		}
		
	}
	
</script>
</head>

<body>









	<table width="98%" align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td align="center"><img src="images/top-pic.jpg" width="993"
				height="133">
			</td>
		</tr>
	</table>
	<table width="993" align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td height="41" background="images/table/right-top-bg.jpg"><img
				src="images/ico/home-ico.jpg" width="4" height="10" hspace="10"
				align="absmiddle"><span class="txt-blue">我的工作&gt;&gt;待办</span>
			</td>
		</tr>
	</table>
	<form action="pendingCheck.do?flag=insert" method="post" id="form1">
	<table width="993" align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td><table width="100%" align="center" cellpadding="0"
					cellspacing="0">
					<tr>
						<td height="21" background="images/table/list-top.jpg"
							class="table-left-right-gray">&nbsp;</td>
					</tr>
					<tr>
						<td><table width="100%" border="1" align="center"
								cellpadding="2" cellspacing="0" bordercolorlight="#D4D4D4"
								bordercolordark="#FFFFFF" bgcolor="#FFFFFF"
								style="word-break: break-all;">
								<tr>
									<td width="15%" rowspan="2" bgcolor="#FBE9B7"><div
											align="center">
											<span class="txt-blue">姓名</span>
										</div>
									</td>
									<td colspan="3" bgcolor="#FBE9B7"><div align="center">
											<span class="txt-blue">德</span>
										</div>
									</td>
									<td colspan="4" bgcolor="#FBE9B7"><div align="center">
											<span class="txt-blue">能</span>
										</div>
									</td>
									<td colspan="3" bgcolor="#FBE9B7"><div align="center">
											<span class="txt-blue">勤</span>
										</div>
									</td>
									<td colspan="2" bgcolor="#FBE9B7"><div align="center">
											<span class="txt-blue">绩</span>
										</div>
									</td>
									<td width="3%" rowspan="2" bgcolor="#FBE9B7"><div
											align="center">
											<span class="txt-blue">考核</span>
										</div>
									</td>
								</tr>
								<tr>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											思<br> 想<br> 素<br> 质
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											廉<br> 洁<br> 自<br> 律
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											工<br> 作<br> 作<br> 风
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											决<br> 策<br> 能<br> 力
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											组<br> 织<br> 协<br> 调<br> 能<br> 力
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											创<br> 新<br> 能<br> 力
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											领<br> 导<br> 能<br> 力
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											责<br> 任<br> 心
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											服<br> 务<br> 意<br> 识
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											目<br> 标<br> 达<br> 成
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											管<br> 理<br> 效<br> 率
										</div>
									</td>
									<td width="7%" valign="top" bgcolor="#FEF9ED" class="txt-gray"><div
											align="center">
											下<br> 属<br> 开<br> 发<br>
										</div>
									</td>
								</tr>


								<input type="hidden" name="docId" value="${docId }"/>
								<c:forEach items="${list}" var="a" varStatus="state">
									<tr bgcolor='${state.count%2==1?"#E5EEFF":"#FFFFFF"}'>
										<input type="hidden" name="accountid"
											value="${a.checkedaccountid}" />
											<input type="hidden" name="checkedid" value="${a.checkedid}" />
										<input type="hidden" name="realname" value="${a.realname}" />
										<input type="hidden" name="orderid" value="${state.index}" />
										<input type="hidden" name="sxszvalue" value="${a.sxszvalue}" />
										<input type="hidden" name="ljzlvalue" value="${a.ljzlvalue}" />
										<input type="hidden" name="gzzfvalue" value="${a.gzzfvalue}" />
										<input type="hidden" name="jcnlvalue" value="${a.jcnlvalue}" />
										<input type="hidden" name="zzxtnlvalue"
											value="${a.zzxtnlvalue}" />
										<input type="hidden" name="cxnlvalue" value="${a.cxnlvalue}" />
										<input type="hidden" name="ldnlvalue" value="${a.ldnlvalue}" />
										<input type="hidden" name="zrxvalue" value="${a.zrxvalue}" />
										<input type="hidden" name="fwysvalue" value="${a.fwysvalue}" />
										<input type="hidden" name="mbdcvalue" value="${a.mbdcvalue}" />
										<input type="hidden" name="glxlvalue" value="${a.glxlvalue}" />
										<input type="hidden" name="xskfvalue" value="${a.xskfvalue}" />


										<td height="22" class="txt-gray"><div align="center">${a.realname
												}</div>
										</td>
										<td class="txt-gray"><div align="center"
												name="sxszvalueText">${a.sxszvalue}</div>
										</td>
										<td class="txt-gray"><div name="ljzlvalueText"
												align="center">${a.ljzlvalue }</div>
										</td>
										<td class="txt-gray"><div name="gzzfvalueText"
												align="center">${a.gzzfvalue }</div>
										</td>
										<td class="txt-gray"><div name="jcnlvalueText"
												align="center">${a.jcnlvalue }</div>
										</td>
										<td class="txt-gray"><div name="zzxtnlvalueText"
												align="center">${a.zzxtnlvalue }</div>
										</td>
										<td class="txt-gray"><div name="cxnlvalueText"
												align="center">${a.cxnlvalue }</div>
										</td>
										<td class="txt-gray"><div name="ldnlvalueText"
												align="center">${a.ldnlvalue }</div>
										</td>
										<td class="txt-gray"><div name="zrxvalueText"
												align="center">${a.zrxvalue }</div>
										</td>
										<td class="txt-gray"><div name="fwysvalueText"
												align="center">${a.fwysvalue }</div>
										</td>
										<td class="txt-gray"><div name="mbdcvalueText"
												align="center">${a.mbdcvalue }</div>
										</td>
										<td class="txt-gray"><div name="glxlvalueText"
												align="center">${a.glxlvalue }</div>
										</td>
										<td class="txt-gray"><div name="xskfvalueText"
												align="center">${a.xskfvalue }</div>
										</td>
										<td class="txt-gray"><div name="" align="center">
												<table width="80" align="center" cellpadding="0"
													cellspacing="0">
													<tr>
														<td><img src="images/button/an-left-1.jpg" width="4"
															height="21">
														</td>
														<td width="80" background="images/button/an-bg.jpg"
															class="txt-blue"><div align="center"
																style="cursor: pointer;"
																onclick="checkAccount(${state.index})">考核评分</div>
														</td>
														<td><img src="images/button/an-right.jpg" width="4"
															height="21">
														</td>
													</tr>
												</table>
											</div>
										</td>
									</tr>

								</c:forEach>




								<tr bgcolor="#F9F9F9">
									<td height="22" colspan="14" class="txt-gray"><div
											align="right">
											<table align="right" cellpadding="0" cellspacing="0">
												<tr>
													<td><img src="images/button/an-left.jpg" width="18"
														height="21">
													</td>
													<td width="60" background="images/button/an-bg.jpg"
														class="txt-blue"><div align="center" id="btn_submit" style="cursor: pointer;">
															
																提交问卷
														</div>
													</td>
													<td><img src="images/button/an-right.jpg" width="4"
														height="21">
													</td>
												</tr>
											</table>
										</div>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</form>
	<table width="993" cellspacing="0" cellpadding="0" align="center">
		<tr>
			<td height="40" background="images/sub-bottom-pic.jpg"><div
					align="right">
					<span class="txt-gray">中国移动通信集团新疆有限公司版权所有 （ Copyright (C)
						2004-2005 ）</span>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>
