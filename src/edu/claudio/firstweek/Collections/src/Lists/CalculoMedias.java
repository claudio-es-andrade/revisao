package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CalculoMedias {

    public static void main(String[] args) {

        List<Double> temperaturas = new ArrayList<>();
        double mediaSemestral = 0d;
        int mesAnormal = 0;

        TemperaturaCidade temperaturaCidade = new TemperaturaCidade();
        temperaturas = temperaturaCidade.geraTemperaturas();
        mediaSemestral = temperaturaCidade.geraTempMedia( temperaturas);
        temperaturaCidade.imprimeTemperaturasAcimaDaMedia(mediaSemestral , temperaturas);

    }

}
