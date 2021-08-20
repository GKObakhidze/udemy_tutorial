import java.util.ArrayList;

public class two_D_ArrayList {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakerylist = new ArrayList<String>();
        bakerylist.add("pasta");
        bakerylist.add("garlic bread");
        bakerylist.add("donuts");


        ArrayList<String> productList = new ArrayList<String>();
        productList.add("tomatoes");
        productList.add("zucchini");
        productList.add("peppers");

        ArrayList<String> drinckList = new ArrayList<String>();
        drinckList.add("soda");
        drinckList.add("coffee");

        groceryList.add(bakerylist);
        groceryList.add(productList);
        groceryList.add(drinckList);


        System.out.println(groceryList.get(2).get(1));


    }

}
