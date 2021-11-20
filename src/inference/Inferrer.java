package inference;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Inferrer {
    Set<Type> possibleTypes;
    Map<Type, Damage[]> matchups;


    public Inferrer(){
        possibleTypes = new HashSet<>();

        Type[] types = Type.values();

        for(Type type : types){
            possibleTypes.add(type);
        }

        matchups = new HashMap<>(){{
            put(Type.NORMAL, TypeMatchUps.NORMAL);
            put(Type.FIRE, TypeMatchUps.FIRE);
            put(Type.WATER, TypeMatchUps.WATER);
            put(Type.ELECTRIC, TypeMatchUps.ELECTRIC);
            put(Type.GRASS, TypeMatchUps.GRASS);
            put(Type.ICE, TypeMatchUps.ICE);
            put(Type.FIGHTING, TypeMatchUps.FIGHTING);
            put(Type.POISON, TypeMatchUps.POISON);
            put(Type.GROUND, TypeMatchUps.GROUND);
            put(Type.FLYING, TypeMatchUps.FLYING);
            put(Type.PSYCHIC, TypeMatchUps.PSYCHIC);
            put(Type.BUG, TypeMatchUps.BUG);
            put(Type.ROCK, TypeMatchUps.ROCK);
            put(Type.GHOST, TypeMatchUps.GHOST);
            put(Type.DRAGON, TypeMatchUps.DRAGON);
            put(Type.DARK, TypeMatchUps.DARK);
            put(Type.STEEL, TypeMatchUps.STEEL);
            put(Type.FAIRY, TypeMatchUps.FAIRY);
        }};
    }

    public void infer(Type firstType, Type secondType){
        
    }
}
