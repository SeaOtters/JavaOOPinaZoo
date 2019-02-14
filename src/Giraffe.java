public class Giraffe extends Animal {

    String favoriteFood;
    String name;

    public Giraffe (String name) {

        super(name, "leaves");
        this.name = name;
        this.favoriteFood = "leaves";
    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours ");
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

