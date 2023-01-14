public class Main {
    public static void main(String[] args) {
        //Ejercicio 1 IF
        ejercicioIf(0);
        //Ejercicio 2
        ciclowhile(3);
        //Ejercicio 3
        ciclodowhile(0);
        //Ejercicio 4
        ciclofor();
        //Ejercicio 5
        cicloswitch();
    }
    //EJERCICIO 1
    public static void ejercicioIf(int numeroIf){
        if (numeroIf>0){
            System.out.println("El numero es positivo");
        } else if (numeroIf<0) {
            System.out.println("El numero es negativo");
        } else{
            System.out.println("El numero es cero");
        }

    }

    //EJERCICIO 2
        public static void ciclowhile (int numerowhile){
            while (numerowhile<3){
                System.out.println(numerowhile);
                numerowhile++;
            }
        }

        //EJERCICIO 3
    public static void ciclodowhile (int numerodowhile){
         do {
             System.out.println(numerodowhile);
             numerodowhile++;
         } while (numerodowhile<3);

    }

    //EJERCICIO 4
    public static void ciclofor(){
        for (int numerofor=0; numerofor<=3; numerofor++){
            System.out.println(numerofor);
        }
}

    public static void cicloswitch(){
        var estacion = "verano";

        switch (estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;

            case "verano":
                System.out.println("Es verano");
                break;

            case "otoño":
                System.out.println("Es otoño");
                break;

            case "invierno":
                System.out.println("Es invierno");
                break;

            default:
                System.out.println("Escribe una estacion");
        }
    }
}