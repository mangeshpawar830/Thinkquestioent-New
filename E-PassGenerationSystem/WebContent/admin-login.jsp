<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.connection.*"%>
<%@ page import="com.admin.*"%>
<!DOCTYPE HTML>
<html>

<!-- Mirrored from p.w3layouts.com/demos/easy_admin_panel/web/sign-in.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 14 Aug 2020 14:24:15 GMT -->
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

<body class="sign-in-up">
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
	<link rel="stylesheet" href="../../../images/demobar_w3_4thDec2019.css">
	<%
		String captcha = null;
		Connection connection = DatabaseConnection.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select captcha from tblcaptcha");
		if (resultset.next()) {
		captcha = resultset.getString(1);
		}
	%>
	<section>
		<div id="page-wrapper" class="sign-in-wrapper">
			<div class="graphs">
				<div class="sign-in-form">
					<div class="sign-in-form-top">
						<p>
							<span>Sign In to</span> <a href="admin-login.jsp">Admin</a>
						</p>
					</div>
					<div class="signin">
						<form action="AdminLogin" method="post">
							<div class="log-input">
								<div class="log-input-left">
									<input type="text" class="user" placeholder="User Name" name="uname" />
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="log-input">
								<div class="log-input-left">
									<input type="password" class="lock" placeholder="Password"
										name="upass" />
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="log-input">
								<div class="log-input-left">
									<input type="text" class="lock" placeholder="Enter Captcha"
										name="vercode" style="height: 40px; width: 235px;"/>&nbsp;<input
										type="text" name="captcha" value="<%=captcha%>"
										style="height: 40px; width: 150px;" disabled>
								</div>
								<div class="clearfix"></div>
							</div>
							<input type="submit" value="Login">
						</form><br>
						<a href="index.jsp">Go To Home Page</a>
					</div>
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
</html>