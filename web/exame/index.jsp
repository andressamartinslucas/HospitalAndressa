

<%@page import="modelo.Exame"%>
<%@page import="dao.exameDAO"%>
<%@page import="java.util.List"%>
<%@include file="../cabecalho.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
exameDAO exameDAO= new exameDAO();
List<Exame> lista = exameDAO.listar();
%>

            <table>
                <a href ="add.jsp"> Adicionar </a> <br />
                <input type="text" placeholder="Digite o texto da pesquisa" />
                <input type="submit" value="Pesquisar" /> <br />
                <tr>
                    <th>Código</th>
                    <th>Nome</th>
                    <th>Data</th>
                    <th>Resultado</th>
                    <th>Urgência</th>
                    
                    
                </tr>
                <%
                for(Exame exame: lista)
                {
                %>
                <tr>
                    
                    <td><%=exame.getExId()%></td>
                    <td><%=exame.getNome()%></td>
                    <td><%=exame.getExData()%></td>
                    <td><%=exame.getExResultado()%></td>
                    <td><%=exame.getExUrgencia()%></td>
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
