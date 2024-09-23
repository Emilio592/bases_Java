package Bases; //Paquete

public class basicos { //Clase Principal
    public static void main (String [] args){ //Método Principal

        //tipo_variable nombre_variable = valor_variable;

        //tipos de datos primitivos
        String a = "Hola Mundo";
        byte by = 127; //-128 a 127
        short s = 2; //-32,768 a 32,767
        int b = -1; //-2^31 a 2^31 - 1
        long l = -12; //-2^63 a 2^63 – 1.
        float f = 1.3f; //precisión de 6-7 dígitos decimales
        double c = 1.2; //precisión de 15 dígitos decimales
        boolean d = false;
        char e = 'f';

        System.out.println(a);

        //conversiones implicitas de datos
        double b_2 = b; //de int a double
        int c_2 = (int) c; //de double a int

        //operaciones aritméticas
        int ResultadoSum = 1 + 1;
        int ResultadoRes = 1 - 1;
        int ResultadoMul = 2 * 2;
        int ResultadoDiv = 4 / 4;
        int ResultadoMod = 4 % 2;

        int x = 4;
        int y = 7;

        x++; //incremento de contador (1)
        y--; //decremento de contador (1)

        System.out.println(x);
        System.out.println(y);

        x += 5; //incremento de contador (5)
        y -= 5; //decremento de contador (5)

        System.out.println(x);
        System.out.println(y);

    }

}