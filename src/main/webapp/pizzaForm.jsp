<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: anthonys
  Date: 11/2/22
  Time: 12:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Form</title>
</head>
<body>
<form method="post" action="/pizza-order">
    <label>Crust</label>
    <select name="crust">
        <option value="thin">thin</option>
        <option value="pan">pan</option>
        <option value="stuffed">stuffed</option>
    </select>

    <label>Sauce</label>
    <select name="sauce">
        <option value="marinara">marinara</option>
        <option value="alfredo">alfredo</option>
        <option value="plain">plain</option>
    </select>

    <label>Size</label>
    <select name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>

    <h1>Toppings</h1>
    <label>Pepperoni</label>
    <input name="topping1" value="pepperoni" type="checkbox">

    <label>Sausage</label>
    <input name="topping2" value="sausage" type="checkbox">

    <label>Chicken</label>
    <input name="topping3" value="chicken" type="checkbox">

    <label>Mushroom</label>
    <input name="topping4"value="mushroom"  type="checkbox">

    <label>Deliver Address</label>
    <input name="address"  type="text"  placeholder="Enter Address">

    <br>

    <button type="submit">Submit</button>
</form>
</body>
</html>
