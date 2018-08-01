<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	function jcPlanOrderSubmit() {
		$.ajax({
			url : '${ctx}/creation/jcPlanOrderAdd.htm',
			type : 'POST',
			data : $("#jcPlanOrderFrom").serialize(),
			success : function(data) {
				alert(data);
				$("#jcPlanOrderFrom")[0].reset();
				/* $("button[type=rest]").trigger("click"); */
				/* $("#jcPlanOrderResultDiv").html("<strong>"+data+"</strong> "); */
			},
			error : function(data) {
				/* $("#jcPlanOrderResultDiv").html("<strong>失败</strong> "); */
				alert("失败");
			}

		});
	}
</script>
<!-- <style>
.form-group {
	margin-top: 20px;
}
</style> -->


<div class="panel-heading">
	<h3 class="panel-title">
		<a href="javascript:void(0);" class="toggle-sidebar"><span
			class="fa fa-angle-double-left" data-toggle="offcanvas"
			title="Maximize Panel"></span></a> 竞彩投注信息录入
	</h3>
</div>
<div class="panel-body">
	<form class="form-horizontal" id="jcPlanOrderFrom"
		action="${ctx}/creation/jcPlanOrderAdd.htm" method="post">
		<div class="form-group">
			<label class="col-sm-2 control-label">投注日期：</label>
			<div class="col-md-3">
				<input type="text" class="form-control"
					name="jcPlannedOrder.planDate" placeholder="">
				<div class="clear"></div>
				<br />
			</div>
		</div>

		<div class="form-group">
            <label class="col-md-2 control-label" >投注内容：</label>
            <div class="col-md-4">
            	<textarea required="" class="form-control" placeholder="" rows="5" cols="20" id="description" name="jcPlannedOrder.planData"></textarea>
            	<div class="clear"></div>
				<br />
            </div>
        </div>


		<div class="form-group">
            <label class="col-md-2 control-label" >投注分析：</label>
            <div class="col-md-4">
            	<textarea required="" class="form-control" placeholder="" rows="5" cols="20" id="description" name="jcPlannedOrder.planAnalyse"></textarea>
            	<div class="clear"></div>
				<br />
            </div>
        </div>	

		<div class="form-group">
			<label class="col-sm-2 control-label">投注金额：</label>
			<div class="col-md-2">
				<input type="text" class="form-control"
					name="jcPlannedOrder.planCostInput" placeholder="">
				<div class="clear"></div>
				<br />
			</div>
		</div>

		<!-- <div class="form-group">
			<label class="col-sm-2 control-label">是否命中：</label>
			<div class="col-md-1">
				<select name="jcPlannedOrder.isWin" class="selecter_1">
					<option value="0">是</option>
					<option value="1">否</option>
				</select>
			</div>

		</div> -->

		<!-- <div class="form-group">
			<label class="col-sm-2 control-label">盈利：</label>
			<div class="col-md-2">
				<input type="text" class="form-control" name="jcPlannedOrder.profit"
					placeholder="">
				<div class="clear"></div>
				<br />
			</div>
		</div> -->

		<div class="form-group" style="margin-left: 300px;">
			<div class="col-sm-offset-2 col-sm-10">
				<button class="btn btn-success"
					onclick="jcPlanOrderSubmit();return false;">提交</button>
					
				<button class="btn btn-info" type="reset">重置</button>	
			</div>
		</div>
	</form>
</div>


