/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stackbuilders.javafunctional.highorderfunctions;

import java.util.function.Function;

/**
 *
 * @author ehernandez
 */
public class GraphUtils {
    
    
    public static void move2toOffset(Integer offset, Function<Integer, Function<Integer, Function<Integer,Integer>>> function)
    {
        for(int x = 0; x<= 10; x++)
        {
            int y = function.apply(1).apply(x).apply(offset);
            paintPoint(x,y);
        }
    }
    
    public static void paintPoint(int x, int y)
    {
        System.out.println(String.format("(%d;%d)", x, y));
    }
    
}
