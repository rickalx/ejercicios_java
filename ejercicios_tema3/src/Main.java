
public class Main {
    public static void main(String[] args) {
        System.out.println("La suma es: " + suma(1,2,3));

        Coche miCoche = new Coche();
        miCoche.incrementar_puertas();
        miCoche.incrementar_puertas();
        miCoche.incrementar_puertas();
        miCoche.incrementar_puertas();
        System.out.println("El numero de puertas es: "+miCoche.numero_puertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}