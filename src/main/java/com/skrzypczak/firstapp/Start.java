package com.skrzypczak.firstapp;

import java.util.Scanner;
import java.lang.String;

public class Start {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);

        //Zadanie 1.
        double first,second;

        System.out.println("Podaj dwie wartości temperatury aby dowiedzieć się czy jedna z nich jest mniejsza niż 100");
        System.out.print("Pierwsza: ");
        first=Read.nextDouble();
        System.out.print("Druga: ");
        second=Read.nextDouble();

        if((first<100 && second>100) || (first>100 && second<100))
        {
            System.out.println("Potwierdzam że jedna z liczb jest mniejsza a druga większa niż 100.");
        }else if(first==100 || second==100)
        {
            System.out.println("Polecenie nie przewidzało przypadku gdy jedna z liczb == 100");
        }else
            {
                System.out.println("Niestety, obie liczby są większe lub mniejsze od 100.");
            }

        //Zadanie 2.

        System.out.println("Podaj liczbę elementów tablicy a ja sprawdzę czy jest tam sekwencja 1,2,3 [minimum 3 elementy]");
        int size;
        do {
            System.out.print("Rozmiar tablicy: ");
            size=Read.nextInt();
        }while (size<3);
        int tab[]= new int[size];

        for (int i =0;i<tab.length;i++)
        {
            System.out.print("Element "+i+". =");
            tab[i]=Read.nextInt();
        }

        for (int i =0;i<tab.length;i++)
        {
            if(i+2< tab.length &&tab[i]==1 &&tab[i+1]==2 &&tab[i+2]==3 )
            {
                System.out.println("W twojej tablicy wystąpił podciąg 1,2,3");
                break;
            }
            if (i-1== tab.length)
            {
                System.out.println("W twojej tablicy nie wystąpił podciąg 1,2,3");
            }

        }
//Zadanie 3
        System.out.println("A teraz tworzymy trójkąt. Podaj trzy boki trójkąta. ");
        System.out.println("Wszystkie wartości muszą być większe od zera. ");
        int a,b,c;
        do {
            System.out.print("a = ");
            a=Read.nextInt();
            System.out.print("b = ");
            b=Read.nextInt();
            System.out.print("c = ");
            c=Read.nextInt();
        }while (!(a>0 && b>0 && c>0));
        int a2,b2,c2;
        if((a>=b) && (a>=c))
        {
            a2=a;
            b2=b;
            c2=c;
        }else if((c>=b) && (c>=a))
        {
            a2=c;
            b2=b;
            c2=a;
        }else
            {
                a2=b;
                b2=a;
                c2=c;
            }
        if(a2*a2==b2*b2 + c2*c2)
        {
            System.out.println("Tak, to są dobre odcinki które stworzą dobry trójkąt prostokątny.");
        }else
        {
            System.out.println("Z tych odcinków nie wyjdzie trójkąt prostokątny");
        }
//Zadanie 4
        int liczaWierszy;
        System.out.print("Podaj liczbe wierszy:");
        liczaWierszy= Read.nextInt();


        for(int i =0;i<liczaWierszy;i++)
        {
            for (int j=0;j<=i;j++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }

        //zadanie 5

        System.out.println("Podaj mi jakiś tekst a ja oddam tylko połowę.");
        System.out.print("Tekst: ");
        Read= new Scanner(System.in);
        //Read.nextInt();   //wczytuje pozostałości w buforze https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        String text;
        text = Read.nextLine();


        for (int i =0;i<(text.length()/2);i++)
        {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        //zadanie 6
        System.out.println("Podaj liczbę elementów tablicy(wiecej niż 0).");
        do {
            System.out.print("Rozmiar tablicy: ");
            size=Read.nextInt();
        }while (size<=0);
        tab= new int[size];

        for (int i =0;i<tab.length;i++)
        {
            System.out.print("Element "+i+". =");
            tab[i]=Read.nextInt();
        }

        int tab2[]=new int[size];
        for (int i =0;i< tab.length;i++)
        {
            tab2[i]=tab[tab.length-1-i];
        }
        System.out.println("Oto twoja tablica wspak:");
        System.out.print("[");
        for (int i =0;i< tab.length;i++)
        {
            System.out.print(tab2[i]);
            if(i!= tab.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");

        //zadanie 7

        Firma firma = new Firma();
        firma.dodajPracownika(new Pracownik("Adam","Kowalski",22));
        firma.dodajPracownika(new Pracownik("Ania","Nowak",23));
        firma.wyswietlPracownikow();
    }
}
