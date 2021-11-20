package view;

import inference.Type;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    Scanner scanner;;

    public View(){
        scanner = new Scanner(System.in);
        Run();
        scanner.close();
    }

    private void Run(){
        boolean dualType = checkDualType();
        System.out.println("Is dualtype: " + dualType);
        // printTypeOptions();



        

    }

    private boolean checkDualType(){
        boolean dualType = false;

        boolean noSelection = true;
        while(noSelection){
            try{
                System.out.println("Is the opposing Pokemon Mono or Dual type?");
                System.out.println("1. Mono Type");
                System.out.println("2. Dual Type");
                if(scanner.hasNextInt()){
                    int value = scanner.nextInt();
                    
                    if(value != 1 && value != 2){
                        throw new InputMismatchException("Input value must be 1 or 2");
                    }else if(value == 2){
                        dualType = true;
                    }

                    noSelection = false;
                }else{
                    throw new InputMismatchException("Input invalid, must be a number");
                }

            }catch(InputMismatchException e){
                System.out.println("Input value invalid, please enter again");
                scanner.nextLine();
            }
        }

        return dualType;
    }

    private void printTypeOptions(){
        Type[] types = Type.values();

        for(Type type : types){
            System.out.printf(("%d. %s\n"), type.valueOf(), type.toString());
        }

    }
}
