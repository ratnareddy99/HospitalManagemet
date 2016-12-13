<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<body>
    <h2>List of all patients</h2>
    <table class="table table-bordered">
        <tr>
            <th>S.No</th>
            <th>Patient Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Doctor</th>
            <th>Radiograph Description</th>
            <th>Reason</th>
            <th>Action</th>
        </tr>
        <tbody>
            <c:forEach items="${patient}" var="patient" varStatus="itr">
                <tr>
                    <td>${itr.index+1}</td>
                    <td>${patient.name}</td>
                    <td>${patient.email}</td>
                    <td>${patient.mobile}</td>
                    <td>${patient.doctor}</td>
                    <td>${patient.radiographDesc}</td>
                    <td>${patient.reasonToConduct}</td>
                    <td><a href="/hospital/edit/${patient.id}" class="btn btn-warning">Edit</a> </td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
    <a href="/hospital/create" class="btn btn-success">Add Patient Details</a>

    <script type="application/javascript" src="js/jquery.js"></script>
    <script type="application/javascript" src="js/bootstrap.js"></script>


</body>
</html>