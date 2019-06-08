package DefiningClassesExercise.RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tire;

    public Car(String model, Engine engine, Cargo cargo, Tire tire) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tire = tire;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public Tire getTire() {
        return this.tire;
    }

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return engine;
    }
}
