<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
 
   <link rel="stylesheet" type="text/css" href="css/login.css"/>
   <link rel="stylesheet" type="text/css" href="css/styles.css">
  

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />

    <script src="https://kit.fontawesome.com/f454128a6e.js" crossorigin="anonymous"></script>

    <title>Login</title>
</head>

<body>


<div class="loginForm">
    <div class="logo"></div>
    <form action="" method="post">
        <div class="champs">
<%--             <span class="items item1" style="display:<?= $error_login['email_pwd_error'] ?>"> l'email ou le mot de passe est incorrecte </span>
 --%>            <span class="items item2"> Email Address <span>*</span> </span>
            <div class="items item3">
                <input type="text" name="email" placeholder="Enter email address *" />
            </div>
           <%--  <i style="font-size: 0.7rem;color:darkred;display:<?= $error_login['email_required'] ?>">
                    L'email est obligatoire
            </i>
            <i style="font-size: 0.7rem;color:darkred;display:<?= $error_login['email_invalid'] ?>">
                    L'email est invalide
            </i> --%>
            <span class="items item4"> Password <span>*</span> </span>
            <div class="items item5">
                <input type="password" name="password" placeholder="Enter your password *" />
            </div>
         <%--    <i style="font-size: 0.7rem;color:darkred;display:<?= $error_login['pwd_required'] ?>">
                Le mot de pass est obligatoire
            </i> --%>
        </div>
        <div class="items item6">
            <input type="checkbox" name="remember" id="" />
            <span>Remember me</span>
        </div>
        <div class="items item7">
            <a href="">Mot de passe Oublié ?</a>
        </div>
        <!-- <input type="hidden" name="page" value="/pro"> -->
        <div class="items item8">
            <button type="submit" name="login">Log In</button>
            <!-- <a href="/pro">Log In</a> -->
        </div>
    </form>
</div>

</body>

</html>