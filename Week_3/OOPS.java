abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class Compartment - Premium passengers only";
    }
}
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment - Reserved for women";
    }
}
class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment - Open for all passengers";
    }
}
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment - Goods and luggage only";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        for (int i = 0; i < compartments.length; i++) {
            int random = (int) (Math.random() * 4) + 1;
            switch (random) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }
        for (int i = 0; i < compartments.length; i++) {
            System.out.println(
                "Compartment " + (i + 1) + ": "
                        + compartments[i].notice()
            );
        }
    }
}
