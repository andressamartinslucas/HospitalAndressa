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
@Table(name = "paciente")
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "p_cpf")
    private String pCpf;
    @Basic(optional = false)
    @Column(name = "p_nome")
    private String pNome;
    @Basic(optional = false)
    @Column(name = "p_rg")
    private String pRg;
    @Basic(optional = false)
    @Column(name = "p_datanasc")
    @Temporal(TemporalType.DATE)
    private Date pDatanasc;
    @Basic(optional = false)
    @Column(name = "p_endereco")
    private String pEndereco;
    @Column(name = "p_complemento")
    private String pComplemento;
    @Basic(optional = false)
    @Column(name = "p_numero")
    private String pNumero;
    @Basic(optional = false)
    @Column(name = "p_estadocivil")
    private String pEstadocivil;
    @Basic(optional = false)
    @Column(name = "p_naturalidade")
    private String pNaturalidade;
    @Basic(optional = false)
    @Column(name = "p_email")
    private String pEmail;
    @Basic(optional = false)
    @Column(name = "p_cor")
    private String pCor;
    @Basic(optional = false)
    @Column(name = "p_sexo")
    private String pSexo;
    @Basic(optional = false)
    @Column(name = "p_ocupacao")
    private String pOcupacao;
    @Column(name = "p_tiposanguineo")
    private String pTiposanguineo;
    @Column(name = "obito_datahora")
    @Temporal(TemporalType.DATE)
    private Date obitoDatahora;
    @Column(name = "obito_causa")
    private String obitoCausa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    private List<Internacao> internacaoList;

    public Paciente() {
    }

    public Paciente(String pCpf) {
        this.pCpf = pCpf;
    }

    public Paciente(String pCpf, String pNome, String pRg, Date pDatanasc, String pEndereco, String pNumero, String pEstadocivil, String pNaturalidade, String pEmail, String pCor, String pSexo, String pOcupacao) {
        this.pCpf = pCpf;
        this.pNome = pNome;
        this.pRg = pRg;
        this.pDatanasc = pDatanasc;
        this.pEndereco = pEndereco;
        this.pNumero = pNumero;
        this.pEstadocivil = pEstadocivil;
        this.pNaturalidade = pNaturalidade;
        this.pEmail = pEmail;
        this.pCor = pCor;
        this.pSexo = pSexo;
        this.pOcupacao = pOcupacao;
    }

    public String getPCpf() {
        return pCpf;
    }

    public void setPCpf(String pCpf) {
        this.pCpf = pCpf;
    }

    public String getPNome() {
        return pNome;
    }

    public void setPNome(String pNome) {
        this.pNome = pNome;
    }

    public String getPRg() {
        return pRg;
    }

    public void setPRg(String pRg) {
        this.pRg = pRg;
    }

    public Date getPDatanasc() {
        return pDatanasc;
    }

    public void setPDatanasc(Date pDatanasc) {
        this.pDatanasc = pDatanasc;
    }

    public String getPEndereco() {
        return pEndereco;
    }

    public void setPEndereco(String pEndereco) {
        this.pEndereco = pEndereco;
    }

    public String getPComplemento() {
        return pComplemento;
    }

    public void setPComplemento(String pComplemento) {
        this.pComplemento = pComplemento;
    }

    public String getPNumero() {
        return pNumero;
    }

    public void setPNumero(String pNumero) {
        this.pNumero = pNumero;
    }

    public String getPEstadocivil() {
        return pEstadocivil;
    }

    public void setPEstadocivil(String pEstadocivil) {
        this.pEstadocivil = pEstadocivil;
    }

    public String getPNaturalidade() {
        return pNaturalidade;
    }

    public void setPNaturalidade(String pNaturalidade) {
        this.pNaturalidade = pNaturalidade;
    }

    public String getPEmail() {
        return pEmail;
    }

    public void setPEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public String getPCor() {
        return pCor;
    }

    public void setPCor(String pCor) {
        this.pCor = pCor;
    }

    public String getPSexo() {
        return pSexo;
    }

    public void setPSexo(String pSexo) {
        this.pSexo = pSexo;
    }

    public String getPOcupacao() {
        return pOcupacao;
    }

    public void setPOcupacao(String pOcupacao) {
        this.pOcupacao = pOcupacao;
    }

    public String getPTiposanguineo() {
        return pTiposanguineo;
    }

    public void setPTiposanguineo(String pTiposanguineo) {
        this.pTiposanguineo = pTiposanguineo;
    }

    public Date getObitoDatahora() {
        return obitoDatahora;
    }

    public void setObitoDatahora(Date obitoDatahora) {
        this.obitoDatahora = obitoDatahora;
    }

    public String getObitoCausa() {
        return obitoCausa;
    }

    public void setObitoCausa(String obitoCausa) {
        this.obitoCausa = obitoCausa;
    }

    public List<Internacao> getInternacaoList() {
        return internacaoList;
    }

    public void setInternacaoList(List<Internacao> internacaoList) {
        this.internacaoList = internacaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pCpf != null ? pCpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.pCpf == null && other.pCpf != null) || (this.pCpf != null && !this.pCpf.equals(other.pCpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Paciente[ pCpf=" + pCpf + " ]";
    }
    
}
