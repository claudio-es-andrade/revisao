package Lists;

import java.util.*;

public class Suspeitos {

    public static void main(String[] args) {

        List<String> solucaoCrime        = new ArrayList<>();
        Interrogatorio questionamentos = new Interrogatorio();

        questionamentos.entrevistasuspeito(solucaoCrime);

    }
}
