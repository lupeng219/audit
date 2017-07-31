<!DOCTYPE html>
<html lang="en">
<head>
    <title>员工管理-员工列表</title>
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
						<button class="btn btn-success btn-addEmployee" type="button">
							<i class="icon-share-alt"></i> 导出信用报告
						</button>
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
									<div class="pull-left mtop5">当前消费分析</div>
									<div class="widget-icons pull-right mlt10 mtop5">
										<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
										<a href="#" class="wclose"><i class="icon-remove"></i></a>
									</div>

								</div>
								<div class="widget-content">
									<table class="table table-striped table-bordered table-hover results">
										<thead>
											<tr>
												<th class="col-md-3">交易笔数</th>
												<td class="col-md-3">0</td>
												<th class="col-md-3">交易金额</th>
												<td class="col-md-3">0</td>
											</tr>
											<tr>
												<th class="col-md-3">最近一次交易时间据上月底天数</th>
												<td class="col-md-3">0</td>
												<th class="col-md-3">当月活动省市</th>
												<td class="col-md-3">0</td>
											</tr>
										</thead>
									</table>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="widget">

								<div class="widget-head clearfix">
									<div class="pull-left mtop5">近12月消费分析</div>
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
												<th>近1个月</th>
												<th>近3个月</th>
												<th>近6个月</th>
												<th>近12个月</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>交易金额</th>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr>
												<th>交易笔数</th>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr>
												<th>最大交易金额</th>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
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
									<div class="pull-left mtop5">过去一年中的飞行信息</div>
									<div class="widget-icons pull-right mlt10 mtop5">
										<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
										<a href="#" class="wclose"><i class="icon-remove"></i></a>
									</div>
								</div>
								<div class="widget-content">
									<table class="table table-striped table-bordered results">
										<thead>
											<tr>
												<th>最爱目的地</th>
												<th>国际头等次数</th>
												<th>延误次数（大于30分钟）</th>
												<th>国内经济次数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>上海</td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
										</tbody>
										<thead>
											<tr>
												<th>国内商务次数</th>
												<th>平均延误分钟数</th>
												<th>平均国内票价</th>
												<th>大飞机次数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>0</td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
										</tbody>
										<thead>
											<tr>
												<th>国际次数</th>
												<th>国际经济次数</th>
												<th>平均国内折扣</th>
												<th>小飞机次数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>0</td>
												<td></td>
												<td></td>
												<td></td>
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
									<button class="btn btn-success mlt7" type="button">
										<i class="icon-ok"></i> 确认查询
									</button>
									<button class="btn btn-success mlt7" type="button">
										<i class="icon-ok"></i> 确认查询
									</button>
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