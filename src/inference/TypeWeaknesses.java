package inference;

public class TypeWeaknesses {
    public static final Weakness[] NORMAL = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, 1),    new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, 2),   new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, 1),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 0),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] FIRE = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, .5),    new Weakness(Type.WATER, 2),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, .5),   new Weakness(Type.ICE, .5),     new Weakness(Type.FIGHTING, 1),   new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 2),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, .5),
        new Weakness(Type.ROCK, 2),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, .5),   new Weakness(Type.FAIRY, .5)
    };

    public static final Weakness[] WATER = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, .5),    new Weakness(Type.WATER, .5),     new Weakness(Type.ELECTRIC, 2),
        new Weakness(Type.GRASS, 2),    new Weakness(Type.ICE, .5),     new Weakness(Type.FIGHTING, 1),   new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, 1),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, .5),   new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] ELECTRIC = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, .5),
        new Weakness(Type.GRASS, 1),    new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, 1),   new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 2),   new Weakness(Type.FLYING, .5),  new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, 1),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, .5),   new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] GRASS = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 2),     new Weakness(Type.WATER, .5),     new Weakness(Type.ELECTRIC, .5),
        new Weakness(Type.GRASS, .5),   new Weakness(Type.ICE, 2),      new Weakness(Type.FIGHTING, 1),   new Weakness(Type.POISON, 2),
        new Weakness(Type.GROUND, .5),  new Weakness(Type.FLYING, 2),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, 2),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] ICE = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 2),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, 1),    new Weakness(Type.ICE, .5),     new Weakness(Type.FIGHTING, 2),   new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, 1),
        new Weakness(Type.ROCK, 2),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, 2),    new Weakness(Type.FAIRY, 1)
    };
    
    public static final Weakness[] FIGHTING = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, 1),    new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, 1),   new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 2),   new Weakness(Type.PSYCHIC, 2),    new Weakness(Type.BUG, .5),
        new Weakness(Type.ROCK, .5),    new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, .5),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 2)
    };

    public static final Weakness[] POISON = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, .5),   new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, .5),  new Weakness(Type.POISON, .5),
        new Weakness(Type.GROUND, 2),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 2),    new Weakness(Type.BUG, .5),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, .5)
    };

    public static final Weakness[] GROUND = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 2),      new Weakness(Type.ELECTRIC, 0),
        new Weakness(Type.GRASS, 2),    new Weakness(Type.ICE, 2),      new Weakness(Type.FIGHTING, 1),   new Weakness(Type.POISON, .5),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, 1),
        new Weakness(Type.ROCK, .5),    new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] FLYING = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 2),
        new Weakness(Type.GRASS, .5),   new Weakness(Type.ICE, 2),      new Weakness(Type.FIGHTING, .5),  new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 0),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, .5),
        new Weakness(Type.ROCK, 2),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] PSYCHIC = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, 1),    new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, .5),  new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, .5),   new Weakness(Type.BUG, 2),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 2),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 2),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] BUG = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 2),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, .5),   new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, .5),  new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, .5),  new Weakness(Type.FLYING, 2),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, 1),
        new Weakness(Type.ROCK, 2),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] ROCK = {
        new Weakness(Type.NORMAL, .5),  new Weakness(Type.FIRE, .5),    new Weakness(Type.WATER, 2),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, 2),    new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, 2),   new Weakness(Type.POISON, .5),
        new Weakness(Type.GROUND, 2),   new Weakness(Type.FLYING, .5),  new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, 1),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, 2),    new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] GHOST = {
        new Weakness(Type.NORMAL, 0),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, 1),    new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, 0),   new Weakness(Type.POISON, .5),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, .5),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 2),    new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, 2),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 1)
    };

    public static final Weakness[] DRAGON = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, .5),    new Weakness(Type.WATER, .5),     new Weakness(Type.ELECTRIC, .5),
        new Weakness(Type.GRASS, .5),   new Weakness(Type.ICE, 2),      new Weakness(Type.FIGHTING, 1),   new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, 1),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 2),     new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 2)
    };

    public static final Weakness[] DARK = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, 1),    new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, 2),   new Weakness(Type.POISON, 1),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 0),    new Weakness(Type.BUG, 2),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, .5),   new Weakness(Type.DRAGON, 1),     new Weakness(Type.DARK, .5),
        new Weakness(Type.STEEL, 1),    new Weakness(Type.FAIRY, 2)
    };

    public static final Weakness[] STEEL = {
        new Weakness(Type.NORMAL, .5),  new Weakness(Type.FIRE, 2),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, .5),   new Weakness(Type.ICE, .5),     new Weakness(Type.FIGHTING, 2),   new Weakness(Type.POISON, 0),
        new Weakness(Type.GROUND, 2),   new Weakness(Type.FLYING, .5),  new Weakness(Type.PSYCHIC, .5),   new Weakness(Type.BUG, .5),
        new Weakness(Type.ROCK, .5),    new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, .5),    new Weakness(Type.DARK, 1),
        new Weakness(Type.STEEL, .5),   new Weakness(Type.FAIRY, .5)
    };

    public static final Weakness[] FAIRY = {
        new Weakness(Type.NORMAL, 1),   new Weakness(Type.FIRE, 1),     new Weakness(Type.WATER, 1),      new Weakness(Type.ELECTRIC, 1),
        new Weakness(Type.GRASS, 1),    new Weakness(Type.ICE, 1),      new Weakness(Type.FIGHTING, .5),  new Weakness(Type.POISON, 2),
        new Weakness(Type.GROUND, 1),   new Weakness(Type.FLYING, 1),   new Weakness(Type.PSYCHIC, 1),    new Weakness(Type.BUG, .5),
        new Weakness(Type.ROCK, 1),     new Weakness(Type.GHOST, 1),    new Weakness(Type.DRAGON, 0),     new Weakness(Type.DARK, .5),
        new Weakness(Type.STEEL, 2),    new Weakness(Type.FAIRY, 1)
    };
}