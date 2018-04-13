package com.example.caterina.elencostudenti.datamodel;

/**
 * Created by Caterina on 10/04/2018.
 */

public class Studente {

    //Attributi della classe

    private String matricola;
    private String cognome;
    private String nome;
    private int cfu;
    private double media;


    // Costruttori


    public String getMatricola() {
        return matricola;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getCfu() {
        return cfu;
    }

    public double getMedia() {
        return media;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Studente(String matricola, String cognome, String nome, int cfu, double media) {
        this.matricola = matricola;
        this.cognome = cognome;

        this.nome = nome;
        this.cfu = cfu;

        this.media = media;
    }
}
