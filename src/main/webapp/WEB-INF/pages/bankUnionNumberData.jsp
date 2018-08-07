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
	
	$(function () {
		 
        //1.初始化Table
        var oTable = new TableInit();
        oTable.Init();
 
        //2.初始化Button的点击事件
        /* var oButtonInit = new ButtonInit();
        oButtonInit.Init(); */
 
    });
 
 
    var TableInit = function () {
        var oTableInit = new Object();
        //初始化Table
        oTableInit.Init = function () {
            $('#tradeList').bootstrapTable({
                url: '${ctx}/creation/queryBankUnionNumberData.htm',         //请求后台的URL（*）
                method: 'post',                      //请求方式（*）
                toolbar: '#toolbar',                //工具按钮用哪个容器
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                queryParams: oTableInit.queryParams,//传递参数（*）
                sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber:1,                       //初始化加载第一页，默认第一页
                pageSize: 50,                       //每页的记录行数（*）
                pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                strictSearch: true,
                clickToSelect: true,                //是否启用点击选中行
                height: 460,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "id",                     //每一行的唯一标识，一般为主键列
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                columns: [{
                    field: 'bankUnionNumber',
                    title: '联行号'
                }, {
                    field: 'bankName',
                    title: '银行名称'
                }, {
                    field: 'contactPhone',
                    title: '联系电话'
                }, {
                    field: 'contactAddress',
                    title: '联系地址'
                }]
            });
        };
 
        //得到查询的参数
      oTableInit.queryParams = function (params) {
            var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                /* limit: params.limit,   //页面大小
                offset: params.offset,  //页码
                sdate: $("#stratTime").val(),
                edate: $("#endTime").val(),
                sellerid: $("#sellerid").val(),
                orderid: $("#orderid").val(),
                CardNumber: $("#CardNumber").val(),
                maxrows: params.limit,
                pageindex:params.pageNumber,
                portid: $("#portid").val(),
                CardNumber: $("#CardNumber").val(),
                tradetype:$('input:radio[name="tradetype"]:checked').val(),
                success:$('input:radio[name="success"]:checked').val(), */
            };
            return temp;
        };
       
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



	
</div>



