import java.util.Scanner;

public class Main {
    public static double IVA=16;
    public static double UMBRAL_DESCUENTO=1000;
    public static double DESCUENTO=.10;

    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Buenas Practicas de Estructura");
        Scanner sc = new Scanner(System.in);
        double subtotal= obtenerdouble(sc,"Dame el subtotal");
        double total = calcularTotal(subtotal);
        System.out.println("Total: " + total);
        }
    public static double obtenerdouble(Scanner sc , String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }
    public static double calcularTotal(double subtotal){
        double totalConIva=subtotal+(subtotal*IVA);
        return calcularDescuento(totalConIva);
    }
    public static double calcularDescuento(double total){
        if (total>UMBRAL_DESCUENTO) {
            total = total - (total * DESCUENTO);  }
        return total;
    }
}
