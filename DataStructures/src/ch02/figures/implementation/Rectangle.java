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
public class Rectangle implements IFigure
{
    protected double length, width;
    
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    public double perimeter()
    {
        return(2 * (length + width));
    }
    
    public double area()
    {
        return(length * width);
    }
}
