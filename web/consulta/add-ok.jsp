
<%@page import="dao.exameDAO"%>
<%@page import="modelo.Exame"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@include file="../cabecalho.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String msg, ex_id, nome, resultado, urgencia;
Date data;

ex_id = request.getParameter("txtCodigo");
nome = request.getParameter("txtNome");
resultado = request.getParameter("txtResultado");
urgencia = request.getParameter("txtUrgencia");
SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");        
data = sf.parse(request.getParameter("txtData"));

Exame obj = new Exame();
obj.setExId(ex_id);
obj.setNome(nome);
obj.setExResultado(resultado);
obj.setExUrgencia(urgencia);

exameDAO exameDAO = new exameDAO();

Boolean funcionou = exameDAO.incluir(obj);

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
