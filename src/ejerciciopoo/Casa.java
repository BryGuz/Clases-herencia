/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;

/**
 *
 * @author Bryan M
 */
public class  Casa {
    
    private Triangulo techo;
    private Rectangulo base;
    private Rectangulo puerta;
    private Poligono ventana;
    private Tortuga joe;
    
    public void dibujar(){
        
        this.joe.Tortuga();
        this.techo.Triangulo(100,-100,50);
        this.base.Rectangulo(-50, -50, 50, 50);
        this.puerta.Rectangulo(50, 50, 30, 20);
        this.ventana.Poligono(100,100, 60);
        
        
    }
}
