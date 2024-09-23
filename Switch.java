package Bases;

public class Switch {
   public static void main (String [] args){
        int habilidad = 3;
        switch (habilidad) {
            case 1:
                System.out.println("opción 1");
                break;
            case 2:
                System.out.println("opción 2");
                break;
            case 3:
                System.out.println("opción 3");
                break;
            default:
                System.out.println("Ninguna opción se cumplió");
        }
    }
}
