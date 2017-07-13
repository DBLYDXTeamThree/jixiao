<%@ page language="java" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>无标题文档</title>
		<link href="css/css.css" rel="stylesheet" type="text/css">
	</head>

	<body>
		<table width="98%" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td height="41" background="images/table/right-top-bg.jpg">
					<img src="images/ico/home-ico.jpg" width="4" height="10"
						hspace="10" align="absmiddle">
					<span class="txt-blue">我的工作&gt;&gt;起草考核</span>
				</td>
			</tr>
		</table>
		<table width="98%" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td>
					<table width="100%" align="center" cellpadding="0" cellspacing="0">
						<tr>
							<td height="21" background="images/table/list-top.jpg"
								class="table-left-right-gray">
								&nbsp;
							</td>
						</tr>
						<tr>
							<td>
								<table width="100%" border="1" align="center" cellpadding="2"
									cellspacing="0" bordercolorlight="#D4D4D4"
									bordercolordark="#FFFFFF" bgcolor="#FFFFFF"
									style="word-break: break-all;">
									<tr bgcolor="#FBE9B7">
										<td width="8%" class="table-right-bottom-gray">
											<div align="center">
												<input type="checkbox" name="checkbox" value="checkbox">
											</div>
										</td>
										<td width="53%" class="table-right-bottom-gray">
											<div align="center">
												<span class="txt-blue">考核标题</span>
											</div>
										</td>
										<td width="20%" class="table-right-bottom-gray">
											<div align="center">
												<span class="txt-blue">起草人</span>
											</div>
										</td>
										<td width="19%" class="table-bottom-gray">
											<div align="center">
												<span class="txt-blue">起草时间</span>
											</div>
										</td>
									</tr>

									<c:forEach var="doc" items="${list}" varStatus="state">
										<tr bgcolor='${state.count%2==0?"#E5EEFF":"#FFFFFF"}'>
											<td class="table-right-bottom-gray">
												<div align="center">
													<input type="checkbox" name="checkbox2" value="checkbox">
												</div>
											</td>
											<td class="table-right-bottom-gray">
												<a href="wodegz-qckh.htm" target="_blank" class="txt-gray">${doc.docname}</a>
											</td>
											<td class="table-right-bottom-gray">
												<a href="#" class="txt-gray">${doc.realname}</a>
											</td>
											<td class="table-bottom-gray">
												<span class="txt-gray">[<fmt:formatDate value="${doc.checktime }" pattern="yyyy-MM-dd"></fmt:formatDate>]</span>
											</td>
										</tr>


									</c:forEach>



									<tr>
										<td colspan="4">
											<%@include file="subPage.jsp" %>
										</td>
									
									</tr>
							

									<!-- 以下是操作菜单 -->

									<tr bgcolor="#F9F9F9">
										<td colspan="4" class="table-right-bottom-gray">
											<div align="center">
											</div>
											<table width="100%" cellpadding="0" cellspacing="0">
												<tr>
													<td width="8%">
														<input type="checkbox" name="checkbox16" value="checkbox">
													</td>
													<td width="68%">
														<span class="txt-blue">选择全部</span>
													</td>

													<td width="12%">
														<table align="right" cellpadding="0" cellspacing="0">
															<tr style="cursor: pointer">
																<td>
																	<img src="images/button/an-left.jpg" width="18"
																		height="21">
																</td>
																<td width="60" background="images/button/an-bg.jpg"
																	class="txt-blue">
																	<div align="center"
																		onclick="javascript:location.href='myWorks_createdraftDoc.jsp'">
																		起草新考核
																	</div>
																</td>
																<td>
																	<img src="images/button/an-right.jpg" width="4"
																		height="21">
																</td>
															</tr>
														</table>
													</td>








													<td width="12%">
														<table align="right" cellpadding="0" cellspacing="0">
															<tr style="cursor: pointer">
																<td>
																	<img src="images/button/an-left.jpg" width="18"
																		height="21">
																</td>
																<td width="60" background="images/button/an-bg.jpg"
																	class="txt-blue">
																	<div align="center">
																		全部删除
																	</div>
																</td>
																<td>
																	<img src="images/button/an-right.jpg" width="4"
																		height="21">
																</td>
															</tr>
														</table>
													</td>
												</tr>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>

