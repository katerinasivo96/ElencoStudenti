package com.example.caterina.elencostudenti;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.caterina.elencostudenti.datamodel.Studente;

import java.util.List;

/**
 * Created by Caterina on 10/04/2018.
 */


//adapter per la listview degli studenti
public class StudentiAdapter extends BaseAdapter {

    private Context context;
    private List<Studente> elenco;

    public StudentiAdapter(Context context, List<Studente> elenco) {
        this.context = context;
        this.elenco = elenco;
    }


    @Override
    public int getCount()
    {
        return elenco.size();
    }

    @Override
    public Object getItem(int i) {
        return elenco.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //nel caso il layout non sia stato iniettato, provvedo
        if (view == null)
            view = LayoutInflater.from(context).inflate(R.layout.riga_studente_layout, null);

        //ottengo gli ID correnti
        TextView vMatricola = view.findViewById(R.id.textMatricola);
        TextView vNomeCompleto = view.findViewById(R.id.textNomeCompleto);

        Studente studente = elenco.get(i);
        vMatricola.setText(studente.get);       //continuare







        return view;
    }


}
