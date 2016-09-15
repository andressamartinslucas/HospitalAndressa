/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Paciente;

/**
 *
 * @author Andressa
 */
public class pacienteDAO extends GenericDAO<Paciente, String>{
    public pacienteDAO()
    {
    super(Paciente.class);
    }
    
}
