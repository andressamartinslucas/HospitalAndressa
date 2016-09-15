
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dao.funcionarioDAO"%>
<%@page import="modelo.Funcionario"%>
<%@page import="java.util.Date"%>
<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String msg, nome, cpf, rg, endereco, complemento, numero, estadoCivil, naturalidade, email, crm, coren;
Date dataNasc;

nome = request.getParameter("txtNome");
cpf = request.getParameter("txtCpf");
rg = request.getParameter("txtRg");
SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");        
dataNasc = sf.parse(request.getParameter("txtdataNasc"));
endereco = request.getParameter("txtEndereco");
complemento = request.getParameter("txtComplemento");
numero = request.getParameter("txtNumero");
estadoCivil = request.getParameter("txtEstadocivil");
naturalidade = request.getParameter("txtNaturalidade");
email = request.getParameter("txtEmail");
crm = request.getParameter("txtCrm");
coren = request.getParameter("txtCoren");


Funcionario obj = new Funcionario();
obj.setFNome(nome);
obj.setFCpf(cpf);
obj.setFRg(rg);
obj.setFDatanasc(dataNasc);
obj.setFEndereco(endereco);
obj.setFComplemento(complemento);
obj.setFNumero(numero);
obj.setFEstadocivil(estadoCivil);
obj.setFNaturalidade(naturalidade);
obj.setFEmail(email);
obj.setCrm(crm);
obj.setCoren(coren);

funcionarioDAO funcionarioDAO = new funcionarioDAO();

Boolean funcionou = funcionarioDAO.incluir(obj);

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
