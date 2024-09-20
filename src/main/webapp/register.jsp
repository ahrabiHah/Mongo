<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehicle Register Apps</title>
    <style>
        /* Centering the form and heading */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f5f5f5;
        }

        .container {
            text-align: center;
        }

        /* Styling the form */
        form {
            text-align: left;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 10px;
            background-color: #fff;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        /* Centering the table and submit button */
        table {
            margin: auto;
        }

        input[type="submit"] {
            display: block;
            margin: 20px auto;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Vehicle Register App</h1>

    <!-- Spring Form Tag -->
    <form:form method="post" modelAttribute="vehicle">
        <table>
            <tr>
                <th>Vehicle Id</th>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <th>Vehicle Company</th>
                <td><form:input path="company" /></td>
            </tr>
            <tr>
                <th>Vehicle Cost</th>
                <td><form:input path="cost" /></td>
            </tr>
            <tr>
                <th>Vehicle Country</th>
                <td><form:input path="country"/></td>
            </tr>
        </table>

        <input type="submit" value="Register Vehicle">
    </form:form>
</div>

</body>
</html>
