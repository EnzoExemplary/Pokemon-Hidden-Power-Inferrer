package inference;

public class Weakness {
    public Type attackingType;
    public double damage;
    
    public Weakness(Type attackingType, double damage){
        this.attackingType = attackingType;
        this.damage = damage;
    }

    public String toString(){
        return String.format("%s deals %.1f", attackingType, damage);
    }
}
