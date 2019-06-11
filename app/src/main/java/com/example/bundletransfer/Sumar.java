package com.example.bundletransfer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Sumar extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultat);

        //hem de rescatar les dades del bundle.
        Bundle dades = getIntent().getExtras();

        int num1 = dades.getInt("number1");
        int num2 = dades.getInt("number2");

        //fem el càlcul
        int resultat = num1 + num2;

        //mostrem el resultat en la vista corresponent
        TextView textView = (TextView)findViewById(R.id.textResultat);
        textView.setText(""+ resultat);

    }
}
