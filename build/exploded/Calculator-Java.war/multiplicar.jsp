<%-- 
    Document   : multiplicar
    Created on : 02/05/2022, 16:31:33
    Author     : dev1
--%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multiplicar</title>
        <link rel="stylesheet" href="css/estilo.css"/>


    </head>
    <style> 
    input[type=text] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      box-sizing: border-box;
      border: 3px solid #ccc;
      -webkit-transition: 0.5s;
      transition: 0.5s;
      outline: none;
    }

    input[type=text]:focus {
      border: 3px solid #555;
    }
    
    #opcao-select{
        width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      box-sizing: border-box;
      border: 3px solid #ccc;
      -webkit-transition: 0.5s;
      transition: 0.5s;
      outline: none;
      font-size: 15px;

    }
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
            <div class="card-mult1">
                <div id="title-calcular">
                    <h1>Calculadora</h1>
                </div>
                <div class="container-mult1">
                    <form action="CalcBsic" method="get">
                        <label>Valor A:</label>
                        <input type="text" name="valorA"><br>
                        <label>Valor B:</label>
                        <input type="text" name="valorB"><br>
                        <select name="opcao" id="opcao-select"><br>
                            <option value="+"> Somar </option>
                            <option value="-"> Subtração </option>
                            <option value="*"> Multiplicação </option>
                            <option value="/"> Divisão </option>
                        </select>
                        <input class="button4" type="submit" id="calcula" value="Calcular">
                </div>
            </div>
        </form>
    </body>
</html>
