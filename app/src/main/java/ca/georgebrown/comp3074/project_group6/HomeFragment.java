package ca.georgebrown.comp3074.project_group6;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private ListView lv;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_home, container, false);
        lv = (ListView) rootView.findViewById(R.id.lv);
        ArrayAdapter<RestaurantList.Restaurant> arrayAdapter = new ArrayAdapter<RestaurantList.Restaurant>(getActivity(), android.R.layout.simple_list_item_1, RestaurantList.ITEMS);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //final Restaurant.RestaurantItem item = (Restaurant.RestaurantItem)parent.getItemAtPosition(position);
                final RestaurantList.Restaurant item = (RestaurantList.Restaurant)parent.getItemAtPosition(position);

                /*String name = item.name;
                String address=item.address;
                String phoneNumber=item.phoneNumber;
                String hours = item.hours;
                String exp = item.experience;
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putString("address",address);
                bundle.putString("phoneNumber",phoneNumber);
                bundle.putString("hours",hours);
                bundle.putString("exp",exp);

                RestaurantDetails restaurantDetails = new RestaurantDetails();
                restaurantDetails.setArguments(bundle);


                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container, restaurantDetails).addToBackStack(null).commit();*/
            }
        });


        return rootView;
    }

}
