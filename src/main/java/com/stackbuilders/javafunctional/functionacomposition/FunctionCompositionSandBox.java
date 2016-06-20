
package com.stackbuilders.javafunctional.functionacomposition;

/**
 * Try function composition
 */
public class FunctionCompositionSandBox
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println(squared(times2(2)));
        System.out.println(times2(squared(2)));
    }
    
    public static final int times2(int val)
    {
        return val * 2;
    }
    
    public static final int squared(int val)
    {
        return val * val;
    }
    
}
