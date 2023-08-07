package com.example.netclanexplorertrail;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ProfessionalFragment extends Fragment {
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_individual, container, false);

        recyclerView=view.findViewById(R.id.recyclerViewProfiles);


        ArrayList<profilemodel> contactsss = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        contactsss.add(new profilemodel(R.drawable.srk, "john","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "Roman","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "david","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "mitchel","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "kane","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "conway","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "ali","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "Vira","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "john","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "Roman","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "david","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "mitchel","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "kane","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "conway","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "ali","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "Vira","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "john","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "Roman","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "david","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "mitchel","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "kane","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "conway","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "ali","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));
        contactsss.add(new profilemodel(R.drawable.srk, "Vira","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur consectetur vitae nisi et cursus."));

        AdapterProffessional adapter = new AdapterProffessional(contactsss,getContext());
        recyclerView.setAdapter(adapter);



        return view;
    }
}