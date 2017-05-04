package drsopa.com.ejemplosdearrays;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.x;
import static drsopa.com.ejemplosdearrays.R.id.texto;
import static java.lang.reflect.Array.get;

public class MainActivity extends Activity {

    EditText texto;
    TextView texto2;
    int a = 0;
    String cadena2;
    String cadena;
    int i = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (EditText) findViewById(R.id.texto);
        texto2 = (TextView) findViewById(R.id.texto2);

    }

    public void Abre(View view) {
        Resources res = this.getResources();
        String[] Tipos_Opciones = res.getStringArray(R.array.TiposOpciones);
        i = 0;
        cadena2 = texto.getText().toString();
        cadena = "uno";
        //cadena = get(Tipos_Opciones, 0).toString();;

if (cadena != cadena2) {

        texto2.setText(cadena + " distinto de  " + cadena2);
        //for (int x = 0; x < Tipos_Opciones.length; x++) {
    }
else {
          //  cadena =  get(Tipos_Opciones, i).toString();

            //if (cadena == cadena2) {
                texto2.setText(cadena + " = " + cadena2);}
           //  }
            //else {i = i + 1;}




            }


        }





