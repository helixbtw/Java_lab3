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

public class Punkt {

    private int pA, pB, pC;

    Punkt(int pX) {
        this.pA = pX;
    }

    Punkt(int pX, int pY, int pZ) {
        this.pA = pX;
        this.pB = pY;
        this.pC = pZ;
    }

    public int getpZ()
    {
        return pC * 10;
    }

    public int getpX()
    {
        return pA;
    }

    public int getpY()
    {
        return pB;
    }

    public void setpX(int pX)
    {
        this.pA = pX;
    }

    public void setpY(int pY)
    {
        this.pB = pY;
    }

    public void setpZ(int pZ)
    {
        this.pC = pZ;
    }

    public int suma()
    {
        return pA + pB + getpZ();
    }

    public int roznica()
    {
        return pA - pB - getpZ();
    }

    public int roznica(int x, int y, int z)
    {
        return pA * x - pB * y - getpZ() * z;
    }
    @Override
    public String toString()
    {
        return "Punkt = {" + "x = " + pA + ", y = " + pB + ", z = " + getpZ() + "}";
    }
}
