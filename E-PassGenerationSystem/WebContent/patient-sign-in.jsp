<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.connection.*"%>
<!---/demosWTR/Freedom/19-02-2020/traveling-freedom-demo_Free/1171185230/webindex.htmlselect * from template_down_details where starter_demo_url='/demosWTR/Freedom/19-02-2020/traveling-freedom-demo_Free/1171185230/webindex.html' lat part:login.html--->
<!--
Author: W3layouts
Author URL: http://w3layouts.com
-->
<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from demo.w3layouts.com/demosWTR/Freedom/19-02-2020/traveling-freedom-demo_Free/1171185230/web/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 17 Oct 2020 04:37:51 GMT -->
<!-- Added by HTTrack -->
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<!-- /Added by HTTrack -->
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Curfew E-Pass Travelling System</title>
<link rel="stylesheet" href="assets/css/style-freedom.css">
</head>

<body>
	<script
		src='../../../../../../../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>
	<script
		src="../../../../../../../m.servedby-buysellads.com/monetization.js"
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
	<script async src='../../../../../../js/autotrack.js'></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<meta name="robots" content="noindex">
<body>
	<link rel="stylesheet"
		href="../../../../../../images/demobar_w3_4thDec2019.css">
	<!-- Demo bar start -->
	<!-- header -->
	<div class="w3l-headers-9">
		<header>
			<div class="wrapper">
				<div class="header">
					<div>
						<h1>
							<a href="index.jsp" class="logo">E-Pass Travelling System</a>
							<!-- if logo is image enable this   
						<a class="logo" href="index.html">
							<img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
						</a> -->
						</h1>
					</div>
					<div class="bottom-menu-content">
						<input type="checkbox" id="nav" /> <label for="nav"
							class="menu-bar"></label>
						<nav>
							<ul class="menu">
								<li><a href="index.jsp" class="link-nav">Home</a></li>
								<li><a href="patient-sign-up.jsp" class="link-nav">Patient
										Sign Up</a></li>

							</ul>
						</nav>
					</div>
				</div>
			</div>
		</header>
		<!-- //header -->
	</div>
	<!-- //covers -->
	<!-- form 34 -->
	<section class="w3l-form-34-main">
		<div class="form34-sub">
			<div class="form34">
				<div class="main-top">
					
						<h2>Patient Login</h2>
						<br>
						<%
							String credential = (String) session.getAttribute("credential");
							if (credential != null) {
								session.removeAttribute("credential");
						%>
						<div class="alert alert-danger" id="danger">You have enter
							wrong credentials.</div>
						<%
							}
						%>
						<%
							String captchaCode = (String) session.getAttribute("verificationCode");
							if (captchaCode != null) {
								session.removeAttribute("verificationCode");
						%>
						<div class="alert alert-info" id="info">You have enter wrong
							verification code.</div>
						<%
							}
						%><br>
						<br>
						<form action="PatientLogin" method="post">
							<div class="">
								<p class="text-head">User Name</p>
								<input type="text" name="uname" class="input"
									placeholder="User Name" required />
							</div>
							<div class="">
								<p class="text-head">Password</p>
								<input type="password" name="upass" class="input"
									placeholder="Your Password" required />
							</div>
							<%
								String captcha = null;
								ResultSet resultset = DatabaseConnection.getResultFromSqlQuery("select captcha from tblcaptcha");
								if (resultset.next()) {
								captcha = resultset.getString(1);
								}
							%>
							<div class="">
								<p class="text-head">Verification Code</p>
								<input type="text" name="vercode" class="input"
									style="width: 350px;" placeholder="Enter Catptcha Here" />&nbsp;<input type="text"
									value="<%=captcha%>" class="input" style="width: 80px;"
									readonly />
							</div>
							<button type="submit" class="buttonbg signinbutton">Login</button>
							<p class="signup">
								Have not an account yet?<a href="patient-sign-up.jsp"
									class="signuplink">Sign up</a>
							</p>
						</form>
					</div>
				
			</div>
		</div>
	</section>
	<!-- //form 34 -->

	<jsp:include page="patient-side-footer.jsp"></jsp:include>
</body>
<script type="text/javascript">
	$(function() {
		$('#danger').delay(3000).show().fadeOut('slow');
	});

	$(function() {
		$('#info').delay(3000).show().fadeOut('slow');
	});
</script>
</html>