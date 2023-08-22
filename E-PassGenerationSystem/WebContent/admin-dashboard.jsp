<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.connection.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE HTML>
<html>

<!-- Mirrored from p.w3layouts.com/demos/easy_admin_panel/web/ by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 14 Aug 2020 14:23:11 GMT -->
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
		<!-- left side start-->
		<jsp:include page="admin-side-header.jsp"></jsp:include>
		<!-- left side end-->

		<!-- main content start-->
		<div class="main-content">
			<!-- header-starts -->
			<div class="header-section">

				<!--toggle button start-->
				<a class="toggle-btn  menu-collapsed"><i class="fa fa-bars"></i></a>
				<!--toggle button end-->

				<!--notification menu start -->
				<div class="menu-right">
					<div class="user-panel-top">
						<div class="profile_details_left">
							<span>E-Pass Generation System</span> | <strong> Admin
								Dashboard</strong>
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
				<!--notification menu end -->
			</div>
			<!-- //header-ends -->
			<div id="page-wrapper">
				<div class="graphs">
					<div class="col_3">
						<div class="col-md-4 widget widget1">
							<div class="r3_counter_box">
								<i class="fa fa-pencil"></i>
								<div class="stats">
									<%
										int allApplications = 0;
										ResultSet resultsetApplications = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient");
										resultsetApplications.next();
										allApplications = resultsetApplications.getInt(1);
									%>
									<h5><%=allApplications %></h5>
									<div class="grow" style="width: 150px;">
										<p>E-Pass Applications</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-4 widget widget1">
							<div class="r3_counter_box">
								<i class="fa fa-check"></i>
								<div class="stats">
									<%
										int approvedApplications = 0;
										ResultSet resultsetApprovedApplications = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient where e_pass_status='Approved'");
										resultsetApprovedApplications.next();
										approvedApplications = resultsetApprovedApplications.getInt(1);
									 %>
									<h5>
										<%=approvedApplications %>
									</h5>
									<div class="grow grow1" style="width: 150px;">
										<p>Approved E-Pass</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-3 widget widget1">
							<div class="r3_counter_box">
								<i class="fa fa-ban"></i>
								<div class="stats">
									<%
										int rejectedApplications = 0;
										ResultSet resultsetRejectedApplications = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient where e_pass_status='Rejected'");
										resultsetRejectedApplications.next();
										rejectedApplications = resultsetRejectedApplications.getInt(1);
									 %>
									<h5>
										<%=rejectedApplications %>
									</h5>
									<div class="grow grow3" style="width: 150px;">
										<p>Rejected E-Pass</p>
									</div>
								</div>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
					<br>
					<div class="col_3">
						<div class="col-md-4 widget widget1">
							<div class="r3_counter_box">
								<i class="fa fa-users"></i>
								<div class="stats">
									<%
										int allpatient = 0;
										ResultSet resultset = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient");
										resultset.next();
										allpatient = resultset.getInt(1);
									%>
									<h5>
										<%=allpatient%>
									</h5>
									<div class="grow">
										<p>All Patients</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-4 widget widget1">
							<div class="r3_counter_box">
								<i class="fa fa-user"></i>
								<div class="stats">
									<%
										int alldoctor = 0;
										ResultSet resultDoctor = DatabaseConnection.getResultFromSqlQuery("select count(*) from tbladmin");
										resultDoctor.next();
										alldoctor = resultDoctor.getInt(1);
									%>
									<h5>
										<%=alldoctor%>
									</h5>
									<div class="grow grow2">
										<p>Doctor</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-3 widget widget1">
							<div class="r3_counter_box">
								<i class="fa fa-eye"></i>
								<div class="stats">
								<%
										int pendingApplications = 0;
										ResultSet resultPendingApplications = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient where e_pass_status='Pending'");
										resultPendingApplications.next();
										pendingApplications = resultPendingApplications.getInt(1);
									%>
									<h5>
										<%=pendingApplications%>
									</h5>
									<div class="grow grow3" style="width: 150px;">
										<p>Pending E-Pass</p>
									</div>
								</div>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<!--body wrapper end-->
		</div>
		<!--footer section start-->
		<footer>
			<p>&copy 2021-2022 E-Pass Travelling System.</p>
		</footer>
		<!--footer section end-->

		<!-- main content end-->
	</section>

	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>
	<%
		} else {
	response.sendRedirect("index.jsp");
	}
	%>
</body>

<!-- Mirrored from p.w3layouts.com/demos/easy_admin_panel/web/ by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 14 Aug 2020 14:23:55 GMT -->
</html>