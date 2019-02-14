public class Tiger extends Animal {

    String favoriteFood;
    String name;

        public Tiger (String name) {

            super(name, "meat");
            this.name = name;
            this.favoriteFood = "meat";
        }

        public void sleep(String name) {
            System.out.println(name + " sleeps for 8 hours ");
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

        }

    }

