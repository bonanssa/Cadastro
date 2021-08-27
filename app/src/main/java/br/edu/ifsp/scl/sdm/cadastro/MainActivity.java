package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private EditText nomeCompletoEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private EditText cidadeEt;
    private Spinner estadosSp;
    private Button salvarBt;
    private Button limparBt;
    private CheckBox listaEmailCb;
    private RadioButton masculinoRb;
    private RadioButton femininoRb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeCompletoEt = findViewById(R.id.nomeCompletoEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        cidadeEt = findViewById(R.id.cidadeEt);
        estadosSp = findViewById(R.id.estadosSp);
        listaEmailCb = findViewById(R.id.listaEmailCb);
        masculinoRb = findViewById(R.id.masculinoRb);
        femininoRb = findViewById(R.id.femininoRb);
    }


    public void salvarCadastro(View view) {

        StringBuilder sb = new StringBuilder();

          Formulario formulario = new Formulario();
          formulario.setNomeCompletoEt(nomeCompletoEt.getText().toString());
          formulario.setTelefoneEt(telefoneEt.getText().toString());
          formulario.setEmailEt(emailEt.getText().toString());
          formulario.setCidadeEt(cidadeEt.getText().toString());
          formulario.setEstadoSp((String) ((TextView) estadosSp.getSelectedView()).getText());
          formulario.setListaEmailCb(listaEmailCb.isChecked());
          formulario.setMasculinoRb(masculinoRb.isChecked());

          // Nome Completo
          sb.append("Nome: ");
          sb.append(formulario.getNomeCompletoEt());
          sb.append('\n');

          // Telefone
          sb.append("Telefone: ");
          sb.append(formulario.getTelefoneEt());
          sb.append('\n');

          // Email
          sb.append("Email: ");
          sb.append(formulario.getEmailEt());
          sb.append('\n');

          // Cidade
          sb.append("Cidade: ");
          sb.append(formulario.getCidadeEt());
          sb.append('\n');

          // Estados
         sb.append("Estado: ");
         sb.append(formulario.getEstadoSp());
         sb.append('\n');

         // CheckBox
         sb.append("Ingressar na lista de e-mails: ");
         sb.append((formulario.getListaEmailCb()?"Sim":"Não"));
         sb.append('\n');

          // Sexo
         sb.append("Sexo: ");
         sb.append((formulario.getMasculinoRb()?"Masculino":"Feminino"));
         sb.append('\n');

        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
    }

    public void limparCampos(View view)
    {
        Formulario formulario = new Formulario();
        formulario.setNomeCompletoEt(null);
        formulario.setTelefoneEt(null);
        formulario.setEmailEt(null);
        formulario.setCidadeEt(null);
        formulario.setEstadoSp(null);
        formulario.setListaEmailCb(null);
        formulario.setMasculinoRb(null);


        nomeCompletoEt.setText("");
        telefoneEt.setText("");
        emailEt.setText("");
        cidadeEt.setText("");
        listaEmailCb.setChecked(false);
        estadosSp.setSelected(false);

        nomeCompletoEt.requestFocus();
    }
}