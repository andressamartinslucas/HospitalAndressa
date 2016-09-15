
<%@page import="modelo.Monitoracao"%>
<%@page import="dao.monitoracaoDAO"%>
<%@page import="java.util.List"%>
<%@include file="../cabecalho.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
monitoracaoDAO monitoracaoDAO= new monitoracaoDAO();
List<Monitoracao> lista = monitoracaoDAO.listar();
%>

            <table>
                <a href ="add.jsp"> Adicionar </a> <br />
                <input type="text" placeholder="digite o texto da pesquisa" />
                <input type="submit" value="Pesquisar" /> <br />
                <tr>
                    <th>Código</th>
                    <th>Descrição</th>
                    <th>Intervalo</th>
                </tr>
                <%
                for(Monitoracao monitoracao: lista)
                {
                %>
                <tr>
                    
                    <td><%=monitoracao.getMoCodigo()%></td>
                    <td><%=monitoracao.getMoDescricao()%></td>
                    <td><%=monitoracao.getMoIntervalo()%></td>
                    
                    
                    <td>
                        <a href ="del-ok.jsp?codigo=1" > Deletar </a>
                        <a href ="upd.jsp?codigo=2" > Modificar </a>
                </tr>
                <%
                }
                %>
               
            </table>

    </body>
</html>
