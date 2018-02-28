/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.figures.implementation;

import ch02.figures.model.IFigure;

/**
 *
 * @author barcvilla
 */
public class Circle implements IFigure
{
    protected double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double perimeter()
    {
        return(2 * PI * radius);
    }
    
    public double area()
    {
        return(PI * radius * radius);
    }
}
