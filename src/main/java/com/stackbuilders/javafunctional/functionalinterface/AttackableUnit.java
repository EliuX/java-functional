
package com.stackbuilders.javafunctional.functionalinterface;

/**
 * Any possible victim
 */
public interface AttackableUnit extends GeneralUnit
{ 

    /**
     * When anybody is attacked
     *
     * @param attacker
     */
    default void onAttackedBy(AttackerUnit attacker)
    {
        System.out.println(String.format("%s cries :-(", getName()));
        System.out.println("Shame on you " + attacker.getName());
    }
}
