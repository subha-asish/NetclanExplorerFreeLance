package com.example.netclanexplorertrail;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MerchantFragment extends Fragment {

    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_individual, container, false);

        recyclerView=view.findViewById(R.id.recyclerViewProfiles);


        ArrayList<profilemodel3> contactsss = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        contactsss.add(new profilemodel3(R.drawable.srk, "john"));
        contactsss.add(new profilemodel3(R.drawable.srk, "Roman"));
        contactsss.add(new profilemodel3(R.drawable.srk, "david"));
        contactsss.add(new profilemodel3(R.drawable.srk, "mitchel"));
        contactsss.add(new profilemodel3(R.drawable.srk, "kane"));
        contactsss.add(new profilemodel3(R.drawable.srk, "conway"));
        contactsss.add(new profilemodel3(R.drawable.srk, "ali"));
        contactsss.add(new profilemodel3(R.drawable.srk, "Vira"));
        contactsss.add(new profilemodel3(R.drawable.srk, "john"));
        contactsss.add(new profilemodel3(R.drawable.srk, "Roman"));
        contactsss.add(new profilemodel3(R.drawable.srk, "david"));
        contactsss.add(new profilemodel3(R.drawable.srk, "mitchel"));
        contactsss.add(new profilemodel3(R.drawable.srk, "kane"));
        contactsss.add(new profilemodel3(R.drawable.srk, "conway"));
        contactsss.add(new profilemodel3(R.drawable.srk, "ali"));
        contactsss.add(new profilemodel3(R.drawable.srk, "Vira"));
        contactsss.add(new profilemodel3(R.drawable.srk, "john"));
        contactsss.add(new profilemodel3(R.drawable.srk, "Roman"));
        contactsss.add(new profilemodel3(R.drawable.srk, "david"));
        contactsss.add(new profilemodel3(R.drawable.srk, "mitchel"));
        contactsss.add(new profilemodel3(R.drawable.srk, "kane"));
        contactsss.add(new profilemodel3(R.drawable.srk, "conway"));
        contactsss.add(new profilemodel3(R.drawable.srk, "ali"));
        contactsss.add(new profilemodel3(R.drawable.srk, "Vira"));

        AdapterMerchant adapter = new AdapterMerchant(contactsss,getContext());
        recyclerView.setAdapter(adapter);



        return view;
    }
}