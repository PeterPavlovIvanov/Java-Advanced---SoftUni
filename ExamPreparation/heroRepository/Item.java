package ExamPreparation.heroRepository;

public class Item {
    private int strength;
    private int agility;
    private int intelligence;

    public Item(int strength, int agility, int intelligence) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    @Override
    public String toString() {
        String result = "Item:\r\n";
        result += "  *  Strength: " + this.getStrength()+"\n";
        result += "  *  Agility: " + this.getAgility()+"\n";
        result += "  *  Intelligence: " + this.getIntelligence()+"\n";

        return result.trim();
    }
}
