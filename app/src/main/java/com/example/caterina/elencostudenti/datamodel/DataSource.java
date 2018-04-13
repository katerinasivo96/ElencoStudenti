package com.example.caterina.elencostudenti.datamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Caterina on 10/04/2018.
 */

//modella la fonte dei dati
public class DataSource {

    //unica istanza dell'oggetto  (singleton)
    private static DataSource istanza = null;

    public DataSource() {
        popoloDataSource();
    }

    public static DataSource getIstanza(){
        if (istanza == null)
            istanza = new DataSource();
        return istanza;
    }
    //come utilizzerei una classe standard:
    //DataSource dataSource = new DataSource();
    //come utilizzo un singleton:
    //DataSource dataSource = DataSource().getIstanza();

    //fonte dati per emulatore
    private HashMap<String,Studente> elenco;    //chiave:string, valore:studente

    public void aggiungiStudente(Studente studente){
        elenco.put(studente.getMatricola(),studente);
    }
    public void eliminaStudente(Studente matricola){
        elenco.remove(matricola);
    }
    public void aggiornaiStudente(Studente studente){
        elenco.remove(studente.getMatricola());
        elenco.put(studente.getMatricola(),studente);
    }
    public Studente leggiStudente(String matricola){
        return elenco.get(matricola);
    }
    public List<Studente> elencoStudenti(String prefissoMatricola){
        ArrayList<Studente> risultato = new ArrayList<>();

        //itero tutti gli elementi per cercare quelli che soddisfano il requisito

        for (Map.Entry<String, Studente>elemento: elenco.entrySet()){                   //il ciclo for serve per scorrere gli elementi della lista
            if (elemento.getKey().startsWith(prefissoMatricola))
                risultato.add(elemento.getValue());

        }
        return risultato;


        //popolo il data source con dati di prova
        private void popoloDataSource(){
            elenco.put("A13001257", new Studente("A13001257", "Esposito", "Gennaro", 108, 23.5));
            elenco.put("A13001258", new Studente("A13001258", "Sivo", "Caterina", 100, 22.5));
            elenco.put("A13001259", new Studente("A13001259", "Picone", "Luigi", 78, 20.5));

    }

    }





}
