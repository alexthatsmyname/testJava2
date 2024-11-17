package problema_test;

import java.time.LocalDate;
import java.time.Period;

public class Vapor {
    private String nume;
    private int numarEchipaj;
    private LocalDate dataLansare;
    private VitezaDeplasare vitezaDeplasare;

    public Vapor() {}

    public Vapor(String nume, int numarEchipaj, LocalDate dataLansare, VitezaDeplasare vitezaDeplasare) {
        this.nume = nume;
        this.numarEchipaj = numarEchipaj;
        this.dataLansare = dataLansare;
        this.vitezaDeplasare = vitezaDeplasare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarEchipaj() {
        return numarEchipaj;
    }

    public void setNumarEchipaj(int numarEchipaj) {
        this.numarEchipaj = numarEchipaj;
    }

    public LocalDate getDataLansare() {
        return dataLansare;
    }

    public void setDataLansare(LocalDate dataLansare) {
        this.dataLansare = dataLansare;
    }

    public VitezaDeplasare getVitezaDeplasare() {
        return vitezaDeplasare;
    }

    public void setVitezaDeplasare(VitezaDeplasare vitezaDeplasare) {
        this.vitezaDeplasare = vitezaDeplasare;
    }

    @Override
    public String toString() {
        return "Vapor{" +
                "nume='" + nume + '\'' +
                ", numarEchipaj=" + numarEchipaj +
                ", dataLansare=" + dataLansare +
                ", vitezaDeplasare=" + vitezaDeplasare +
                '}';
    }

    public int aniTrecutiDeLaLansare() {
        LocalDate dataCurenta = LocalDate.now();
        Period perioadaTrecuta = Period.between(dataLansare, dataCurenta);
        return perioadaTrecuta.getYears();
    }
}
