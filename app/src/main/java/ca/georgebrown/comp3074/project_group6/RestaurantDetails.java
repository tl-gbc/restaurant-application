package ca.georgebrown.comp3074.project_group6;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantDetails extends Fragment {


    public RestaurantDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_restaurant_details, container, false);

        Bundle bundle=getArguments();
        String name = bundle.getString("name");
        String address = bundle.getString("address");
        String phoneNumber=bundle.getString("phoneNumber");
        String hours = bundle.getString("hours");
        String exp = bundle.getString("exp");

        TextView txtName = rootView.findViewById(R.id.nameOut);
        TextView txtAddress = rootView.findViewById(R.id.addressOut);
        TextView txtPN = rootView.findViewById(R.id.phoneOut);
        TextView txtHours = rootView.findViewById(R.id.hoursOut);
        TextView txtExp = rootView.findViewById(R.id.expOut);

        txtName.setText(name);
        txtAddress.setText(address);
        txtPN.setText(phoneNumber);
        txtHours.setText(hours);
        txtExp.setText(exp);


        return rootView;
    }

}
