package com.example.android.logo.modello;

public class Utente {
    private String username,password;

    private String preferredIceCream;

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) throw new IllegalArgumentException();

        if(! (obj instanceof Utente)) return false;

        Utente tmp = (Utente) obj;
        if(tmp.username.equals(username) && tmp.password.equals(password))
            return true;
        return false;
    }
}