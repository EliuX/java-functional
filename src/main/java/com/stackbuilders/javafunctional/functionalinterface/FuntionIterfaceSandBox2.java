
package com.stackbuilders.javafunctional.functionalinterface;

/**
 * Functional Interfaces 
 * - Virtual extension methods: intetrface default, use parent default function
 */
public class FuntionIterfaceSandBox2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { 
        assasinate(()-> "Eliecer", (AttackerUnit attacker) ->
        {
            System.out.println("what are you doing with your life?");
        });
        //What happens if we leave the GeneralUnit getName implementation also abstract?
    }

    //@TODO Change to AttackerUnit second parameter
    public static void assasinate(AttackerUnit attacker, GeneralUnit victim)
    {
        System.out.println(String.format("%s feels dangerous and he is looking some victim to kill.", attacker.getName()));
        System.out.println(String.format("%s spots %s", attacker.getName(), victim.getName()));
        attacker.attack(victim);
    } 
}
