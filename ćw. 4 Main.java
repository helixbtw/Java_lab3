/* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Student student = new Student("Agata", WydzialEnum.Handlowy);
        Student student1 = new Student("Paweł",WydzialEnum.Matematyki);
        Student student2 = new Student("Krzysztof",WydzialEnum.Filologii);
        Student student3 = new Student("Wiesław",WydzialEnum.Mechatroniczny);
        Student student4 = new Student("Adam",WydzialEnum.Elektroniczny);

        Osoba osoba = new Osoba("Agata","Gradtke",66397);



        List<Student> Studenci = new ArrayList<>();
        Studenci.add(student);
        Studenci.add(student1);

        for (Student s : Studenci) {
            System.out.println(s);
        }
    }
}
