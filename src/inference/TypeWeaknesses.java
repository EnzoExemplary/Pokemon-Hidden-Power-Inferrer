package inference;

public class TypeWeaknesses {
    public static final Damage[] NORMAL = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, 1),    new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, 2),   new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, 1),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 0),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] FIRE = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, .5),    new Damage(Type.WATER, 2),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, .5),   new Damage(Type.ICE, .5),     new Damage(Type.FIGHTING, 1),   new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 2),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, .5),
        new Damage(Type.ROCK, 2),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, .5),   new Damage(Type.FAIRY, .5)
    };

    public static final Damage[] WATER = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, .5),    new Damage(Type.WATER, .5),     new Damage(Type.ELECTRIC, 2),
        new Damage(Type.GRASS, 2),    new Damage(Type.ICE, .5),     new Damage(Type.FIGHTING, 1),   new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, 1),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, .5),   new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] ELECTRIC = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, .5),
        new Damage(Type.GRASS, 1),    new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, 1),   new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 2),   new Damage(Type.FLYING, .5),  new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, 1),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, .5),   new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] GRASS = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 2),     new Damage(Type.WATER, .5),     new Damage(Type.ELECTRIC, .5),
        new Damage(Type.GRASS, .5),   new Damage(Type.ICE, 2),      new Damage(Type.FIGHTING, 1),   new Damage(Type.POISON, 2),
        new Damage(Type.GROUND, .5),  new Damage(Type.FLYING, 2),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, 2),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] ICE = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 2),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, 1),    new Damage(Type.ICE, .5),     new Damage(Type.FIGHTING, 2),   new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, 1),
        new Damage(Type.ROCK, 2),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, 2),    new Damage(Type.FAIRY, 1)
    };
    
    public static final Damage[] FIGHTING = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, 1),    new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, 1),   new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 2),   new Damage(Type.PSYCHIC, 2),    new Damage(Type.BUG, .5),
        new Damage(Type.ROCK, .5),    new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, .5),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 2)
    };

    public static final Damage[] POISON = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, .5),   new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, .5),  new Damage(Type.POISON, .5),
        new Damage(Type.GROUND, 2),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 2),    new Damage(Type.BUG, .5),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, .5)
    };

    public static final Damage[] GROUND = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 2),      new Damage(Type.ELECTRIC, 0),
        new Damage(Type.GRASS, 2),    new Damage(Type.ICE, 2),      new Damage(Type.FIGHTING, 1),   new Damage(Type.POISON, .5),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, 1),
        new Damage(Type.ROCK, .5),    new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] FLYING = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 2),
        new Damage(Type.GRASS, .5),   new Damage(Type.ICE, 2),      new Damage(Type.FIGHTING, .5),  new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 0),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, .5),
        new Damage(Type.ROCK, 2),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] PSYCHIC = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, 1),    new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, .5),  new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, .5),   new Damage(Type.BUG, 2),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 2),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 2),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] BUG = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 2),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, .5),   new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, .5),  new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, .5),  new Damage(Type.FLYING, 2),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, 1),
        new Damage(Type.ROCK, 2),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] ROCK = {
        new Damage(Type.NORMAL, .5),  new Damage(Type.FIRE, .5),    new Damage(Type.WATER, 2),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, 2),    new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, 2),   new Damage(Type.POISON, .5),
        new Damage(Type.GROUND, 2),   new Damage(Type.FLYING, .5),  new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, 1),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, 2),    new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] GHOST = {
        new Damage(Type.NORMAL, 0),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, 1),    new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, 0),   new Damage(Type.POISON, .5),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, .5),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 2),    new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, 2),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 1)
    };

    public static final Damage[] DRAGON = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, .5),    new Damage(Type.WATER, .5),     new Damage(Type.ELECTRIC, .5),
        new Damage(Type.GRASS, .5),   new Damage(Type.ICE, 2),      new Damage(Type.FIGHTING, 1),   new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, 1),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 2),     new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 2)
    };

    public static final Damage[] DARK = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, 1),    new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, 2),   new Damage(Type.POISON, 1),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 0),    new Damage(Type.BUG, 2),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, .5),   new Damage(Type.DRAGON, 1),     new Damage(Type.DARK, .5),
        new Damage(Type.STEEL, 1),    new Damage(Type.FAIRY, 2)
    };

    public static final Damage[] STEEL = {
        new Damage(Type.NORMAL, .5),  new Damage(Type.FIRE, 2),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, .5),   new Damage(Type.ICE, .5),     new Damage(Type.FIGHTING, 2),   new Damage(Type.POISON, 0),
        new Damage(Type.GROUND, 2),   new Damage(Type.FLYING, .5),  new Damage(Type.PSYCHIC, .5),   new Damage(Type.BUG, .5),
        new Damage(Type.ROCK, .5),    new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, .5),    new Damage(Type.DARK, 1),
        new Damage(Type.STEEL, .5),   new Damage(Type.FAIRY, .5)
    };

    public static final Damage[] FAIRY = {
        new Damage(Type.NORMAL, 1),   new Damage(Type.FIRE, 1),     new Damage(Type.WATER, 1),      new Damage(Type.ELECTRIC, 1),
        new Damage(Type.GRASS, 1),    new Damage(Type.ICE, 1),      new Damage(Type.FIGHTING, .5),  new Damage(Type.POISON, 2),
        new Damage(Type.GROUND, 1),   new Damage(Type.FLYING, 1),   new Damage(Type.PSYCHIC, 1),    new Damage(Type.BUG, .5),
        new Damage(Type.ROCK, 1),     new Damage(Type.GHOST, 1),    new Damage(Type.DRAGON, 0),     new Damage(Type.DARK, .5),
        new Damage(Type.STEEL, 2),    new Damage(Type.FAIRY, 1)
    };
}