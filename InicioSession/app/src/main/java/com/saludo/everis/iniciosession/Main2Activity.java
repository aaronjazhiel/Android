package com.saludo.everis.iniciosession;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private Button btn_salir;
    private TextView tv_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent miItenAnterior = getIntent();
        String  mail= miItenAnterior.getStringExtra(MainActivity.EXTRA_MESSAGE);

        btn_salir = (Button) findViewById(R.id.buttonSalir);
        tv_mensaje = ( TextView) findViewById(R.id.textViewBienvenido);


        tv_mensaje.setText(mail);

        btn_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itentResgro = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(itentResgro);
           }
        });
    }
}
