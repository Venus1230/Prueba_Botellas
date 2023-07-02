// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        botella botella1 = new botella();
        Scanner Scanner = new Scanner(System.in);
        operaciones ingreso=new operaciones();
            System.out.println("Sistema de Embotelladora");
            System.out.println("Ingrese capacidad de botella");
            System.out.println("1.-500ml");
            System.out.println("2.-1000ml");
            System.out.println("--------------------");
            System.out.println("3.-Imprimir estudiantes");
            int cap = Scanner.nextInt();
            botella1.setCapacidad(cap);
            System.out.println("Ingrese color");
            String palabra1 = Scanner.next();
            botella1.setColor(palabra1);
            System.out.println("Ingrese Stock");
            int sto = Scanner.nextInt();
             botella1.setStock(sto);
             System.out.println("Desea añadir ingresos y egresos");
            System.out.println("1.-Si");
            System.out.println("2.-Imprimir recibo base");
            int elec= Scanner.nextInt();
            switch (elec) {
                case 1:
                    System.out.println("Registre ingresos");
                    int ingresos = Scanner.nextInt();
                    ingreso.setIngreso(ingresos);
                    System.out.println("Registre egresos");
                    int egresos = Scanner.nextInt();
                    ingreso = new operaciones(ingresos, egresos, botella1.getStock());
                    System.out.println("Botellas totales");
                    int resultado = ingreso.opera();
                    System.out.println(resultado);
                    botella1.datosb(resultado);
                    if(resultado<0){
                        System.out.println("STOCK INSUFICIENTE");
                    }
                    break;
                    case 2:
                        botella1.datos2(sto);

                    break;
                case 3:
                    System.out.println("INTEGRANTES");
                    System.out.println("Dario Manobanda");
                    System.out.println("Angie Guanoluisa");
                    System.out.println("Yahir Sacan");
                    System.out.println("Dylan Salazar");
                    System.out.println("Davis Vacacela");
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
