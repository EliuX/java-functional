
package com.stackbuilders.javafunctional.functionacomposition;

import java.util.function.Function;
/**
 * Try function composition
 * - Function must operate with objects: Integer instead of int
 */
public class FunctionCompositionSandBox3
{ 
    private static final Function<Integer, Integer> TIMES2 = x -> x * 2; 
    
    private static final Function<Integer, Integer> SQUARED = x -> x * x;    
    
    public static void main(String[] args)
    {
        System.out.println(SQUARED.apply(TIMES2.apply(2)));
        System.out.println(TIMES2.apply(SQUARED.apply(2)));
    } 
    
}
