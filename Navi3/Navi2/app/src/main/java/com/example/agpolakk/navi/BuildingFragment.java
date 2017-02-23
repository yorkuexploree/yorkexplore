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

public class BuildingFragment extends Fragment {

    View myView;
    String[] BUILDINGS;
    ArrayAdapter adapter_building;
    ListView listView_building;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.buildingslayout,container,false);

        BUILDINGS = new String[]{"Central Square", "York Lanes", "Stacie Library",
                "YU Bookstore", "Lassonde School of Engineering", "Curtis Lucture Hall", "Vari Hall",
                "Life Science Building", "Accolade West"};
        adapter_building = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, BUILDINGS);

        listView_building = (ListView) myView.findViewById(R.id.listView_building);
        listView_building.setAdapter(adapter_building);

        return myView;
    }
}
