
<%@page import="modelo.Leito"%>
<%@page import="dao.leitoDAO"%>
<%@page import="modelo.Funcionario"%>
<%@page import="dao.funcionarioDAO"%>
<%@page import="java.util.List"%>
<%@include file="../cabecalho.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
leitoDAO leitoDAO= new leitoDAO();
List<Leito> lista = leitoDAO.listar();
%>

            <table>
                <a href ="add.jsp"> Adicionar </a> <br />
                <input type="text" placeholder="Digite o texto da pesquisa" />
                <input type="submit" value="Pesquisar" /> <br />
                <tr>
                    <th>Código</th>
                    <th>Quarto</th>
                    <th>Unidade</th>
                    <th>Ocupado</th>
                    
                    
                </tr>
                <%
                for(Leito leito: lista)
                {
                %>
                <tr>
                    
                    <td><%=leito.getLCodigo()%></td>
                    <td><%=leito.getLQuarto()%></td>
                    <td><%=leito.getLUnidade()%></td>
                    <td><%=leito.getLOcupado()%></td>
                    
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
