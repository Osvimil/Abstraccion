
package abstraccion;


public abstract class Animal {
    private String nombre;
    
    Animal(){}
    
    public abstract void moverse();
    
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String nom){
        this.nombre=nom;
    }
    
    public void comer(){
        System.out.println("El "+nombre+" esta comiendo, que ricolino");
    }
    
   
    
    
    
}
