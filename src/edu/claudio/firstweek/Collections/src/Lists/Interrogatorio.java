package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Interrogatorio {

    private List<String> respostas = new ArrayList<>();

    public void entrevistasuspeito(List<String> respostas){
        this.respostas = respostas;
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Início do Interrogatório: ");
        System.out.print("\nTelefonou para vítima? ");
        String suspeitoRespondeu = entrada.next();

        respostas.add(suspeitoRespondeu.toLowerCase());

        System.out.print("Esteve no local do crime? ");
        suspeitoRespondeu = entrada.next();
        respostas.add(suspeitoRespondeu.toLowerCase());

        System.out.print("Mora perto da vítima? ");
        suspeitoRespondeu = entrada.next();
        respostas.add(suspeitoRespondeu.toLowerCase());

        System.out.print("Devia para vítima? ");
        suspeitoRespondeu = entrada.next();
        respostas.add(suspeitoRespondeu.toLowerCase());

        System.out.print("Já trabalhou com a vítima? ");
        suspeitoRespondeu = entrada.next();
        respostas.add(suspeitoRespondeu.toLowerCase());

        System.out.println(respostas);
        fimDoInquerito(respostas);

    }

    public void fimDoInquerito(List<String> respostas){
        this. respostas = respostas;
        int contadorDeSims = 0;
        for (String resposta : respostas) {
            if(resposta.contains("s")){
                contadorDeSims++;
            }
        }
        switch(contadorDeSims) {
            case 2:
                System.out.println(">>>SUSPEITA<<<"); break;
            case 3:
            case 4:
                System.out.println(">>CÚMPLICE<<"); break;
            case 5:
                System.out.println(">>>>>ASSASSINO<<<<<"); break;
            default:
                System.out.println("******INOCENTE******"); break;
        }
    }
}
