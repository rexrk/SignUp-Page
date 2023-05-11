<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title>SignUp Form</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>
<body>
<div class="SignUp-form">
    <div class="text">
        SignUp
    </div>
    <form action="getData" method="post">
        <div class="field">
            <div class="fas fa-envelope"></div>
            <input type="text" placeholder="Username" name="username">
        </div>
        <div class="field">
            <div class="fas fa-lock"></div>
            <input type="password" placeholder="Password" name="password">
        </div>
        <button type="submit">SignUp</button>
        <div class="link">
            Thanks for Signing Up!!
        </div>
    </form>
</div>
</body>
</html>