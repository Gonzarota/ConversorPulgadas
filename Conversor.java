import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int contador=1;
        while (contador==1){
            System.out.println("Que desea convertir?");
            System.out.println("1.Pulgadas a cm");
            System.out.println("2.cm a pulgadas");
            int value = input.nextInt();

            if (value == 1 || value == 2) {

                if (value==1) {
                    System.out.println("Intruduce una medida en centimetros");
                    double centimetros = input.nextDouble();
                    double pulgadas = 0.393701 * centimetros;
                    System.out.println("La conversión de " + centimetros + " centimetros son " + pulgadas + " pulgadas");
                } else {
                    System.out.println("Intruduce una medida en pulgadas");
                    int pulgadas = input.nextInt();
                    double cm = 2.54 * pulgadas;
                    System.out.println("La conversión de " + pulgadas + " pulgadas son " + cm + "cm");
                }
                contador++;
            } else {
                System.out.println("número incorrecto");
            }
        }
    }
}

