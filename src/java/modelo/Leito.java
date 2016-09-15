/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
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

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "leito")
@NamedQueries({
    @NamedQuery(name = "Leito.findAll", query = "SELECT l FROM Leito l")})
public class Leito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "l_codigo")
    private String lCodigo;
    @Basic(optional = false)
    @Column(name = "l_quarto")
    private String lQuarto;
    @Basic(optional = false)
    @Column(name = "l_unidade")
    private String lUnidade;
    @Basic(optional = false)
    @Column(name = "l_ocupado")
    private String lOcupado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "leito")
    private List<Internacao> internacaoList;

    public Leito() {
    }

    public Leito(String lCodigo) {
        this.lCodigo = lCodigo;
    }

    public Leito(String lCodigo, String lQuarto, String lUnidade, String lOcupado) {
        this.lCodigo = lCodigo;
        this.lQuarto = lQuarto;
        this.lUnidade = lUnidade;
        this.lOcupado = lOcupado;
    }

    public String getLCodigo() {
        return lCodigo;
    }

    public void setLCodigo(String lCodigo) {
        this.lCodigo = lCodigo;
    }

    public String getLQuarto() {
        return lQuarto;
    }

    public void setLQuarto(String lQuarto) {
        this.lQuarto = lQuarto;
    }

    public String getLUnidade() {
        return lUnidade;
    }

    public void setLUnidade(String lUnidade) {
        this.lUnidade = lUnidade;
    }

    public String getLOcupado() {
        return lOcupado;
    }

    public void setLOcupado(String lOcupado) {
        this.lOcupado = lOcupado;
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
        hash += (lCodigo != null ? lCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leito)) {
            return false;
        }
        Leito other = (Leito) object;
        if ((this.lCodigo == null && other.lCodigo != null) || (this.lCodigo != null && !this.lCodigo.equals(other.lCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Leito[ lCodigo=" + lCodigo + " ]";
    }
    
}
