package view;

import inference.Type;
import inference.Effectiveness;
import inference.Inferrer;
import main.Main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class View {
    private Scanner scanner;
    private Inferrer inferrer;
    private Type firstType;
    private Type secondType;


    public View(){
        scanner = new Scanner(System.in);
        inferrer = new Inferrer();
        Run();
        scanner.close();
    }

    private void Run(){
        // Get input for whether opposing pokemon is mono/dual type
        boolean dualType = checkDualType();
        Main.pause(true);

        // Get inputs for the opposing pokemon's first type
        firstType = checkType(false);
        Main.pause(true);

        // Get inputs for the opposing pokemon's second type (if any)
        String secondTypePrint = "";
        if(dualType){  
            secondType = checkType(true);
            Main.pause(true);
            secondTypePrint = ", " + secondType;
        }else{
            secondType = null;
        }

        // Print out opposing pokemon's type(s)
        System.out.printf("\nOpposing pokemon is %s%s type\n", firstType, secondTypePrint);
        Main.pause(true);

        // Get input for how effective the hidden power was
        Effectiveness effectiveness = getHiddenPowerEffectiveness();
        System.out.println("Hidden power's result: " + effectiveness.label);
        Main.pause(true);

        inferrer.infer(firstType, secondType);

        

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
                System.out.println(e.getMessage() + "\n");
                Main.pause(false);
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
                    }else if(isSecondType && value == firstType.valueOf()){
                        throw new InputMismatchException("Second type cannot be same as the first");
                    }else{
                        type = Type.values()[value];
                    }

                    noSelection = false;
                }else{
                    throw new InputMismatchException("Input invalid, must be a number");
                }

            }catch(InputMismatchException e){
                System.out.println(e.getMessage() + "\n");
                Main.pause(false);
                scanner.nextLine();
            }
        }       

        return type;
    }
    
    private void printTypeOptions(){
        Type[] types = Type.values();

        for(Type type : types){
            System.out.printf(("%d. %s\n"), type.valueOf(), type);
        }
    }

    private Effectiveness getHiddenPowerEffectiveness(){
        Effectiveness effectiveness = null;

        boolean noSelection = true;
        while(noSelection){
            try{
                System.out.println("Select hidden power's effectiveness against opposing pokemon");
                printEffectivenessOptitons();
                if(scanner.hasNextInt()){
                    int value = scanner.nextInt();
                    
                    if(value < 0 || value >= Effectiveness.values().length){
                        throw new InputMismatchException("Input value must from 0 to " + (Effectiveness.values().length - 1));
                    }else{
                        effectiveness = Effectiveness.values()[value];
                    }

                    noSelection = false;
                }else{
                    throw new InputMismatchException("Input invalid, must be a number");
                }

            }catch(InputMismatchException e){
                System.out.println(e.getMessage() + "\n");
                Main.pause(false);
                scanner.nextLine();
            }
        }

        return effectiveness;
    }

    private void printEffectivenessOptitons(){
        Effectiveness[] effectiveOptions = Effectiveness.values();

        for(Effectiveness effectiveOption : effectiveOptions){
            System.out.printf(("%d. %s\n"), effectiveOption.value, effectiveOption.label);
        }
    }
}
