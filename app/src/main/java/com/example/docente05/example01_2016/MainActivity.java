package com.example.docente05.example01_2016;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Edtname1, Edtemail1;
    RadioButton RbopcinM, RbopcionF;
    public String Opcion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edtname1 = (EditText) findViewById(R.id.Edtname);
        Edtemail1 = (EditText) findViewById(R.id.Edtemail);
        RbopcinM = (RadioButton) findViewById(R.id.Rbopcion1);
        RbopcionF = (RadioButton) findViewById(R.id.Rbopcion2);

        View.OnClickListener radio = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.Rbopcion1 :
                        Opcion="M";
                        break;
                    case R.id.Rbopcion2:
                        Opcion="F";
                        break;
                }
            }
        };
        RbopcinM.setOnClickListener(radio);
        RbopcionF.setOnClickListener(radio);
    }
    public void ClickOk(View v){
        Toast.makeText(MainActivity.this,"Imprimiendo... "+Edtname1.getText()+" "+Edtemail1.getText()+" "+Opcion,Toast.LENGTH_SHORT).show();

    }
    /*public String getOpcion() {
        return Opcion;
    }*/

}
