/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Bryan M
 */
public class Rectangulo {
    
    private Turtle joe;
    
    public void Rectangulo(double x, double y, int a, int h){
        joe.setX(x);
        joe.setY(y);
        for(int i=0 ;i<2;i++){
            joe.right(90);
            joe.fd(a);
            joe.right(90);
            joe.fd(h);
        }
    }
}
