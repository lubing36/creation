<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div class="panel-heading">
	<h3 class="panel-title">
		<a href="javascript:void(0);" class="toggle-sidebar"><span
			class="fa fa-angle-double-left" data-toggle="offcanvas"
			title="Maximize Panel"></span></a> 账本信息
	</h3>
</div>

<div class="panel panel-default">
	<div class="panel">
		<ul id="myTab1" class="nav nav-tabs nav-justified">
			<li class="active"><a href="#home1" data-toggle="tab">支出</a></li>
			<li><a href="#profile1" data-toggle="tab">收入</a></li>
			<li class="dropdown"><a href="#" id="myTabDrop1-1"
				class="dropdown-toggle" data-toggle="dropdown">理财 <b
					class="caret"></b></a>
				<ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1">
					<li><a href="#dropdown1-1" tabindex="-1" data-toggle="tab">股票</a></li>
					<li><a href="#dropdown1-2" tabindex="-1" data-toggle="tab">基金</a></li>
				</ul></li>
		</ul>

		<div id="myTabContent" class="tab-content">
			<div class="tab-pane fade active in" id="home1">
				<p>Raw denim you probably haven't heard of them jean shorts
					Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse.
					Mustache cliche tempor, williamsburg carles vegan helvetica.</p>
			</div>
			<div class="tab-pane fade" id="profile1">
				<p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla
					single-origin coffee squid. Exercitation +1 labore velit, blog
					sartorial PBR leggings next level wes anderson artisan four loko
					farm-to-table craft beer twee.</p>
			</div>
			<div class="tab-pane fade" id="dropdown1-1">
				<p>Etsy mixtape wayfarers, ethical wes anderson tofu before they
					sold out mcsweeney's organic lomo retro fanny pack lo-fi
					farm-to-table readymade. Messenger bag gentrify pitchfork tattooed
					craft beer, iphone...</p>
			</div>
			<div class="tab-pane fade" id="dropdown1-2">
				<p>Trust fund seitan letterpress, keytar raw denim keffiyeh etsy
					art party before they sold out master cleanse gluten-free squid
					scenester freegan cosby sweater. Fanny pack portland seitan DIY,
					art party locavore wolf cliche ...</p>
			</div>
		</div>
	</div>
</div>
