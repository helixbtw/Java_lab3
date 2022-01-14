public class Main {

    public static void main(String[] args) {

        Punkt punktA = new Punkt(7);
        punktA.toString();
        System.out.println("punktA: " + punktA);

        Punkt punkt = new Punkt(1,2,3);
        punktA.toString();
        System.out.println("punktA: " + punktA);

        punktA.setpA(10);
        punktA.setpB(20);
        punktA.setpC(30);
        punktA.toString();
        System.out.println("punktA: " + punktA);

        System.out.println("Zmienna pA: " + punktA.getpA() +
                "\nZmienna pB: " + punktA.getpB() +
                "\nZmienna pC: " + punktA.getpC());

        System.out.println("Suma wartosci dla punktu punktu A = {" + punktA.getpA() + ", " + punktA.getpB() + ", " + punktA.getpC() + "} to: " + punktA.suma());
        System.out.println("Roznica pierwszej wartosci dla punktu punktu A = {" + punktA.getpA() + ", " + punktA.getpB() + ", " + punktA.getpC() + "} to: " + punktA.roznica());
        System.out.println("Roznica drugiej wartosci dla punktu punktu A = {" + punktA.getpA() + ", " + punktA.getpB() + ", " + punktA.getpC() + "} to: " +
                punktA.roznica(punktA.getpA(), punktA.getpB(), punktA.getpC()));

    }
}
/* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
