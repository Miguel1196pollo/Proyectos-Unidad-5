package mx.edu.utng.seccion_08_navigation_drawer.Fragments;

/**
 * Created by Toshiba on 14/04/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.edu.utng.seccion_08_navigation_drawer.R;


public class AlertsFragment extends Fragment {


    public AlertsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alerts, container, false);
    }

}