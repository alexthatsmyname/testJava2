package problema_test;

import java.time.LocalDate;

public class VasCroaziera extends Vapor {
    private int numarPiscine;
    private int numarRestaurante;

    public VasCroaziera() {}

    public VasCroaziera(String nume, int numarEchipaj, LocalDate dataLansare, VitezaDeplasare vitezaDeplasare, int numarPiscine, int numarRestaurante) {
        super(nume, numarEchipaj, dataLansare, vitezaDeplasare);
        this.numarPiscine = numarPiscine;
        this.numarRestaurante = numarRestaurante;
    }

    public int getNumarPiscine() {
        return numarPiscine;
    }

    public void setNumarPiscine(int numarPiscine) {
        this.numarPiscine = numarPiscine;
    }

    public int getNumarRestaurante() {
        return numarRestaurante;
    }

    public void setNumarRestaurante(int numarRestaurante) {
        this.numarRestaurante = numarRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numarPiscine=" + numarPiscine +
                ", numarRestaurante=" + numarRestaurante +
                '}';
    }
}
