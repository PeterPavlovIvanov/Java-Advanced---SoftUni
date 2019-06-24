package spaceStationRecruitment;

import java.util.ArrayList;
import java.util.List;

public class SpaceStation {
    private String name;
    private int capacity;
    private List<Astronaut> data;

    public SpaceStation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCount() {
        return this.data.size();
    }

    public void add(Astronaut astronaut) {
        if (this.data.size() < capacity) {
            this.data.add(astronaut);
        }
    }

    public boolean remove(String name1) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name1)) {
                this.data.remove(this.data.get(i));
                return true;
            }
        }
        return false;
    }

    public Astronaut getOldestAstronaut() {
        Astronaut astronaut = null;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getAge() > max) {
                max = this.data.get(i).getAge();
                astronaut = this.data.get(i);
            }
        }

        return astronaut;
    }

    public Astronaut getAstronaut(String name1) {
        Astronaut astronaut = null;
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name1)) {
                astronaut = this.data.get(i);
            }
        }
        return astronaut;
    }

    public String report() {
        String result = "Astronauts working at Space Station " + this.getName() + ":\r\n";

        for (int i = 0; i < this.data.size(); i++) {
            result += this.data.get(i).toString();
        }

        return result;
    }

}
