
<%@page import="modelo.Medicacao"%>
<%@page import="dao.medicacaoDAO"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Paciente"%>
<%@page import="dao.pacienteDAO"%>
<%@include file="../cabecalho.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
medicacaoDAO medicacaoDAO= new medicacaoDAO();
List<Medicacao> lista = medicacaoDAO.listar();
%>

            <table>
                <a href ="add.jsp"> Adicionar </a> <br />
                <input type="text" placeholder="digite o texto da pesquisa" />
                <input type="submit" value="Pesquisar" /> <br />
                <tr>
                    <th>Nome</th>
                    <th>Código</th>
                    <th>Dosagem</th>
                    <th>Intervalo</th>
                </tr>
                <%
                for(Medicacao medicacao : lista)
                {
                %>
                <tr>
                    
                    <td><%=medicacao.getMeNome()%></td>
                    <td><%=medicacao.getMeCodigo()%></td>
                    <td><%=medicacao.getMeDosagem()%></td>
                    <td><%=medicacao.getMeIntervalo()%></td>
                                       
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
