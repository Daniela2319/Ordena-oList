package Activity.dio;


//Dados uma lista com seis primeiros meses do ano [Jan,Fev,Mar,Abr,Maio] faças:

import java.util.ArrayList;

import java.util.List;

public class Temperaturas {
    public static void main(String[] args) {
//Lista com seis primeiro meses do ano


        List<Mes>meses = new ArrayList<>(){{
            add(new Mes("Janeiro", 21.1,8));
            add(new Mes("Fevereiro", 24.8,7));
            add(new Mes("Marco", 23.9,9));
            add(new Mes("Abril", 20.4,5));
            add(new Mes("Maio", 19.1,9));
            add(new Mes("Junho", 17.1,10));
        }};
        System.out.println("Lista dos primeiros meses do ano:");
        System.out.println(meses);







    }
}
