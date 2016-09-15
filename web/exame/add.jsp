<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Adicionar</h1><br />
        <form action="add-ok.jsp" method = "post">
            <label>Código:</label>
            <input type="text" name="txtCodigo" required /><br />
            <label>Nome:</label>
            <input type="text" name="txtNome" /><br />
            <label>Data:</label>
            <input type="text" name="txtData" /><br />
            <label>Resultado:</label>
            <input type="date" name="txtResultado" /><br />
            <label>Urgência:</label>
            <input type="text" name="txtUrgencia" /><br />
            
            
            <input type="submit" value="Enviar"/>
            <input type="reset" value="Limpar"/>
        </form>
    </body>
</html>
