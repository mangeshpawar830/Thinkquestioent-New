<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="w3l-headers-9">
	<header>
		<div class="wrapper">
			<div class="header">
				<div>
					<h1>
						<a href="index.jsp" class="logo">Curfew E-Pass System</a>
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
							<li><a href="patient-dashboard.jsp" class="link-nav">Home</a></li>
							<li><a href="apply-epass.jsp" class="link-nav">Apply E-Pass</a></li>
							<li><a href="check-epass-status.jsp" class="link-nav">Check Status</a></li>
							<li><a href="download-epass.jsp" class="link-nav">Download E-Pass</a></li>
							<li><label for="drop-3" class="toggle toogle-2">Account
									<span class="fa fa-angle-down" aria-hidden="true"></span>
							</label><a href="" class="link-nav dropdown-toggle">Account <span
									class="fa fa-angle-down" aria-hidden="true"></span></a> <input
								type="checkbox" id="drop-3" />
								<ul>
									<li><a href="user-profile.jsp">My Profile</a></li>
									<li><a href="user-profile-update.jsp">Update Profile</a></li>
									<li><a href="patient-change-password.jsp">Change Password</a></li>
									<li><a href="patient-logout.jsp">Log Out</a></li>
								</ul></li>
							<li class="nav-right-sty"><a href="" class="actionbg"><%=session.getAttribute("uname") %></a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</header>
</div>