
package com.stackbuilders.javafunctional.functionacomposition;

import java.util.function.Function;
/**
 * Try function composition
 * - compose works just like function composition in haskell
 * - andThen the other way around. Standard imperative: left to right
 */
public class FunctionCompositionSandBox2
{ 
    private static final Function<Integer, Integer> TIMES2 = x -> x * 2; 
    
    private static final Function<Integer, Integer> SQUARED = x -> x * x;    
    
    public static void main(String[] args)
    {
        System.out.println(SQUARED.compose(TIMES2).apply(2));
        System.out.println(SQUARED.andThen(TIMES2).apply(2));        
    } 
    
}
