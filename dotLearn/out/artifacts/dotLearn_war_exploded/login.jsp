<%--
  Created by IntelliJ IDEA.
  User: Nandula
  Date: 10/31/2019
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {font-family: Arial, Helvetica, sans-serif;}
        form {border: 3px solid #f1f1f1;}

        input[type=text], input[type=password], input[type=button]{
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }

        button:hover {
            opacity: 0.8;
        }

        .cancelbtn {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
        }

        .subbtn {
            width: auto;
            padding: 10px 18px;
            background-color: #1c6bf4;
        }
        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
        }

        img.avatar {
            width: 25%;
            border-radius: 30%;
        }

        .container {
            padding: 16px;
        }

        span.psw {
            float: right;
            padding-top: 16px;
        }

        /* Change styles for span and cancel button on extra small screens */
        @media screen and (max-width: 300px) {
            span.psw {
                display: block;
                float: none;
            }
            .cancelbtn {
                width: 100%;
            }
        }
    </style>
</head>
<body>

<h2>Login Form</h2>

<form action="loginServlet" method="post">
    <div class="imgcontainer">
        <img src="img_avatar.png" alt="Avatar" class="avatar">
    </div>

    <div class="form-group">

<!--        <label for="input2">Answer 2</label>-->
<!--        <input type="text" class="form-control" id="input2" placeholder="">-->


        <label for="input2">User Name</label>
        <input type="text"  class="form-control" placeholder="Enter Username" id="input2" name="uname" required>
    </div>
<!--        <div class="form-group">-->
        <label><b>Password</b></label>
        <input type="password"  class="form-control" placeholder="Enter Password" name="psw" required>

        <input type="submit"  value="Login">
        <label>
            <input type="checkbox" checked="checked" name="remember"> Remember me
        </label>
<!--    </div>-->

    <div class="container" style="background-color:#f1f1f1">
        <button type="button" class="cancelbtn">Cancel</button>
        <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
</form>
</body>
</html>

