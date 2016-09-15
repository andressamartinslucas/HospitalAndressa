
<%@page import="dao.leitoDAO"%>
<%@page import="modelo.Leito"%>
<%@page import="java.util.Date"%>
<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String msg, codigo, quarto, unidade, ocupado;

codigo = request.getParameter("txtCodigo");
quarto = request.getParameter("txtQuarto");
unidade = request.getParameter("txtUnidade");
ocupado = request.getParameter("txtOcupado");

Leito obj = new Leito();
obj.setLCodigo(codigo);
obj.setLQuarto(quarto);
obj.setLUnidade(unidade);
obj.setLOcupado(ocupado);

leitoDAO leitoDAO = new leitoDAO();

Boolean funcionou = leitoDAO.incluir(obj);

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
