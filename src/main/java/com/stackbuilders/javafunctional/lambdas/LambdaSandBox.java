
package com.stackbuilders.javafunctional.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Streams
 *  - Parallelism
 *
 * @author eliecerhdz
 */
public class LambdaSandBox
{
    private static final Logger LOG = Logger.getLogger(LambdaSandBox.class.getName());

    public static void main(String[] args)
    {
        List<String> bastards = Arrays.asList("Ramsay Snow", "Jon Snow", "Ellaria Sand", "Gentry Storm", "Brynden Rivers", "Daemon Blackfyre", "Jafer Flowers", "Sofie Waters", "Cotter Pyke");
        printBastards(bastards.stream()); //Sequential
        System.out.println("-----------");
        printBastards(bastards.parallelStream());
    }

    public static void printBastards(Stream<String> bastardsStream)
    {
        bastardsStream.forEach(new Consumer<String>()
        {

            @Override
            public void accept(String name)
            {
                try
                {
                    Thread.sleep((long) (Math.random() * 1000));
                    System.out.println("- " + name);
                }
                catch (InterruptedException ex)
                {
                    LOG.warning("Houson we have a problem with random");
                }
            }
        });
    }

    /**
     * Selects those bastards with name Snow
     *
     * @param bastardsStream {@link Stream} of bastards in question
     * @return {@link List} with all found bastards, not <code>null</code>
     */
    public static List<String> selectBastardsFromTheNorth(Stream<String> bastardsStream)
    {
        //A predicate is a function  P: X→ {true, false}, is called a predicate on X. 
        //When P is a predicate on X, we sometimes say P is a property of X.
        return bastardsStream.filter(new Predicate<String>()
        {

            @Override
            public boolean test(String t)
            {
                //Property: Is a bastard of the north (isBartardOfNorth)
                return t.endsWith("Snow");
            }

        }).collect(Collectors.toList());    //High order function?
    }
}
