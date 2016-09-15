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
@Table(name = "funcionario")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "f_cpf")
    private String fCpf;
    @Basic(optional = false)
    @Column(name = "f_nome")
    private String fNome;
    @Basic(optional = false)
    @Column(name = "f_rg")
    private String fRg;
    @Basic(optional = false)
    @Column(name = "f_datanasc")
    @Temporal(TemporalType.DATE)
    private Date fDatanasc;
    @Basic(optional = false)
    @Column(name = "f_endereco")
    private String fEndereco;
    @Column(name = "f_complemento")
    private String fComplemento;
    @Basic(optional = false)
    @Column(name = "f_numero")
    private String fNumero;
    @Basic(optional = false)
    @Column(name = "f_estadocivil")
    private String fEstadocivil;
    @Basic(optional = false)
    @Column(name = "f_naturalidade")
    private String fNaturalidade;
    @Basic(optional = false)
    @Column(name = "f_email")
    private String fEmail;
    @Column(name = "crm")
    private String crm;
    @Column(name = "coren")
    private String coren;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario")
    private List<RealizaMedicacao> realizaMedicacaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario")
    private List<Internacao> internacaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario")
    private List<RealizaMonitoracao> realizaMonitoracaoList;

    public Funcionario() {
    }

    public Funcionario(String fCpf) {
        this.fCpf = fCpf;
    }

    public Funcionario(String fCpf, String fNome, String fRg, Date fDatanasc, String fEndereco, String fNumero, String fEstadocivil, String fNaturalidade, String fEmail) {
        this.fCpf = fCpf;
        this.fNome = fNome;
        this.fRg = fRg;
        this.fDatanasc = fDatanasc;
        this.fEndereco = fEndereco;
        this.fNumero = fNumero;
        this.fEstadocivil = fEstadocivil;
        this.fNaturalidade = fNaturalidade;
        this.fEmail = fEmail;
    }

    public String getFCpf() {
        return fCpf;
    }

    public void setFCpf(String fCpf) {
        this.fCpf = fCpf;
    }

    public String getFNome() {
        return fNome;
    }

    public void setFNome(String fNome) {
        this.fNome = fNome;
    }

    public String getFRg() {
        return fRg;
    }

    public void setFRg(String fRg) {
        this.fRg = fRg;
    }

    public Date getFDatanasc() {
        return fDatanasc;
    }

    public void setFDatanasc(Date fDatanasc) {
        this.fDatanasc = fDatanasc;
    }

    public String getFEndereco() {
        return fEndereco;
    }

    public void setFEndereco(String fEndereco) {
        this.fEndereco = fEndereco;
    }

    public String getFComplemento() {
        return fComplemento;
    }

    public void setFComplemento(String fComplemento) {
        this.fComplemento = fComplemento;
    }

    public String getFNumero() {
        return fNumero;
    }

    public void setFNumero(String fNumero) {
        this.fNumero = fNumero;
    }

    public String getFEstadocivil() {
        return fEstadocivil;
    }

    public void setFEstadocivil(String fEstadocivil) {
        this.fEstadocivil = fEstadocivil;
    }

    public String getFNaturalidade() {
        return fNaturalidade;
    }

    public void setFNaturalidade(String fNaturalidade) {
        this.fNaturalidade = fNaturalidade;
    }

    public String getFEmail() {
        return fEmail;
    }

    public void setFEmail(String fEmail) {
        this.fEmail = fEmail;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public List<RealizaMedicacao> getRealizaMedicacaoList() {
        return realizaMedicacaoList;
    }

    public void setRealizaMedicacaoList(List<RealizaMedicacao> realizaMedicacaoList) {
        this.realizaMedicacaoList = realizaMedicacaoList;
    }

    public List<Internacao> getInternacaoList() {
        return internacaoList;
    }

    public void setInternacaoList(List<Internacao> internacaoList) {
        this.internacaoList = internacaoList;
    }

    public List<RealizaMonitoracao> getRealizaMonitoracaoList() {
        return realizaMonitoracaoList;
    }

    public void setRealizaMonitoracaoList(List<RealizaMonitoracao> realizaMonitoracaoList) {
        this.realizaMonitoracaoList = realizaMonitoracaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fCpf != null ? fCpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.fCpf == null && other.fCpf != null) || (this.fCpf != null && !this.fCpf.equals(other.fCpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Funcionario[ fCpf=" + fCpf + " ]";
    }
    
}
