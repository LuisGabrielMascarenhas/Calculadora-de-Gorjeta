package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;


import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    TextInputEditText txtFieldValor,txtFieldValorGorjeta,txtFieldValorTotal;
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

        txtFieldValorTotal.setEnabled(false);
        txtFieldValorGorjeta.setEnabled(false);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Gorjeta gorjeta = new Gorjeta();
                gorjeta.valor = Integer.parseInt(Objects.requireNonNull(txtFieldValor.getText()).toString());

                switch (qualidade_spinner.getSelectedItem().toString()){
                    case "Excelente 10%":
                        gorjeta.qualidade = 10;
                        break;
                    case "Otimo 8%":
                        gorjeta.qualidade = 8;
                        break;
                    case "Bom 5%":
                        gorjeta.qualidade = 5;
                        break;
                    case "Ruim 2%":
                        gorjeta.qualidade = 2;
                        break;
                    default:
                        break;
                }
                gorjeta.calcularGorjeta();

                txtFieldValorGorjeta.setText(gorjeta.getGorjeta()+" ");
                txtFieldValorTotal.setText(gorjeta.getValorTotal()+ "");


            }
        });

    }

}