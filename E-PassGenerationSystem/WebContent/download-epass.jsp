<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.connection.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from demo.w3layouts.com/demosWTR/Freedom/19-02-2020/traveling-freedom-demo_Free/1171185230/web/single.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 17 Oct 2020 04:37:51 GMT -->
<!-- Added by HTTrack -->
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<!-- /Added by HTTrack -->
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Curfew E-Pass Travelling System</title>
<link rel="stylesheet" href="assets/css/style-freedom.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

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

	<meta name="robots" content="noindex">
<body>
	<link rel="stylesheet"
		href="../../../../../../images/demobar_w3_4thDec2019.css">
	<%
		if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
	%>
	<jsp:include page="patient-side-header.jsp"></jsp:include><br>
	<br>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-sm-8">
				<h3>Print Your E-Pass</h3>
				<div id="exampl">
					<%
						String status = null;
						ResultSet resultset = DatabaseConnection.getResultFromSqlQuery("select * from tblpatient where user_name='" + session.getAttribute("uname") + "' and e_pass_status='Approved'");
						while (resultset.next()) {
					%>
					<center>
						<table class="table table-bordered" border="2" cellspacing="2" cellpadding="2" width="80%">
							<tbody>
								<tr>
									<th>Your Id</th>
									<td><%=resultset.getString("patient_id")%></td>
								</tr>
								<tr>
									<th>Full Name</th>
									<td><%=resultset.getString("patient_full_name")%></td>
								</tr>
								<tr>
									<th>Email</th>
									<td><%=resultset.getString("patient_email")%></td>
								</tr>
								<tr>
									<th>Mobile</th>
									<td><%=resultset.getString("Patient_mobile")%></td>
								</tr>
								<tr>
									<th>Address</th>
									<td><%=resultset.getString("patient_address")%></td>
								</tr>
								<tr>
									<th>Disease</th>
									<td><%=resultset.getString("patient_disease")%></td>
								</tr>
								<tr>
									<th>Travelling From To Destintaion</th>
									<td><font color="red"><%=resultset.getString("source_city")%></font>
										<b>To</b><font color="red"> <%=resultset.getString("destination_city")%></font>
									</td>
								</tr>
								<%
									if (resultset.getString("e_pass_status").equals("Pending")) {
								%>
								<tr>
									<th>E-Pass Status</th>
									<td><%=resultset.getString("e_pass_status")%></td>
								</tr>
								<br>
								<h4>
									<label class="label label-danger">Your application is
										Pending.</label>
								</h4>
								<%
									} else {
								%>
								<tr>
									<th>E-Pass Status</th>
									<td><%=resultset.getString("e_pass_status")%></td>
								</tr>
								<%
									}
								%>
							</tbody>
						</table>
						<i class="fa fa-print fa-2x" aria-hidden="true"
							OnClick="CallPrint(this.value)"></i>
					</center>
				</div>
				<%
					}
				%>
			</div>
		</div>
	</div>
	<script>
		function CallPrint(strid) {
			var prtContent = document.getElementById("exampl");
			var WinPrint = window.open('', '','left=0,top=0,width=800,height=900,toolbar=0,scrollbars=0,status=0');
			WinPrint.document.write(prtContent.innerHTML);
			WinPrint.document.close();
			WinPrint.focus();
			WinPrint.print();
			WinPrint.close();
		}
	</script>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<jsp:include page="patient-side-footer.jsp"></jsp:include>
	<%
		} else {
	response.sendRedirect("index.jsp");
	}
	%>
</body>
</html>