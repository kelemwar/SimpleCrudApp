<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head>

    <%--Bootstrap, notification, datatable--%>
    <link rel="stylesheet" href="webjars/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="webjars/noty/3.1.0/demo/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="webjars/datatables/1.10.16/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="webjars/noty/3.1.0/lib/noty.css"/>

    <script type="text/javascript" src="webjars/jquery/3.3.1-1/jquery.min.js" defer></script>
    <script type="text/javascript" src="webjars/bootstrap/4.1.0/js/bootstrap.min.js" defer></script>
    <script type="text/javascript" src="webjars/datatables/1.10.16/js/jquery.dataTables.min.js" defer></script>
    <script type="text/javascript" src="webjars/datatables/1.10.16/js/dataTables.bootstrap4.min.js" defer></script>
    <script type="text/javascript" src="webjars/noty/3.1.0/lib/noty.min.js" defer></script>

    <script type="text/javascript" src="resources/js/datatable.js" defer></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<br>

<div class="container">
    <button class="btn btn-primary" onclick="add()">Add User</button>
    <table class="table table-striped table-hover table-sm" id="datatable">
        <thead class="thead-dark">
        <tr>

            <th>Name</th>
            <th>Last Name</th>
            <th>Birthday</th>
            <th>gender</th>
            <th></th>
            <th></th>
        </tr>
        </thead>

    </table>
</div>

<div class="modal fade" id="editRow" tabindex="-1">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="modalLabel">Add user</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form id="detailsForm">
                    <input type="hidden" id="id" name="id">

                    <div class="form-group">
                        <label for="name" class="col-form-label">Name</label>
                        <input type="text" class="form-control" id="name" name="name"
                               placeholder="name">
                    </div>
                    <div class="form-group">
                        <label for="lastName" class="col-form-label">Last Name</label>
                        <input type="text" class="form-control" id="lastName" name="lastName"
                               placeholder="Last Name">
                    </div>
                    <div class="form-group">
                        <label for="birthday" class="col-form-label">Birthday</label>
                        <input type="datetime-local" class="form-control" id="birthday" name="birthday"
                               placeholder="birthday">
                    </div>
                    <div class="form-group">
                        <select name="gender" size="2">
                            <option value="male">Male</option>
                            <option value="female">Female</option>
                        </select>
                    </div>

                </form>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="save()">Save changes</button>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
