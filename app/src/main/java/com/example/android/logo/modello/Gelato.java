package com.example.android.logo.modello;

import java.util.List;

public class Gelato {
    private List<String> gustiPossibili;

    private String gusto, descrizione;

    public String getGusto() {
        return gusto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Gelato(String gusto) {
        if(gusto == null || gusto.equals("") || descrizione == null || descrizione.equals(""))
            throw new IllegalArgumentException();

        if(!gustiPossibili.contains(gusto))
            throw new IllegalArgumentException();

        this.gusto = gusto;
        switch (gusto) {
            case "fragola": this.descrizione = "mo te lo devo spiegare io cos'è il gelato alla fragola?";
            case "nocciola": this.descrizione = "mo te lo devo spiegare io cos'è il gelato alla nocciola?";
            case "limone": this.descrizione = "mo te lo devo spiegare io cos'è il gelato al limone?";
            case "crema": this.descrizione = "mo te lo devo spiegare io cos'è il gelato alla fragola?";
            case "fiordilatte": this.descrizione = "mo te lo devo spiegare io cos'è il gelato al fiordilatte?";
        }

    }

    private void setGustiPossibili() {
        gustiPossibili.add("fragola");
        gustiPossibili.add("limone");
        gustiPossibili.add("nocciola");
        gustiPossibili.add("crema");
        gustiPossibili.add("fiordilatte");
    }
}
