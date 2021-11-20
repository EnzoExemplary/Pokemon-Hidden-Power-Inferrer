package main;

import view.View;
import java.util.concurrent.TimeUnit;

public class Main {
    public static final boolean ENABLE_PAUSES = true;
    public static final int PAUSE_TIME_SEC = 2;

    public static void main(String[] args) {
        View view = new View();
    }

    public static void pause(){
        try{
            if(ENABLE_PAUSES){
                TimeUnit.SECONDS.sleep(PAUSE_TIME_SEC);
            }           
        }catch(InterruptedException e){
            //Continue as normal
        }
    }
}

