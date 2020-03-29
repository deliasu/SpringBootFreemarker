<!doctype html>
<html>
<head>
    <title>Spring Boot Freemarker</title>
    <style>
        table {
            width: 30%;
            font-size: .938em;
            border-collapse: collapse;
        }
        th {
            text-align: left;
            padding: .5em .5em;
            font-weight: bold;
            background: #f5f5f5;
            color: #999;
        }

        td {
            padding: .5em .5em;
            border-bottom: 1px solid  #ccc;
        }

    </style>
</head>
<h3>Users Table</h3>
<table class="table table-border">
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>address</th>
        <th>Phone</th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.address}</td>
            <td>${user.phone}</td>
        </tr>
    </#list>
    </tbody>
</table>
</html>