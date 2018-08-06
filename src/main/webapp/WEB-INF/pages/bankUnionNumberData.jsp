<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	function queryInfo(){
		$.ajax({
			url:"${ctx}/creation/queryBankUnionNumberData.htm",
			type:"post",
			data:$("#queryInfoFrom").serialize(),
			success:function(data){
				
			},
			error:function(){
				
			}
		});
	}
	
	$(function(){
		//1.初始化Table
		var oTable = new TableInit();
		oTable.Init();
		//2.初始化Button的点击事件
		var oButtoInit = new ButtonInit();
		oButtonInit.Init();
	});
	
	var TableInit = function(){
		var oTableInit = new Object();
		//初始化table
		oTableInit.Init = function(){
			$('#tb_departments').bootstrapTable({
				url:'${ctx}/creation/queryBankUnionNumberData.htm',
				menthod:'post',
				toolbar:'#toolbar',
				strped:true,
				cache:false,
				pagination:true,
				sortable:false,
				sortOrder:'asc',
				queryParams:oTableInit.queryParams,
				sidePagination:'server',
				pageNumber:1,
				pageSize:10,
				pageList:{10, 20, 50},
				search:true,
				strictSearch:true,
				showColumns:true,
				showRefresh:true,
				clickToSelect:true,
				height:500,
				uniqueId:'ID',
				showToggle:true,
				cardView:false,
				detailView:false,
				columns:[{
					checkbox:true
				},{
					field:'name',
					title:'bume'
				}],
			});
		}
	}
</script>

<div class="panel-heading">
	<h3 class="panel-title">
		<a href="javascript:void(0);" class="toggle-sidebar"><span
			class="fa fa-angle-double-left" data-toggle="offcanvas"
			title="Maximize Panel"></span></a> 全国银行联行号
	</h3>
</div>

<div class="panel-body">
	<h4 class="content-row-title">查询条件：</h4>
	<form class="form-horizontal" method="post" id="queryInfoFrom">
		<div class="form-group">
			<label class="col-sm-2 control-label">联行号：</label>
			<div class="col-md-3">
				<input type="text" class="form-control"
					name="bankUnionNumberInfo.bankUnionNumber" placeholder="">
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label">银行名称：</label>
			<div class="col-md-3">
				<input type="text" class="form-control"
					name="bankUnionNumberInfo.bankName" placeholder="">
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button class="btn btn-success"
					onclick="queryInfo();return false;">提交</button>
					
				<button class="btn btn-info" type="reset">重置</button>	
			</div>
		</div>
	</form>
	
	<div class="bs-example">
		<table class="table">
			<thead>
				<tr>
					<th>序号</th>
					<th>联行号</th>
					<th>银行名称</th>
					<th>联系电话</th>
					<th>联系地址</th>
					
				</tr>
				<tbody>
					<c:forEach var="item" items="${data.infos}" varStatus="id">
						<tr>
							<td>${id.index+1}</td>
							<td>${item.bankUnionNumber}</td>
							<td>${item.bankName}</td>
							<td>${item.contactPhone}</td>
							<td>${item.contactAddress}</td>
						</tr>
					</c:forEach>
				</tbody>
			</thead>
			<tfoot>
				<tr>
					<th>总条数</th>
				</tr>
				<tr>
					<td>${data.pageInfo.count }</td>
				</tr>
			</tfoot>
		</table>
		<nav aria-label="Page navigation" style="margin-left: 50%">
			<ul class="pagination">
				<li>
					<a href="javascript:void(0)" onclick="" aria-label="Previous">
						<span aria-hidden="true">&laquo;</span>
					</a>
				</li>
				<li><span>当前第${data.pageInfo.currentPage }页</span></li>
				<li><span>共${data.pageInfo.totalPage }页</span></li>
				<li>
					<a href="javascript:void(0)" aria-label="Next">
						<span aria-hidden="true">&raquo;</span>
					</a>			
				</li>
			</ul>
		</nav>
	</div>
</div>



<div class="panel-body" style="padding-bottom:0px;"> 
	<div class="panel panel-default">
		<div class="panel-heading">查询条件</div>
		<div class="panel-body">
			<form action="" id="queryParams">
				<div class="form-group" style="margin-top:15px;">
					<label class="control-label col-sm-1" for="txt_search_departmentname">部门名称</label>
					<div class="col=sm-3">
						<input type="text" class="form-control" id="txt_search_departmentname"/>
					</div>
					
					<label class="control-label col-sm-1" for="txt_search_departmentname">部门名称</label>
					<div class="col=sm-3">
						<input type="text" class="form-control" id="txt_search_departmentname"/>
					</div>
					
					<label class="control-label col-sm-1" for="txt_search_departmentname">部门名称</label>
					<div class="col=sm-3">
						<input type="text" class="form-control" id="txt_search_departmentname"/>
					</div>
				</div>
			</form>
		</div>
	</div>
	
	<div id="toolbar" class="btn-group">
		<button id="btn_add" type="button" class="btn btn-default">
			<span class="glyphicon glyphicon-plus" aria-hidden="true">新增</span>
		</button>
		<button id="btn_edit" type="button" class="btn btn-default">
			<span class="glyphicon glyphicon-pencil" aria-hidden="true">修改</span>
		</button>
		<button id="btn_delete" type="button" class="btn btn-default">
			<span class="glyphicon glyphicon-remove" aria-hidden="true">删除</span>
		</button>
		
		<table id="tb_departments"></table>
		
	</div>
	
</div>



