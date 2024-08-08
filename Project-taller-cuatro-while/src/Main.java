// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Realizar la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10.

        int contador= 1;
        int suma=0;

        while (contador <=10) {
            suma= suma + contador;
            contador ++;
            System.out.println("Suma = " + suma);
        }
    }
}