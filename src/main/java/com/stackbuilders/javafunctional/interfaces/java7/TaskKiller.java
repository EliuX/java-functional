
package com.stackbuilders.javafunctional.interfaces.java7;

/**
 * Kills a task
 * @author ehernandez
 */
public interface TaskKiller {
   
    /**
     * Kills a process given its process id
     * @param procid Process id
     */
    void kill(long procid);
    
}
