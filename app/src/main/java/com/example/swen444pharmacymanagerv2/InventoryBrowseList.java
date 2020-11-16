package com.example.swen444pharmacymanagerv2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InventoryBrowseList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InventoryBrowseList extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InventoryBrowseList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InventoryBrowseList.
     */
    // TODO: Rename and change types and number of parameters
    public static InventoryBrowseList newInstance(String param1, String param2) {
        InventoryBrowseList fragment = new InventoryBrowseList();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inventory_browse_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        view.findViewById(R.id.MenuImage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(InventoryBrowseList.this)
                        .navigate(R.id.action_inventoryBrowseList_to_MainMenu);
            }
        });

        view.findViewById(R.id.inventory_browse_list_back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(InventoryBrowseList.this)
                        .navigate(R.id.action_inventoryBrowseList_to_inventoryBrowseSearch);
            }
        });

        view.findViewById(R.id.searchResult1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(InventoryBrowseList.this)
                        .navigate(R.id.action_inventoryBrowseList_to_inventoryBrowseDetails);
            }
        });

        view.findViewById(R.id.searchResult2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(InventoryBrowseList.this)
                        .navigate(R.id.action_inventoryBrowseList_to_inventoryBrowseDetails);
            }
        });
    }
}