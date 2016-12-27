package com.nanddgroup.itea_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Static_StaticFragment extends Fragment {


    public Static_StaticFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootLayout = inflater.inflate(R.layout.fragment_static__static,container);
        TextView tvValue = (TextView) rootLayout.findViewById(R.id.tvValue);
        SeekBar sb = (SeekBar) rootLayout.findViewById(R.id.sb);
        return rootLayout;

    }

}
