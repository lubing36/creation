<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <section id='content'>
    <div class='span12'>
        <div class='page-header'>
            <h1 class='pull-left'>
                <i class='icon-table'></i>
                <span>数据中心</span>
            </h1>
            <div class='pull-right'>
                <ul class='breadcrumb'>
                    <li>
                        <a href="${ctx }/index.htm"><i class='icon-bar-chart'></i>
                        </a>
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li class='active'>首页</li>
                </ul>
            </div>
        </div>
    </div>
	<div class='span12 box bordered-box orange-border'
		style='margin-bottom: 0;'>
		<div class='box-header purple-background'>
			<div class='title'>历史数据</div>
			<div class='actions'>
				<a href="#" class="btn box-remove btn-mini btn-link"><i
					class='icon-remove'></i> </a> <a href="#"
					class="btn box-collapse btn-mini btn-link"><i></i> </a>
			</div>
		</div>
		<div class='box-content box-no-padding'>
			<div class='responsive-table'>
				<div class='scrollable-area'>
					<table
						class='data-table-column-filter table table-bordered table-striped'
						style='margin-bottom: 0;'>
						<thead>
							<tr>
								<th>序号</th>
								<th>日期</th>
								<th>投注内容</th>
								<th>比赛分析</th>
								<th>投注金额</th>
								<th>是否中奖</th>
								<th>盈利</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="data" items="${list }">
								<tr>
									<td>${data.id }</td>
									<td>${data.planDate }</td>
									<td>${data.planData }</td>
									<td>${data.planAnalyse }</td>
									<td>${data.planCostInput }</td>
									<td>
										<c:if test="${data.isWin ==0 }"><span style="color: red">中奖</span></c:if>
										<c:if test="${data.isWin ==1 }"><span style="color: blue">未中奖</span></c:if>
										<c:if test="${data.isWin =='' or data.isWin ==null }"><span style="color: blue">状态未知</span></c:if>
									</td>
									<td><span class='label label-important'>profit</span></td>
									<td>
										<div class='text-right'>
											<a class='btn btn-success btn-mini' href='#'> <i
												class='icon-ok'></i>
											</a> <a class='btn btn-danger btn-mini' href='#'> <i
												class='icon-remove'></i>
											</a>
										</div>
									</td>
								</tr>
							</c:forEach>
						</tbody>
						<tfoot>
							<tr>
								<th>Name</th>
								<th>E-mail</th>
								<th colspan='2'>Status</th>
							</tr>
						</tfoot>
					</table>
				</div>
			</div>
		</div>
		</div>