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