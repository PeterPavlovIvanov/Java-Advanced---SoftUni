package ExamPreparation.heroRepository;

import java.util.ArrayList;
import java.util.List;

public class HeroRepository {
    private List<Hero> data;

    public HeroRepository() {
        this.data = new ArrayList<>();
    }

    public void add(Hero entity) {
        this.data.add(entity);
    }

    public void remove(String name) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                this.data.remove(this.data.get(i));
            }
        }
    }

    public Hero getHeroWithHighestStrength() {
        int highestStrength = Integer.MIN_VALUE;
        Hero highestStr = null;

        for (int i = 0; i < this.data.size(); i++) {
            if (highestStrength < this.data.get(i).getItem().getStrength()) {
                highestStrength = this.data.get(i).getItem().getStrength();
                highestStr = this.data.get(i);
            }
        }

        return highestStr;
    }

    public Hero getHeroWithHighestAgility(){
        int highestAgility = Integer.MIN_VALUE;
        Hero highestagy = null;

        for (int i = 0; i < this.data.size(); i++) {
            if (highestAgility < this.data.get(i).getItem().getAgility()) {
                highestAgility = this.data.get(i).getItem().getAgility();
                highestagy = this.data.get(i);
            }
        }

        return highestagy;
    }

    public Hero getHeroWithHighestIntelligence(){
        int highestIntelligence = Integer.MIN_VALUE;
        Hero highestInte = null;

        for (int i = 0; i < this.data.size(); i++) {
            if (highestIntelligence < this.data.get(i).getItem().getIntelligence()) {
                highestIntelligence = this.data.get(i).getItem().getIntelligence();
                highestInte = this.data.get(i);
            }
        }

        return highestInte;
    }

    public int getCount(){
        int count = 0;
        for (int i = 0; i < this.data.size(); i++) {
            count++;
        }
        return count;
    }

    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < this.data.size(); i++) {
            result += this.data.get(i).toString();
        }
        return result.trim();
    }


}
