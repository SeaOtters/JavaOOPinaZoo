public class Zookeeper {

    String name;
    static int population;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(Animal[] animals, String food) {
        System.out.println(name + " is feeding " + food + " to " + animals.length + " of " + Animal.population + " total animals ");
        System.out.println(name + " is feeding " + food + " to " + animals.length + " animals ");
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat(food);
        }
    }
}
