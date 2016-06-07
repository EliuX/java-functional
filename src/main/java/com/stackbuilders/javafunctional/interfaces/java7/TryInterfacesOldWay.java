
package com.stackbuilders.javafunctional.interfaces.java7;

/**
 * Try old and new ways of implementing interfaces
 * @author ehernandez
 */
public class TryInterfacesOldWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        long spotifyProcessId = findProcessByName("Spotify");
        killTask(new TaskKiller() {
            @Override
            public void kill(long procid) {
                System.out.println(procid);     
            }
        }, spotifyProcessId);
    }
    
    /**
     * Kill a task using java 7 syntax
     * @param handler Handler of killing the process
     * @param processToKill Id of the process to kill
     */
    public static void killTask(TaskKiller handler, long processToKill)
    {
        handler.kill(processToKill);
    }
    
    public static long findProcessByName(String processName)
    {
        return 10L; //Fake logic
    }
    
}
