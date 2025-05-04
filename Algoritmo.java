public class Algoritmo{
        //ES PAR metodo estatico
        public static boolean esPar(int num){
            return num % 2 == 0;
        }

        //ES PRIMO metodo estatico
        public static boolean esPrimo(int num){
            return num % 2 == 1;
        }
    //EN REVERSA metodo estatico
    public static void stringEnReversa(String texto){
        char[] letras = texto.toCharArray();
        for(int i=letras.length-1; i>=0;i--){

        System.out.print(letras[i]);
        }
    }
    // ES PALIDROMO metodo estaticp
    public static boolean esPalidromo(String texto){
        char[] letras = texto.toCharArray();
        String reversa = "";
        for(int i=letras.length-1; i>=0;i--){
        reversa+=letras[i];
        }
        return texto.equals(reversa);
    }

    // SecuenciaFizzBuzz
    public static void SecuenciaFizzBuzz(int num){
        for(int i = 1;i <= num;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz, ");
            }
            else if(i % 5 == 0){
                System.out.print("Buzz, ");
            }
            else if(i % 3 == 0){
            System.out.print("Fizz, ");
            }
            else{
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args){
        int num = 15;
        String texto = "hola";
        stringEnReversa(texto);
        System.out.println();
        System.out.println("Es palidromo? "+ esPalidromo(texto));
        System.out.println("Es par? "+ esPar(num));
        System.out.println("Es primo? "+esPrimo(num));
        SecuenciaFizzBuzz(num);
    }


}