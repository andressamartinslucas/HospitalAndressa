
<%@page import="java.util.List"%>
<%@page import="modelo.Paciente"%>
<%@page import="dao.pacienteDAO"%>
<%@include file="../cabecalho.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
pacienteDAO pacienteDAO= new pacienteDAO();
List<Paciente> lista = pacienteDAO.listar();
%>

            <table>
                <a href ="add.jsp"> Adicionar </a> <br />
                <input type="text" placeholder="digite o texto da pesquisa" />
                <input type="submit" value="Pesquisar" /> <br />
                <tr>
                    <th>Nome</th>
                    <th>CPF</th>
                    <th>RG</th>
                    <th>Sexo</th>
                    <th>Data de NascimentoG</th>
                    <th>Endereço</th>
                    <th>Nº</th>
                    <th>Complemento</th>
                    <th>Estado Civil</th>
                    <th>Naturalidade</th>
                    <th>Cor</th>
                    <th>Ocupação</th>
                    <th>Email</th>
                    <th>Tipo Sanguineo</th>
                </tr>
                <%
                for(Paciente paciente: lista)
                {
                %>
                <tr>
                    
                    <td><%=paciente.getPNome()%></td>
                    <td><%=paciente.getPCpf()%></td>
                    <td><%=paciente.getPRg()%></td>
                    <td><%=paciente.getPSexo()%></td>
                    <td><%=paciente.getPDatanasc()%></td>
                    <td><%=paciente.getPEndereco()%></td>
                    <td><%=paciente.getPNumero()%></td>
                    <td><%=paciente.getPComplemento()%></td>
                    <td><%=paciente.getPEstadocivil()%></td>
                    <td><%=paciente.getPNaturalidade()%></td>
                    <td><%=paciente.getPCor()%></td>
                    <td><%=paciente.getPOcupacao()%></td>
                    <td><%=paciente.getPEmail()%></td>
                    <td><%=paciente.getPTiposanguineo()%></td>
                    
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
