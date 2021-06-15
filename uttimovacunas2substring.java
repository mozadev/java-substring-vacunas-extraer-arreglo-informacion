package prueba;

import java.util.Scanner;

public class PaquetesVacunas {
    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);
        String[] codigos = {"PER01251150082021", "ARG16729078072021",
                "BRA89023090122021", "ARG10020130092021",
                "MEX12046785062021", "PER46013090062021",
                "URU05608070072021"
        };
        System.out.println("ingrese el mes");
        int mes = lee.nextInt();
        paquetesVacunasEnviados(mes, codigos);
        CodigolaboratoriomenosVacunas(mes,codigos);
        paquetesMas5000vacunas( mes, codigos);


//        String cadena = "URU05608070072021";
//        System.out.println(cadena.substring(11, 13));

    }

    public static void paquetesVacunasEnviados(int mes, String[] codigos) {
        int contador = 0;
        int sumalab1 = 0;
        int sumalab2 = 0;
        int sumalab3 = 0;
        String menor="";

        for (int i = 0; i < codigos.length; i++) {
            int mesCodigo = Integer.parseInt(codigos[i].substring(11, 13));
            if (mes == mesCodigo) {
                sumalab1 = sumalab1 + Integer.parseInt(codigos[i].substring(3, 6));
                sumalab2 = sumalab2 + Integer.parseInt(codigos[i].substring(6, 9));
                sumalab3 = sumalab3 + Integer.parseInt(codigos[i].substring(9, 11));
                           }
        }
        if(sumalab1<sumalab2 && sumalab1<sumalab3)
            menor="lab1";
        if(sumalab2<sumalab3 && sumalab2<sumalab1)
            menor="lab2";
        if(sumalab3<sumalab1 && sumalab3<sumalab2)
            menor="lab3";
        System.out.println("el laboratorio con menor envio es: " + menor);

    }

    public static void CodigolaboratoriomenosVacunas(int mes, String[] codigos) {
        int contador = 0;
        for (int i = 0; i < codigos.length; i++) {
            int mesCodigo = Integer.parseInt(codigos[i].substring(11, 13));
            if (mes == mesCodigo) {
                contador++;
            }
        }
        System.out.println("el numero de paquetes enviados sera : " + contador);

    }


    public static void paquetesMas5000vacunas(int mes, String[] codigos) {
        int contador = 0;
        int sumalab1 = 0;
        int sumalab2 = 0;
        int sumalab3 = 0;
        String menor="";


        for (int i = 0; i < codigos.length; i++) {
            int sumatotal=0;
            int mesCodigo = Integer.parseInt(codigos[i].substring(11, 13));
            if (mes == mesCodigo) {
                sumalab1 = sumalab1 + Integer.parseInt(codigos[i].substring(3, 6));
                sumalab2 = sumalab2 + Integer.parseInt(codigos[i].substring(6, 9));
                sumalab3 = sumalab3 + Integer.parseInt(codigos[i].substring(9, 11));
            }
            sumatotal=sumalab1+sumalab2+sumalab3;
            if (sumatotal>500){
                contador++;
            }
        }


        System.out.println("el cantidad de paquetes con mas de 500  " + contador);


    }

}


