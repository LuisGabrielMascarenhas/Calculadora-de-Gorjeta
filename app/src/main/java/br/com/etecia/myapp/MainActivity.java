package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

  protected TextInputLayout txtFieldValor,txtFieldValorGorjeta,txtFieldValorTotal;
 Spinner qualidade_spinner;

 Button btnCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFieldValor = findViewById(R.id.txtFieldValor);
        txtFieldValorGorjeta = findViewById(R.id.txtFieldValorGorjeta);
        txtFieldValorTotal = findViewById(R.id.txtFieldValorTotal);

        qualidade_spinner = findViewById(R.id.qualidade_spinner);
        btnCalcular = findViewById(R.id.btnCalcular);

    }

}