/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stackbuilders.javafunctional.highorderfunctions;

import static com.stackbuilders.javafunctional.highorderfunctions.GraphUtils.move2toOffset;
import java.util.function.Function;

/**
 * Compatible with JDK < 1.7
 * @
 *
 * author ehernandez
 */
public class CurryingLambdas
{

    private static final Function<Integer, Function<Integer, Function<Integer, Integer>>> LINEAR_FUNCTIONS = f -> x -> n -> f * x + n;

    private static final Function<Integer, Function<Integer, Function<Integer, Integer>>> PARABOL_FUNCTIONS = f -> x -> n -> f * (x * x) + n;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        move2toOffset(0, LINEAR_FUNCTIONS);
        System.out.println("---");
        move2toOffset(0, PARABOL_FUNCTIONS);
    }
}
