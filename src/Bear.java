public class Bear extends Animal {

    String favoriteFood;
    String name;

    public Bear(String name) {

        super(name, " fish ");
        this.name = name;
        this.favoriteFood = "fish";

    }

    public void sleep(String name) {

        System.out.println(name + " hibernates for 4 months ");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food );
        if(food == favoriteFood){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }


    public static void main(String[] args) {
        //make and run a main method

    }

}

