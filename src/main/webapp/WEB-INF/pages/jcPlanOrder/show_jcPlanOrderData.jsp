<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div class="panel-heading">
	<h3 class="panel-title">
		<a href="javascript:void(0);" class="toggle-sidebar"><span
			class="fa fa-angle-double-left" data-toggle="offcanvas"
			title="Maximize Panel"></span></a> 竞彩投注信息
	</h3>
</div>
<div class="panel-body">
	<div class="bs-example">
		<table class="table">
			<thead>
				<tr>
					<th>序号</th>
					<th>订单时间</th>
					<th>投注内容</th>
					<th>投注分析</th>
					<th>投入金额</th>
					<th>是否命中</th>
					
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>总条数</th>
					<th>总投入</th>
					<th>总盈亏</th>
				</tr>
				<tr>
					<td>${info.count }</td>
					<td></td>
					<td></td>
				</tr>
			</tfoot>
		</table>
		<nav aria-label="Page navigation" style="margin-left: 50%">
			<ul class="pagination">
				<li>
					<a href="#" aria-label="Previous">
						<span aria-hidden="true">&laquo;</span>
					</a>
				</li>
				<li><span>当前第${info.currentPage }页</span></li>
				<li><span>共${info.totalPage }页</span></li>
				<li>
					<a href="#" aria-label="Next">
						<span aria-hidden="true">&raquo;</span>
					</a>			
				</li>
			</ul>
		</nav>
	</div>
		
</div>


