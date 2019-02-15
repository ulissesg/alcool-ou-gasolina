package com.example.calculadoradecombustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button calcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.Valcool);
        precoGasolina = findViewById(R.id.Vgasolina);
        calcular = findViewById(R.id.Calcular);
        resultado = findViewById(R.id.resultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pAlcool = precoAlcool.getText().toString();
                String pGasolina = precoGasolina.getText().toString();

                if (pAlcool.length() < 1 || pGasolina.length() < 1){

                    resultado.setText("Campo(s) em branco !");

                }else{
                    Double valorAlcool = Double.parseDouble(pAlcool);
                    Double valorGasolina = Double.parseDouble(pGasolina);

                    Double res = valorAlcool / valorGasolina;

                    if (res <= 0.7){
                        resultado.setText("É melhor utilizar Álcool !");
                    }else{
                        resultado.setText("É melhor utilizar Gasolina !");
                    }
                }
            }
        });
    }
}
