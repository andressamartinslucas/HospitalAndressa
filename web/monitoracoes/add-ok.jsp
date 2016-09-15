
<%@page import="dao.monitoracaoDAO"%>
<%@page import="modelo.Monitoracao"%>
<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String msg, descricao, intervalo;
Long codigo;

descricao = request.getParameter("txtDescricao");
intervalo = request.getParameter("txtIntervalo");
codigo = Long.parseLong(request.getParameter("txtCodigo"));

Monitoracao obj = new Monitoracao();
obj.setMoDescricao(descricao);
obj.setMoCodigo(Long.toString(codigo));
obj.setMoIntervalo(intervalo);

monitoracaoDAO monitoracaoDAO = new monitoracaoDAO();

Boolean funcionou = monitoracaoDAO.incluir(obj);

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
