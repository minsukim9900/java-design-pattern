package structural_patterns.facade.ex1;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        Lights lights = new Lights();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(thermostat, lights, coffeeMaker);

        smartHomeFacade.wakeUp();
        smartHomeFacade.leaveHome();
    }
}
