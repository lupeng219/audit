<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
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
						<form class="bs-example bs-example-form" role="form"  action="${root}/service/information/exportidTwo_zPdf" method="post" >
						<input type="hidden" name = "id" value="${id}"/>
						<input type="hidden" name = "name" value="${name}"/>
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
									<div class="pull-left mtop5">身份证二要素验证结果</div>
									<div class="widget-icons pull-right mlt10 mtop5">
										<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
										<a href="#" class="wclose"><i class="icon-remove"></i></a>
									</div>

								</div>
								<div class="widget-content">
									<table class="table table-striped table-bordered table-hover results">
										<thead>
											<tr>
												<th class="col-md-3">身份证二要素验证产品计费标识</th>
												<td class="col-md-3">${idTwo_zForm.flag_idtwo_z}</td>
												<th class="col-md-3">查询结果</th>
												<td class="col-md-3">${idTwo_zForm.MESSAGE}</td>
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
										<a href="${root}/service/information/indexIdTwo_z" class="btn btn-success mlt7"><i class="icon-ok"></i> 返回</a>
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