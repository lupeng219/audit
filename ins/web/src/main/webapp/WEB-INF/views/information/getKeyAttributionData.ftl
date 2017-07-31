<!DOCTYPE html>
<html lang="en">
<head>
    <title>信息验证-身份证号手机号归属地结果</title>
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
						<form class="bs-example bs-example-form" role="form"  action="${root}/service/information/exportKeyAttributionPdf" onsubmit="return toVaild()" method="post" >
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
									<div class="pull-left mtop5">身份证号手机号归属地结果</div>
									<div class="widget-icons pull-right mlt10 mtop5">
										<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
										<a href="#" class="wclose"><i class="icon-remove"></i></a>
									</div>

								</div>
								<div class="widget-content">
									<table class="table table-striped table-bordered table-hover results">
										<thead>
											<tr>
												<th class="col-md-3">身份证号归属省</th>
												<td class="col-md-3">${keyAttributionForm.ka_id_province}</td>
												<th class="col-md-3">身份证号归属市</th>
												<td class="col-md-3">${keyAttributionForm.ka_id_city}</td>
											</tr>
											<tr>
												<th class="col-md-3">手机所属省</th>
												<td class="col-md-3">${keyAttributionForm.ka_cell_province}</td>
												<th class="col-md-3">手机所属城市</th>
												<td class="col-md-3">${keyAttributionForm.ka_cell_city}</td>
											</tr>
											<tr>
												<th class="col-md-3">手机卡类型</th>
												<td class="col-md-3">${keyAttributionForm.ka_cell_card_type}</td>
												<th class="col-md-3"></th>
												<td class="col-md-3"></td>
											</tr>
										</thead>
									</table>
								</div>
							</div>
						</div>
					</div>
					<!-- Buttons -->
							<div class="form-group">
								<!-- Buttons -->
								<div class="col-lg-12 text-left">
										<a href="${root}/service/information/indexKeyAttribution" class="btn btn-success mlt7"><i class="icon-ok"></i> 返回</a>
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