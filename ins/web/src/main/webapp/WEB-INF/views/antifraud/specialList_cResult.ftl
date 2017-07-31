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
						<form class="bs-example bs-example-form" role="form"  action="${root}/service/antifraud/exportSpecialList_cPdf" method="post" >
							<input type="hidden" name = "id" value="${id}"/>
							<input type="hidden" name = "name" value="${name}"/>
							<input type="hidden" name = "cell" value="${cell}"/>
							<input type="hidden" name = "linkman_cell" value="${linkman_cell}"/>
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
				
					<div class="row">
						<div class="col-md-12">
							<div class="widget">

								<div class="widget-head clearfix">
									<div class="pull-left mtop5"><font color="red">注：空：未命中，0：本人直接命中，1：一度关系命中，2：二度关系命中</font></div>
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
												<th>通过身份证号查询</th>
												<th>通过手机号查询</th>
												<th>通过联系人手机查询</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>高危行为</th>
												<td>${specialList.sl_id_abnormal}</td>
												<td>${specialList.sl_cell_abnormal}</td>
												<td>${specialList.sl_lm_cell_abnormal}</td>
												
											</tr>
											<tr>
												<th>电信欠费</th>
												<td>${specialList.sl_id_phone_overdue}</td>
												<td>${specialList.sl_cell_phone_overdue}</td>
												<td>${specialList.sl_lm_cell_phone_overdue}</td>
												
											</tr>
											<tr>
												<th>法院失信人</th>
												<td>${specialList.sl_id_court_bad}</td>
												<td>${specialList.sl_cell_court_bad}</td>
												<td>${specialList.sl_lm_cell_court_bad}</td>
												
											</tr>
											<tr>
												<th>法院被执行人</th>
												<td>${specialList.sl_id_court_executed}</td>
												<td>${specialList.sl_cell_court_executed}</td>
												<td>${specialList.sl_lm_cell_court_executed}</td>
												
											</tr>
											<tr>
												<th>银行(含信用卡)中风险</th>
												<td>${specialList.sl_id_bank_bad}</td>
												<td>${specialList.sl_cell_bank_bad}</td>
												<td>${specialList.sl_lm_cell_bank_bad}</td>
												
											</tr>
											<tr>
												<th>银行(含信用卡)一般风险</th>
												<td>${specialList.sl_id_bank_overdue}</td>
												<td>${specialList.sl_cell_bank_overdue}</td>
												<td>${specialList.sl_lm_cell_bank_overdue}</td>
											</tr>
											<tr>
												<th>银行(含信用卡)资信不佳</th>
												<td>${specialList.sl_id_bank_fraud}</td>
												<td>${specialList.sl_cell_bank_fraud}</td>
												<td>${specialList.sl_lm_cell_bank_fraud}</td>
											</tr>
											<tr>
												<th>银行(含信用卡)高风险</th>
												<td>${specialList.sl_id_bank_lost}</td>
												<td>${specialList.sl_cell_bank_lost}</td>
												<td>${specialList.sl_lm_cell_bank_lost}</td>
											</tr>
											<tr>
												<th>银行(含信用卡)拒绝</th>
												<td>${specialList.sl_id_bank_refuse}</td>
												<td>${specialList.sl_cell_bank_refuse}</td>
												<td>${specialList.sl_lm_cell_bank_refuse}</td>
											</tr>
											<tr>
												<th>非银(含全部非银类型)中风险</th>
												<td>${specialList.sl_id_p2p_bad}</td>
												<td>${specialList.sl_cell_p2p_bad}</td>
												<td>${specialList.sl_lm_cell_p2p_bad}</td>
											</tr>
											<tr>
												<th>非银(含全部非银类型)一般风险</th>
												<td>${specialList.sl_id_p2p_overdue}</td>
												<td>${specialList.sl_cell_p2p_overdue}</td>
												<td>${specialList.sl_lm_cell_p2p_overdue}</td>
											</tr>
											<tr>
												<th>非银(含全部非银类型)资信不佳</th>
												<td>${specialList.sl_id_p2p_fraud}</td>
												<td>${specialList.sl_cell_p2p_fraud}</td>
												<td>${specialList.sl_lm_cell_p2p_fraud}</td>
											</tr>
											<tr>
												<th>非银(含全部非银类型)高风险</th>
												<td>${specialList.sl_id_p2p_lost}</td>
												<td>${specialList.sl_cell_p2p_lost}</td>
												<td>${specialList.sl_lm_cell_p2p_lost}</td>
											</tr>
											<tr>
												<th>非银(含全部非银类型)拒绝</th>
												<td>${specialList.sl_id_p2p_refuse}</td>
												<td>${specialList.sl_cell_p2p_refuse}</td>
												<td>${specialList.sl_lm_cell_p2p_refuse}</td>
											</tr>
											<tr>
												<th>非银-P2P中风险</th>
												<td>${specialList.sl_id_nbank_p2p_bad}</td>
												<td>${specialList.sl_cell_nbank_p2p_bad}</td>
												<td>${specialList.sl_lm_cell_nbank_p2p_bad}</td>
											</tr>
											<tr>
												<th>非银-P2P一般风险</th>
												<td>${specialList.sl_id_nbank_p2p_overdue}</td>
												<td>${specialList.sl_cell_nbank_p2p_overdue}</td>
												<td>${specialList.sl_lm_cell_nbank_p2p_overdue}</td>
											</tr>
											<tr>
												<th>非银-P2P资信不佳</th>
												<td>${specialList.sl_id_nbank_p2p_fraud}</td>
												<td>${specialList.sl_cell_nbank_p2p_fraud}</td>
												<td>${specialList.sl_lm_cell_nbank_p2p_fraud}</td>
											</tr>
											<tr>
												<th>非银-P2P高风险</th>
												<td>${specialList.sl_id_nbank_mc_lost}</td>
												<td>${specialList.sl_cell_nbank_mc_lost}</td>
												<td>${specialList.sl_lm_cell_nbank_mc_lost}</td>
											</tr>
											<tr>
												<th>非银-P2P拒绝</th>
												<td>${specialList.sl_id_nbank_p2p_refuse}</td>
												<td>${specialList.sl_cell_p2p_refuse}</td>
												<td>${specialList.sl_lm_cell_nbank_p2p_refuse}</td>
											</tr>
											<tr>
												<th>非银-小贷中风险</th>
												<td>${specialList.sl_id_nbank_mc_bad}</td>
												<td>${specialList.sl_cell_nbank_mc_bad}</td>
												<td>${specialList.sl_lm_cell_nbank_mc_bad}</td>
											</tr>
											<tr>
												<th>非银-小贷一般风险</th>
												<td>${specialList.sl_id_nbank_mc_overdue}</td>
												<td>${specialList.sl_cell_nbank_mc_overdue}</td>
												<td>${specialList.sl_lm_cell_nbank_mc_overdue}</td>
											</tr>
											<tr>
												<th>非银-小贷资信不佳</th>
												<td>${specialList.sl_id_nbank_mc_fraud}</td>
												<td>${specialList.sl_cell_nbank_mc_fraud}</td>
												<td>${specialList.sl_lm_cell_nbank_mc_fraud}</td>
											</tr>
											<tr>
												<th>非银-小贷高风险</th>
												<td>${specialList.sl_id_nbank_mc_lost}</td>
												<td>${specialList.sl_cell_nbank_mc_lost}</td>
												<td>${specialList.sl_lm_cell_nbank_mc_lost}</td>
											</tr>
											<tr>
												<th>非银-小贷拒绝</th>
												<td>${specialList.sl_id_nbank_mc_refuse}</td>
												<td>${specialList.sl_cell_nbank_mc_refuse}</td>
												<td>${specialList.sl_lm_cell_nbank_mc_refuse}</td>
											</tr>
											<tr>
												<th>非银-现金类分期中风险</th>
												<td>${specialList.sl_id_nbank_ca_bad}</td>
												<td>${specialList.sl_cell_nbank_ca_bad}</td>
												<td>${specialList.sl_lm_cell_nbank_ca_bad}</td>
											</tr>
											<tr>
												<th>非银-现金类分期一般风险</th>
												<td>${specialList.sl_id_nbank_ca_overdue}</td>
												<td>${specialList.sl_cell_nbank_ca_overdue}</td>
												<td>${specialList.sl_lm_cell_nbank_ca_overdue}</td>
											</tr>
											<tr>
												<th>非银-现金类分期资信不佳</th>
												<td>${specialList.sl_id_nbank_ca_fraud}</td>
												<td>${specialList.sl_cell_nbank_ca_fraud}</td>
												<td>${specialList.sl_lm_cell_nbank_ca_fraud}</td>
											</tr>
											<tr>
												<th>非银-现金类分期高风险</th>
												<td>${specialList.sl_id_nbank_ca_lost}</td>
												<td>${specialList.sl_cell_nbank_ca_lost}</td>
												<td>${specialList.sl_lm_cell_nbank_ca_lost}</td>
											</tr>
											<tr>
											    <th>非银-现金类分期拒绝</th>
												<td>${specialList.sl_id_nbank_ca_refuse}</td>
												<td>${specialList.sl_cell_nbank_ca_refuse}</td>
												<td>${specialList.sl_lm_cell_nbank_ca_refuse}</td>
											</tr>
											<tr>
												<th>非银-代偿类分期中风险</th>
												<td>${specialList.sl_id_nbank_com_bad}</td>
												<td>${specialList.sl_cell_nbank_com_bad}</td>
												<td>${specialList.sl_lm_cell_nbank_com_bad}</td>
											</tr>
											<tr>
												<th>非银-代偿类分期一般风险</th>
												<td>${specialList.sl_id_nbank_com_overdue}</td>
												<td>${specialList.sl_cell_nbank_com_overdue}</td>
												<td>${specialList.sl_lm_cell_nbank_com_overdue}</td>
											</tr>
											<tr>
												<th>非银-代偿类分期资信不佳</th>
												<td>${specialList.sl_id_nbank_com_fraud}</td>
												<td>${specialList.sl_cell_nbank_com_fraud}</td>
												<td>${specialList.sl_lm_cell_nbank_com_fraud}</td>
											</tr>
											<tr>
												<th>非银-代偿类分期高风险</th>
												<td>${specialList.sl_id_nbank_com_lost}</td>
												<td>${specialList.sl_cell_nbank_com_lost}</td>
												<td>${specialList.sl_lm_cell_nbank_com_lost}</td>
											</tr>
											<tr>
												<th>非银-代偿类分期拒绝</th>
												<td>${specialList.sl_id_nbank_com_refuse}</td>
												<td>${specialList.sl_cell_nbank_com_refuse}</td>
												<td>${specialList.sl_lm_cell_nbank_com_refuse}</td>
											</tr>
											<tr>
												<th>非银-消费类分期中风险</th>
												<td>${specialList.sl_id_nbank_cf_bad}</td>
												<td>${specialList.sl_cell_nbank_cf_bad}</td>
												<td>${specialList.sl_lm_cell_nbank_cf_bad}</td>
											</tr>
											<tr>
												<th>非银-消费类分期一般风险</th>
												<td>${specialList.sl_id_nbank_cf_overdue}</td>
												<td>${specialList.sl_cell_nbank_cf_overdue}</td>
												<td>${specialList.sl_lm_cell_nbank_cf_overdue}</td>
											</tr>
											<tr>
												<th>非银-消费类分期资信不佳</th>
												<td>${specialList.sl_id_nbank_cf_fraud}</td>
												<td>${specialList.sl_cell_nbank_cf_fraud}</td>
												<td>${specialList.sl_lm_cell_nbank_cf_fraud}</td>
											</tr>
											<tr>
												<th>非银-消费类分期高风险</th>
												<td>${specialList.sl_id_nbank_cf_lost}</td>
												<td>${specialList.sl_cell_nbank_cf_lost}</td>
												<td>${specialList.sl_lm_cell_nbank_cf_lost}</td>
											</tr>
											<tr>
												<th>非银-消费类分期拒绝</th>
												<td>${specialList.sl_id_nbank_cf_refuse}</td>
												<td>${specialList.sl_cell_nbank_cf_refuse}</td>
												<td>${specialList.sl_lm_cell_nbank_cf_refuse}</td>
											</tr>
											<tr>
												<th>非银-其他中风险</th>
												<td>${specialList.sl_id_nbank_other_bad}</td>
												<td>${specialList.sl_cell_nbank_other_bad}</td>
												<td>${specialList.sl_lm_cell_nbank_other_bad}</td>
											</tr>
											<tr>
												<th>非银-其他一般风险</th>
												<td>${specialList.sl_id_nbank_other_overdue}</td>
												<td>${specialList.sl_cell_nbank_other_overdue}</td>
												<td>${specialList.sl_lm_cell_nbank_other_overdue}</td>
											</tr>
											<tr>
												<th>非银-其他资信不佳</th>
												<td>${specialList.sl_id_nbank_other_fraud}</td>
												<td>${specialList.sl_cell_nbank_other_fraud}</td>
												<td>${specialList.sl_lm_cell_nbank_other_fraud}</td>
											</tr>
											<tr>
												<th>非银-其他高风险</th>
												<td>${specialList.sl_id_nbank_other_lost}</td>
												<td>${specialList.sl_cell_nbank_other_lost}</td>
												<td>${specialList.sl_lm_cell_nbank_other_lost}</td>
											</tr>
											<tr>
												<th>非银-其他拒绝</th>
												<td>${specialList.sl_id_nbank_other_refuse}</td>
												<td>${specialList.sl_cell_nbank_other_refuse}</td>
												<td>${specialList.sl_lm_cell_nbank_other_refuse}</td>
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
										<a href="${root}/service/antifraud/indexSpecialList_c" class="btn btn-success mlt7"><i class="icon-ok"></i> 返回</a>
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