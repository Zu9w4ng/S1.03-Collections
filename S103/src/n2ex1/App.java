package n2ex1;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {

        Restaurant restaurant1 = new Restaurant("restaurant1", 7);
        Restaurant restaurant2 = new Restaurant("restaurant2", 8);
        Restaurant restaurant3 = new Restaurant("restaurant3", 7);
        Restaurant restaurant4 = new Restaurant("restaurant1", 7);
        Restaurant restaurant5 = new Restaurant("restaurant2", 8);

        ArrayList<Restaurant> arrayRestaurants = new ArrayList<Restaurant>(Arrays.asList(restaurant1, restaurant2, restaurant3, restaurant4, restaurant5));

        HashSet<Restaurant> restaurants = new HashSet<>();

        for (Restaurant restaurant : arrayRestaurants) {

            if (!restaurants.add(restaurant)) {
                System.out.println("Ja existia");
            }
            else {
                System.out.println("s'ha afegit un restaurant nou");
            }   
        }
    }
}
