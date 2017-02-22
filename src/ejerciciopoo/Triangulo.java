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
public class Triangulo {
    private Turtle joe;
    
    public void Triangulo(double x, double y,int a){
        joe.setX(x);
        joe.setY(y);
        //triangle
            joe.right(30);
            joe.fd(a);
            joe.right(120);
            joe.fd(a);
            joe.right(120);
            joe.fd(a);
    }
}
