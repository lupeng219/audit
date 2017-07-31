<!DOCTYPE html>
<html lang="en">
<head>
    <title>规则</title>
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
					<form class="bs-example bs-example-form" role="form"  action="${root}/service/rule/exportRulePdf" onsubmit="return toVaild()" method="post" >
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
									<div class="pull-left mtop5">反欺诈规则查询结果</div>
									<div class="widget-icons pull-right mlt10 mtop5">
										<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
										<a href="#" class="wclose"><i class="icon-remove"></i></a>
									</div>

								</div>
								<div class="widget-content">
									<table class="table table-striped table-bordered table-hover results">
										<thead>
											<tr>
												<th class="col-md-3">最终决策结果</th>
												<td class="col-md-3">
												<#if ruleForm.rule_final_decision == "Reject" >
												拒绝
												</#if>
												<#if ruleForm.rule_final_decision == "Accept" >
												通过
												</#if>
												<#if ruleForm.rule_final_decision == "Review" >
												复议
												</#if>
												</td>
												<th class="col-md-3">最终规则评分</th>
												<td class="col-md-3">${ruleForm.rule_final_weight}</td>
											</tr>
											<tr>
												<th class="col-md-3">非银客群特殊名单规则-银行中风险</th>
												<td class="col-md-3">${ruleForm.rule_name_QJS010}</td>
												<th class="col-md-3">非银客群特殊名单规则-银行中风险权重</th>
												<td class="col-md-3">${ruleForm.rule_weight_QJS010}</td>
											</tr>
											<tr>
												<th class="col-md-3">非银客群多次申请规则-最近在非银机构多次申请次数过多</th>
												<td class="col-md-3">${ruleForm.rule_name_QJF050}</td>
												<th class="col-md-3">非银客群多次申请规则-最近在非银机构多次申请次数过多权重</th>
												<td class="col-md-3">${ruleForm.rule_weight_QJF050}</td>
											</tr>
											<tr>
												<th class="col-md-3">非非银客群多次申请月度版规则-近期在非银机构有过申请</th>
												<td class="col-md-3">${ruleForm.rule_name_QAM010}</td>
												<th class="col-md-3">非银客群多次申请月度版规则-近期在非银机构有过申请权重</th>
												<td class="col-md-3">${ruleForm.rule_weight_QAM010}</td>
											</tr>
											<tr>
												<th class="col-md-3">法院被执行人规则-法院失信人</th>
												<td class="col-md-3">${ruleForm.rule_name_QJE010}</td>
												<th class="col-md-3">法院被执行人规则-法院失信人权重</th>
												<td class="col-md-3">${ruleForm.rule_weight_QJE010}</td>
											</tr>
											<tr>
												<th class="col-md-3">法院被执行人规则-法院被执行人</th>
												<td class="col-md-3">${ruleForm.rule_name_QJE020}</td>
												<th class="col-md-3">法院被执行人规则-法院被执行人权重</th>
												<td class="col-md-3">${ruleForm.rule_weight_QJE020}</td>
											</tr>
										</thead>
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
										<a href="${root}/service/rule/indexRule" class="btn btn-success mlt7"><i class="icon-ok"></i> 返回</a>
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