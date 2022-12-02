package it.DevelHope.ExerciseJava1;

public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer1.name = "Marco Lo Bello";
        programmer1.age = 27;
        programmer1.wearsGlasses = true;

        programmer2.name = "Pino Pigno";
        programmer2.age = 25;
        programmer2.wearsGlasses = true;

        programmer1.drinkCoffe();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
