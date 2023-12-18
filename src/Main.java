import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sueldo = 0;
        int categoria;

        System.out.println("Ingrese el tipo de categoria de la que desea calcular el sueldo");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();

        if (categoria == 1) {
            sueldo = 15890 + (15890 * 10) / 100;
        }
        else if (categoria == 2){
            sueldo = 25630.89;
        }
        else if (categoria == 3){
            sueldo = 35560.20 - (35560.20*0.11);
        }
        else {
            System.out.println("No hay una categoría asociada al número que ingresaste. \nPor favor ingresa un número de cagoría válido, el cual puede ser:1 \n2 \n3");
        }
        if(sueldo != 0) {
            System.out.println("El sueldo es " + sueldo);
        }
        else{
            System.out.println("");
        }

    }
}