/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Funcionario;
import modelo.Monitoracao;

/**
 *
 * @author Aluno
 */
public class monitoracaoDAO extends GenericDAO<Monitoracao, Long>{
    public monitoracaoDAO()
    {
    super(Monitoracao.class);
    };
}
