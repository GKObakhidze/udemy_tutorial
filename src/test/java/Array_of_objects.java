public class Array_of_objects {

    public static void main(String[] args) {

       /* int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] Strings = new String[5];*/

       // food[] refrigerator = new food[3];
        food food1 = new food("pizza");
        food food2 = new food("hamburger");
        food food3 = new food("hotdog");
        food[] refrigerator = {food1,food2,food3};

        /*refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;*/

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }

}


class food {
    String name;
    food(String name){
        this.name = name;
    }


}
