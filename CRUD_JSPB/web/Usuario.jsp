<%@page import="java.util.List"%>
<%@page import="dao.UsuarioDAO"%>
<%@page import="modelo.Usuario"%>
<!DOCTYPE html>



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
        <h4>Usuario:xxxx <a href = http://www.uninnasau.edu.br/> Sair</a></h4>
        </div>
        <hr>
        <h4>
            <a href ="index.html">Fazendas</a> 
            <a href="Animal.jsp">Animal</a> 
            <a href="Usuario.jsp">Usuarios</a>
        </h4>
        
        
        <h1>Usuario</h1>
        
        <a href = "CadastroUsuario.jsp">+ Novo Usuario</a><br/>
        
        <input type="text" name="pesquisar"/><input type="submit" value="Pesquisar" /> <br/>
         <table border="1">
            <tr>   
               <th>Nome</th>
               <th>Email</th>
                 <th>Perfil</th>
               <th>Ações</th>
            </tr>
           
            <tr>
                <td>registro.getLogin</td>
                <td>registro.getEmail</td>
                <td>registro.getPerfil(</td>
                <td><a href="AtualizarUsuario.jsp?login=<registro.getLogin">Editar</a>
                    <a href="ExclusaoUsuario.jsp?login=egistro.getLogin(>">Excluir</a></td>
        
      </table>    
      
           
    </body>
</html>
