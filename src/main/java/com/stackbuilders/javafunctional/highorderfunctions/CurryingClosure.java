
package com.stackbuilders.javafunctional.highorderfunctions;
 
import static com.stackbuilders.javafunctional.highorderfunctions.GraphUtils.move2toOffset;
import java.util.function.Function;

/**
 *
 * @author ehernandez
 */
public class CurryingClosure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        move2toOffset(0, linearFunction());
    }
    
    public static Function<Integer, Function<Integer, Function<Integer,Integer>>> linearFunction()
    {
        return new Function<Integer, Function<Integer, Function<Integer, Integer>>>() {
            @Override
            public Function<Integer, Function<Integer, Integer>> apply(Integer factor) {
                return new Function<Integer, Function<Integer, Integer>>() {
                    @Override
                    public Function<Integer, Integer> apply(Integer xval) {
                       return new Function<Integer, Integer>() {
                           @Override
                           public Integer apply(Integer nvalue) {
                               return factor * xval + nvalue;
                           }
                       };
                    }
                };
            }
        };
    }
    
}
