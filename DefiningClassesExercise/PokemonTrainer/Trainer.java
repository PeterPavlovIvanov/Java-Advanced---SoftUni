package DefiningClassesExercise.PokemonTrainer;

import java.util.List;

public class Trainer {
    private static final int START_BADGES = 0;
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer() {

    }

    public String getName() {
        return name;
    }

    public Trainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.badges = START_BADGES;
        this.pokemons = pokemons;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void loseHealthToAllPokemons() {
        this.pokemons
                .stream()
                .forEach(p -> p.loseHealth());
    }

    public void DeletePokemons() {
        for (int i = 0; i < this.pokemons.size(); i++) {
            if (this.pokemons.get(i).deadPokemon()) {
                this.pokemons.remove(this.pokemons.get(i));
            }
        }
    }

    public void EarnBadge() {
        this.badges += 1;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public int getBadges() {
        return this.badges;
    }
}
