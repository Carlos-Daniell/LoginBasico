package com.example.loginbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, senha;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.user);
        senha = (EditText) findViewById(R.id.senha);
        btn = (Button) findViewById(R.id.btn);

        /*
        btn.setOnClickListener((View) ->{
            startActivity(new Intent(MainActivity.this, segunda.class));

        });
*/
    }

    //Segunda Opção
    public void clicaBotao(View view){
        if (user.getText().toString().equals("Admin") && senha.getText().toString().equals("12345"))
            startActivity(new Intent(MainActivity.this,Segunda.class));
        else Toast.makeText(this,"Usuário ou Senha Invalido !",Toast.LENGTH_SHORT).show();

    }

}