package problema_test;

import java.time.LocalDate;

public class VasMarfa extends Vapor {
    private int numarContainere;

    public VasMarfa() {}

    public VasMarfa(String nume, int numarEchipaj, LocalDate dataLansare, VitezaDeplasare vitezaDeplasare, int numarContainere) {
        super(nume, numarEchipaj, dataLansare, vitezaDeplasare);
        this.numarContainere = numarContainere;
    }

    public int getNumarContainere() {
        return numarContainere;
    }

    public void setNumarContainere(int numarContainere) {
        this.numarContainere = numarContainere;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numarContainere=" + numarContainere +
                '}';
    }
}
