
package clases;

import java.util.Scanner;
/**
 *
 * @author Catherin
 */
public class PedidosPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo, tamanio;
        Tipo tipoSel;
        String tamanioSel="";
        System.out.println("PROGRAMA PARA HACER PEDIDOS DE PIZZA"
                + "\nSeleccione el tipo de Pizza:"
                + "\n1: Margarita"
                + "\n2: Cuatro Quesos"
                + "\n3: Funghi");
        tipo = sc.nextInt();
        System.out.println("Seleccione el tamaño"
                + "\n1: Mediana"
                + "\n2: Familiar");
        tamanio = sc.nextInt();
        switch(tipo){
            case 1: 
                tipoSel = Tipo.MARGARITA;
                break;
            case 2:
                tipoSel = Tipo.CUATRO_QUESOS;
                break;
            case 3: 
                tipoSel = Tipo.FUNGHI;
                break;
            default:
                System.out.println("Ingrese un numero valido");
                return;
        }
        if(tamanio==1) tamanioSel = "mediana"; 
        else if(tamanio == 2)tamanioSel = "familiar";
        else System.out.println("Ingrese un numero válido");
        
        Pizza nuevapizza = new Pizza(tipoSel, tamanioSel);
        System.out.println("Pedido realizado");
        System.out.println(nuevapizza);
    
        
        
        
        
        /*
        Pizza p1 = new Pizza(Tipo.MARGARITA, "mediana");
        Pizza p2 = new Pizza(Tipo.FUNGHI, "familiar");
        System.out.println(p1);
        System.out.println(p2);
        Pizza p3 = new Pizza(Tipo.CUATRO_QUESOS, "mediana");
        p2.sirve();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();*/
        System.out.println("servidas: " + Pizza.getTotalServidas());
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
       
    }
    
}
