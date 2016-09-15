<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Adicionar</h1><br />
        <form action="add-ok.jsp" method = "post">
            <label>Nome:</label>
            <input type="text" name="txtNome" required /><br />
            <label>Código:</label>
            <input type="text" name="txtCodigo" /><br />
            <label>Dosagem:</label>
            <input type="text" name="txtDosagem" /><br />
            <label>Intervalo:</label>
            <input type="date" name="txtIntervalo" /><br />
            
            
            <input type="submit" value="Enviar"/>
            <input type="reset" value="Limpar"/>
        </form>
    </body>
</html>
