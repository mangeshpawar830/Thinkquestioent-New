<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.connection.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>E-Pass System for COVID-19</title>
<meta content="" name="description">
<meta content="" name="keywords">

<!-- Favicons -->
<!-- <link href="assets/img/favicon.png" rel="icon">
<link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon"> -->

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
<link href="assets/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet">
<link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
<link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
<link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
<link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link
	href="assets/vendor/bootstrap-datepicker/css/bootstrap-datepicker.min.css"
	rel="stylesheet">

<!-- Template Main CSS File -->
<link href="assets/css/style.css" rel="stylesheet">
</head>

<body>

	<!-- ======= Top Bar ======= -->
	<div id="topbar" class="d-none d-lg-flex align-items-center fixed-top">
		<div class="container d-flex">
			<div class="contact-info mr-auto">
				<i class="icofont-envelope"></i> <a href="mailto:mangupawar830@gmail.com">mangupawar830@gmail.com</a>
				<i class="icofont-phone"></i> +91-8308075163 <i class="icofont-google-map"></i> Maharashtra, India.
			</div>
		</div>
	</div>

	<!-- ======= Header ======= -->
	<header id="header" class="fixed-top">
		<div class="container d-flex align-items-center">

			<h2 class="logo mr-auto">
				<a href="index.jsp">E-Pass System for COVID-19</a>
			</h2>

			<nav class="nav-menu d-none d-lg-block">
				<ul>
					<li class="active"><a href="index.jsp">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#contact">Contact</a></li>
					<li class="drop-down"><a href="">Login</a>
						<ul>
							<li><a href="patient-sign-in.jsp">Patient Login</a></li>
							<li><a href="admin-login.jsp">Doctor/Admin Login</a></li>
						</ul></li>
				</ul>
			</nav>
			<!-- .nav-menu -->
		</div>
	</header>
	<!-- End Header -->

	<!-- ======= Hero Section ======= -->
	<section id="hero" class="d-flex align-items-center">
		<div class="container">		
			<h3>
				<strong><font color="orange">Welcome To E-Pass System for COVID-19</font></strong>
			</h3>
			
		</div>
	</section>
	<!-- End Hero -->
	<main id="main">
		<!-- ======= Counts Section ======= -->
		<section id="counts" class="counts">
			<div class="container">
				<div class="row">
					<div class="col-lg-3 col-md-6">
						<%
							int approvedApplications = 0;
							ResultSet resultsetApprovedApplications = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient where e_pass_status='Approved'");
							resultsetApprovedApplications.next();
							approvedApplications = resultsetApprovedApplications.getInt(1);
						%>
						<div class="count-box">
							<i class="icofont-doctor-alt"></i> <span data-toggle="counter-up"><%=approvedApplications %></span>
							<p>Approved E-Pass</p>
						</div>
					</div>

					<div class="col-lg-3 col-md-6 mt-5 mt-md-0">
						<%
							int rejectedApplications = 0;
							ResultSet resultsetRejectedApplications = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient where e_pass_status='Rejected'");
							resultsetRejectedApplications.next();
							rejectedApplications = resultsetRejectedApplications.getInt(1);
						%>
						<div class="count-box">
							<i class="icofont-patient-bed"></i> <span
								data-toggle="counter-up"><%=rejectedApplications %></span>
							<p>Rejected E-Pass</p>
						</div>
					</div>

					<div class="col-lg-3 col-md-6 mt-5 mt-lg-0">
						<%
							int allApplications = 0;
							ResultSet resultsetApplications = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient");
							resultsetApplications.next();
							allApplications = resultsetApplications.getInt(1);
						%>
						<div class="count-box">
							<i class="icofont-laboratory"></i> <span data-toggle="counter-up"><%=allApplications %></span>
							<p>Total E-Pass Applications</p>
						</div>
					</div>

					<div class="col-lg-3 col-md-6 mt-5 mt-lg-0">
						<%
							int alldoctor = 0;
							ResultSet resultDoctor = DatabaseConnection.getResultFromSqlQuery("select count(*) from tbladmin");
							resultDoctor.next();
							alldoctor = resultDoctor.getInt(1);
						%>
						<div class="count-box">
							<i class="icofont-award"></i> <span data-toggle="counter-up"><%=alldoctor%></span>
							<p>Admin/Doctor</p>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- End Counts Section -->

		<!-- ======= about Section ======= -->
		<section id="about" class="about">
			<div class="container">

				<div class="section-title">
					<h2>About</h2>
					<p>E-Pass System for COVID-19 is a web-based technology that will
						manage the records of pass which issue by administrative. E-Pass
						Management System is an automatic system that delivers data
						processing at a very high speed in a systematic manner.</p>
				</div>

				<div class="row">
					<div
						class="col-lg-6 col-md-6 d-flex align-items-stretch mt-4 mt-md-0">
						<div class="icon-box">
							<h4>
								<a href="">Patient</a>
							</h4>
							<p>Patient submit his own details and documents for e-pass.</p>
						</div>
					</div>
					<div class="col-lg-6 col-md-6 d-flex align-items-stretch">
						<div class="icon-box">
							<h4>
								<a href="admin-login.jsp">Admin/Doctor</a>
							</h4>
							<p>Admin can briefly view the total number of category and
								how many pass will be generated in a day.</p>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- End about Section -->
		<!-- ======= Contact Section ======= -->
		<section id="contact" class="contact">
			<div class="container">

				<div class="section-title">
					<h2>Contact</h2>
					<p>For more details, Please contact with us.</p>
				</div>
			</div>
			<div class="container">
				<div class="row mt-5">

					<div class="col-lg-4">
						<div class="info">
							<div class="address">
								<i class="icofont-google-map"></i>
								<h4>Location:</h4>
								<p>Maharashtra, India</p>
							</div>

							<div class="email">
								<i class="icofont-envelope"></i>
								<h4>Email:</h4>
								<p>mangupawar830@gmail.com</p>
							</div>

							<div class="phone">
								<i class="icofont-phone"></i>
								<h4>Call:</h4>
								<p>+91-8308075163</p>
							</div>

						</div>

					</div>

					<div class="col-lg-8 mt-5 mt-lg-0">
						<form action="AddContacts" method="post">
							<div class="form-row">
								<div class="col-md-6 form-group">
									<input type="text" name="name" class="form-control" id="name"
										placeholder="Your Name" data-rule="minlen:4"
										data-msg="Please enter at least 4 chars" />
									<div class="validate"></div>
								</div>
								<div class="col-md-6 form-group">
									<input type="email" class="form-control" name="email"
										id="email" placeholder="Your Email" data-rule="email"
										data-msg="Please enter a valid email" />
									<div class="validate"></div>
								</div>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="subject"
									id="subject" placeholder="Subject" data-rule="minlen:4"
									data-msg="Please enter at least 8 chars of subject" />
								<div class="validate"></div>
							</div>
							<div class="form-group">
								<textarea class="form-control" name="message" rows="5"
									data-rule="required" data-msg="Please write something for us"
									placeholder="Message"></textarea>
								<div class="validate"></div>
							</div>
							<div class="text-center">
								<button type="submit">Send Message</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</section>
		<!-- End Contact Section -->

	</main>
	<!-- End #main -->

	<!-- ======= Footer ======= -->
	<footer id="footer">
		<div class="container d-md-flex py-4">
			<div class="mr-md-auto text-center text-md-left">
				<div class="copyright">&copy 2022-2023 E-Pass System for COVID-19.</div>
			</div>
			<div class="social-links text-center text-md-right pt-3 pt-md-0">
				<a href="#" class="twitter"><i class="bx bxl-twitter"></i></a> <a
					href="#" class="facebook"><i class="bx bxl-facebook"></i></a> <a
					href="#" class="instagram"><i class="bx bxl-instagram"></i></a> <a
					href="#" class="google-plus"><i class="bx bxl-skype"></i></a> <a
					href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
			</div>
		</div>
	</footer>
	<!-- End Footer -->

	<div id="preloader"></div>
	<a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

	<!-- Vendor JS Files -->
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
	<script src="assets/vendor/php-email-form/validate.js"></script>
	<script src="assets/vendor/venobox/venobox.min.js"></script>
	<script src="assets/vendor/waypoints/jquery.waypoints.min.js"></script>
	<script src="assets/vendor/counterup/counterup.min.js"></script>
	<script src="assets/vendor/owl.carousel/owl.carousel.min.js"></script>
	<script
		src="assets/vendor/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>

	<!-- Template Main JS File -->
	<script src="assets/js/main.js"></script>

</body>

</html>