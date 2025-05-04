    public class Aplicacion{
    public static void main(String[] args){
        int num = 15;
        String texto = "hola";
        System.out.println("Es par? "+ Algoritmo.esPar(num));
        System.out.println("Es primo? "+ Algoritmo.esPrimo(num));
        System.out.println("La palabla "+ texto +" en reversa es:");
        Algoritmo.stringEnReversa(texto);
        System.out.println();
        System.out.println("Es palidromo? "+ Algoritmo.esPalidromo(texto));
        Algoritmo.SecuenciaFizzBuzz(num);
    }
    }