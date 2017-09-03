package com.example.gabrielarroyave.practica1_1;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String seleccion, radio, lado1, lado2, lado3;
    private RadioButton rCuadrado, rCirculo,rTriangulo, rCubo;
    private EditText eRadio, eLado1, eLado2, eLado3;
    private TextView tResultado, tLado1, tLado2, tLado3, tRadio;
    private Button bCalcular;
    private RadioGroup rRadiogroup;
    private double Area=0, Perimetro=0, Volumen=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCalcular=(Button)findViewById(R.id.bCalcular);
        rCuadrado = (RadioButton) findViewById(R.id.rCuadrado);
        rCirculo = (RadioButton) findViewById(R.id.rCirculo);
        rTriangulo = (RadioButton) findViewById(R.id.rTriangulo);
        rCubo = (RadioButton) findViewById(R.id.rCubo);
        eRadio = (EditText) findViewById(R.id.eRadio);
        eLado1 = (EditText) findViewById(R.id.eLado1);
        eLado2 = (EditText) findViewById(R.id.eLado2);
        eLado3 = (EditText) findViewById(R.id.eLado3);
        tResultado = (TextView) findViewById(R.id.tResultado);
        tLado1 = (TextView) findViewById(R.id.tLado1);
        tLado2 = (TextView) findViewById(R.id.tLado2);
        tLado3 = (TextView) findViewById(R.id.tLado3);
        tRadio = (TextView) findViewById(R.id.tRadio);
        rRadiogroup = (RadioGroup) findViewById(R.id.rRadiogroup);

        rRadiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                tResultado.setText("");
                if (rCirculo.isChecked()){
                    tRadio.setVisibility(View.VISIBLE);
                    eRadio.setVisibility(View.VISIBLE);
                    tLado1.setVisibility(View.GONE);
                    tLado2.setVisibility(View.GONE);
                    tLado3.setVisibility(View.GONE);
                    eLado1.setVisibility(View.GONE);
                    eLado2.setVisibility(View.GONE);
                    eLado3.setVisibility(View.GONE);
                }
                if (rTriangulo.isChecked()){
                    tRadio.setVisibility(View.GONE);
                    eRadio.setVisibility(View.GONE);
                    tLado1.setVisibility(View.VISIBLE);
                    tLado2.setVisibility(View.VISIBLE);
                    tLado3.setVisibility(View.VISIBLE);
                    eLado1.setVisibility(View.VISIBLE);
                    eLado2.setVisibility(View.VISIBLE);
                    eLado3.setVisibility(View.VISIBLE);
                }
                if (rCubo.isChecked()){
                    tRadio.setVisibility(View.GONE);
                    eRadio.setVisibility(View.GONE);
                    tLado1.setVisibility(View.VISIBLE);
                    tLado2.setVisibility(View.GONE);
                    tLado3.setVisibility(View.GONE);
                    eLado1.setVisibility(View.VISIBLE);
                    eLado2.setVisibility(View.GONE);
                    eLado3.setVisibility(View.GONE);
                }
                if (rCuadrado.isChecked()){
                    tRadio.setVisibility(View.GONE);
                    eRadio.setVisibility(View.GONE);
                    tLado1.setVisibility(View.VISIBLE);
                    tLado2.setVisibility(View.GONE);
                    tLado3.setVisibility(View.GONE);
                    eLado1.setVisibility(View.VISIBLE);
                    eLado2.setVisibility(View.GONE);
                    eLado3.setVisibility(View.GONE);
                }


            }
        });
    }


    public void fCalcular(View view) {
        if(rCuadrado.isChecked()){
            double elado1 = Integer.parseInt(eLado1.getText().toString());
            Perimetro=4*elado1;
            Area=elado1*elado1;
            tResultado.setText("Perímetro: "+Perimetro+" cm"+"\nÁrea: "+Area+" cm^2");
        }
        if(rCirculo.isChecked()){
            double eradio = Integer.parseInt(eRadio.getText().toString());
            Perimetro= 2*Math.PI*eradio;
            Area= Math.PI*eradio*eradio;
            tResultado.setText("Perímetro: "+Perimetro+" cm"+"\nÁrea: "+Area+" cm^2 ");
        }
        if(rTriangulo.isChecked()){
            double eladoA = Integer.parseInt(eLado1.getText().toString());
            double eladoB = Integer.parseInt(eLado2.getText().toString());
            double eladoC = Integer.parseInt(eLado3.getText().toString());
            Perimetro= eladoA+eladoB+eladoC;
            Area= eladoA*eladoB/2;
            tResultado.setText("Perímetro: "+Perimetro+" cm"+"\nÁrea: "+Area+" cm^2");
        }
        if(rCubo.isChecked()){
            double elado = Integer.parseInt(eLado1.getText().toString());
            Area = 6*elado*elado;
            Volumen = elado*elado*elado;
            tResultado.setText("Área: "+Area+" cm"+"\nVolumen: "+Volumen+" cm^3 ");
        }
    }
}
