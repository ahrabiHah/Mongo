<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehicle App</title>
    <style>
        /* Body styling */
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        /* Centered container for content */
        .container {
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 30px;
            width: 400px;
            text-align: center;
        }

        /* Title */
        h1 {
            margin: 0 0 20px;
            color: #333;
            font-size: 24px;
        }

        /* Info fields */
        .vehicle-info {
            background-color: bisque;
            padding: 10px;
            margin: 10px 0;
            border-radius: 8px;
            font-size: 20px;
            text-align: center;
        }

        /* Styling for red highlighted vehicle ID */
        .vehicle-id {
            color: red;
            font-weight: bold;
        }

        /* Styling for regular vehicle information */
        .vehicle-data {
            color: #333;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Your Vehicle Info registered with us:</h1>

    <!-- Vehicle ID with red highlight -->
    <div class="vehicle-info vehicle-id">Vehicle ID: ${vehicle.id}</div>

    <!-- Other vehicle details -->
    <div class="vehicle-info vehicle-data">Vehicle Country: ${vehicle.country}</div>
    <div class="vehicle-info vehicle-data">Vehicle Cost: ${vehicle.cost}</div>
    <div class="vehicle-info vehicle-data">Vehicle Company: ${vehicle.company}</div>
</div>

</body>
</html>
