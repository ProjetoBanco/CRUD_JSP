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
        <h4>Usuario:xxxx <a href = http://www.bage.ifsul.edu.br/portal/> Sair</a></h4>
        </div>
        <hr>
       <h4>
            <a href ="index.jsp">Fazendas</a> 
            <a href="Animal.jsp">Animal</a> 
            <a href="Usuario.jsp">Usuarios</a>
        </h4>
        
        <h1>Atualiza��o de Cadastro</h1>
        
        <form action="FimAtualizacao.html">
            Nome       : <input type="text" name="nome"/><br/>
            Localiza��o: <input type="text" name="localizacao"/><br/>
            Hectares   : <input type="text" name="hectares"/><br/>
            Data       : <input type="text" name="data"/><br/>
            Ativo      : <input type="checkbox" name="ativo" value="ativo"/><br/>
            Sit. Financeira: 
            <select name="finan">
                <option value="selecione">Selecione</option>
                <option value="quitada">Quitada</option>
                <option value="alienada">Alienada</option>
                <option value="penhorada">Penhorada</option>
            </select><br/>  
            
            <input type="submit" value="Atualiza��o"/> 
            
        </form>
    </body>
</html>
