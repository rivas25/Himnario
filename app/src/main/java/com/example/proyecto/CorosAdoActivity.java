package com.example.proyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class CorosAdoActivity extends AppCompatActivity {

    private EditText ettituloca, etautorca, etletraca;
    private Button btnRegistrarca;
    private ListView lvdatosca;
    private AsyncHttpClient clienteca = new AsyncHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coros_ado);

        ettituloca = findViewById(R.id.ettituloca);
        etautorca = findViewById(R.id.etautorca);
        etletraca = findViewById(R.id.etletraca);

        btnRegistrarca = findViewById(R.id.btnRegistrarca);

        lvdatosca = findViewById(R.id.lvDatosRCADO);

        clienteca = new AsyncHttpClient();

        almacenarCoros();

        obtenerCoros();
    }
    private void almacenarCoros() {
        btnRegistrarca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ettituloca.getText().toString().length()== 0 )  {
                    ettituloca.setError("Campo Obligatorio");
                }else if (etautorca.getText().toString().length()== 0){
                    etautorca.setError("Campo Obligatorio");
                }else  if (etletraca.getText().toString().length()== 0){
                    etletraca.setError("Campo Obligatorio");
                }else{
                    CorosAdo a = new CorosAdo();
                    a.setTitulo(ettituloca.getText().toString().replaceAll(" ", "%20"));
                    a.setAutor(etautorca.getText().toString().replaceAll(" ", "%20"));
                    a.setLetra(etletraca.getText().toString().replaceAll(" ", "%20"));

                    agregarCoros(a);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    obtenerCoros();
                }
            }
        });
    }
