//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        postiveOrZeroOrNegativ(number);
        sum(input1, input2);

        number = -6;
        positiveOrNegative(number);
        postiveOrZeroOrNegativ(number);

        number = 0;
        postiveOrZeroOrNegativ(number);

        name = "John";
        bartender(name);


        }


        public static void hello(){
        System.out.println("Hello world");
        }
        public static void positiveOrNegative(int number){
        if(number <= 0){
            System.out.println("Het getaal " + number + " is negatief");
        }
        else{
            System.out.println("Het getaal " + number + " is positief");
        }
        }
        public static void postiveOrZeroOrNegativ(int number){

            if (number > 0) {
                System.out.println("Het getal " + number + " is positief.");
            } else if (number == 0) {
                System.out.println("Het getal is nul.");
            } else {
                System.out.println("Het getal " + number + " is negatief.");
            }
    }public static void bartender(String name){
        String favoriteDrink;
        switch (name){
            case "henk":
                favoriteDrink = "Beer";
                break;
            case "John":
                favoriteDrink = "Wine";
                break;
            case "Emily":
                favoriteDrink = "Whiskey3";
                break;
                default:
                    favoriteDrink = "water";
                    break;
        }
        System.out.println(" Hello " +name+ " i'll get you some " + favoriteDrink + " . ");
    }
    public static void sum(int input1, int input2){
        int result = input1 + input2;
        System.out.println(input1 + " summed by " + input2 + " = " + result);
    }

    }