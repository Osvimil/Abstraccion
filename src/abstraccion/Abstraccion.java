
package abstraccion;


public class Abstraccion {

    
    public static void main(String[] args) {
        
        Perro perro = new Perro();
        Ave ave = new Ave();
        
        perro.comer();
        perro.moverse();
        
        ave.comer();
        ave.moverse();
        
    }
    
}
