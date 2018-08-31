<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
$(function(){
	initTable();
	
	//查询按钮事件
	$("#btn_query").click(function(){
		$("#oracleTable").bootstrapTable('refresh');
	});
});


// 表格数据初始化
function initTable(){
	$("#oracleTable").bootstrapTable({
	    url: "${ctx}/creation/queryOracleErrorMessageData.htm",
	    cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
	    striped: true,  //表格显示条纹，默认为false
	    pagination: true, // 在表格底部显示分页组件，默认false
	    pageList: [10, 20, 30, 40], // 设置页面可以显示的数据条数
	    pageSize: 10, // 页面数据条数
	    pageNumber: 1, // 首页页码
	    showRefresh: true,
	    showExport: true,
	    exportDataType: 'basic',
	    exportTypes:['excel','xlsx'],
	    exportOptions:{  
	    	fileName: '数据导出',              //文件名称设置  
	        worksheetName: 'Sheet1',          //表格工作区名称  
	        tableName: '商品数据表',  
	        excelstyles: ['background-color', 'color', 'font-size', 'font-weight'],  
	     },
	    //search:true,
	    sidePagination: 'server', // 设置为服务器端分页
	    queryParams: function (params) { // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求
	        return {
	            pageSize: params.limit, // 每页要显示的数据条数
	            offset: params.offset, // 每页显示数据的开始行号
	            sort: params.sort, // 要排序的字段
	            sortOrder: params.order, // 排序规则
	            errorCode: $("#txt_search_errorCode").val() // 错误码
	        }
	    },
	    sortName: 'id', // 要排序的字段
	    sortOrder: 'desc', // 排序规则
	    columns: [{
	        checkbox: true
	    }, {
	        field: 'errorCode',
	        title: '错误码编号'
	    }, {
	        field: 'errorMsg',
	        title: '错误信息'
	    }, {
	        field: 'errorMsgZh',
	        title: '错误信息-中文'
	    }, {
	        field: 'cause',
	        title: '错误产生原因'
	    },  {
	        field: 'causeZh',
	        title: '错误产生原因-中文'
	    }, {
	        field: 'action',
	        title: '解决方案'
	    }, {
	        field: 'actionZh',
	        title: '解决方案-中文'
	    }],
	    onLoadSuccess: function(){  //加载成功时执行
	          console.info("加载成功");
	    },
	    onLoadError: function(){  //加载失败时执行
	          console.info("加载数据失败");
	    }
	
	})
};


</script>

<div class="panel-heading">
	<h3 class="panel-title">
		<a href="javascript:void(0);" class="toggle-sidebar"><span
			class="fa fa-angle-double-left" data-toggle="offcanvas"
			title="Maximize Panel"></span></a> oracle错误码
	</h3>
</div>

<div class="panel panel-default">
	 <form id="formSearch" class="form-horizontal">
                    <div class="form-group" style="margin-top:15px">
                        <label class="control-label col-sm-1">错误码</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" id="txt_search_errorCode">
                        </div>
                        <div class="col-sm-4" style="text-align:left;">
                            <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询</button>
                        </div>
                    </div>
                </form>
                <button type="button" id="download" style="margin-left:50px" id="btn_download" class="btn btn-primary" onClick ="$('#oracleTable').tableExport({ type: 'excel', escape: 'false' })">数据导出</button>
                
                <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button id="btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button>
            <button id="btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>
        <table id="oracleTable">
        </table>
        
</div>
