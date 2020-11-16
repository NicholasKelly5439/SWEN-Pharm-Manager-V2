package com.example.swen444pharmacymanagerv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class BaggingMain extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bagging_main, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.MenuImage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BaggingMain.this)
                        .navigate(R.id.action_baggingMain_to_MainMenu);
            }
        });

        view.findViewById(R.id.BackImage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BaggingMain.this)
                        .navigate(R.id.action_baggingMain_to_MainMenu);
            }
        });

        view.findViewById(R.id.imageview_scanning_window).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BaggingMain.this)
                        .navigate(R.id.action_baggingMain_to_baggingRxScanning);
            }
        });
    }
}