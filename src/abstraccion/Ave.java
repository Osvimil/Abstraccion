/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author oswaldosaldivar
 */
public class Ave extends Animal{
    
    Ave(){
    super();
    setNombre("AVE");
    }

    @Override
    public void moverse() {
        System.out.println("El ave vuela paps");

    }
    
    
}
