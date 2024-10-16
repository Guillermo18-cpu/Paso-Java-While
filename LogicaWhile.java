public class LogicaWhile {

    int numeroEntrada=0;
    int resultado=0;
    int control=0;

    public LogicaWhile(int numeroEntrada, int resultado, int control) {
        this.numeroEntrada = numeroEntrada;
        this.resultado = resultado;
        this.control = control;
    }


    public void calcularResultado(){ 

        while (numeroEntrada>=control) { 
            resultado=resultado+control;
            control=control+1;
        }
        System.out.println("La suma de los primeros " +numeroEntrada+ " naturales es igual a " +resultado);

     }    
 
}