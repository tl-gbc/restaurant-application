package ca.georgebrown.comp3074.project_group6;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<RestaurantItem> ITEMS = new ArrayList<RestaurantItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, RestaurantItem> ITEM_MAP = new HashMap<String, RestaurantItem>();

    private static final int COUNT = 5;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            String x = String.valueOf(i);
            addItem(new RestaurantItem(String.valueOf(i),"name"+x,"address"+x,"phone"+x,"hours"+x,"experience"+x));
        }
    }

    private static void addItem(RestaurantItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class RestaurantItem implements Serializable {
        public String id;

        public RestaurantItem(String id, String name, String address, String phoneNumber, String hours, String experience) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.hours = hours;
            this.experience = experience;
        }
        public String name;
        public String address;
        public String phoneNumber;
        public String hours;
        public String experience;
    }
}
