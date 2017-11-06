package com.saludo.everis.iniciosession;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Struct;

public class MainActivity extends AppCompatActivity {


   private EditText passwordEdt,mailEdt;
   private Button btnInicio;

   private String password = "admin";
   private String email = "admin@hotmail.com";
   public final static String EXTRA_MESSAGE = "email";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mailEdt = (EditText) findViewById(R.id.editMail);
        passwordEdt = (EditText) findViewById(R.id.editPassword);
        btnInicio = (Button) findViewById(R.id.buttonInicio);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mailEdt.getText().toString().equals(email)&& passwordEdt.getText().toString().equals(password) ){

                    Intent miIntent = new Intent(MainActivity.this,Main2Activity.class);
                    miIntent.putExtra(EXTRA_MESSAGE,mailEdt.getText().toString());
                    startActivity(miIntent);
                }else{
                    Toast.makeText(MainActivity.this,"Usuario o contrasena erroneos",Toast.LENGTH_SHORT).show();
                 }
            }
        });


    }
}
