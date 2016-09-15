<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Adicionar</h1><br />
        <form action="add-ok.jsp" method = "post">
            <label>Descrição:</label>
            <input type="text" name="txtDescricao" required /><br />
            <label>Código:</label>
            <input type="text" name="txtCodigo" /><br />
            <label>Intercalo:</label>
            <input type="text" name="txtIntevalo" /><br />
            
            <input type="submit" value="Enviar"/>
            <input type="reset" value="Limpar"/>
        </form>
    </body>
</html>
