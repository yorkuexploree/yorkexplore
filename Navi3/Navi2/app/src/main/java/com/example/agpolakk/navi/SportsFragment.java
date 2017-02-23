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

public class SportsFragment extends Fragment {

    View myView;
    String[] SPORTS;
    ArrayAdapter adapter_sports;
    ListView listView_sports;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.sportslayout,container,false);

        SPORTS = new String[]{"Basketball", "Volleyball", "Badminton",
                "Tennis", "Swimming"};
        adapter_sports = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, SPORTS);

        listView_sports = (ListView) myView.findViewById(R.id.listView_sports);
        listView_sports.setAdapter(adapter_sports);

        return myView;
    }
}
