package com.example.tarea21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eNombre, eApellido, eEdad, eCorreo;
    Button eBotonS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); setContentView(R.layout.activity_main);
        eNombre= findViewById(R.id.et_nombre); eApellido= findViewById(R.id.et_apellido); eCorreo= findViewById(R.id.et_correo); eEdad= findViewById(R.id.et_edad); eBotonS= findViewById(R.id.btn_send);
        eBotonS.setOnClickListener(v->{ String name= eNombre.getText().toString(); String apell= eApellido.getText().toString(); String correo = eCorreo.getText().toString(); String edad = eEdad.getText().toString();
            Intent mIntent= new Intent(this, Main2Activity.class); mIntent.putExtra(AppConstant.NOMBRE_KEY, name); mIntent.putExtra(AppConstant.APELLIDO_KEY, apell); mIntent.putExtra(AppConstant.CORREO_KEY, correo); mIntent.putExtra(AppConstant.EDAD_KEY, edad);
            startActivity(mIntent);
        });
    }
}
