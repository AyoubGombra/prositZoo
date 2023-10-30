package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatique;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestre;

import java.util.Scanner;



public class main {

    int nbrCages = 20;
    String zooName = "my zoo";


    public static  void main(String[] args){
       /* main zm = new main();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages );

        System.out.println("-------------------------------------------------------------");
        //Instruction 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de cages souhaité:");
        int nbrCagesSaisie = sc.nextInt();
        Animal a1 = new Animal();
        main zm1 = new main();
        zm1.nbrCages = nbrCagesSaisie;
        System.out.println("Veuillez saisir le nom de votre zoo :");
        zm1.zooName= sc.next();
        //Etape optionelle
        //zm1.zooName = "notMyZoo";
        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages);


        System.out.println("-------------------------------------------------------------");

        System.out.println("mrigla machya");
        System.out.println("rabi yoster frr XD");

        Animal a2 = new Animal("Lion" , "lion" , 22 , true) ;

        Zoo z1 = new Zoo("ayoub","mednin",25);
        System.out.println(z1);
        System.out.println(z1.toString());



        System.out.println(z1.addAnimal(a1));
        System.out.println(z1.addAnimal(a2));


        z1.displayAnimals();

        System.out.println(z1.searchAnimal(a2));
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(z1.searchAnimal(dog));

        System.out.println(z1.removeAnimal(a2));
        z1.displayAnimals();*/

       /* System.out.println("-------------------------------------------------------");
        Aquatique aquatic = new Aquatique("Fish", "Sardine", 2, true, "Sea");
        Terrestre terrestrial = new Terrestre("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);



        aquatic.swim();
        dolphin.swim();
        penguin.swim();*/



        /*System.out.println("donner la famille de votre animal : ");
        a1.family = sc.next();
        System.out.println("donner le nom de votre animal : ");
        a1.name = sc.next();
        System.out.println("donner l age de votre animal : ");
        a1.age = sc.nextInt();
        System.out.println("donner la famille de votre animal : ");
        a1.family = sc.next();
        System.out.println("donner si il est isMammal \"true or false\" : ");
        a1.isMammal = sc.hasNext();*/

        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        Dolphin d = new Dolphin();
        d.setSwimmingSpeed(24.5f);
        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(21.8f);
        Dolphin d2 = new Dolphin();
        d2.setSwimmingSpeed(20.3f);
        Dolphin d3 = new Dolphin();
        d3.setSwimmingSpeed(22.6f);


        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);
        Penguin p = new Penguin();
        p.setSwimmingDepth(24.6f);
        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(29.6f);
        Penguin p2 = new Penguin();
        p2.setSwimmingDepth(219.6f);
        Penguin p3 = new Penguin();
        p1.setSwimmingDepth(2.6f);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);
        myZoo.addAquaticAnimal(new Penguin());

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatique[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

        myZoo.displayNumberOfAquaticsByType();

        System.out.println(myZoo.maxPenguinSwimmingDepth());


    }
}
