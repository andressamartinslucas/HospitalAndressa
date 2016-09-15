<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Adicionar</h1><br />
        <form action="add-ok.jsp" method = "post">
            <label>Nome:</label>
            <input type="text" name="txtNome" required /><br />
            <label>CPF:</label>
            <input type="text" name="txtCpf" /><br />
            <label>RG:</label>
            <input type="text" name="txtRg" /><br />
            <label>Data de Nascimento:</label>
            <input type="date" name="txtDatanasc" /><br />
            <label>Endereço:</label>
            <input type="text" name="txtEndereco" /><br />
            <label>Complemento:</label>
            <input type="text" name="txtComplemento" /><br />
            <label>Número:</label>
            <input type="text" name="txtNumero" /><br />
            <label>Estado Civil:</label>
            <select name="txtEstadocivil" required>
                <option value="">Selecione</option>
                <option value="Solteiro">Solteiro</option>
                <option value="Casado">Casado</option>
                <option value="Uniao Estável">UE</option>
                
                
            </select>
            <br />
            <label>Naturalidade:</label>
            <input type="text" name="txtNaturalidade" /><br />
            <label>Email:</label>
            <input type="text" name="txtEmail" /><br />
            <label>Crm:</label>
            <input type="text" name="txtCrm" /><br />
            <label>Coren:</label>
            <input type="text" name="txtCoren" /><br />
            
            <input type="submit" value="Enviar"/>
            <input type="reset" value="Limpar"/>
        </form>
    </body>
</html>
