package ca.georgebrown.comp3074.project_group6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RestaurantList {
    public static final List<Restaurant> ITEMS = new ArrayList<Restaurant>();

    private static Random random = new Random(System.currentTimeMillis());

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Restaurant> ITEM_MAP = new HashMap<String, Restaurant>();

    private static final int COUNT = 5;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addRestaurant(createRestaurant(i));
        }
    }

    public static void addRestaurant(Restaurant item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static Restaurant createRestaurant(int position) {
        return new Restaurant(String.valueOf(random.nextLong()), "Restaurant " + position, makeDetails(position));
    }

    public static Restaurant createRestaurant(String name, String details) {
        return new Restaurant(String.valueOf(random.nextLong()), name, details);
    }

    public static void removeRestaurant(Restaurant item){
        Restaurant restaurant = ITEM_MAP.get(item.id);
        ITEMS.remove(restaurant);
        ITEM_MAP.remove(item.id);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Restaurant {
        public final String id;
        public final String content;
        public final String details;

        public Restaurant(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }


}
