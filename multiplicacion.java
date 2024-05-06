public class multiplicacion {
    public static void main(String[] args) {
        int a = 10, b = 5;

        LimpiarPantalla();
        Por(a,b);
    }

    public static void Por(int a, int b){
        int c = a*b;
        System.out.println("El resultado de la multiplicación es: " + c);
    }

    public static void LimpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
