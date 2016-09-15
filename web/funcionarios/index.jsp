
<%@page import="modelo.Funcionario"%>
<%@page import="dao.funcionarioDAO"%>
<%@page import="java.util.List"%>
<%@include file="../cabecalho.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
funcionarioDAO funcionarioDAO= new funcionarioDAO();
List<Funcionario> lista = funcionarioDAO.listar();
%>

            <table>
                <a href ="add.jsp"> Adicionar </a> <br />
                <input type="text" placeholder="Digite o texto da pesquisa" />
                <input type="submit" value="Pesquisar" /> <br />
                <tr>
                    <th>Nome</th>
                    <th>CPF</th>
                    <th>RG</th>
                    <th>Data de Nascimento</th>
                    <th>Endereço</th>
                    <th>Nº</th>
                    <th>Complemento</th>
                    <th>Estado Civil</th>
                    <th>Naturalidade</th>
                    <th>Email</th>
                    <th>Crm</th>
                    <th>Coren</th>
                    
                </tr>
                <%
                for(Funcionario funcionario: lista)
                {
                %>
                <tr>
                    
                    <td><%=funcionario.getFNome()%></td>
                    <td><%=funcionario.getFCpf()%></td>
                    <td><%=funcionario.getFRg()%></td>
                    <td><%=funcionario.getFDatanasc()%></td>
                    <td><%=funcionario.getFEndereco()%></td>
                    <td><%=funcionario.getFNumero()%></td>
                    <td><%=funcionario.getFComplemento()%></td>
                    <td><%=funcionario.getFEstadocivil()%></td>
                    <td><%=funcionario.getFNaturalidade()%></td>
                    <td><%=funcionario.getFEmail()%></td>
                    <td><%=funcionario.getCrm()%></td>
                    <td><%=funcionario.getCoren()%></td>
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
