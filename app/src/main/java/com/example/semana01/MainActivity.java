package com.example.semana01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
    {

    Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncalcular=(Button)findViewById(R.id.btncalcular);

        btncalcular.setOnClickListener(this);
    }

    public void Calcular() {

        Toast.makeText(this, "El producto es: ",Toast.LENGTH_LONG).show();

    }
    @Override
    public void onClick(View v)
    {
        if(v==btncalcular)
        {
            Calcular();
        }
    }
}