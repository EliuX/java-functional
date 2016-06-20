
package com.stackbuilders.javafunctional.functionalinterface;

/**
 * Any unit, ground or air, or even Supply depots
 *
 * @FunctionalInterface is like an interface over this interface.
 */
@FunctionalInterface
public interface GeneralUnit
{
    /**
     * Verbose name of the unit
     *
     * @return {@link String} not null
     */
    default String getName()
    {
        return "A thing";
    }

    void onAttackedBy(AttackerUnit attacker);
}
