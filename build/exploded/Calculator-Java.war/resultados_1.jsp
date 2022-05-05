<%-- 
    Document   : resultados
    Created on : 03/05/2022, 10:49:35
    Author     : dev1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado da Operação</title>
        <link rel="stylesheet" href="css/estilo.css"/>


    </head>
    <style> 
    #title-calcular{
        text-align: center;
        font-family: century-gothic;
    }
    </style>

    <body>
        <input type="checkbox" id="active">
            <label for="active" class="menu-btn"><span></span></label>
            <label for="active" class="close"></label>
            <div class="wrapper">
              <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="multiplicar.jsp">Multiplicação</a></li>
                <li><a href="multiplicar2.jsp">Multiplicação por 10, 100 e 1000</a></li><br><br>
                <li><a href="equipe.jsp">Equipe</a></li>
                </ul>
            </div>
            <div id="questao1" class="card-mult1">
                <div id="title-calcular">
                    <h1>Resultado</h1>
                    <%= request.getParameter("valorA") %>
                    <%= request.getParameter("opcao") %>
                    <%= request.getParameter("valorB") %>
                    <%= " = " %>
                    <%= request.getAttribute("resultado") %>
                <div>
            </div>
    </body>
</html>