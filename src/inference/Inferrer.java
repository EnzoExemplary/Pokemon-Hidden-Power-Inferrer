package inference;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Inferrer {
    Set<Type> possibleTypes;
    Map<Type, Weakness[]> weaknesses;


    public Inferrer(){
        possibleTypes = new HashSet<>();

        Type[] types = Type.values();

        for(Type type : types){
            possibleTypes.add(type);
        }

        weaknesses = new HashMap<>(){{
            put(Type.NORMAL, TypeWeaknesses.NORMAL);
            put(Type.FIRE, TypeWeaknesses.FIRE);
            put(Type.WATER, TypeWeaknesses.WATER);
            put(Type.ELECTRIC, TypeWeaknesses.ELECTRIC);
            put(Type.GRASS, TypeWeaknesses.GRASS);
            put(Type.ICE, TypeWeaknesses.ICE);
            put(Type.FIGHTING, TypeWeaknesses.FIGHTING);
            put(Type.POISON, TypeWeaknesses.POISON);
            put(Type.GROUND, TypeWeaknesses.GROUND);
            put(Type.FLYING, TypeWeaknesses.FLYING);
            put(Type.PSYCHIC, TypeWeaknesses.PSYCHIC);
            put(Type.BUG, TypeWeaknesses.BUG);
            put(Type.ROCK, TypeWeaknesses.ROCK);
            put(Type.GHOST, TypeWeaknesses.GHOST);
            put(Type.DRAGON, TypeWeaknesses.DRAGON);
            put(Type.DARK, TypeWeaknesses.DARK);
            put(Type.STEEL, TypeWeaknesses.STEEL);
            put(Type.FAIRY, TypeWeaknesses.FAIRY);
        }};
    }

    public void infer(Type firstType, Type secondType){
        Weakness[] typeWeaknesses = {};

        if(secondType == null){
            typeWeaknesses = weaknesses.get(firstType);
        }else{
            typeWeaknesses = getDualWeaknesses(firstType, secondType);
        }

        for(Weakness weakness : typeWeaknesses){
            System.out.println(weakness);
        }
        
    }

    public Weakness[] getDualWeaknesses(Type firstType, Type secondType){
        Weakness[] dualWeaknesses = {};

        if(firstType != null && secondType != null){
            Weakness[] firstTypeWeaknesses = weaknesses.get(firstType);
            Weakness[] secondTypeWeaknesses = weaknesses.get(secondType);

            if(firstTypeWeaknesses.length == secondTypeWeaknesses.length){
                dualWeaknesses = new Weakness[firstTypeWeaknesses.length];

                for(int i = 0; i < dualWeaknesses.length; i++){
                    Type type = firstTypeWeaknesses[i].attackingType;
                    double firstWeakness = firstTypeWeaknesses[i].damage;
                    double secondWeakness = secondTypeWeaknesses[i].damage;
                    dualWeaknesses[i] = new Weakness(type, firstWeakness*secondWeakness);
                }
            }

        }

        return dualWeaknesses;
    }
}
