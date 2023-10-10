package n2ex2;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {


        //exercici 1
        Restaurant restaurant1 = new Restaurant("restaurant1", 7);
        Restaurant restaurant2 = new Restaurant("restaurant2", 8);
        Restaurant restaurant3 = new Restaurant("restaurant3", 7);
        Restaurant restaurant4 = new Restaurant("restaurant1", 7);
        Restaurant restaurant5 = new Restaurant("Restaurant", 4);
        Restaurant restaurant6 = new Restaurant("restaurant7", 6);
        Restaurant restaurant7 = new Restaurant("restaurant7", 9);
        Restaurant restaurant8 = new Restaurant("restaurantePaco", 8);

        ArrayList<Restaurant> arrayRestaurants = new ArrayList<Restaurant>(Arrays.asList(restaurant1, restaurant2, restaurant3, restaurant4, restaurant5, restaurant6, restaurant7, restaurant8));

        HashSet<Restaurant> restaurants = new HashSet<>();

        for (Restaurant restaurant : arrayRestaurants) {

            if (!restaurants.add(restaurant)) {
                System.out.println("Ja existia");
            }
            else {
                System.out.println("s'ha afegit un restaurant nou");
            }   
        }

        //exercici 2

        ArrayList<Restaurant> orderedRestaurants = new ArrayList<>(restaurants);
        orderedRestaurants.sort(new SortRestaurant());

        for (Restaurant restaurant : orderedRestaurants) {
            System.out.println(restaurant);
        }

      
    }
}

