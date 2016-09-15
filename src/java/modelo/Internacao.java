/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "internacao")
@NamedQueries({
    @NamedQuery(name = "Internacao.findAll", query = "SELECT i FROM Internacao i")})
public class Internacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "i_codigo")
    private String iCodigo;
    @Basic(optional = false)
    @Column(name = "i_datahora")
    @Temporal(TemporalType.DATE)
    private Date iDatahora;
    @Basic(optional = false)
    @Column(name = "i_causa")
    private String iCausa;
    @Column(name = "i_cuidados")
    private String iCuidados;
    @Column(name = "i_dieta")
    private String iDieta;
    @JoinColumn(name = "funcionario", referencedColumnName = "f_cpf")
    @ManyToOne(optional = false)
    private Funcionario funcionario;
    @JoinColumn(name = "leito", referencedColumnName = "l_codigo")
    @ManyToOne(optional = false)
    private Leito leito;
    @JoinColumn(name = "paciente", referencedColumnName = "p_cpf")
    @ManyToOne(optional = false)
    private Paciente paciente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "internacao")
    private List<Consulta> consultaList;

    public Internacao() {
    }

    public Internacao(String iCodigo) {
        this.iCodigo = iCodigo;
    }

    public Internacao(String iCodigo, Date iDatahora, String iCausa) {
        this.iCodigo = iCodigo;
        this.iDatahora = iDatahora;
        this.iCausa = iCausa;
    }

    public String getICodigo() {
        return iCodigo;
    }

    public void setICodigo(String iCodigo) {
        this.iCodigo = iCodigo;
    }

    public Date getIDatahora() {
        return iDatahora;
    }

    public void setIDatahora(Date iDatahora) {
        this.iDatahora = iDatahora;
    }

    public String getICausa() {
        return iCausa;
    }

    public void setICausa(String iCausa) {
        this.iCausa = iCausa;
    }

    public String getICuidados() {
        return iCuidados;
    }

    public void setICuidados(String iCuidados) {
        this.iCuidados = iCuidados;
    }

    public String getIDieta() {
        return iDieta;
    }

    public void setIDieta(String iDieta) {
        this.iDieta = iDieta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Consulta> getConsultaList() {
        return consultaList;
    }

    public void setConsultaList(List<Consulta> consultaList) {
        this.consultaList = consultaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iCodigo != null ? iCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Internacao)) {
            return false;
        }
        Internacao other = (Internacao) object;
        if ((this.iCodigo == null && other.iCodigo != null) || (this.iCodigo != null && !this.iCodigo.equals(other.iCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Internacao[ iCodigo=" + iCodigo + " ]";
    }
    
}
