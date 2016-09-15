/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "realiza_medicacao")
@NamedQueries({
    @NamedQuery(name = "RealizaMedicacao.findAll", query = "SELECT r FROM RealizaMedicacao r")})
public class RealizaMedicacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rme_codigo")
    private String rmeCodigo;
    @Basic(optional = false)
    @Column(name = "rme_datahora")
    @Temporal(TemporalType.DATE)
    private Date rmeDatahora;
    @JoinColumn(name = "consulta", referencedColumnName = "co_codigo")
    @ManyToOne(optional = false)
    private Consulta consulta;
    @JoinColumn(name = "funcionario", referencedColumnName = "f_cpf")
    @ManyToOne(optional = false)
    private Funcionario funcionario;

    public RealizaMedicacao() {
    }

    public RealizaMedicacao(String rmeCodigo) {
        this.rmeCodigo = rmeCodigo;
    }

    public RealizaMedicacao(String rmeCodigo, Date rmeDatahora) {
        this.rmeCodigo = rmeCodigo;
        this.rmeDatahora = rmeDatahora;
    }

    public String getRmeCodigo() {
        return rmeCodigo;
    }

    public void setRmeCodigo(String rmeCodigo) {
        this.rmeCodigo = rmeCodigo;
    }

    public Date getRmeDatahora() {
        return rmeDatahora;
    }

    public void setRmeDatahora(Date rmeDatahora) {
        this.rmeDatahora = rmeDatahora;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rmeCodigo != null ? rmeCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RealizaMedicacao)) {
            return false;
        }
        RealizaMedicacao other = (RealizaMedicacao) object;
        if ((this.rmeCodigo == null && other.rmeCodigo != null) || (this.rmeCodigo != null && !this.rmeCodigo.equals(other.rmeCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.RealizaMedicacao[ rmeCodigo=" + rmeCodigo + " ]";
    }
    
}
