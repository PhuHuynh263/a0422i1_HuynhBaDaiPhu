package ss7_abstract_class_interface.practise.animal_edible;

import ss7_abstract_class_interface.practise.animal_edible.animal.Animal;
import ss7_abstract_class_interface.practise.animal_edible.animal.Chicken;
import ss7_abstract_class_interface.practise.animal_edible.animal.Tiger;
import ss7_abstract_class_interface.practise.animal_edible.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
