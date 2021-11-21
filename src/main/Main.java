package main;

import view.View;
import java.util.concurrent.TimeUnit;

public class Main {
    public static final boolean ENABLE_PAUSES = true;
    public static final int PAUSE_TIME_SEC_SHORT = 1;
    public static final int PAUSE_TIME_SEC_LONG = 2;


    public static void main(String[] args) {
        new View();
        System.exit(0);
    }

    public static void pause(boolean shortPause){
        try{
            if(ENABLE_PAUSES){
                if(shortPause){
                    TimeUnit.SECONDS.sleep(PAUSE_TIME_SEC_SHORT);
                }else{
                    TimeUnit.SECONDS.sleep(PAUSE_TIME_SEC_LONG);
                }
                
            }           
        }catch(InterruptedException e){
            //Continue as normal
        }
    }
}

