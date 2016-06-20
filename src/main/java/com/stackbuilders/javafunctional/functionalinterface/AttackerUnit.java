
package com.stackbuilders.javafunctional.functionalinterface;

/**
 * Any unit which attacks
 */
@FunctionalInterface
public interface AttackerUnit extends GeneralUnit, AttackableUnit
{
    default void attack(GeneralUnit victim)
    {
        System.out.println(String.format("%s -- shoots --> %s", getName(), victim.getName()));
        victim.onAttackedBy(this);
    }

    @Override
    public default void onAttackedBy(AttackerUnit attacker)
    {
        System.out.println(String.format("Badass %s yells! ARGGGg", getName()));
        System.out.println(String.format("%s strickes back to %s", getName(), attacker.getName()));
    }

    String getName();

}
