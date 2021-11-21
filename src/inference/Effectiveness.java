package inference;

public enum Effectiveness {
    NO_EFFECT(0, "No effect"),
    NOT_VERY(1, "Not very effective"),
    NORMAL(2, "Normally effective"),
    SUPER(3, "Super effective");

    public int value;
    public String label;

    Effectiveness(int value, String label){
        this.value = value;
        this.label = label;
    }
}
