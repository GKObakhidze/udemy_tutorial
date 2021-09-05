public class static_keyword {
    public static void main(String[] args) {


        Friend friend1 = new Friend("sponegbob");
        Friend friend2 = new Friend("patrick");
        Friend friend3 = new Friend("squidware");
        Friend friend4 = new Friend("sandey");

        System.out.println(Friend.numberofFriends);

        Friend.displayFriends();

    }


}


class Friend {
    String name;
    static int numberofFriends;

    Friend(String name){
        this.name = name;
        numberofFriends ++;
    }

    static void displayFriends(){
        System.out.println("You have "+numberofFriends+" friends");
    }
}