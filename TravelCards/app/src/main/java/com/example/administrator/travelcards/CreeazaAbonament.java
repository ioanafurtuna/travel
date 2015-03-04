package com.example.administrator.travelcards;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreeazaAbonament extends Fragment {


    public CreeazaAbonament() {
        // Required empty public constructor
    }

    public static CreeazaAbonament newInstance() {
        CreeazaAbonament fragment = new CreeazaAbonament();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_creeaza_abonament, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(2);

    }

}
