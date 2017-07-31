<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<style></style>
</head>
<body>
	<div class="wrapper">
		<div class="user-broke-promise">
		
			<div class="widget">
				<div class="widget-head">
					<h5>用户失信被执行案件</h5>
				</div>
				<div class="widget-content">
					<table class="table table-striped table-bordered table-hover results">
						<thead>
							<tr>
								<th>案件</th>
								<th>第一个</th>
								<th>第二个</th>
								<th>第三个</th>
								<th>第四个</th>
								<th>第五个</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th>姓名</th>
								<td>${ex_bad1_name}</td>
								<td>${ex_bad2_name}</td>
								<td>${ex_bad3_name}</td>
								<td>${ex_bad4_name}</td>
								<td>${ex_bad5_name}</td>
							</tr>
							<tr>
								<th>身份证号/组织机构代码</th>
								<td>${ex_bad1_cid}</td>
								<td>${ex_bad2_cid}</td>
								<td>${ex_bad3_cid}</td>
								<td>${ex_bad4_cid}</td>
								<td>${ex_bad5_cid}</td>
							</tr>
							<tr>
								<th>证件类型</th>
								<td>
								<#if ex_bad1_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_bad1_cidtype=="11">
								组织机构代码
								</#if></td>
								<td><#if ex_bad2_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_bad2_cidtype=="11">
								组织机构代码
								</#if></td>
								<td><#if ex_bad3_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_bad3_cidtype=="11">
								组织机构代码
								</#if></td>
								<td><#if ex_bad4_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_bad4_cidtype=="11">
								组织机构代码
								</#if></td>
								<td><#if ex_bad5_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_bad5_cidtype=="11">
								组织机构代码
								</#if></td>
							</tr>
							
							<tr>
								<th>数据时间</th>
								<td>${ex_bad1_datatime}</td>
								<td>${ex_bad2_datatime}</td>
								<td>${ex_bad3_datatime}</td>
								<td>${ex_bad4_datatime}</td>
								<td>${ex_bad5_datatime}</td>
							</tr>
							
							<tr>
								<th>数据类型编码</th>
								<td>${ex_bad1_datatypeid}</td>
								<td>${ex_bad2_datatypeid}</td>
								<td>${ex_bad3_datatypeid}</td>
								<td>${ex_bad4_datatypeid}</td>
								<td>${ex_bad5_datatypeid}</td>
							</tr>
							
							<tr>
								<th>数据类型</th>
								<td>${ex_bad1_datatype}</td>
								<td>${ex_bad2_datatype}</td>
								<td>${ex_bad3_datatype}</td>
								<td>${ex_bad4_datatype}</td>
								<td>${ex_bad5_datatype}</td>
							</tr>
							
							<tr>
								<th>法定代表人/负责人</th>
								<td>${ex_bad1_leader}</td>
								<td>${ex_bad2_leader}</td>
								<td>${ex_bad3_leader}</td>
								<td>${ex_bad4_leader}</td>
								<td>${ex_bad5_leader}</td>
							</tr>
							
							<tr>
								<th>住所地</th>
								<td>${ex_bad1_address}</td>
								<td>${ex_bad2_address}</td>
								<td>${ex_bad3_address}</td>
								<td>${ex_bad4_address}</td>
								<td>${ex_bad5_address}</td>
							</tr>
							
							<tr>
								<th>执行法院</th>
								<td>${ex_bad1_court}</td>
								<td>${ex_bad2_court}</td>
								<td>${ex_bad3_court}</td>
								<td>${ex_bad4_court}</td>
								<td>${ex_bad5_court}</td>
							</tr>
							
							<tr>
								<th>立案时间</th>
								<td>${ex_bad1_time}</td>
								<td>${ex_bad2_time}</td>
								<td>${ex_bad3_time}</td>
								<td>${ex_bad4_time}</td>
								<td>${ex_bad5_time}</td>
							</tr>
							<tr>
								<th>执行案号</th>
								<td>${ex_bad1_casenum}</td>
								<td>${ex_bad2_casenum}</td>
								<td>${ex_bad3_casenum}</td>
								<td>${ex_bad4_casenum}</td>
								<td>${ex_bad5_casenum}</td>
							</tr>
							<tr>
								<th>执行标的</th>
								<td>${ex_bad1_money}</td>
								<td>${ex_bad2_money}</td>
								<td>${ex_bad3_money}</td>
								<td>${ex_bad4_money}</td>
								<td>${ex_bad5_money}</td>
							</tr>
							<tr>
								<th>执行依据文号</th>
								<td>${ex_bad1_base}</td>
								<td>${ex_bad2_base}</td>
								<td>${ex_bad3_base}</td>
								<td>${ex_bad4_base}</td>
								<td>${ex_bad5_base}</td>
							</tr>
							<tr>
								<th>做出执行依据单位</th>
								<td>${ex_bad1_basecompany}</td>
								<td>${ex_bad2_basecompany}</td>
								<td>${ex_bad3_basecompany}</td>
								<td>${ex_bad4_basecompany}</td>
								<td>${ex_bad5_basecompany}</td>
							</tr>
							<tr>
								<th>生效法律文书确定的义务</th>
								<td>${ex_bad1_obligation}</td>
								<td>${ex_bad2_obligation}</td>
								<td>${ex_bad3_obligation}</td>
								<td>${ex_bad4_obligation}</td>
								<td>${ex_bad5_obligation}</td>
							</tr>
							
							<tr>
								<th>生效法律文书确定的最后履行义务截止时间</th>
								<td>${ex_bad1_lasttime}</td>
								<td>${ex_bad2_lasttime}</td>
								<td>${ex_bad3_lasttime}</td>
								<td>${ex_bad4_lasttime}</td>
								<td>${ex_bad5_lasttime}</td>
							</tr>
							
							<tr>
								<th>被执行人的履行情况</th>
								<td>${ex_bad1_performance}</td>
								<td>${ex_bad2_performance}</td>
								<td>${ex_bad3_performance}</td>
								<td>${ex_bad4_performance}</td>
								<td>${ex_bad5_performance}</td>
							</tr>
							
							<tr>
								<th>失信被执行人行为具体情形</th>
								<td>${ex_bad1_concretesituation}</td>
								<td>${ex_bad2_concretesituation}</td>
								<td>${ex_bad3_concretesituation}</td>
								<td>${ex_bad4_concretesituation}</td>
								<td>${ex_bad5_concretesituation}</td>
							</tr>
							
							<tr>
								<th>认定失信时间</th>
								<td>${ex_bad1_breaktime}</td>
								<td>${ex_bad2_breaktime}</td>
								<td>${ex_bad3_breaktime}</td>
								<td>${ex_bad4_breaktime}</td>
								<td>${ex_bad5_breaktime}</td>
							</tr>
							
							<tr>
								<th>发布时间</th>
								<td>${ex_bad1_posttime}</td>
								<td>${ex_bad2_posttime}</td>
								<td>${ex_bad3_posttime}</td>
								<td>${ex_bad4_posttime}</td>
								<td>${ex_bad5_posttime}</td>
							</tr>
							
							<tr>
								<th>已履行</th>
								<td>${ex_bad1_performedpart}</td>
								<td>${ex_bad2_performedpart}</td>
								<td>${ex_bad3_performedpart}</td>
								<td>${ex_bad4_performedpart}</td>
								<td>${ex_bad5_performedpart}</td>
							</tr>
							<tr>
								<th>未履行</th>
								<td>${ex_bad1_unperformpart}</td>
								<td>${ex_bad2_unperformpart}</td>
								<td>${ex_bad3_unperformpart}</td>
								<td>${ex_bad4_unperformpart}</td>
								<td>${ex_bad5_unperformpart}</td>
							</tr>
						</tbody>
				 </table>
				</div>
			</div>
			
			<div class="widget">
				<div class="widget-head">
					<h5>用户被执行案件</h5>
				</div>
				<div class="widget-content">
					<table class="table table-striped table-bordered table-hover results">
						<thead>
							<tr>
								<th>案件</th>
								<th>第一个</th>
								<th>第二个</th>
								<th>第三个</th>
								<th>第四个</th>
								<th>第五个</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th>姓名</th>
								<td>${ex_execut1_name}</td>
								<td>${ex_execut2_name}</td>
								<td>${ex_execut3_name}</td>
								<td>${ex_execut4_name}</td>
								<td>${ex_execut5_name}</td>
							</tr>
							<tr>
								<th>身份证号/组织机构代码</th>
								<td>${ex_execut1_cid}</td>
								<td>${ex_execut2_cid}</td>
								<td>${ex_execut3_cid}</td>
								<td>${ex_execut4_cid}</td>
								<td>${ex_execut5_cid}</td>
							</tr>
							<tr>
								<th>证件类型</th>
								<td><#if  ex_execut1_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_execut1_cidtype=="11">
								组织机构代码
								</#if></td>
								<td><#if  ex_execut2_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_execut2_cidtype=="11">
								组织机构代码
								</#if></td>
								<td><#if  ex_execut3_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_execut3_cidtype=="11">
								组织机构代码
								</#if></td>
								<td><#if  ex_execut4_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_execut4_cidtype=="11">
								组织机构代码
								</#if></td>
								<td><#if  ex_execut5_cidtype =="1">
								居民身份证
								</#if>
								<#if ex_execut5_cidtype=="11">
								组织机构代码
								</#if></td>
							</tr>
							
							<tr>
								<th>数据时间</th>
								<td>${ex_execut1_datatime}</td>
								<td>${ex_execut2_datatime}</td>
								<td>${ex_execut3_datatime}</td>
								<td>${ex_execut4_datatime}</td>
								<td>${ex_execut5_datatime}</td>
							</tr>
							
							<tr>
								<th>数据类型编码</th>
								<td>${ex_execut1_datatypeid}</td>
								<td>${ex_execut2_datatypeid}</td>
								<td>${ex_execut3_datatypeid}</td>
								<td>${ex_execut4_datatypeid}</td>
								<td>${ex_execut5_datatypeid}</td>
							</tr>
							
							<tr>
								<th>数据类型</th>
								<td>${ex_execut1_datatype}</td>
								<td>${ex_execut2_datatype}</td>
								<td>${ex_execut3_datatype}</td>
								<td>${ex_execut4_datatype}</td>
								<td>${ex_execut5_datatype}</td>
							</tr>
							
							<tr>
								<th>执行法院</th>
								<td>${ex_execut1_court}</td>
								<td>${ex_execut2_court}</td>
								<td>${ex_execut3_court}</td>
								<td>${ex_execut4_court}</td>
								<td>${ex_execut5_court}</td>
							</tr>
							
							<tr>
								<th>立案时间</th>
								<td>${ex_execut1_time}</td>
								<td>${ex_execut2_time}</td>
								<td>${ex_execut3_time}</td>
								<td>${ex_execut4_time}</td>
								<td>${ex_execut5_time}</td>
							</tr>
							<tr>
								<th>执行案号</th>
								<td>${ex_execut1_casenum}</td>
								<td>${ex_execut2_casenum}</td>
								<td>${ex_execut3_casenum}</td>
								<td>${ex_execut4_casenum}</td>
								<td>${ex_execut5_casenum}</td>
							</tr>
							<tr>
								<th>执行标的</th>
								<td>${ex_execut1_money}</td>
								<td>${ex_execut2_money}</td>
								<td>${ex_execut3_money}</td>
								<td>${ex_execut4_money}</td>
								<td>${ex_execut5_money}</td>
							</tr>
							
							<tr>
								<th>案件状态</th>
								<td>${ex_execut1_statute}</td>
								<td>${ex_execut2_statute}</td>
								<td>${ex_execut3_statute}</td>
								<td>${ex_execut4_statute}</td>
								<td>${ex_execut5_statute}</td>
							</tr>
							
							<tr>
								<th>执行依据</th>
								<td>${ex_execut1_basic}</td>
								<td>${ex_execut2_basic}</td>
								<td>${ex_execut3_basic}</td>
								<td>${ex_execut4_basic}</td>
								<td>${ex_execut5_basic}</td>
							</tr>
							<tr>
								<th>做出执行依据机构</th>
								<td>${ex_execut1_basiccourt}</td>
								<td>${ex_execut2_basiccourt}</td>
								<td>${ex_execut3_basiccourt}</td>
								<td>${ex_execut4_basiccourt}</td>
								<td>${ex_execut5_basiccourt}</td>
							</tr>
						</tbody>
				 </table>
				</div>
			</div>
		
		
			
		</div>
	</div>
</body>
</html>