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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>dotLearn - Learn for the Future</title>
    <link rel="icon" href="assets/images/logo.png">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <script type="text/javascript" src="assets/js/bootstrap.js"></script>
    <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
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
        <a href="login.jsp"><button class="btn mr-sm-2" type="button" style="border-color: #000000;color: #000000" onmouseout="this.style.borderColor='#000000';this.style.color='#000000';this.style.backgroundColor='transparent'" onmouseover="this.style.backgroundColor='#000000';this.style.color='#ffffff';">Log In</button></a>
        <!--<button class="btn btn-outline-success mr-sm-2" type="button" style="border-color: #000000;color: #000000" onmouseout="this.style.borderColor='#000000';this.style.color='#000000';this.style.backgroundColor='transparent'" onmouseover="this.style.backgroundColor='#000000';this.style.color='#ffffff';">Register</button>-->
      </form>
      <div class="navbar" id="profile" style="display: block">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              <img src="assets/images/profile-img.png" class="mr-3" style="width: 30px;height: 30px;">Nandula Perera
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="profile.jsp"><span class="fa fa-user mr-1"></span> Profile</a>
              <a class="dropdown-item" href="#"><span class="fa fa-book mr-1"></span> My Courses</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#"><span class="fa fa-sign-out mr-1"></span>Logout </a>
            </div>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  </body>
</html>
