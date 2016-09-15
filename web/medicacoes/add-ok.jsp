
<%@page import="dao.medicacaoDAO"%>
<%@page import="modelo.Medicacao"%>
<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String msg, nome, dosagem, intervalo;
Long codigo;

nome = request.getParameter("txtNome");
codigo = Long.parseLong(request.getParameter("txtCodigo"));
dosagem = request.getParameter("txtDosagem");
intervalo = request.getParameter("txtIntervalo");

Medicacao obj = new Medicacao();

obj.setMeNome(nome);
obj.setMeCodigo(Long.toString(codigo));
obj.setMeDosagem(dosagem);
obj.setMeIntervalo(intervalo);

medicacaoDAO medicacaoDAO = new medicacaoDAO();

Boolean funcionou = medicacaoDAO.incluir(obj);

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
