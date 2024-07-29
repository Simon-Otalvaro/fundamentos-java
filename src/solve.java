import java.util.Scanner;

public class solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ejercicio 1: ¿Cuál será el resultado de la operación?");
            System.out.println("2. Ejercicio 2: Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?");
            System.out.println("3. Ejercicio 3: Valor a imprimir.");
            System.out.println("4. Ejercicio 4: Código escrito.");
            System.out.println("5. Ejercicio 5: Resultado.");
            System.out.println("6. Ejercicio 6: Convierte el número 65 a un char. ¿Qué carácter obtienes?");
            System.out.println("7. Ejercicio 7: ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?");
            System.out.println("8. Ejercicio 8: Escribe código para convertir un float a un String.");
            System.out.println("9. Ejercicio 9: ¿Cuál es el resultado de (int) Math.round(3.7)?");
            System.out.println("10. Ejercicio 10: Dado byte b = 50;, ¿Cómo lo convertirías a short?");
            System.out.println("0. Salir");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                    //Operadores de Asignación
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
                    break;
                case 15:
                    ejercicio15();
                    break;
                //Operadores de Decremento
                case 16:
                    ejercicio16();
                    break;
                case 17:
                    ejercicio17();
                    break;
                case 18:
                    ejercicio18();
                    break;
                case 19:
                    ejercicio19();
                    break;
                case 20:
                    ejercicio20();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void ejercicio1() {
        int x = (int) 5.89 + (int) 3.45;
        System.out.println("El resultado de la operación es: " + x);
    }

    public static void ejercicio2() {
        char c = 'A';
        int asciiValue = (int) c;
        System.out.println("El valor ASCII de '" + c + "' es: " + asciiValue);
    }

    public static void ejercicio3() {
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println("El valor que se imprime es:" +i);
    }

    public static void ejercicio4() {
        String numeroCadena = "12345";
        // Convertir el String a int
        try {
            int numeroEntero = Integer.parseInt(numeroCadena);
            System.out.println("El número convertido es: " + numeroEntero);
        } catch (NumberFormatException e) {
            System.err.println("La cadena no contiene un número válido.");
        }
    }

    public static void ejercicio5() {
        int resultado = (int) (char) (byte) -1;
        System.out.println("El resultado es: " + resultado);
    }

    public static void ejercicio6(){
        int numero = 65;
        char caracter = (char) numero;
        System.out.println("El carácter es: " + caracter);
    }

    public static  void ejercicio7(){
        long numeroLong = 2147483648L;
        int numeroInt = (int) numeroLong;
        System.out.println("El número es: " + numeroInt);
    }

    public static void ejercicio8 (){
        float numeroFloat = 3.14159f;
        String cadena1 = String.valueOf(numeroFloat);
        System.out.println("Usando String.valueOf: " + cadena1);
    }

    public static void ejercicio9 (){
        double numero = 3.7;
        int resultado = (int) Math.round(numero);
        System.out.println("El resultado es: " + resultado);
    }

    public  static void ejercicio10(){
        byte b = 50;
        short s = b;
        System.out.println("El valor de short es: " + s);
    }

    // Funciones sección OPERADORES DE ASIGNACIÓN

    public static void ejercicio11() {
        int x = 10;
        x += 5;
        System.out.println("El valor de x es: " + x); // Debería imprimir 15
    }

    public static void ejercicio12(){
        int x = 3;
        int y = 2;
        System.out.println("Resultado con la expresión simplificada: " + y);
    }

    public static void ejercicio13(){
        int a = 15;
        a %= 4;
        System.out.println("El valor de a es: " + a);
    }

    public static void ejercicio14(){
        int x = 10;
        int y = 5;
        x = x + y;
        System.out.println("Resultado: " + x);
    }

    public static void ejercicio15(){
        int x = 5;
        x ^= 2;
        System.out.println("El valor de x es: " + x); // Debería imprimir 7
    }

    // Funciones sección OPERADORES DE INCREMENTO O DECREMENTO

    public static void ejercicio16() {
        int x = 5;
        int y = ++x;System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
    }
    public static void ejercicio17(){
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
    }

    public static void ejercicio18(){
        int count = 10; // count
        --count;
        System.out.println("El valor de count después de pre-decremento es: " + count); // Debería imprimir 9
    }

    public static void ejercicio19(){
        int i = 5;
        int result = ++i;
        System.out.println("result: " + result);
    }

    public static void ejercicio20(){
        int x = 3;
        x = x++;
        System.out.println("El valor de x es: " + x);
    }
    static int EjerciciosCombinados1(){
        int i = 5;
        i += ++i + i++ + ++i;
        return i;
    }
    static int EjerciciosCombinados2( double doubleVar){
        int num = (int) doubleVar;
        return num++;

    }
    static double EjerciciosCombinados3(){
        double d = 5.7;
        int i = (int)d;
        i = 2;
        System.out.println("esto imprime i con i-- en consola" +i--);
        System.out.println("esto  valia i");
        return d;
    }
    static double EjerciciosCombinados4(){

        double result = 0.0;
        int intVar = 10;

        result += (double) intVar / 2.0;
        return  result ;
    }
    static char EjerciciosCombinados5(){
        char c = 'X';
        c += 32;
        System.out.println(c);
        return c;
    }
    static short EjerciciosCombinados6(){
        long longVar = 100L;
        short shortVar = (short) longVar;
        shortVar= 3;
        return  shortVar;
    }
    static int EjerciciosCombinados7(){
        int x = 10;
        x += (x++) + (++x);
        return x;
    }
    static byte EjerciciosCombinados8( float floatVar){
        byte result = (byte) floatVar;
        return --result;
    }
    static byte EjerciciosCombinados9(){
        int i = 257;
        byte b = (byte)i;
        System.out.println("i a pasar a byte es : ");
        return b;
    }
    static int EjerciciosCombinados10(double doubleVar){
        int num = (int) doubleVar;
        num += 5;
        num++;
        return num;
    }

}



