package com.example.bundletransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickSumar(View view){

        //creem les instàncies de les vistes de text dels num1 i num2, de tipus EditText:
        EditText quadre1 = (EditText) findViewById(R.id.num1);
        EditText quadre2 = (EditText)findViewById(R.id.num2);
        //el que es guarda dins de EditText sempre és string.

        int n1 = Integer.parseInt(quadre1.getText().toString());
        int n2 = Integer.parseInt(quadre2.getText().toString());


        Intent intent = new Intent(this, Sumar.class);

        //per traspassar dades a la classe Sumar
        //de moment passem dades fixes, en un futur seran els de l'usuari
        intent.putExtra("number1", n1);
        intent.putExtra("number2", n2);

        startActivity(intent);
    }
}
