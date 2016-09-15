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
@Table(name = "realiza_monitoracao")
@NamedQueries({
    @NamedQuery(name = "RealizaMonitoracao.findAll", query = "SELECT r FROM RealizaMonitoracao r")})
public class RealizaMonitoracao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rmo_codigo")
    private String rmoCodigo;
    @Basic(optional = false)
    @Column(name = "rmo_datahora")
    @Temporal(TemporalType.DATE)
    private Date rmoDatahora;
    @JoinColumn(name = "consulta", referencedColumnName = "co_codigo")
    @ManyToOne(optional = false)
    private Consulta consulta;
    @JoinColumn(name = "funcionario", referencedColumnName = "f_cpf")
    @ManyToOne(optional = false)
    private Funcionario funcionario;

    public RealizaMonitoracao() {
    }

    public RealizaMonitoracao(String rmoCodigo) {
        this.rmoCodigo = rmoCodigo;
    }

    public RealizaMonitoracao(String rmoCodigo, Date rmoDatahora) {
        this.rmoCodigo = rmoCodigo;
        this.rmoDatahora = rmoDatahora;
    }

    public String getRmoCodigo() {
        return rmoCodigo;
    }

    public void setRmoCodigo(String rmoCodigo) {
        this.rmoCodigo = rmoCodigo;
    }

    public Date getRmoDatahora() {
        return rmoDatahora;
    }

    public void setRmoDatahora(Date rmoDatahora) {
        this.rmoDatahora = rmoDatahora;
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
        hash += (rmoCodigo != null ? rmoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RealizaMonitoracao)) {
            return false;
        }
        RealizaMonitoracao other = (RealizaMonitoracao) object;
        if ((this.rmoCodigo == null && other.rmoCodigo != null) || (this.rmoCodigo != null && !this.rmoCodigo.equals(other.rmoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.RealizaMonitoracao[ rmoCodigo=" + rmoCodigo + " ]";
    }
    
}
