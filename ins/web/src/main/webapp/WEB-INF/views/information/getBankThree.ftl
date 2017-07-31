<!DOCTYPE html>
<html lang="en">
<head>
    <title>中融佰诚</title>
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
            <!-- Page heading ends -->
            <!-- Matter -->
			<div class="matter">
				<div class="container">
					<!-- Table -->
					<div class="row">
						<div class="col-md-12 text-center">
							<h1>银行卡三要素验证</h1>
						</div>
						<div class="col-md-11 text-left col-md-offset-1">
							<h3 class="pull-left"><img src="${root}/img/icon-connect.png" alt="" style="padding: 0 10px 0 0;">查询接口选项</h3>
							<div class="clearfix col-md-9">
								<hr style="border:1.4px solid #5296e3;display:block;">
							</div>
						</div>
					</div>
					<div class="row" style='margin-top:20px;'>
						<div class="col-md-6 col-md-offset-3">

							<form class="bs-example bs-example-form" role="form"  action="${root}/service/information/getBankThreeData" onsubmit="return toVaild()" method="post" >
								<div class="col-md-12 input-group input-group-lg" style='margin-top:30px;'>
									<span class="input-group-addon">姓名</span>
									<input type="text" class="form-control" placeholder="请输入姓名" name="name" id="name" maxlength="20">
								</div>
								<div class="col-md-12 input-group input-group-lg" style='margin-top:30px;'>
									<span class="input-group-addon">身份证号</span>
									<input type="text" class="form-control" placeholder="请输入身份证号" name ="id" id="id" maxlength="18">
								</div>
								<div class="col-md-12 input-group input-group-lg" style='margin-top:30px;'>
									<span class="input-group-addon">银行卡号</span>
									<input type="text" class="form-control" placeholder="请输入银行卡号" name ="bank_id" id="bank_id" maxlength="25">
								</div>
								<div class="col-md-12 input-group mtop15">

									<div class="col-lg-12 text-center">
										<button class="btn btn-lg btn-success  mlt7" type="submit" id="getRule">
											<i class="icon-ok">确认查询</i> 
										</button>
									
									</div>
								</div>
							</form>


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
 <script language="javascript">
 
    </script>
    <!-- Footer starts -->
    <#include "./common/common_footer.ftl">
    <!-- Scroll to top -->
    <span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span>
    <!-- Footer ends -->
    <script>seajs.use("information/bankThreeParameter.js");</script>

</body>
</html>