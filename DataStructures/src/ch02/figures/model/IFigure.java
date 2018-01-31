/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.figures.model;

/**
 *
 * @author barcvilla
 */
public interface IFigure 
{
    final double PI = 3.14;
    
    // retorna el perimetro de la figura
    double perimeter();
    // retorna el area de la figura
    double area();
}
