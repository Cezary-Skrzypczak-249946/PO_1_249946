package com.skrzypczak.firstapp;

import java.util.ArrayList;

public class Firma {
    ArrayList<Pracownik> listaPracownikow= new ArrayList<>();

    public void dodajPracownika(Pracownik p)
    {
        listaPracownikow.add(p);
    }
    public void wyswietlPracownikow()
    {
        for(int i =0;i<listaPracownikow.size();i++)
        {
            System.out.println(i+1+". "+listaPracownikow.get(i).imie +" "+ listaPracownikow.get(i).nazwisko +" wiek: "+listaPracownikow.get(i).wiek );
        }
    }

}
