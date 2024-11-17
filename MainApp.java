package problema_test;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainApp {

    public static void afisareVapoare(List<Vapor> vapoare) {
        for (Vapor vapor : vapoare) {
            System.out.println(vapor);
        }
    }

    public static void afisareDetaliiVapoareCroaziera(List<Vapor> vapoare, int numarPiscineCautate, int numarAni) {
        List<Vapor> vapoareFiltrare = vapoare.stream().filter(vapor -> vapor instanceof VasCroaziera).
                filter(vapor -> ((VasCroaziera) vapor).getNumarPiscine() > numarPiscineCautate).
                filter(vapor -> vapor.aniTrecutiDeLaLansare() == numarAni).
                filter(vapor -> vapor.getVitezaDeplasare() == VitezaDeplasare.MARE).
                collect(Collectors.toList());
        afisareVapoare(vapoareFiltrare);
    }

    public static void afisareDenumiriVaseMarfaDescrescator(List<Vapor> vapoare) {
        vapoare.stream().filter(vapor -> vapor instanceof VasMarfa)
                .sorted((v1, v2) -> Integer.compare(((VasMarfa) v2).getNumarContainere(), ((VasMarfa) v1).getNumarContainere()))
                .forEach(vapor -> System.out.println((vapor.getNume())));
    }



    public static void main(String[] args) {
        List<Vapor> vapoare = CSVUtils.citesteVapoareDinCSV("src/main/resources/vapoare.csv");
        Scanner scanner = new Scanner(System.in);
        int option;
        while(true) {
            System.out.println("0. Iesire");
            System.out.println("1. Afisare vapoare");
            System.out.println("2. Afisare vase croaziera nr piscine lansare apa si viteza mare");
            System.out.println("3. Afisare denumire vase transport marfa descrescator dupa nr containere");
            System.out.println("Introduceti optiunea: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch(option) {
                case 0:
                    System.out.println("Iesire...");
                    return;
                case 1:
                    afisareVapoare(vapoare);
                    break;
                case 2:
                    int numarPiscineCautate;
                    int numarAni;
                    System.out.println("Introduceti numarul piscinelor: ");
                    numarPiscineCautate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduceti numarul ani: ");
                    numarAni = scanner.nextInt();
                    scanner.nextLine();
                    afisareDetaliiVapoareCroaziera(vapoare, numarPiscineCautate, numarAni);
                    break;
                case 3:
                    afisareDenumiriVaseMarfaDescrescator(vapoare);
                    break;
            }
        }
    }
}
