package servicee;

import java.util.List;
import java.util.ArrayList;

import model.Animal;
import util.Searchable;

public class AnimalDictionary implements Searchable<Animal> {
    private List<Animal> a;

    public AnimalDictionary() {
        a = new ArrayList<>();
    }

    public void addAnimal(Animal M) {
        a.add(M);
    }

    public String searchAnimal(String name) {
        for (Animal animal : a) {
            if (name.equals(animal.getName())) {
                return animal.getType() + ": " + animal.getPoint();
            }
        }
        return "";
    }

    @Override
    public List<Animal> searchByType(String type) {
        List<Animal> result = new ArrayList<>();
        for (Animal ani : a) {
            if (ani.getType().equals(type)) {
                result.add(ani);
            }
        }
        return result;
    }
}
