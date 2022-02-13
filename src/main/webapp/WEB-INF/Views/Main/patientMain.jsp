<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Patient - Doctor Appointment</title>
    <style>
      <%@include file="../../WEB-INF/css/main_style.css"%>
    </style>

    <%-- <link rel="stylesheet" href="../../WEB-INF/css/main_style.css" /> --%>
  </head>
  <body>
  	<%@ page import = "MainClasses.Patient" %>
  
  	<%
  	Patient patient = (Patient)request.getAttribute("patient");
  	String name = patient.getName();
  	request.setAttribute("patient", patient);
  	%>
    <h1>Welcome, <%out.print(name); %></h1>
    <br /><br />

    <div align="center">
    <form action="<%= request.getContextPath() %>/patientMain" method="post">
      <table class="p">
        <tr>
          <td>
          
            <p>This is the main page for Patients. Here you can:</p>
          </td>
        </tr>
        <tr>
          <td>
            <ol>
              <li>Watch your <em>Appointments History</em>.</li>
              <br />
              <input type="hidden" name="patient" value="<%=patient%>" />
              <input type="submit" name="history" class="button" style="background-color: rgb(179, 83, 0)" value="History">
<br /><br /><br />
              <li>
                Watch your
                <em style="color: rgb(51, 79, 133)">Feature Appointments</em>.
              </li>
              <br>
              <input type="submit"  name="feature" class="button" value="My Appointments" style="width:230px">
              <br /><br /><br />
              <li>
                Book an
                <em style="color: rgb(41, 119, 26)">Appointment</em>. <br />
                <br />
                <input type="submit"  name="book"
                  class="button"
                  style="background-color: rgb(41, 119, 26)"
                  value="Booking">
              </li>
            </ol>
          </td>
        </tr>
      </table>
      </form>
    </div>
  </body>
</html>
