package com.example.swen444pharmacymanagerv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class fragment_menu extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.BaggingButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment_menu.this)
                        .navigate(R.id.action_MainMenu_to_baggingMain);
            }
        });


        view.findViewById(R.id.InventoryButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment_menu.this)
                        .navigate(R.id.action_MainMenu_to_inventoryMain);
            }
        });


        view.findViewById(R.id.FillingButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment_menu.this)
                        .navigate(R.id.action_MainMenu_to_fillingMain);
            }
        });

        /*
        view.findViewById(R.id.OrderingButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment_menu.this)
                        .navigate(R.id.action_MainMenu_to_OrderingMain);
            }
        });

         */
    }
}