/* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */



import java.util.Scanner;

public class Student {
    String nazwisko;
    String imie;
    int index;
    boolean absolwent;



    public Student() {
    }

    public Student(String imie, String nazwisko, int index, boolean absolwent) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.index = index;
        this.absolwent = absolwent;
    }
}
