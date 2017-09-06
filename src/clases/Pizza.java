
package clases;

/**
 *
 * @author Catherin
 * @version 0.1
 */
public class Pizza {
    /*Atributos de clase*/
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    
    /*
    *Tamaños posibles: = mediana / familiar
    */
    private String tamaño;
    private Tipo tipo;
    /*
    * Estado false = pedida / true = servida
    */
    private boolean estado;
    public Pizza(){
        this.estado = false;
        this.tamaño = "mediana";
        this.tipo = Tipo.MARGARITA;
        totalPedidas += 1;        
    }
    /**
     * @param tamaño String, indica el Tamaño de la Pizza
     * @param tipo Tipo, tipo de la clase Enum
     */
    public Pizza(Tipo tipo, String tamaño){
        this.estado = false;
        this.tamaño = tamaño;
        this.tipo = tipo;
        totalPedidas += 1;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        String estadoString = "";
        if(estado){
            estadoString = "servida";
        } else{
            estadoString = "pedida";
        }
        return ("pizza " + tipo + " " + tamaño + " " 
                + estadoString).toLowerCase();
    }
    /*
    * Sin parámetros, cambia el estado de la pizza si aún no 
    * fue servida
    */
    public void sirve(){
        if(estado){
            System.out.println("Esta pizza ya está servida");
        } else {
            this.setEstado(true);
            totalServidas += 1;
            totalPedidas -= 1;
        }
    }
    
    public static void pruebaGithub(){
        System.out.println("Estamos en gitHub!!");
    }
    
}
