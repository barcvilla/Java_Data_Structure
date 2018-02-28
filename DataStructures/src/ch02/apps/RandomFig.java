/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.apps;

import ch02.figures.implementation.Circle;
import ch02.figures.implementation.Rectangle;
import ch02.figures.model.IFigure;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author barcvilla
 */
public class RandomFig 
{
    public static void main(String[] args) 
    {
        DecimalFormat df = new DecimalFormat("#.###");
        Random rand = new Random();
        final int COUNT = 5;
        double totalArea = 0;
        
        IFigure[] figures = new IFigure[COUNT];
        // generamos figuras
        for(int i = 0; i < COUNT; i++)
        {
            switch(rand.nextInt(2))
            {
                case 0:
                    figures[i] = new Circle(1.0);
                    System.out.println("Circle area 3.14\n");
                    break;
                case 1:
                    figures[i] = new Rectangle(1.0, 2.0);
                    System.out.println("Rectangle area 2.00\n");
                    break;
            }
        }
        // sumamos areas
        for(int i = 0; i < COUNT; i++)
        {
            totalArea = totalArea + figures[i].area();
        }
        System.out.println("\nTotal: " + df.format(totalArea));
    }
}
