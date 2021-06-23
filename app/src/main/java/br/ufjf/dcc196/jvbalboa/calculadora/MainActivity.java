package br.ufjf.dcc196.jvbalboa.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private EditText editTextPrimeiroNumero;
    private EditText editTextSegundoNumero;
    private TextView textViewResultado;
    private RadioGroup radioGroupOperacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPrimeiroNumero = findViewById(R.id.editTextPrimeiroNumero);
        editTextSegundoNumero = findViewById(R.id.editTextSegundoNumero);
        textViewResultado = findViewById(R.id.textViewResultado);
        radioGroupOperacao = findViewById(R.id.radioGroupOperacao);
    }

    public void calcular(View view) {
        Double primeiroNumero = 0.0;
        Double segundoNumero = 0.0;
        Double resultado = null;
        try {
            primeiroNumero = Double.parseDouble(editTextPrimeiroNumero.getText().toString());
            segundoNumero = Double.parseDouble(editTextSegundoNumero.getText().toString());

            switch (radioGroupOperacao.getCheckedRadioButtonId()) {
                case R.id.radioButtonSoma:
                    resultado = primeiroNumero + segundoNumero;
                    break;
                case R.id.radioButtonSubtracao:
                    resultado = primeiroNumero - segundoNumero;
                    break;
                case R.id.radioButtonMultiplicacao:
                    resultado = primeiroNumero * segundoNumero;
                    break;
                case R.id.radioButtonDivisao:
                    resultado = primeiroNumero / segundoNumero;
                    break;
            }

        } catch (Exception e){

        }

        textViewResultado.setText(resultado != null? resultado.toString() : "-");
    }
}