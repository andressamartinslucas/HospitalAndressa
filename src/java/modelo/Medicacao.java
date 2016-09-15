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
@Table(name = "medicacao")
@NamedQueries({
    @NamedQuery(name = "Medicacao.findAll", query = "SELECT m FROM Medicacao m")})
public class Medicacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "me_codigo")
    private String meCodigo;
    @Basic(optional = false)
    @Column(name = "me_nome")
    private String meNome;
    @Basic(optional = false)
    @Column(name = "me_dosagem")
    private String meDosagem;
    @Basic(optional = false)
    @Column(name = "me_intervalo")
    private String meIntervalo;

    public Medicacao() {
    }

    public Medicacao(String meCodigo) {
        this.meCodigo = meCodigo;
    }

    public Medicacao(String meCodigo, String meNome, String meDosagem, String meIntervalo) {
        this.meCodigo = meCodigo;
        this.meNome = meNome;
        this.meDosagem = meDosagem;
        this.meIntervalo = meIntervalo;
    }

    public String getMeCodigo() {
        return meCodigo;
    }

    public void setMeCodigo(String meCodigo) {
        this.meCodigo = meCodigo;
    }

    public String getMeNome() {
        return meNome;
    }

    public void setMeNome(String meNome) {
        this.meNome = meNome;
    }

    public String getMeDosagem() {
        return meDosagem;
    }

    public void setMeDosagem(String meDosagem) {
        this.meDosagem = meDosagem;
    }

    public String getMeIntervalo() {
        return meIntervalo;
    }

    public void setMeIntervalo(String meIntervalo) {
        this.meIntervalo = meIntervalo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (meCodigo != null ? meCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicacao)) {
            return false;
        }
        Medicacao other = (Medicacao) object;
        if ((this.meCodigo == null && other.meCodigo != null) || (this.meCodigo != null && !this.meCodigo.equals(other.meCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Medicacao[ meCodigo=" + meCodigo + " ]";
    }
    
}
