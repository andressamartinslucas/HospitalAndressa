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
@Table(name = "consulta")
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c")})
public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "co_codigo")
    private String coCodigo;
    @Basic(optional = false)
    @Column(name = "co_datahora")
    @Temporal(TemporalType.DATE)
    private Date coDatahora;
    @Column(name = "co_obs")
    private String coObs;
    @Basic(optional = false)
    @Column(name = "co_pressao")
    private String coPressao;
    @Basic(optional = false)
    @Column(name = "co_temperatura")
    private String coTemperatura;
    @Column(name = "co_situacao")
    private String coSituacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
    private List<Exame> exameList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
    private List<RealizaMedicacao> realizaMedicacaoList;
    @JoinColumn(name = "internacao", referencedColumnName = "i_codigo")
    @ManyToOne(optional = false)
    private Internacao internacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
    private List<RealizaMonitoracao> realizaMonitoracaoList;

    public Consulta() {
    }

    public Consulta(String coCodigo) {
        this.coCodigo = coCodigo;
    }

    public Consulta(String coCodigo, Date coDatahora, String coPressao, String coTemperatura) {
        this.coCodigo = coCodigo;
        this.coDatahora = coDatahora;
        this.coPressao = coPressao;
        this.coTemperatura = coTemperatura;
    }

    public String getCoCodigo() {
        return coCodigo;
    }

    public void setCoCodigo(String coCodigo) {
        this.coCodigo = coCodigo;
    }

    public Date getCoDatahora() {
        return coDatahora;
    }

    public void setCoDatahora(Date coDatahora) {
        this.coDatahora = coDatahora;
    }

    public String getCoObs() {
        return coObs;
    }

    public void setCoObs(String coObs) {
        this.coObs = coObs;
    }

    public String getCoPressao() {
        return coPressao;
    }

    public void setCoPressao(String coPressao) {
        this.coPressao = coPressao;
    }

    public String getCoTemperatura() {
        return coTemperatura;
    }

    public void setCoTemperatura(String coTemperatura) {
        this.coTemperatura = coTemperatura;
    }

    public String getCoSituacao() {
        return coSituacao;
    }

    public void setCoSituacao(String coSituacao) {
        this.coSituacao = coSituacao;
    }

    public List<Exame> getExameList() {
        return exameList;
    }

    public void setExameList(List<Exame> exameList) {
        this.exameList = exameList;
    }

    public List<RealizaMedicacao> getRealizaMedicacaoList() {
        return realizaMedicacaoList;
    }

    public void setRealizaMedicacaoList(List<RealizaMedicacao> realizaMedicacaoList) {
        this.realizaMedicacaoList = realizaMedicacaoList;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public void setInternacao(Internacao internacao) {
        this.internacao = internacao;
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
        hash += (coCodigo != null ? coCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.coCodigo == null && other.coCodigo != null) || (this.coCodigo != null && !this.coCodigo.equals(other.coCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Consulta[ coCodigo=" + coCodigo + " ]";
    }
    
}
