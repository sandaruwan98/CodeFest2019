<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Quiz"%>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Quiz</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<body>
<form action="quizServlet" method="post">
    <div>
        Course Name : <input type="text" name="course-name">
        <br/>
        Unit Name : <input type="text" name="unit-name">
        <br/>
        <input type="submit" value="Search">
    </div>
</form>
    <%
        ArrayList<Quiz> questionList= (ArrayList<Quiz>) session.getAttribute("questionList");
        try{
            for(Quiz quiz:questionList){
    %>
    <fieldset>
        <p>
            <%=quiz.getQuesContain()
            %>
        </p>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="answers" id="inlineRadio1" value="option1">
        <label class="form-check-label" for="inlineRadio1">1.<%=quiz.getAns1()%></label>
      </div><br>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="answers" id="inlineRadio2" value="option2">
        <label class="form-check-label" for="inlineRadio2">2.<%=quiz.getAns2()%></label>
      </div><br>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="answers" id="inlineRadio3" value="option3">
        <label class="form-check-label" for="inlineRadio3">3.<%=quiz.getAns3()%></label>
      </div><br>
      <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="answers" id="inlineRadio4" value="option4">
            <label class="form-check-label" for="inlineRadio3">4.<%=quiz.getAns4()%></label>
        </div><br>
    <!--<button type="button" class="btn btn-success">Success</button>
    <button type="button" class="btn btn-danger">Danger</button>-->
</fieldset>
    <%}
    }catch(Exception e){

    }%>
</body>
</html>