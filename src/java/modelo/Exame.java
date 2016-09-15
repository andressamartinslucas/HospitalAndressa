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
@Table(name = "exame")
@NamedQueries({
    @NamedQuery(name = "Exame.findAll", query = "SELECT e FROM Exame e")})
public class Exame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ex_id")
    private String exId;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "ex_data")
    @Temporal(TemporalType.DATE)
    private Date exData;
    @Basic(optional = false)
    @Column(name = "ex_resultado")
    private String exResultado;
    @Basic(optional = false)
    @Column(name = "ex_urgencia")
    private String exUrgencia;
    @JoinColumn(name = "consulta", referencedColumnName = "co_codigo")
    @ManyToOne(optional = false)
    private Consulta consulta;

    public Exame() {
    }

    public Exame(String exId) {
        this.exId = exId;
    }

    public Exame(String exId, String nome, Date exData, String exResultado, String exUrgencia) {
        this.exId = exId;
        this.nome = nome;
        this.exData = exData;
        this.exResultado = exResultado;
        this.exUrgencia = exUrgencia;
    }

    public String getExId() {
        return exId;
    }

    public void setExId(String exId) {
        this.exId = exId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getExData() {
        return exData;
    }

    public void setExData(Date exData) {
        this.exData = exData;
    }

    public String getExResultado() {
        return exResultado;
    }

    public void setExResultado(String exResultado) {
        this.exResultado = exResultado;
    }

    public String getExUrgencia() {
        return exUrgencia;
    }

    public void setExUrgencia(String exUrgencia) {
        this.exUrgencia = exUrgencia;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exId != null ? exId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exame)) {
            return false;
        }
        Exame other = (Exame) object;
        if ((this.exId == null && other.exId != null) || (this.exId != null && !this.exId.equals(other.exId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Exame[ exId=" + exId + " ]";
    }
    
}
