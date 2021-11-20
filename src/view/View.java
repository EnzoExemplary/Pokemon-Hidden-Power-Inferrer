package view;

import inference.Type;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private Scanner scanner;
    private Type firstType;
    private Type secondType;

    public View(){
        scanner = new Scanner(System.in);
        Run();
        scanner.close();
    }

    private void Run(){
        boolean dualType = checkDualType();

        firstType = checkType(false);
        if(dualType){  
            secondType = checkType(true);
        }else{
            secondType = null;
        }

        System.out.println("Type 1: " + firstType);
        System.out.println("Type 2: " + secondType);
        

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

    private Type checkType(boolean isSecondType){
        Type type = null;
        int numTypes = Type.values().length;

        String selection = "first";
        if(isSecondType){
            selection = "second";
        }

        boolean noSelection = true;
        while(noSelection){
            try{
                System.out.println("Select the opposing Pokemon's " + selection + " type:");
                printTypeOptions();

                if(scanner.hasNextInt()){
                    int value = scanner.nextInt();
                    
                    if(value < 0 || value >= numTypes){
                        throw new InputMismatchException("Input value must from 0 to " + (numTypes - 1));
                    }else{
                        type = Type.values()[value];
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

        return type;
    }
    private void printTypeOptions(){
        Type[] types = Type.values();

        for(Type type : types){
            System.out.printf(("%d. %s\n"), type.valueOf(), type.toString());
        }

    }
}
