package br.edu.ifsp.scl.sdm.cadastro;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Formulario {

    private String nomeCompletoEt;
    private String telefoneEt;
    private String emailEt;
    private String cidadeEt;
    private String estadoSp;
    private String salvarBt;
    private String limparBt;
    private Boolean listaEmailCb;
    private Boolean masculinoRb;
    private Boolean femininoRb;


    public String getTelefoneEt() {
        return telefoneEt;
    }

    public void setTelefoneEt(String telefoneEt) {
        this.telefoneEt = telefoneEt;
    }

    public String getEmailEt() {
        return emailEt;
    }

    public void setEmailEt(String emailEt) {
        this.emailEt = emailEt;
    }

    public String getCidadeEt() {
        return cidadeEt;
    }

    public void setCidadeEt(String cidadeEt) {
        this.cidadeEt = cidadeEt;
    }

    public String getEstadoSp() {
        return estadoSp;
    }

    public void setEstadoSp(String estadoSp) {
        this.estadoSp = estadoSp;
    }

    public Boolean getListaEmailCb() {
        return listaEmailCb;
    }

    public void setListaEmailCb(Boolean listaEmailCb) {
        this.listaEmailCb = listaEmailCb;
    }


    public Boolean getMasculinoRb() {
        return masculinoRb;
    }

    public void setMasculinoRb(Boolean masculinoRb) {
        this.masculinoRb = masculinoRb;
    }

    public String getNomeCompletoEt() {
        return nomeCompletoEt;
    }

    public void setNomeCompletoEt(String nomeCompletoEt) {
        this.nomeCompletoEt = nomeCompletoEt;
    }

}
