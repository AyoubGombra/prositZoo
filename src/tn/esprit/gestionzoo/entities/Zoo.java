package tn.esprit.gestionzoo.entities;

public class Zoo {
    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private Aquatique[] aquaticAnimals;
    private String name, city;
    private int nbrAnimals;
    private int nbrAquatics;

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Aquatique[10];
        this.name = name;
        this.city = city;
    }


    public int getNbrAquatics() {
        return nbrAquatics;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquatics = nbrAquatics;
    }

    public Aquatique[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatique[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Zoo (){

    }

    public Zoo (String name, String city, final int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    void displayZoo (){
        System.out.println("Name: "+ name + ",City: " + city + ",Nombres Des Cages : " + NUMBER_OF_CAGES);
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }
    public boolean addAnimal(Animal animal) {
        if (isZooFull()==true)
            return false;
        else {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
    }
    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    boolean isZooFull() {
        return NUMBER_OF_CAGES <= nbrAnimals;
    }


    Zoo comparerZoo (Zoo z1, Zoo z2){
        if (z1.nbrAnimals < z2.nbrAnimals)
            return z2;
        else
            return z1;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + NUMBER_OF_CAGES;
    }

    public void addAquaticAnimal(Aquatique aquatic) {
        aquaticAnimals[nbrAquatics] = aquatic;
        nbrAquatics++;
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxDepth < penguin.getSwimmingDepth())
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Le Zoo " + name + " contient " + nbrDolphins + " dauphins et " + nbrPenguins + " pingouins");
    }

}

    





















