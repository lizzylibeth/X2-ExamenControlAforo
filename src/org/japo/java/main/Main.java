/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Constantes
        final int AFORO_MIN = 0;
        final int AFORO_MAX = 1234;

        //Variables
        int dia = 1;
        int personas;

        String diaSemana = "Lunes";
        int cuenta = 0;
        int aforoMedio;

        int mayor = 0;
        int menor = AFORO_MAX;

        double porcentajeMayor;
        double porcentajeMenor;

        int diaMayor = 0;
        int diaMenor = 7;

        String diaSemanaMayor = "Lunes";
        String diaSemanaMenor = "Lunes";

        //Cabecera
        System.out.println("CINES DEL CENTRO COMERCIAL XeKeBó – CONTROL DE AFORO ");
        System.out.println("==================================================== ");

        //Bucle
        for (int i = 0; i < 7; i++) {

            switch (dia) {
                case 1:
                    diaSemana = "Lunes     ";
                    break;
                case 2:
                    diaSemana = "Martes    ";
                    break;
                case 3:
                    diaSemana = "Miércoles ";
                    break;
                case 4:
                    diaSemana = "Jueves    ";
                    break;
                case 5:
                    diaSemana = "Viernes   ";
                    break;
                case 6:
                    diaSemana = "Sábado    ";
                    break;
                case 7:
                    diaSemana = "Domingo   ";
                    break;
            }

            //Cálculo personas aleatorias
            personas = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;

            //Día de mayor aforo y la cantidad
            if (personas > mayor) {
                mayor = personas;
                diaMayor = dia;

            } else if (personas < menor) {
                menor = personas;
                diaMenor = dia;
            }

            //Mensaje del bucle, personas aleatorias cada dia
            System.out.printf("%s- Aforo ....:  %4d personas %n", diaSemana, personas);
            dia++;
            cuenta = cuenta + personas;
        }

        //Separador
        System.out.println("---");

        //Aforo Semanal
        System.out.printf("Aforo semanal ........: %5d personas %n", cuenta);

        //Cálculo Aforo Medio y porcentaje de Aforo Medio
        aforoMedio = cuenta / 2;
        double porcentajeMedio = ((double) aforoMedio / (double) AFORO_MAX) * 100;

        System.out.printf(Locale.ENGLISH, "Aforo medio diario ...: %5d personas "
                + "(%.2f%%)%n", aforoMedio, porcentajeMedio);

        //Separador
        System.out.println("---");

        //Cálculo de los porcentajes (Mayor y Menor aforo)
        porcentajeMayor = ((double) mayor / (double) AFORO_MAX) * 100;
        porcentajeMenor = ((double) menor / (double) AFORO_MAX) * 100;

        switch (diaMayor) {
            case 1:
                diaSemanaMayor = "Lunes     ";
                break;
            case 2:
                diaSemanaMayor = "Martes    ";
                break;
            case 3:
                diaSemanaMayor = "Miércoles ";
                break;
            case 4:
                diaSemanaMayor = "Jueves    ";
                break;
            case 5:
                diaSemanaMayor = "Viernes   ";
                break;
            case 6:
                diaSemanaMayor = "Sábado    ";
                break;
            case 7:
                diaSemanaMayor = "Domingo   ";

                break;
        }
        switch (diaMenor) {
            case 1:
                diaSemanaMenor = "Lunes     ";
                break;
            case 2:
                diaSemanaMenor = "Martes    ";
                break;
            case 3:
                diaSemanaMenor = "Miércoles ";
                break;
            case 4:
                diaSemanaMenor = "Jueves    ";
                break;
            case 5:
                diaSemanaMenor = "Viernes   ";
                break;
            case 6:
                diaSemanaMenor = "Sábado    ";
                break;
            case 7:
                diaSemanaMenor = "Domingo   ";
                break;
        }

        //DIAS DE AFORO MÁXIMO Y MÍNIMO
        System.out.printf(Locale.ENGLISH, "Día de máximo aforo ..: %5d personas "
                + "(%5.2f%%) - %2s %n", mayor, porcentajeMayor, diaSemanaMayor);

        System.out.printf(Locale.ENGLISH, "Día de mínimo aforo ..: %5d personas "
                + "(%5.2f%%) - %2s %n", menor, porcentajeMenor, diaSemanaMenor);

    }//main

}//class
