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
					<h5>反欺诈规则查询结果</h5>
				</div>
				<div class="widget-content">
					<table class="table table-striped table-bordered table-hover results">
						<thead>
						<tr>
							<th >最终决策结果</th>
							<td >
							<#if rule_final_decision == "Reject" >
							拒绝
							</#if>
							<#if rule_final_decision == "Accept" >
							通过
							</#if>
							<#if rule_final_decision == "Review" >
							复议
							</#if>
							</td>
							<th >最终规则评分</th>
							<td >${rule_final_weight}</td>
						</tr>
						<tr>
							<th >非银客群特殊名单规则-银行中风险</th>
							<td >${rule_name_QJS010}</td>
							<th >非银客群特殊名单规则-银行中风险权重</th>
							<td >${rule_weight_QJS010}</td>
						</tr>
						<tr>
							<th >非银客群多次申请规则-最近在非银机构多次申请次数过多</th>
							<td >${rule_name_QJF050}</td>
							<th >非银客群多次申请规则-最近在非银机构多次申请次数过多权重</th>
							<td >${rule_weight_QJF050}</td>
						</tr>
						<tr>
							<th >非非银客群多次申请月度版规则-近期在非银机构有过申请</th>
							<td >${rule_name_QAM010}</td>
							<th >非银客群多次申请月度版规则-近期在非银机构有过申请权重</th>
							<td >${rule_weight_QAM010}</td>
						</tr>
						<tr>
							<th >法院被执行人规则-法院失信人</th>
							<td >${rule_name_QJE010}</td>
							<th >法院被执行人规则-法院失信人权重</th>
							<td >${rule_weight_QJE010}</td>
						</tr>
						<tr>
							<th >法院被执行人规则-法院被执行人</th>
							<td >${rule_name_QJE020}</td>
							<th >法院被执行人规则-法院被执行人权重</th>
							<td >${rule_weight_QJE020}</td>
						</tr>
					</thead>
				 </table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>