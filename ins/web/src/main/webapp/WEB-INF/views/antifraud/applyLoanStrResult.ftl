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
						<form class="bs-example bs-example-form" role="form"  action="${root}/service/antifraud/exportApplyLoanStrPdf" method="post" >
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
									<div class="pull-left mtop5">距今最早查询结果</div>
									<div class="widget-icons pull-right mlt10 mtop5">
										<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
										<a href="#" class="wclose"><i class="icon-remove"></i></a>
									</div>
								</div>
								<div class="widget-content">
									<table class="table table-striped table-bordered  results">
										<thead>
											<tr>
												<th>类别</th>
												<th>按手机号查询</th>
												<th>按身份证号查询</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>距最早在银行机构申请的间隔天数</th>
												<td>${applyLoanStrForm.als_fst_cell_bank_inteday}</td>
												<td>${applyLoanStrForm.als_fst_id_bank_inteday}</td>
											</tr>
											<tr>
												<th>距最早在非银行机构申请的间隔天数</th>
												<td>${applyLoanStrForm.als_fst_cell_nbank_inteday}</td>
												<td>${applyLoanStrForm.als_fst_id_nbank_inteday}</td>
											</tr>
											<tr>
												<th>距最近在银行机构申请的间隔天数</th>
												<td>${applyLoanStrForm.als_lst_cell_bank_inteday}</td>
												<td>${applyLoanStrForm.als_lst_id_bank_inteday}</td>
											</tr>
											<tr>
												<th>最近开始在银行机构连续申请的次数</th>
												<td>${applyLoanStrForm.als_lst_cell_bank_consnum}</td>
												<td>${applyLoanStrForm.als_lst_id_bank_consnum}</td>
											</tr>
											<tr>
												<th>最近开始在银行机构连续申请的持续天数</th>
												<td>${applyLoanStrForm.als_lst_cell_bank_csinteday}</td>
												<td>${applyLoanStrForm.als_lst_id_bank_csinteday}</td>
											</tr>
											<tr>
												<th>距最近在非银行机构申请的间隔天数</th>
												<td>${applyLoanStrForm.als_lst_cell_nbank_inteday}</td>
												<td>${applyLoanStrForm.als_lst_id_nbank_inteday}</td>
											</tr>
											<tr>
												<th>最近开始在非银行机构连续申请的次数</th>
												<td>${applyLoanStrForm.als_lst_cell_nbank_consnum}</td>
												<td>${applyLoanStrForm.als_lst_id_nbank_consnum}</td>
											</tr>
											<tr>
												<th>最近开始在非银机构连续申请的持续天数</th>
												<td>${applyLoanStrForm.als_lst_cell_nbank_csinteday}</td>
												<td>${applyLoanStrForm.als_lst_id_nbank_csinteday}</td>
											</tr>
										</tbody>
									</table>
								</div>

							</div>

						</div>
					</div>
					
					<div class="row">
						<div class="col-md-12">
							<div class="widget">

								<div class="widget-head clearfix">
									<div class="pull-left mtop5">按身份证号查询结果</div>
									<div class="widget-icons pull-right mlt10 mtop5">
										<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
										<a href="#" class="wclose"><i class="icon-remove"></i></a>
									</div>
								</div>
								<div class="widget-content">
									<table class="table table-striped table-bordered  results">
										<thead>
											<tr>
												<th>月份</th>
												<th>近7天</th>
												<th>近15天</th>
												<th>近1个月</th>
												<th>近3个月</th>
												<th>近6个月</th>
												<th>近12个月</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>在本机构(本机构为银行)的申请次数</th>
												<td>${applyLoanStrForm.als_d7_id_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_d15_id_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_m1_id_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_m3_id_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_m6_id_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_m12_id_bank_selfnum}</td>
											</tr>
											<tr>
												<th>在银行机构申请次数</th>
												<td>${applyLoanStrForm.als_d7_id_bank_allnum}</td>
												<td>${applyLoanStrForm.als_d15_id_bank_allnum}</td>
												<td>${applyLoanStrForm.als_m1_id_bank_allnum}</td>
												<td>${applyLoanStrForm.als_m3_id_bank_allnum}</td>
												<td>${applyLoanStrForm.als_m6_id_bank_allnum}</td>
												<td>${applyLoanStrForm.als_m12_id_bank_allnum}</td>
											</tr>
											<tr>
												<th>在银行机构申请机构数</th>
												<td>${applyLoanStrForm.als_d7_id_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_bank_orgnum}</td>
											</tr>
											<tr>
												<th>在本机构(本机构为非银)申请次数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_selfnum}</td>
											</tr>
											<tr>
												<th>在非银机构申请次数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-p2p申请次数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_p2p_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-小贷申请次数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_mc_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-现金类分期申请次数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_ca_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-消费类分期申请次数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_cf_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-代偿类分期申请次数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_com_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-其他申请机构数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_oth_orgnum}</td>
											</tr>
											
											
											<tr>
												<th>在非银机构申请机构数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-p2p申请机构数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_p2p_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-小贷申请机构数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_mc_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-现金类分期申请机构数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_ca_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-消费类分期申请机构数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_cf_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-代偿类分期申请机构数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_com_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-其他申请机构数</th>
												<td>${applyLoanStrForm.als_d7_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_id_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_id_nbank_oth_orgnum}</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="widget">

								<div class="widget-head clearfix">
									<div class="pull-left mtop5">按手机号查询结果</div>
									<div class="widget-icons pull-right mlt10 mtop5">
										<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
										<a href="#" class="wclose"><i class="icon-remove"></i></a>
									</div>
								</div>
								<div class="widget-content">
									<table class="table table-striped table-bordered  results">
										<thead>
											<tr>
												<th>月份</th>
												<th>近7天</th>
												<th>近15天</th>
												<th>近1个月</th>
												<th>近3个月</th>
												<th>近6个月</th>
												<th>近12个月</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>在本机构(本机构为银行)的申请次数</th>
												<td>${applyLoanStrForm.als_d7_cell_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_bank_selfnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_bank_selfnum}</td>
											</tr>
											<tr>
												<th>在银行机构申请次数</th>
												<td>${applyLoanStrForm.als_d7_cell_bank_allnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_bank_allnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_bank_allnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_bank_allnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_bank_allnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_bank_allnum}</td>
											</tr>
											<tr>
												<th>在银行机构申请机构数</th>
												<td>${applyLoanStrForm.als_d7_cell_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_bank_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_bank_orgnum}</td>
											</tr>
											<tr>
												<th>在本机构(本机构为非银)申请次数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_selfnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_selfnum}</td>
											</tr>
											<tr>
												<th>在非银机构申请次数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_allnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-p2p申请次数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_p2p_allnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_p2p_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-小贷申请次数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_mc_allnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_mc_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-现金类分期申请次数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_ca_allnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_ca_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-消费类分期申请次数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_cf_allnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_cf_allnum}</td>
											</tr>
											<tr>
												<th>在非银机构-代偿类分期申请次数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_com_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-其他申请机构数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_oth_orgnum}</td>
											</tr>
											
											
											<tr>
												<th>在非银机构申请机构数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-p2p申请机构数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_p2p_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_p2p_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-小贷申请机构数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_mc_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_mc_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-现金类分期申请机构数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_ca_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_ca_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-消费类分期申请机构数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_cf_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_cf_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-代偿类分期申请机构数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_com_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_com_orgnum}</td>
											</tr>
											<tr>
												<th>在非银机构-其他申请机构数</th>
												<td>${applyLoanStrForm.als_d7_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_d15_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m1_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m3_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m6_cell_nbank_oth_orgnum}</td>
												<td>${applyLoanStrForm.als_m12_cell_nbank_oth_orgnum}</td>
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
									<div class="col-lg-12 text-left">
										<a href="${root}/service/antifraud/indexApplyLoanStr" class="btn btn-success mlt7"><i class="icon-ok"></i> 返回</a>
								</div>
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