package com.example.actividadclaseteam3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Aqui
        final EditText textoexportar;
        textoexportar = findViewById(R.id.pasarTexto);

        Button btn = findViewById(R.id.botonact2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AcercaDe.class);
                intent.putExtra("frase", textoexportar.getText().toString());

                startActivityForResult(intent, 0);
            }
        });
    }
}