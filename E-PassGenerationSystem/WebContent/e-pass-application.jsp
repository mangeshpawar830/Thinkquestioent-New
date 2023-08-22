<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.connection.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE HTML>
<html>

<!-- Mirrored from p.w3layouts.com/demos/easy_admin_panel/web/tables.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 14 Aug 2020 14:24:15 GMT -->
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
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
		<div class="main-content main-content4">
			<!-- header-starts -->
			<div class="header-section">

				<!--toggle button start-->
				<a class="toggle-btn  menu-collapsed"><i class="fa fa-bars"></i></a>
				<!--toggle button end-->

				<!--notification menu start -->
				<div class="menu-right">
					<div class="user-panel-top">
						<div class="profile_details_left">
							<span>E-Pass Generation System</span> | <strong> E-Pass
								Applications</strong>
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
					<h4 class="blank1">E-Pass Applications</h4>
					<%
						String success = (String) session.getAttribute("success");
					if (success != null) {
						session.removeAttribute("success");
					%>
					<div class="alert success" id="success">Your medical
						prescription data matched hence your application have approved.</div>
					<%
						}
					%>

					<%
						String fail = (String) session.getAttribute("fail");
					if (fail != null) {
						session.removeAttribute("fail");
					%>
					<div class="alert alert-danger" id="danger">Your medical
						prescription data not matched hence your application have
						rejected.</div>
					<%
						}
					%>
					<div class="xs tabls">
						<div class="bs-example4" data-example-id="contextual-table">
							<table class="table">
								<thead>
									<tr>
										<th>Patient Id</th>
										<th>Patient Name</th>
										<th>Email Id</th>
										<th>Mobile No</th>
										<th>Address</th>
										<th>Disease</th>
										<th>Source</th>
										<th>Destination</th>
										<th>Status</th>
										<th>Action</th>
									</tr>
								</thead>
								<%
									ResultSet resultset = DatabaseConnection
										.getResultFromSqlQuery("select * from tblpatient where e_pass_status='Pending'");
								while (resultset.next()) {
								%>
								<tbody>
									<tr class="active">
										<th scope="row"><%=resultset.getString("patient_id")%></th>
										<td><%=resultset.getString("patient_full_name")%></td>
										<td><%=resultset.getString("patient_email")%></td>
										<td><%=resultset.getString("Patient_mobile")%></td>
										<td><%=resultset.getString("patient_address")%></td>
										<td><%=resultset.getString("patient_disease")%></td>
										<td><%=resultset.getString("source_city")%></td>
										<td><%=resultset.getString("destination_city")%></td>
										<td><span class="label btn_6 label-info"><%=resultset.getString("e_pass_status")%></span></td>
										<td><a
											href="check-patient-epass-application.jsp?patientId=<%=resultset.getString("patient_id")%>"
											class="btn btn_5 btn-lg btn-warning">Check Application</a></td>
									</tr>
								</tbody>
								<%
									}
								%>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--footer section start-->
		<footer>
			<p>
				<p>&copy 2021-2022 E-Pass Travelling System.</p>
			</p>
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
<script type="text/javascript">
	$(function() {
		$('#success').delay(3000).show().fadeOut('slow');
	});

	$(function() {
		$('#danger').delay(3000).show().fadeOut('slow');
	});
</script>
</html>