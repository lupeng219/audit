<!DOCTYPE html>
<html lang="en">
<head>
    <#include "./common/common_src.ftl"/>
    <style>
    	.icon-del:before{
    		content: "\f00d";
    	}
    </style>
</head>

<body>
	<#include "./common/common_header.ftl">
    <div class="content">
    	<#include "./common/common_menu.ftl">  
        <!-- Main bar -->
        <div class="mainbar">
            <!-- Page heading -->
			<div class="page-head">
				<h2 class="pull-left"><i class="icon-home"></i> 结果信息</h2>
				<div class="clearfix">
					<div class="bread-crumb pull-right">
						<form class="bs-example bs-example-form" role="form"  action="${root}/service/antifraud/exportInfoRelationPdf" method="post" >
							<input type="hidden" name = "id" value="${id}"/>
							<input type="hidden" name = "name" value="${name}"/>
							<input type="hidden" name = "cell" value="${cell}"/>
							<button class="btn btn-success btn-addEmployee" type="submit">
								<i class="icon-share-alt"></i> 导出信用报告
							</button>
						</form>	
					</div>
				</div>

			</div>
			<!-- Page heading ends -->
			<!-- Matter -->
			<div class="matter">
				<div class="container">
					<!-- Table -->
					<div class="row">
						<div class="col-md-12">
							<div class="widget">

								<div class="widget-head clearfix">
									<div class="pull-left mtop5">申请信息关联查询结果</div>
									<div class="widget-icons pull-right mlt10 mtop5">
										<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
										<a href="#" class="wclose"><i class="icon-remove"></i></a>
									</div>
								</div>
								<div class="widget-content">
									<table class="table table-striped table-bordered results">
										<thead>
											<tr>
												<th>近1月身份证关联手机号个数</th>
												<th>近1月身份证关联邮箱个数</th>
												<th>近1月手机号关联身份证个数</th>
												<th>近1月手机号关联邮箱个数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>${infoRelationForm.ir_m1_id_x_cell_cnt}</td>
												<td>${infoRelationForm.ir_m1_id_x_mail_cnt}</td>
												<td>${infoRelationForm.ir_m1_cell_x_id_cnt}</td>
												<td>${infoRelationForm.ir_m1_cell_x_mail_cnt}</td>
											</tr>
										</tbody>
										<thead>
											<tr>
												<th>近3月身份证关联手机号个数</th>
												<th>近3月身份证关联邮箱个数</th>
												<th>近3月手机号关联身份证个数</th>
												<th>近3月手机号关联邮箱个数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>${infoRelationForm.ir_m3_id_x_cell_cnt}</td>
												<td>${infoRelationForm.ir_m3_id_x_mail_cnt}</td>
												<td>${infoRelationForm.ir_m3_cell_x_id_cnt}</td>
												<td>${infoRelationForm.ir_m3_cell_x_mail_cnt}</td>
											</tr>
										</tbody>
										<thead>
											<tr>
												<th>近6月身份证关联手机号个数</th>
												<th>近6月身份证关联邮箱个数</th>
												<th>近6月手机号关联身份证个数</th>
												<th>近6月手机号关联邮箱个数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>${infoRelationForm.ir_m6_id_x_cell_cnt}</td>
												<td>${infoRelationForm.ir_m6_id_x_mail_cnt}</td>
												<td>${infoRelationForm.ir_m6_cell_x_id_cnt}</td>
												<td>${infoRelationForm.ir_m6_cell_x_mail_cnt}</td>
											</tr>
										</tbody>
										<thead>
											<tr>
												<th>近12月身份证关联手机号个数</th>
												<th>近12月身份证关联邮箱个数</th>
												<th>近12月手机号关联身份证个数</th>
												<th>近12月手机号关联邮箱个数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>${infoRelationForm.ir_m12_id_x_cell_cnt}</td>
												<td>${infoRelationForm.ir_m12_id_x_mail_cnt}</td>
												<td>${infoRelationForm.ir_m12_cell_x_id_cnt}</td>
												<td>${infoRelationForm.ir_m12_cell_x_mail_cnt}</td>
											</tr>
										</tbody>
										<thead>
											<tr>
												<th>身份证关联的手机号个数</th>
												<th>身份证关联的邮箱个数</th>
												<th>手机号关联的身份证个数</th>
												<th>手机号关联的邮箱个数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>${infoRelationForm.ir_id_x_cell_cnt}</td>
												<td>${infoRelationForm.ir_id_x_mail_cnt}</td>
												<td>${infoRelationForm.ir_cell_x_id_cnt}</td>
												<td>${infoRelationForm.ir_cell_x_mail_cnt}</td>
											</tr>
										</tbody>
										<thead>
											<tr>
												<th>身份证是否在手机号关联的以往身份证列表中</th>
												<th>手机号是否在身份证关联的以往手机号列表中</th>
												<th>与查询身份证和手机号完全匹配的最近申请距今天数</th>
												<th>与本次手机号不一致的以往关联手机号的最近一次查询距今天数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>
												<#if infoRelationForm.ir_id_inlistwith_cell ==1>
												是
												<#elseif infoRelationForm.ir_id_inlistwith_cell ==0>
												否
												<#elseif infoRelationForm.ir_id_inlistwith_cell=="空">
												没有以往关联
												</#if>
												</td>
												<td>
												<#if infoRelationForm.ir_cell_inlistwith_id =="1">
												是
												<#elseif infoRelationForm.ir_cell_inlistwith_id=="0">
												否
												<#elseif infoRelationForm.ir_cell_inlistwith_id=="空">
												没有以往关联
												</#if>
												</td>
												<td>
												${infoRelationForm.ir_allmatch_days}
												</td>
												<td>${infoRelationForm.ir_id_x_cell_notmat_days}</td>
											</tr>
										</tbody>
										<thead>
											<tr>
												<th>与本次身份证不一致的以往关联身份证的最近一次查询距今天数</th>
												<th>身份证关联的手机号最近一次变动距今天数</th>
												<th>手机号关联的身份证最近一次变动距今天数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>${infoRelationForm.ir_cell_x_id_notmat_days}</td>
												<td>${infoRelationForm.ir_id_x_cell_lastchg_days}</td>
												<td>${infoRelationForm.ir_cell_x_id_lastchg_days}</td>
											</tr>
										</tbody>
									</table>
								</div>

							</div>

						</div>
					</div>
					<div class="row">
						<div class="col-md-12">


							<!-- Buttons -->
					<div class="form-group">
								<!-- Buttons -->
								<div class="col-lg-12 text-left">
										<a href="${root}/service/antifraud/indexInfoRelation" class="btn btn-success mlt7"><i class="icon-ok"></i> 返回</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- Matter ends -->
        </div>

        <!-- Mainbar ends -->
        <div class="clearfix"></div>

    </div>
    <!-- Content ends -->

    <!-- Footer starts -->
    <#include "./common/common_footer.ftl">
    <!-- Scroll to top -->
    <span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span>
    <!-- Footer ends -->
</body>
</html>