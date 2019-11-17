<%--
  Created by IntelliJ IDEA.
  User: Nandula
  Date: 11/15/2019
  Time: 12:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>dotLearn - Learn for the Future</title>
    <link rel="icon" href="assets/images/logo.png">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
    <a class="navbar-brand" href="#">
      <img src="assets/images/logo.png" width="50" height="50" class="d-inline-block align-top" alt="dotLearn Logo">
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
          <a class="nav-link" href="#">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Courses</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contact</a>
        </li>
        <!--<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Dropdown
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Something else here</a>
          </div>
        </li>-->
        <!--<li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
        </li>-->
      </ul>
      <form class="form-inline my-2 my-lg-0">
        <!--<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">-->
        <button class="btn mr-sm-2" type="button" style="border-color: #000000;color: #000000" onmouseout="this.style.borderColor='#000000';this.style.color='#000000';this.style.backgroundColor='transparent'" onmouseover="this.style.backgroundColor='#000000';this.style.color='#ffffff';">Log In</button>
        <!--<button class="btn btn-outline-success mr-sm-2" type="button" style="border-color: #000000;color: #000000" onmouseout="this.style.borderColor='#000000';this.style.color='#000000';this.style.backgroundColor='transparent'" onmouseover="this.style.backgroundColor='#000000';this.style.color='#ffffff';">Register</button>-->
      </form>
    </div>
  </nav>
  </body>
</html>