package com.example.caterina.elencostudenti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.caterina.elencostudenti.datamodel.DataSource;

public class MainActivity extends AppCompatActivity {

    private ListView vListaStudenti;
    private DataSource dataSource;
    private StudentiAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ottengo il riferimento alla view
        vListaStudenti = findViewById(R.id.listStudenti);

        dataSource = DataSource.getIstanza();
        adapter = new StudentiAdapter(this, dataSource.elencoStudenti("A13"));




    }
}
