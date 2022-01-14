/* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */


import java.util.Scanner;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Student student1 = new Student("Krystian", "Beeger", 29443, false);
        Student student2 = new Student("Michał", "Malinowski", 22776, false);
        Student student3 = new Student("Amelia","Mielewczyk",18996, true);

        Student[] studenci = {student1, student2, student3};

        for (Student student : studenci) {
            String absolwent;
            if (student.absolwent == true) {
                absolwent = "Student aktywny";
            }
            else {
                absolwent = "Student nieaktywny";
            }
            System.out.println(student.imie + " " + student.nazwisko + " | index " + student.index + " | " + absolwent);

        }
    }
}
