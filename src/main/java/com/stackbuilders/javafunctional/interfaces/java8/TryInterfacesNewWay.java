
package com.stackbuilders.javafunctional.interfaces.java8;

/**
 * Try old and new ways of implementing interfaces
 * @author ehernandez
 */
public class TryInterfacesNewWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * We need to implement only the undefined function: {@link TaskKiller#kill}
         * and use other defaults function of the interfaces (calculables).
         * See analogy with class types.
         */
        killTask(System.out::println, "Spotify");
    }
    
    /**
     * Kill a task using java 7 syntax
     * @param handler Handler of killing the process
     * @param name Name of the process to kill
     */
    public static void killTask(NewTaskKiller handler, String name)
    {
        long processId = handler.findProcessByName(name);
        handler.kill(processId);
    }
    
}
