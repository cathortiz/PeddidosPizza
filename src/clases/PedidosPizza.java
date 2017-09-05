
package clases;

/**
 *
 * @author Catherin
 */
public class PedidosPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza p1 = new Pizza(Tipo.MARGARITA, "mediana");
        Pizza p2 = new Pizza(Tipo.FUNGHI, "familiar");
        System.out.println(p1);
        System.out.println(p2);
        Pizza p3 = new Pizza(Tipo.CUATRO_QUESOS, "mediana");
        p2.sirve();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("servidas: " + Pizza.getTotalServidas());
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
    }
    
}