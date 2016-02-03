<%@ include file="00-header.jsp" %>
<div class="content">
<section><span>About Charging System Neuss-NRW</span></section>
<table class="userInputFullPage">
	<tr><td>Version:</td><td>${version}</td></tr>
	<tr><td>Database Version:</td><td>${db.version}</td></tr>
	<tr><td>Last Database Update:</td><td>${db.updateTimestamp}</td></tr>
    <tr><td>Log File:</td><td>${logFile}</td></tr>
	<tr><td>System Time:</td><td>${systemTime}</td></tr>
    <tr><td>System Time Zone:</td><td>${systemTimeZone}</td></tr>
</table>
</div>
<%@ include file="00-footer.jsp" %>