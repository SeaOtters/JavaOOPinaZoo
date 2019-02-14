public class Bee extends Animal {

    String favoriteFood;
    String name;

    public Bee (String name) {

        super(name, "pollen");
        this.name = name;
        this.favoriteFood = "pollen";
    }

    public void sleep(String name) {
        System.out.println(name + " never sleeps ");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food );
        if(food == favoriteFood){
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep(name);
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }


    public static void main(String[] args) {

    }

}

