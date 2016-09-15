/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Funcionario;

/**
 *
 * @author Andressa
 */
public class funcionarioDAO extends GenericDAO<Funcionario, String>{
    public funcionarioDAO()
    {
    super(Funcionario.class);
    };
}
