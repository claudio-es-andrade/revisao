package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TemperaturaCidade {
    private int Tmin ;
    private int Tmax ;
    private List <Double> temperaturadia = new ArrayList<>();

    public List <Double> geraTemperaturas(){
        for (int i = 0; i < 180; i++) {
            double temp  = gerarnumerosAleatoriosDouble(15d, 28d);
            temperaturadia.add(temp);
            }
            return this.temperaturadia;
        }
    public double geraTempMedia(List<Double> temperaturadia){
        this.temperaturadia  =  temperaturadia;
        double somaSemestral = 0d;
        for (double temp : temperaturadia) {

            somaSemestral += temp;
        }
        double MediaSemestral = somaSemestral / temperaturadia.size();

        return MediaSemestral;
    }
    public void imprimeTemperaturasAcimaDaMedia(double MediaSemestral, List<Double> temperaturadia){

        int mesAnormal = 0;
        this.temperaturadia  =  temperaturadia;
        System.out.println(" MESES COM AS TEMPERATURAS ACIMA DA MEDIA: ");

        for (double temperaturasAcimaDaMedia : temperaturadia) {
            if (temperaturasAcimaDaMedia > MediaSemestral) {

                int mesAcimaDaMedia = temperaturadia.indexOf(temperaturasAcimaDaMedia);

                if (mesAcimaDaMedia == 0 && mesAcimaDaMedia <= 30) {
                    mesAnormal = 1;
                } else if (mesAcimaDaMedia >= 31 && mesAcimaDaMedia <= 60) {

                    mesAnormal = 2;
                } else if (mesAcimaDaMedia >= 61 && mesAcimaDaMedia <= 90) {

                    mesAnormal = 3;
                } else if (mesAcimaDaMedia >= 91 && mesAcimaDaMedia <= 120) {

                    mesAnormal = 4;
                } else if (mesAcimaDaMedia >= 121 && mesAcimaDaMedia <= 150) {

                    mesAnormal = 5;
                } else if (mesAcimaDaMedia >= 151 && mesAcimaDaMedia <= 180) {

                    mesAnormal = 6;
                }
                switch (mesAnormal) {
                    case (1):
                        System.out.println(" DIA: " + (mesAcimaDaMedia + 1) + " - JANEIRO:     " + new DecimalFormat("#,##0.00").format(temperaturasAcimaDaMedia) + " oC");
                        break;
                    case (2):
                        System.out.println(" DIA: " + (mesAcimaDaMedia + 1) + " - FEVEREIRO:    " + new DecimalFormat("#,##0.00").format(temperaturasAcimaDaMedia) + " oC");
                        break;
                    case (3):
                        System.out.println(" DIA: " + (mesAcimaDaMedia + 1) + " - MARÇO:     " + new DecimalFormat("#,##0.00").format(temperaturasAcimaDaMedia) + " oC");
                        break;
                    case (4):
                        System.out.println(" DIA: " + (mesAcimaDaMedia + 1) + " - ABRIL:     " + new DecimalFormat("#,##0.00").format(temperaturasAcimaDaMedia) + " oC");
                        break;
                    case (5):
                        System.out.println(" DIA: " + (mesAcimaDaMedia) + " - MAIO:     " + new DecimalFormat("#,##0.00").format(temperaturasAcimaDaMedia) + " oC");
                        break;
                    case (6):
                        System.out.println(" DIA: " + (mesAcimaDaMedia) + " - JUNHO:    " + new DecimalFormat("#,##0.00").format(temperaturasAcimaDaMedia) + " oC");
                        break;
                    default:
                        break;
                }

            }
        }
    }
//    public int getRandomNumberUsingNextInt(int min, int max) {
//        Random random = new Random();
//        return random.nextInt(max - min) + min;
//    }
    public double gerarnumerosAleatoriosDouble(double minimo, double maximo) {
//        double minimo = 1D;
//        double maximo = 10D;
        double generatedDouble = minimo + new Random().nextDouble() * (maximo - minimo);
        return generatedDouble;
    }
}
