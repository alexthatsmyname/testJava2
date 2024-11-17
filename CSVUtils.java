package problema_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {
    public static List<Vapor> citesteVapoareDinCSV(String filePath) {
        List<Vapor> vapoare = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            while((line = br.readLine()) != null) {
                String[] split = line.split(",");
                String nume = split[0];
                int numarEchipaj = Integer.parseInt(split[1]);
                LocalDate dataLansare = LocalDate.parse(split[2]);
                VitezaDeplasare vitezaDeplasare = VitezaDeplasare.valueOf(split[3]);
                if(split.length > 5) {
                    int numarPiscine = Integer.parseInt(split[4]);
                    int numarRestaurante = Integer.parseInt(split[5]);
                    vapoare.add(new VasCroaziera(nume, numarEchipaj, dataLansare, vitezaDeplasare, numarPiscine, numarRestaurante));
                } else {
                    int numarContainere = Integer.parseInt(split[4]);
                    vapoare.add(new VasMarfa(nume, numarEchipaj, dataLansare, vitezaDeplasare, numarContainere));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vapoare;
    }
}
