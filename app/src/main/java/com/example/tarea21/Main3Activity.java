package com.example.tarea21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tName, tApell, tEmail, tEdad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tName= findViewById(R.id.tv_name);tApell= findViewById(R.id.tv_apell);tEmail= findViewById(R.id.tv_correo);tEdad= findViewById(R.id.tv_edad);

        Intent mIntent= this.getIntent();

        if(mIntent!=null) {
            tName.setText("Nombre: " + mIntent.getStringExtra(AppConstant.NOMBRE_KEY));tApell.setText("Apellido: " + mIntent.getStringExtra(AppConstant.APELLIDO_KEY));tEmail.setText("Correo: " + mIntent.getStringExtra(AppConstant.CORREO_KEY));
            tEdad.setText("Edad: " + mIntent.getStringExtra(AppConstant.EDAD_KEY));
        }
    }
}
