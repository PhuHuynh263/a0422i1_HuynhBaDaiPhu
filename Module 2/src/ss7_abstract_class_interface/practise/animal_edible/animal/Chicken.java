package ss7_abstract_class_interface.practise.animal_edible.animal;

import ss7_abstract_class_interface.practise.animal_edible.animal.Animal;
import ss7_abstract_class_interface.practise.animal_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
