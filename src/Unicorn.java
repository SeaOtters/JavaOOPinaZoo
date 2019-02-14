public class Unicorn extends Animal {

        String favoriteFood;
        String name;

        public Unicorn (String name) {

            super(name, "marshmallows");
            this.name = name;
            this.favoriteFood = "marshmallows";
        }

        public void sleep(String name) {
            System.out.println(name + " sleeps in a cloud ");
        }

        public void eat(String food) {
            System.out.println(name + " eats " + food );
            if(food == favoriteFood){
                System.out.println("YUM!!! " + name + " wants more " + food);
                sleep(name);
            }
        }


        public static void main(String[] args) {

        }

    }



