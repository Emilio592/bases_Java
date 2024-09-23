package Bases;

public class condiciones {
    public static void main (String [] args) {
        int x = 1, y = 2;
        //1
        if(x > y){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        int a = 1, b = 3, c = 5, d = 1;
        //2
        if(a > b || c > b){                     //operador lógico || (OR)
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        //3
        if(a == 1 && c == 7){                     //operador lógico && (AND)
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        //4
        if((a + b) != (b + c)){                     //operador lógico != (NOT)
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        boolean resultado = true;

        System.out.println("Resp.Invertida: "+!resultado);

        //Condiciones Concatenadas
        if (a == b){
            System.out.println("Bloque 1");
        } else if (a == c){
            System.out.println("Bloque 2");
        } else if (a == d){
            System.out.println("Bloque 3");
        } else {
            System.out.println("No hay similitudes");
        }
    }
}

