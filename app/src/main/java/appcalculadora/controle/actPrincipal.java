package appcalculadora.controle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class actPrincipal extends AppCompatActivity {

    TextView txtNumero;
    EditText edtNumero;
    Button btnSomar, btnSubtrair,btnmultiplicar,btnDividir;
    private float numero1, numero2, resultado;
    private String operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_principal);
        txtNumero=findViewById(R.id.txtNumero);
        edtNumero=findViewById(R.id.edtNumero);
        btnSomar=findViewById(R.id.btnSomar);
    }
    public void Somar(View view) {
        operacao="+";
        numero1 = Integer.parseInt(edtNumero.getText().toString());
        txtNumero.setText(String.valueOf(numero1) + " + ");
        LimparNumeros();
    }
    public void Igual(View view) {
        numero2 = Integer.parseInt(edtNumero.getText().toString());
        if(operacao.equals("+")) {
            resultado = numero1 + numero2;
            txtNumero.setText(txtNumero.getText()+String.valueOf(numero2)+" = "+String.valueOf(resultado));
        }
        LimparNumeros();
        HabilitaBotoes(view);
    }
    public void LimparNumeros() {
        edtNumero.setText("");
        edtNumero.requestFocus();
        btnSomar.setEnabled(false);
    }
    public void HabilitaBotoes(View view) {
        btnSomar.setEnabled(true);
    }
}