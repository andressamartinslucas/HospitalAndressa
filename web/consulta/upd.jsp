
<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar</title>
    </head>
    <body>
        <h1>Modificar</h1>
        <form action="add-ok.jsp" method = "post">
            <label>Código:</label>
            <input type="text" name="txtCodigo" value="" readonly /><br />
            <label>Nome:</label>
            <input type="text" name="txtNome" value="" required /><br />
            <label>Data:</label>
            <input type="text" name="txtData" value="" /><br />
            <label>Resultado:</label>
            <input type="text" name="txtResultado" value="" /><br />
            <label>Urgência:</label>
            <input type="text" name="txtUrgencia" value="" /><br />
  
            
            <input type="submit" value="Enviar"/>
            <input type="reset" value="Limpar"/>
        </form>
    </body>
</html>
