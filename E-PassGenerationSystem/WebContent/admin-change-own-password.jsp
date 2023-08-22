<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.connection.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE HTML>
<html>

<!-- Mirrored from p.w3layouts.com/demos/easy_admin_panel/web/forms.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 14 Aug 2020 14:24:15 GMT -->
<!-- Added by HTTrack -->
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<!-- /Added by HTTrack -->
<head>
<title>Curfew E-Pass Travelling System</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Easy Admin Panel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 



</script>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
<link href="css/font-awesome.css" rel="stylesheet">
<!-- jQuery -->
<!-- lined-icons -->
<link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />
<!-- //lined-icons -->
<!-- chart -->
<script src="js/Chart.js"></script>
<!-- //chart -->
<!--animate-->
<link href="css/animate.css" rel="stylesheet" type="text/css"
	media="all">
<script src="js/wow.min.js"></script>
<script>
	new WOW().init();
</script>
<!--//end-animate-->
<!----webfonts--->
<link
	href='http://fonts.googleapis.com/css?family=Cabin:400,400italic,500,500italic,600,600italic,700,700italic'
	rel='stylesheet' type='text/css'>
<!---//webfonts--->
<!-- Meters graphs -->
<script src="js/jquery-1.10.2.min.js"></script>
<!-- Placed js at the end of the document so the pages load faster -->

</head>

<body class="sticky-header left-side-collapsed" onload="initMap()">
	<script
		src='../../../../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>
	<script src="../../../../m.servedby-buysellads.com/monetization.js"
		type="text/javascript"></script>
	<script>
		(function() {
			if (typeof _bsa !== 'undefined' && _bsa) {
				// format, zoneKey, segment:value, options
				_bsa.init('flexbar', 'CKYI627U', 'placement:w3layoutscom');
			}
		})();
	</script>
	<script>
		(function() {
			if (typeof _bsa !== 'undefined' && _bsa) {
				// format, zoneKey, segment:value, options
				_bsa.init('fancybar', 'CKYDL2JN', 'placement:demo');
			}
		})();
	</script>
	<script>
		(function() {
			if (typeof _bsa !== 'undefined' && _bsa) {
				// format, zoneKey, segment:value, options
				_bsa.init('stickybox', 'CKYI653J', 'placement:w3layoutscom');
			}
		})();
	</script>
	<!--<script>(function(v,d,o,ai){ai=d.createElement("script");ai.defer=true;ai.async=true;ai.src=v.location.protocol+o;d.head.appendChild(ai);})(window, document, "//a.vdo.ai/core/w3layouts_V2/vdo.ai.js?vdo=34");</script>-->
	<div id="codefund">
		<!-- fallback content -->
	</div>
	<script src="https://ethicalads.io/?ref=codefund" async="async"></script>

	<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async
		src='https://www.googletagmanager.com/gtag/js?id=UA-149859901-1'></script>
	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag() {
			dataLayer.push(arguments);
		}
		gtag('js', new Date());

		gtag('config', 'UA-149859901-1');
	</script>

	<script>
		window.ga = window.ga || function() {
			(ga.q = ga.q || []).push(arguments)
		};
		ga.l = +new Date;
		ga('create', 'UA-149859901-1', 'demo.w3layouts.com');
		ga('require', 'eventTracker');
		ga('require', 'outboundLinkTracker');
		ga('require', 'urlChangeTracker');
		ga('send', 'pageview');
	</script>
	<script async src='../../../js/autotrack.js'></script>

	<meta name="robots" content="noindex">
<body>
	<%
		if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
	%>
	<link rel="stylesheet" href="../../../images/demobar_w3_4thDec2019.css">
	<!-- Demo bar start -->

	<section>
		<jsp:include page="admin-side-header.jsp"></jsp:include>
		<!-- main content start-->
		<div class="main-content main-content3">
			<!-- header-starts -->
			<div class="header-section">

				<!--toggle button start-->
				<a class="toggle-btn  menu-collapsed"><i class="fa fa-bars"></i></a>
				<!--toggle button end-->
				<div class="menu-right">
					<div class="user-panel-top">
						<div class="profile_details_left">
							<span>E-Pass Generation System</span> | <strong> Admin
								Change Password</strong>
						</div>
						<div class="profile_details">
							<ul>
								<li class="dropdown profile_details_drop"><a href="#"
									class="dropdown-toggle" data-toggle="dropdown"
									aria-expanded="false">
										<div class="profile_img">
											<div class="user-name">
												<p>
													<%=session.getAttribute("uname")%><span>Administrator</span>
												</p>
											</div>
											<i class="lnr lnr-chevron-down"></i> <i
												class="lnr lnr-chevron-up"></i>
											<div class="clearfix"></div>
										</div>
								</a>
									<ul class="dropdown-menu drp-mnu">
										<li><a href="admin-change-own-password.jsp"><i
												class="fa fa-cog"></i> Settings</a></li>
										<li><a href="admin-logout.jsp"><i
												class="fa fa-sign-out"></i> Logout</a></li>
									</ul></li>
								<div class="clearfix"></div>
							</ul>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<!-- //header-ends -->
			<div id="page-wrapper">
				<div class="graphs">
					<h3 class="blank1">Change Password</h3>
					<%
						String currentPassword = null;
					ResultSet resultSet = DatabaseConnection
							.getResultFromSqlQuery("select * from tbladmin where uname='" + session.getAttribute("uname") + "'");
					if (resultSet.next()) {
						currentPassword = resultSet.getString("password");
					}
					%>
					<div class="tab-content">
						<div class="tab-pane active" id="horizontal-form">
							<form class="form-horizontal" action="AdminPasswordChange"
								method="post">
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">Current
										Password</label>
									<div class="col-sm-8">
										<input type="password" class="form-control1"
											value="<%=currentPassword%>" name="cpassword" readonly>
									</div>
								</div>
								<div class="form-group">
									<label for="disabledinput" class="col-sm-2 control-label">New
										Password</label>
									<div class="col-sm-8">
										<input type="password" class="form-control1"
											placeholder="New Password" name="password">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-sm-2 control-label">Confirm
										Password</label>
									<div class="col-sm-8">
										<input type="password" class="form-control1"
											id="inputPassword" placeholder="Confirm Password"
											name="confpass">
									</div>
								</div>
						</div>
					</div>

					<div class="bs-example"
						data-example-id="form-validation-states-with-icons">
						<div class="panel-footer">
							<div class="row">
								<div class="col-sm-8 col-sm-offset-2">
									<button class="btn-success btn">Change Password</button>
								</div>
							</div>
						</div>

					</div>
					</form>
				</div>
			</div>
		</div>
		<!--footer section start-->
		<footer>
			<p>&copy 2021-2022 E-Pass Travelling System.</p>
		</footer>
		<!--footer section end-->
	</section>

	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>
</body>

<%
	} else {
response.sendRedirect("index.jsp");
}
%>
</html>