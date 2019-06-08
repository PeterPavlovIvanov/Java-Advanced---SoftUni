package DefiningClassesExercise.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Trainer> trainers = new ArrayList<>();
        List<String> onlyTrainersNames = new ArrayList<>();

        while (!"Tournament".equals(line)) {
            String[] command = line.split("\\s+");

            String trainerName = command[0];
            String pokemonName = command[1];
            String pokemonElement = command[2];
            int pokemonHealth = Integer.parseInt(command[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (!onlyTrainersNames.contains(trainerName)) {
                List<Pokemon> pokemonsCollection = new ArrayList<>();
                pokemonsCollection.add(pokemon);

                Trainer trainerTemp = new Trainer(trainerName, pokemonsCollection);
                trainers.add(trainerTemp);
            } else {
                Trainer trainer = trainers.get(onlyTrainersNames.indexOf(trainerName));
                List<Pokemon> currentState = new ArrayList<>();
                currentState.addAll(trainer.getPokemons());
                currentState.add(pokemon);

                trainer.setPokemons(currentState);
            }

            if (!onlyTrainersNames.contains(trainerName)) {
                onlyTrainersNames.add(trainerName);
            }
            line = scanner.nextLine();
        }

        String element = scanner.nextLine();

        while (!"End".equals(element)) {

            for (int i = 0; i < trainers.size(); i++) {
                int temp = trainers.get(i).getPokemons().size();

                boolean loseHP = true;
                for (int j = 0; j < temp; j++) {
                    if (element.equals(trainers.get(i).getPokemons().get(j).getElement())) {
                        trainers.get(i).EarnBadge();
                        loseHP = false;
                        break;
                    }
                }

                if (loseHP) {
                    trainers.get(i).loseHealthToAllPokemons();
                }
                trainers.get(i).DeletePokemons();
            }

            element = scanner.nextLine();
        }

        LinkedHashMap<String, List<Integer>> output = new LinkedHashMap<>();

        for (int i = 0; i < trainers.size(); i++) {
            int temp = trainers.get(i).getPokemons().size();
            int badges = trainers.get(i).getBadges();

            List<Integer> tempfinal = new ArrayList<>();
            tempfinal.add(badges);
            tempfinal.add(temp);

            output.put(trainers.get(i).getName(), tempfinal);
        }

        output.entrySet()
                .stream()
                .sorted((e1,e2) -> e2.getValue().get(0).compareTo(e1.getValue().get(0)))
                .forEach(e -> System.out.println(String.format(
                        "%s %d %d",e.getKey(),e.getValue().get(0),e.getValue().get(1)
                )));

    }
}
