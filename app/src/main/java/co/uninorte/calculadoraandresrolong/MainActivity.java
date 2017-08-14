package co.uninorte.calculadoraandresrolong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton0,botonmas,botonmenos,botonigual;
    int result;
    String a,b;
    int op,h,j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editex1);
        boton0=(Button) findViewById(R.id.button0);
        boton1=(Button) findViewById(R.id.button1);
        boton2=(Button) findViewById(R.id.button2);
        boton3=(Button) findViewById(R.id.button3);
        boton4=(Button) findViewById(R.id.button4);
        boton5=(Button) findViewById(R.id.button5);
        boton6=(Button) findViewById(R.id.button6);
        boton7=(Button) findViewById(R.id.button7);
        boton8=(Button) findViewById(R.id.button8);
        boton9=(Button) findViewById(R.id.button9);
        botonmas=(Button) findViewById(R.id.buttonmas);
        botonmenos=(Button) findViewById(R.id.buttonmenos);
        botonigual=(Button) findViewById(R.id.buttonigual);


    }


    public void Agregar2(View view) {
         a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=2;
        res=(res*10)+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Agregar3(View view) {
         a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=3;
        res=(res*10)+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Agregar4(View view) {
         a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=4;
        res=(res*10)+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Agregar5(View view) {
         a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=5;
        res=(res*10)+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Agregar6(View view) {
         a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=6;
        res=(res*10)+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Agregar7(View view) {
         a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=7;
         res=(res*10)+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Agregar8(View view) {
        a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=8;
        res=(res*10)+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Agregar9(View view) {
        a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=9;
        res=(res*10)+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Agregar0(View view) {
         a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=0;
        res=res+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Agregar1(View view) {
        a= editText.getText().toString();
        int res= Integer.parseInt(a);
        int temp=1;
         res=res+temp;
        String r = String.valueOf(res);
        editText.setText(r);
    }

    public void Suma1(View view) {
        op=1;
        String n= String.valueOf(0);
        editText.setText(n);
        b= editText.getText().toString();
        
         h=Integer.parseInt(a);
         j=Integer.parseInt(b);


    }

    public void Igual(View view) {
        if(op==1){
            result=h+j;
        }else{
            result=h-j;
        }
        String f = String.valueOf(result);
        editText.setText(f);
    }

    public void Resta(View view) {
        op=2;
        String n= String.valueOf(0);
        editText.setText(n);
        b= editText.getText().toString();
         h=Integer.parseInt(a);
         j=Integer.parseInt(b);
        result=h-j;
    }
}
