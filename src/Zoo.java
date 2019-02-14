public class Zoo {

    static String favoriteFood = "bacon";

    public static void main(String[] args) {
        eat("Tigger", "meat");
        eat("Tigger", "bacon");
    }

    public static void sleep (String name){

        System.out.println(name + " sleeps for 8 hours ");
    }

    public static void eat (String name , String food){
        System.out.println(name + " eats " + food );
        if(food == favoriteFood){
            System.out.println("YUM!!!" + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }
}


