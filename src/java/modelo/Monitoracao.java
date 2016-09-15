/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "monitoracao")
@NamedQueries({
    @NamedQuery(name = "Monitoracao.findAll", query = "SELECT m FROM Monitoracao m")})
public class Monitoracao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "mo_codigo")
    private String moCodigo;
    @Basic(optional = false)
    @Column(name = "mo_descricao")
    private String moDescricao;
    @Basic(optional = false)
    @Column(name = "mo_intervalo")
    private String moIntervalo;

    public Monitoracao() {
    }

    public Monitoracao(String moCodigo) {
        this.moCodigo = moCodigo;
    }

    public Monitoracao(String moCodigo, String moDescricao, String moIntervalo) {
        this.moCodigo = moCodigo;
        this.moDescricao = moDescricao;
        this.moIntervalo = moIntervalo;
    }

    public String getMoCodigo() {
        return moCodigo;
    }

    public void setMoCodigo(String moCodigo) {
        this.moCodigo = moCodigo;
    }

    public String getMoDescricao() {
        return moDescricao;
    }

    public void setMoDescricao(String moDescricao) {
        this.moDescricao = moDescricao;
    }

    public String getMoIntervalo() {
        return moIntervalo;
    }

    public void setMoIntervalo(String moIntervalo) {
        this.moIntervalo = moIntervalo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moCodigo != null ? moCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Monitoracao)) {
            return false;
        }
        Monitoracao other = (Monitoracao) object;
        if ((this.moCodigo == null && other.moCodigo != null) || (this.moCodigo != null && !this.moCodigo.equals(other.moCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Monitoracao[ moCodigo=" + moCodigo + " ]";
    }
    
}
