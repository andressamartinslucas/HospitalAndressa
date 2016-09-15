<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Adicionar</h1><br />
        <form action="add-ok.jsp" method = "post">
            <label>Código:</label>
            <input type="text" name="txtCodigo" required /><br />
            <label>Quarto:</label>
            <input type="text" name="txtQuarto" /><br />
            <label>Unidade:</label>
            <input type="text" name="txtUnidade" /><br />
            <label>Ocupado:</label>
            <input type="date" name="txtOcupado" /><br />
            
            <input type="submit" value="Enviar"/>
            <input type="reset" value="Limpar"/>
        </form>
    </body>
</html>
