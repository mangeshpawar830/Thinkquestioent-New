<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.connection.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from demo.w3layouts.com/demosWTR/Freedom/19-02-2020/traveling-freedom-demo_Free/1171185230/web/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 17 Oct 2020 04:37:51 GMT -->
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
	<%
		if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
	%>
	<jsp:include page="patient-side-header.jsp"></jsp:include>
	<!-- inner banner -->

	<!-- //covers -->
	<!-- form 34-2 -->
	<section class="w3l-form-34-main">
		<div class="w3l-book-9">
			<div class="main-top">
				<div class="wrapper padding-bord">
					<p class="form-para">
						<strong>Edit Profile.</strong>
					</p>
					<%
						String credential = (String) session.getAttribute("success");
						if (credential != null) {
						session.removeAttribute("success");
					%>
						<div class="alert alert-success" id="success">You profile
						updated sucessfully.</div>
					<%
						}
					%>
					<%
						ResultSet rs = DatabaseConnection
							.getResultFromSqlQuery("select * from tblpatient where user_name='" + session.getAttribute("uname") + "'");
					if (rs.next()) {
					%>
					<form action="PatientProfileUpdate" method="post">
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>My Register Id
								</p>
								<input type="text" name="pid" class="input"
									value="<%=rs.getString("patient_id")%>" readonly />
							</div>
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>Full Name</strong>
								</p>
								<input type="text" name="fname" class="input"
									value="<%=rs.getString("patient_full_name")%>" />
							</div>

						</div>
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>Email</strong>
								</p>
								<input type="email" name="email" class="input"
									value="<%=rs.getString("patient_email")%>" />
							</div>
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>Mobile No</strong>
								</p>
								<input type="text" name="mobile" class="input"
									value="<%=rs.getString("Patient_mobile")%>" />
							</div>

						</div>
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>Disease</strong>
								</p>
								<input type="text" name="disease" class="input"
									value="<%=rs.getString("patient_disease")%>" />
							</div>
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>Address</strong>
								</p>
								<input type="text" name="address" class="input"
									value="<%=rs.getString("patient_address")%>" />
							</div>

						</div>
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>User Name</strong>
								</p>
								<input type="text" name="uname" class="input"
									value="<%=rs.getString("user_name")%>" readonly />
							</div>
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>Password</strong>
								</p>
								<input type="password" name="upassword" class="input"
									value="<%=rs.getString("password")%>" readonly />
							</div>
						</div>
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>Created At</strong>
								</p>
								<input type="text" name="created_at" class="input"
									value="<%=rs.getString("created_at")%>" readonly />
							</div>
							<div class="ele-9its_grid">
								<p class="text-left">
									<strong>Updated At</strong>
								</p>
								<input type="text" name="updated_at" class="input"
									value="<%=rs.getString("updated_at")%>" readonly />
							</div>
						</div>
						<div class="d-grid grid-col-1">
							<div class="ele-9its_grid">
								<input type="submit" class="btn btn-primary"
									value="Update Profile" />
							</div>
						</div>
					</form>
					<%
						}
					%>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="patient-side-footer.jsp"></jsp:include>
	<%
		} else {
	response.sendRedirect("index.jsp");
	}
	%>
</body>
<script type="text/javascript">
	$(function() {
		$('#success').delay(3000).show().fadeOut('slow');
	});
</script>
</html>