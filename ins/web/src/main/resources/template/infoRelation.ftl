<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<style>
.table-striped > tr:nth-of-type(odd) {
			background-color: #f9f9f9;
		}
.table-bordered > tr > th,
		.table-bordered  > tr > th,
		.table-bordered  > tr > th,
		.table-bordered  > tr > td,
		.table-bordered  > tr > td,
		.table-bordered  > tr > td {
			border: 1px solid #ddd;
		}
		
		.table  > tr > th,
		.table  > tr > th,
		.table  > tr > th,
		.table  > tr > td,
		.table  > tr > td,
		.table  > tr > td {
			padding: 8px;
			line-height: 1.42857143;
			vertical-align: top;
			border-top: 1px solid #ddd;
			font-size: 13px;
		}

</style>
</head>
<body>
	<div class="wrapper">
		<div class="user-broke-promise">
		
			<div class="widget">
				<div class="widget-head">
					<h5>申请信息关联查询结果</h5>
				</div>
				<div class="widget-content">
					<table class="table table-striped table-bordered table-hover results">
					
						<tr>
							<th>近1月身份证关联手机号个数</th>
							<th>近1月身份证关联邮箱个数</th>
							<th>近1月手机号关联身份证个数</th>
							<th>近1月手机号关联邮箱个数</th>
						</tr>
					
					
						<tr>
							<td>${ir_m1_id_x_cell_cnt}</td>
							<td>${ir_m1_id_x_mail_cnt}</td>
							<td>${ir_m1_cell_x_id_cnt}</td>
							<td>${ir_m1_cell_x_mail_cnt}</td>
						</tr>
					
					
						<tr>
							<th>近3月身份证关联手机号个数</th>
							<th>近3月身份证关联邮箱个数</th>
							<th>近3月手机号关联身份证个数</th>
							<th>近3月手机号关联邮箱个数</th>
						</tr>
					
					
						<tr>
							<td>${ir_m3_id_x_cell_cnt}</td>
							<td>${ir_m3_id_x_mail_cnt}</td>
							<td>${ir_m3_cell_x_id_cnt}</td>
							<td>${ir_m3_cell_x_mail_cnt}</td>
						</tr>
					
					
						<tr>
							<th>近6月身份证关联手机号个数</th>
							<th>近6月身份证关联邮箱个数</th>
							<th>近6月手机号关联身份证个数</th>
							<th>近6月手机号关联邮箱个数</th>
						</tr>
					
					
						<tr>
							<td>${ir_m6_id_x_cell_cnt}</td>
							<td>${ir_m6_id_x_mail_cnt}</td>
							<td>${ir_m6_cell_x_id_cnt}</td>
							<td>${ir_m6_cell_x_mail_cnt}</td>
						</tr>
					
					
						<tr>
							<th>近12月身份证关联手机号个数</th>
							<th>近12月身份证关联邮箱个数</th>
							<th>近12月手机号关联身份证个数</th>
							<th>近12月手机号关联邮箱个数</th>
						</tr>
					
					
						<tr>
							<td>${ir_m12_id_x_cell_cnt}</td>
							<td>${ir_m12_id_x_mail_cnt}</td>
							<td>${ir_m12_cell_x_id_cnt}</td>
							<td>${ir_m12_cell_x_mail_cnt}</td>
						</tr>
					
					
						<tr>
							<th>身份证关联的手机号个数</th>
							<th>身份证关联的邮箱个数</th>
							<th>手机号关联的身份证个数</th>
							<th>手机号关联的邮箱个数</th>
						</tr>
					
					
						<tr>
							<td>${ir_id_x_cell_cnt}</td>
							<td>${ir_id_x_mail_cnt}</td>
							<td>${ir_cell_x_id_cnt}</td>
							<td>${ir_cell_x_mail_cnt}</td>
						</tr>
					
					
						<tr>
							<th>身份证是否在手机号关联的以往身份证列表中</th>
							<th>手机号是否在身份证关联的以往手机号列表中</th>
							<th>与查询身份证和手机号完全匹配的最近申请距今天数</th>
							<th>与本次手机号不一致的以往关联手机号的最近一次查询距今天数</th>
						</tr>
					
					
						<tr>
							<td>
							<#if ir_id_inlistwith_cell =="1">
							是
							<#elseif ir_id_inlistwith_cell =="0">
							否
							<#elseif ir_id_inlistwith_cell=="空">
							没有以往关联
							</#if>
							</td>
							<td>
							<#if ir_cell_inlistwith_id =="1">
							是
							<#elseif ir_cell_inlistwith_id=="0">
							否
							<#elseif ir_cell_inlistwith_id=="空">
							没有以往关联
							</#if>
							</td>
							<td>
							${ir_allmatch_days}
							</td>
							<td>${ir_id_x_cell_notmat_days}</td>
						</tr>
					
					
						<tr>
							<th>与本次身份证不一致的以往关联身份证的最近一次查询距今天数</th>
							<th>身份证关联的手机号最近一次变动距今天数</th>
							<th>手机号关联的身份证最近一次变动距今天数</th>
						</tr>
					
					
						<tr>
							<td>${ir_cell_x_id_notmat_days}</td>
							<td>${ir_id_x_cell_lastchg_days}</td>
							<td>${ir_cell_x_id_lastchg_days}</td>
						</tr>
					
				 </table>
				</div>
			</div>
		
		
			
		</div>
	</div>
</body>
</html>