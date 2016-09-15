/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Funcionario;
import modelo.Medicacao;

/**
 *
 * @author Aluno
 */
public class medicacaoDAO extends GenericDAO<Medicacao, Long> {
    public medicacaoDAO()
    {
    super(Medicacao.class);
    }
}
