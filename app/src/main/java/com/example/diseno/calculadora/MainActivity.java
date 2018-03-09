package com.example.diseno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText info;
    public double primero, segundo, inforesult;
    int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info= findViewById(R.id.resultado);
    }

    public void btn0 (View v){
        String captura= info.getText().toString();
        captura=captura+"0";
        info.setText(captura);
    }

    public void btn1 (View v){
        String captura= info.getText().toString();
        captura=captura+"1";
        info.setText(captura);
    }

    public void btn2 (View v){
        String captura= info.getText().toString();
        captura=captura+"2";
        info.setText(captura);
    }

    public void btn3 (View v){
        String captura= info.getText().toString();
        captura=captura+"3";
        info.setText(captura);
    }

    public void btn4 (View v){
        String captura= info.getText().toString();
        captura=captura+"4";
        info.setText(captura);
    }

    public void btn5 (View v){
        String captura= info.getText().toString();
        captura=captura+"5";
        info.setText(captura);
    }

    public void btn6 (View v){
        String captura= info.getText().toString();
        captura=captura+"6";
        info.setText(captura);
    }

    public void btn7 (View v){
        String captura= info.getText().toString();
        captura=captura+"7";
        info.setText(captura);
    }

    public void btn8 (View v){
        String captura= info.getText().toString();
        captura=captura+"8";
        info.setText(captura);
    }

    public void btn9 (View v){
        String captura= info.getText().toString();
        captura=captura+"9";
        info.setText(captura);
    }

}
