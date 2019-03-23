package com.example.tarea21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tNombre, tApellido, tCorreo, tEdad;
    Button BottonC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); tNombre= findViewById(R.id.tv_nombre); tApellido= findViewById(R.id.tv_apellido); tCorreo= findViewById(R.id.tv_correo); tEdad= findViewById(R.id.tv_edad); BottonC= findViewById(R.id.btn_share);
        Intent mIntent= getIntent();
        tNombre.setText(mIntent.getStringExtra(AppConstant.NOMBRE_KEY));tApellido.setText(mIntent.getStringExtra(AppConstant.APELLIDO_KEY));tCorreo.setText(mIntent.getStringExtra(AppConstant.CORREO_KEY));tEdad.setText(mIntent.getStringExtra(AppConstant.EDAD_KEY));

        BottonC.setOnClickListener(v->{
            String name= tNombre.getText().toString(); String apell= tApellido.getText().toString();String correo= tCorreo.getText().toString();String edad = tEdad.getText().toString();
            Intent newIntent= new Intent();newIntent.setType("text/plain");
            newIntent.setAction(Intent.ACTION_SEND);newIntent.putExtra(AppConstant.NOMBRE_KEY, name);newIntent.putExtra(AppConstant.APELLIDO_KEY, apell);newIntent.putExtra(AppConstant.CORREO_KEY, correo);newIntent.putExtra(AppConstant.EDAD_KEY, edad);
            startActivity(newIntent);
        });

    }
}
