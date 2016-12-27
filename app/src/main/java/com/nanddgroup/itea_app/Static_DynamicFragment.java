package com.nanddgroup.itea_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Static_DynamicFragment extends Fragment {


    public Static_DynamicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String data[] = {"Киев", "Львов", "Одесса", "Донецк", "Харьков"};
        ListView lv = new ListView(getActivity());
        ArrayAdapter<String> ad = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_list_item_1,
                        data);
        lv.setAdapter(ad);
        return lv;
    }

}
