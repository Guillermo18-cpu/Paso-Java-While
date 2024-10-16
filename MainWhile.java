import java.util.Scanner;

public class MainWhile {

    public static void main(String[] args) {
        Scanner Wh = new Scanner(System.in); 
        int numeroEntrada=0;
        int resultado=0;
        System.out.println("Ingrese el numero que desea calcular");
        numeroEntrada = Wh.nextInt();

       
        LogicaWhile actividad1 = new LogicaWhile(numeroEntrada, resultado, resultado);
        actividad1.calcularResultado();
        Wh.close();
    }
}
