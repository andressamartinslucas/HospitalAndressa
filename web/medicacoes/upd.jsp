
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
            <label>Nome:</label>
            <input type="text" name="txtNome" value="" readonly /><br />
            <label>CPF:</label>
            <input type="text" name="txtCPF" value="" required /><br />
            <label>RG:</label>
            <input type="text" name="txtRG" value="" /><br />
            <label>Data de Nascimento:</label>
            <input type="text" name="txtDataNasc" value="" /><br />
            <label>Endereço:</label>
            <input type="text" name="txtEndereco" value="" /><br />
            <label>Complemento:</label>
            <input type="text" name="txtomplemento" value="" /><br />
            <label>Número:</label>
            <input type="text" name="txtNumero" value="" /><br />
            <label>Estado Civil:</label>
            <input type="text" name="txtEstadoCivil" value="" /><br />
            <label>Naturalidade:</label>
            <input type="text" name="txtNaturalidade" value="" /><br />
            <label>Email:</label>
            <input type="text" name="txtEmail" value="" /><br />
            <label>Cor:</label>
            <input type="text" name="txtCOr" value="" /><br />
            <label>Sexo:</label>
            <input type="text" name="txtSexo" value="" /><br />
            <label>Ocupação</label>
            <input type="text" name="txtOcupacao" value="" /><br />
            <label>Tipo Sanguíneo:</label>
            <input type="text" name="txtTipoSanguineo" value="" /><br />
            <!Como colocar as coisas referentes a óbito tbm? Tem que aparecer ali pra todo mundo?? !>   
            
            <input type="submit" value="Enviar"/>
            <input type="reset" value="Limpar"/>
        </form>
    </body>
</html>
