package br.ufjf.dcc196.jvbalboa.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private EditText editTextPrimeiroNumero;
    private EditText editTextSegundoNumero;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPrimeiroNumero = findViewById(R.id.editTextPrimeiroNumero);
        editTextSegundoNumero = findViewById(R.id.editTextSegundoNumero);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void calcular(View view) {
        Double primeiroNumero = 0.0;
        Double segundoNumero = 0.0;
        Double resultado = null;
        try {
            primeiroNumero = Double.parseDouble(editTextPrimeiroNumero.getText().toString());
            segundoNumero = Double.parseDouble(editTextSegundoNumero.getText().toString());
            resultado = primeiroNumero + segundoNumero;
        } catch (Exception e){

        }

        textViewResultado.setText(resultado != null? resultado.toString() : "-");
    }
}