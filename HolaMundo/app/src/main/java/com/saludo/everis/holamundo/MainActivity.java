package com.saludo.everis.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textViwe_1;
    private Button   button_1 ;
    private Integer contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViwe_1 = (TextView) findViewById(R.id.text_1);
        button_1  = (Button) findViewById(R.id.button_1);


        textViwe_1.setText("Hola Aaron");

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             contador = contador +1;
              textViwe_1.setText("Numero de personas"+ contador);
            }
        });
    }
}
