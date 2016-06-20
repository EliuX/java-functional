
package com.stackbuilders.javafunctional.lambdas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Streams
 *  - method handle: method reference
 *  - Function composition: left to right
 *
 * @author eliecerhdz
 */
public class LambdaSandBox2
{
    private static final Logger LOG = Logger.getLogger(LambdaSandBox2.class.getName());

    public static void main(String[] args)
    {
        List<String> bastards = Arrays.asList("Ramsay Snow", "Jon Snow", "Ellaria Sand", "Gentry Storm", "Brynden Rivers", "Daemon Blackfyre", "Jafer Flowers", "Sofie Waters", "Cotter Pyke");
        List<String> starks = new LinkedList<>(Arrays.asList("Robb Stark", "Rickon Stark", "Arya Stark", "Bran Stark", "Sansa Stark")); 
        bastards.stream().filter(LambdaSandBox2::isJon).map(x->x.replace("Snow", "Stark")).forEach(starks::add);
        starks.forEach(System.out::println);
    }

    /**
     * More couple function to use a method handle instead of a java lambda
     * @param bastardName
     * @return 
     */
    public static boolean isJon(String bastardName)
    {
        return bastardName.startsWith("Jon Snow");
    }
}
