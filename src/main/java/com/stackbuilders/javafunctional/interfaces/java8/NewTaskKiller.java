
package com.stackbuilders.javafunctional.interfaces.java8; 

/**
 * Kills a task
 * @author ehernandez
 */
@FunctionalInterface
public interface NewTaskKiller {
   
    /**
     * Kills a process given its process id
     * @param procid Process id
     */
    void kill(long procid);
    
    /**
     * Search a process by its canonical name. Common for all other processes.
     * @param name Canonical name of the process
     * @return id of the process
     */
    default long findProcessByName(String name)
    { 
        //Fake logic to search process
        return 10L;
    }
    
}
