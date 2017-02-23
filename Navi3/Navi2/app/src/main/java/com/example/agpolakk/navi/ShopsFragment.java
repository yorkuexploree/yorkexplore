package com.example.agpolakk.navi;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by agpolakk on 22/02/2017.
 */

public class ShopsFragment extends Fragment {

    View myView;
    String[] SHOPS;
    ArrayAdapter adapter_shops;
    ListView listView_shops;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.shopslayout,container,false);

        SHOPS = new String[]{"Central Square", "Heroes", "Popoyes",
                "YU Bookstore", "Shopper's Drug Mart", "Bar&Grill", "The Absinthe Pub", "Second Cup",
                "Tim Horton's"};
        adapter_shops = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, SHOPS);

        listView_shops = (ListView) myView.findViewById(R.id.listView_shops);
        listView_shops.setAdapter(adapter_shops);



        return myView;
    }
}
