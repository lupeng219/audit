<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<style>
		* {
			margin: 0;
			padding: 0;
			box-sizing: border-box;
		}
		
		a {
			text-decoration: none;
		}
		
		body,
		html {
			width: 100%;
		}
		
		.wrapper {
			width: 1200px;
			margin: 0 auto;
		}
		
		.widget {
			border: 1px solid #c9c9c9;
			border-radius: 3px;
			margin-top: 10px;
			margin-bottom: 20px;
			background: #fafafa url(../img/cream.png) repeat;
		}
		
		.widget .widget-head {
			background-color: #f8f8f8;
			background: -webkit-gradient(linear, left top, left bottom, from(#f8f8f8), to(#f2f2f2));
			background: -webkit-linear-gradient(top, #f8f8f8, #f2f2f2);
			background: -moz-linear-gradient(top, #f8f8f8, #f2f2f2);
			background: -ms-linear-gradient(top, #f8f8f8, #f2f2f2);
			background: -o-linear-gradient(top, #f8f8f8, #f2f2f2);
			background: linear-gradient(top, #f8f8f8, #f2f2f2);
			border-top-right-radius: 3px;
			border-top-left-radius: 3px;
			text-shadow: 0px 1px #fff;
			border-bottom: 1px solid #ccc;
			border-top: 1px solid #fff;
			color: #666;
			font-size: 13px;
			font-weight: bold;
			padding: 8px 15px;
		}
		
		.widget .widget-head h5 {
			height: 50px;
			line-height: 50px;
			color: #666;
			font-size: 15px;
		}
		
		table {
			background-color: transparent;
			border-spacing: 0;
			border-collapse: collapse;
			box-sizing: border-box;
		}
		
		.results th {
			background: #eee !important;
		}
		
		.coRED {
			color: red !important;
		}
		
		.w25 {
			width: 25%;
		}
		
		th,
		td {
			text-align: center;
		}
		
		.widget .table-bordered {
			border-radius: 0px;
			border: 0px;
		}
		
		.widget .table {
			margin: 0px;
			width: 100%;
		}
		
		.table-striped > tbody > tr:nth-of-type(odd) {
			background-color: #f9f9f9;
		}
		
		.widget .table-bordered td:first-child,
		.widget .table-bordered th:first-child {
			border-left: 0px;
		}
		
		.widget .table-bordered td {
			border-top: 0px !important;
			border-bottom: 1px solid #ddd !important;
			border-radius: 0px !important;
		}
		
		.table-bordered > thead > tr > th,
		.table-bordered > tbody > tr > th,
		.table-bordered > tfoot > tr > th,
		.table-bordered > thead > tr > td,
		.table-bordered > tbody > tr > td,
		.table-bordered > tfoot > tr > td {
			border: 1px solid #ddd;
		}
		
		.table > thead > tr > th,
		.table > tbody > tr > th,
		.table > tfoot > tr > th,
		.table > thead > tr > td,
		.table > tbody > tr > td,
		.table > tfoot > tr > td {
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
								<td>王亮</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<th>身份证号/组织机构代码</th>
								<td>421</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<th>证件类型</th>
								<td>居民身份证</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<th>数据时间</th>
								<td>2015年7月5日</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<th>数据类型编码</th>
								<td>102</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<th>数据类型</th>
								<td>居民身份证</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<th>法定代表人/负责人</th>
								<td>王强</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="widget">
				<div class="widget-head">
					<h5 class="coRED">注：空：未命中，0：本人直接命中，1：一度关系命中，2：二度关系命中</h5>
				</div>
				<div class="widget-content">
					<table class="table table-striped table-bordered table-hover results">
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
								<td>0</td>
								<td>0</td>
								<td>0</td>
							</tr>
							<tr>
								<th>电信欠费</th>
								<td>0</td>
								<td>1</td>
								<td>1</td>
							</tr>
							<tr>
								<th>法院失信人</th>
								<td>0</td>
								<td>0</td>
								<td>0</td>
							</tr>
							<tr>
								<th>法院被执行人</th>
								<td>0</td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<th>银行（含信用卡）中风险</th>
								<td>2</td>
								<td>1</td>
								<td>1</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="widget">
				<div class="widget-head">
					<h5>申请信息关联查询结果</h5>
				</div>
				<div class="widget-content">
					<table class="table table-striped table-bordered table-hover results">
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
			<div class="widget">
				<div class="widget-head">
					<h5>手机在网时长结果</h5>
				</div>
				<div class="widget-content">
					<table class="table table-striped table-bordered table-hover results">
						<thead>
							<tr>
								<th class="w25">交易笔数</th>
								<td class="w25">0</td>
								<th class="w25">交易金额</th>
								<td class="w25">0</td>
							</tr>
							<tr>
								<th class="w25">最近一次交易时间据上月底天数</th>
								<td class="w25">0</td>
								<th class="w25">当月活动省市</th>
								<td class="w25">0</td>
							</tr>
						</thead>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>

</html>