<%@page import="java.util.Date"%>
<%@page import="dao.pacienteDAO"%>
<%@page import="modelo.Paciente"%>
<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String msg, nome, cpf, rg, endereco, complemento, numero, estadoCivil, naturalidade, email,
cor, sexo, ocupacao, tipoSanguineo;
Date dataNasc;

nome = request.getParameter("txtNome");
cpf = request.getParameter("txtCpf");
rg = request.getParameter("txtRg");
dataNasc = request.getParameter("txtdataNasc");
endereco = request.getParameter("txtEndereco");
complemento = request.getParameter("txtComplemento");
numero = request.getParameter("txtNumero");
estadoCivil = request.getParameter("txtEstadocivil");
naturalidade = request.getParameter("txtNaturalidade");
email = request.getParameter("txtEmail");
cor = request.getParameter("txtCor");
sexo = request.getParameter("txtSexo");
ocupacao = request.getParameter("txtOcupacao");
tipoSanguineo = request.getParameter("txtTiposanguineo");

Paciente obj = new Paciente();
obj.setPNome(nome);
obj.setPCpf(cpf);
obj.setPRg(rg);
obj.setPDatanasc(dataNasc);
obj.setPEndereco(endereco);
obj.setPComplemento(complemento);
obj.setPNumero(numero);
obj.setPEstadocivil(estadoCivil);
obj.setPNaturalidade(naturalidade);
obj.setPEmail(email);
obj.setPCor(cor);
obj.setPSexo(sexo);
obj.setPOcupacao(ocupacao);
obj.setPTiposanguineo(tipoSanguineo);

pacienteDAO pacienteDAO = new pacienteDAO();

Boolean funcionou = pacienteDAO.incluir(obj);

if(funcionou == true){
msg  ="Registro cadastrado com sucesso";
}else{
    msg ="Erro ao cadastrar";
}

%>
        <h1><%=msg%></h1>
        <a href="index.jsp"> Voltar </a>
    </body>
</html>
