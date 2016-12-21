package com.botones2.keka.botones2;


import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Botones extends AppCompatActivity {

    RelativeLayout rlBotones;
    TextView etFrases;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        rlBotones = (RelativeLayout)findViewById(R.id.rlBoton);

        /*Instrucciónes para añadir una fuente externa al EditText

        */

    }

    public void press(View v) {
        //Instrucciones para añadir una fuente nueva
        //Hay que crear la carpeta assets y dentro la de font, donde irá nuestra fuente
        etFrases=(TextView) findViewById(R.id.etFrases);
        String font_path = "fonts/stonehen.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        etFrases.setTypeface(TF);

        switch (v.getId()){


            case R.id.boton1:
                etFrases.setText("Me da pena que se admire el valor en la batalla, menos mal que con los" +
                        "rifles no se matan las palabras");
                Toast.makeText(Botones.this,"Abrazado a la tristeza, Extrechinato y tu", Toast.LENGTH_SHORT).show();
                Drawable d = getDrawable(R.drawable.fondo1);
                rlBotones.setBackground(d);

                break;

            case R.id.boton2:
                etFrases.setText("El triunfo del verdadero hombre surge de las cenizas del error.");
                Toast.makeText(Botones.this,"Pablo Neruda", Toast.LENGTH_SHORT).show();
                Drawable d2 = getDrawable(R.drawable.fondo2);
                rlBotones.setBackground(d2);

                break;

            case R.id.boton3:
                etFrases.setText("Quiéreme cuando menos lo merezca porque será cuando más lo necesite");
                Toast.makeText(Botones.this,"Robert Louis Stevenson", Toast.LENGTH_SHORT).show();
                Drawable d3 = getDrawable(R.drawable.fondo3);
                rlBotones.setBackground(d3);

                break;

            case R.id.boton4:
                etFrases.setText("Y verás sin duda el resurgir poderoso del guerrero \n" +
                        "sin miedo a leyes ni a nostalgias \n" +
                        "y lo verás caer una y mil veces y levantarse de nuevo, \n" +
                        "con la pura bandera de su raza. ");
                Toast.makeText(Botones.this,"Abrazado a la tristeza, Extrechinato y tu", Toast.LENGTH_SHORT).show();
                Drawable d4 = getDrawable(R.drawable.fondo4);
                rlBotones.setBackground(d4);

                break;

            case R.id.boton5:
                etFrases.setText("Nada es fácil; nada se regala en este mundo, todo tiene que aprenderse " +
                        "con mucho esfuerzo. Un hombre que va en busca del conocimiento debe comportarse " +
                        "de la misma manera que un soldado que va a la guerra: bien despierto, con miedo, " +
                        "con respeto, y con absoluta confianza. Siguiendo estos requisitos, podrá perder " +
                        "alguna que otra batalla, pero nunca se lamentará de su destino.");
                Toast.makeText(Botones.this,"Popular", Toast.LENGTH_SHORT).show();
                Drawable d5 = getDrawable(R.drawable.fondo8);
                rlBotones.setBackground(d5);

                break;

            case R.id.boton6:
                etFrases.setText("Preocúpate más por tu carácter que por tu reputación. Tu " +
                        "carácter es lo que realmente eres, mientras que tu reputación es " +
                        "solo lo que los otros creen que tú eres.\n");
                Toast.makeText(Botones.this,"Dale Carnegie", Toast.LENGTH_SHORT).show();
                Drawable d6 = getDrawable(R.drawable.fondo7);
                rlBotones.setBackground(d6);

                break;
        }



    }

}