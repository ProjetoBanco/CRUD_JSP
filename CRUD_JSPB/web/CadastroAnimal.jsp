<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Fazenda</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" type="text/css" href="Css/TesteCSS.css" />
    </head>
    <body>
        <div> <h5>Sistema de Controle de Fazendas</h5>
        <img src ="fazenda.JPG" height="80" width="200" ><img>
        <h4>Usuario:xxxx <a href = http://www.mauriciodenassau.edu.br/> Sair</a></h4>
        </div>
        <hr>
        <h4>
            <a href ="index.jsp">Fazendas</a> 
            <a href="Animal.jsp">Animal</a> 
            <a href="Usuario.jsp">Usuarios</a>
        </h4>
        
        <h1>Cadastro de Animal</h1>
        
        <form action="FimCadastroAnimal.jsp">
             Nome          : <input type="text" name="nome"/><br/>
            Caracteristica: <textarea></textarea><br/>
            Criado na Fazenda: <input type="checkbox" name="criado" />Sim<br/>
                       
            <input type="submit" value="Cadastrar"/> 
            <input type="reset" value="Limpar" />
        </form>
    </body>
</html>

