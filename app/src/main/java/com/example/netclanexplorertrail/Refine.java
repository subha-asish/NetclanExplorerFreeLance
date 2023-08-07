package com.example.netclanexplorertrail;

import android.os.Bundle;

import androidx.appcompat.widget.TooltipCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

import java.util.Locale;


public class Refine extends Fragment {
     String[] items = {"Available | Hey Let Us Connect"};
     AutoCompleteTextView autoCompleteTextView;
     ArrayAdapter<String> arrayAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_refine, container, false);


        Slider slider = view.findViewById(R.id.slider);
        TextView tooltipTextView = view.findViewById(R.id.tooltipTextView);
        // Set up the tooltip for the Slider
        TooltipCompat.setTooltipText(slider, "Tooltip Text");
        ;


//Drop Down
      autoCompleteTextView = view.findViewById(R.id.auto_complete_txt);
      arrayAdapter = new ArrayAdapter<String>(getContext(),R.layout.list_item,items);
      autoCompleteTextView.setAdapter(arrayAdapter);
        return view;
    }
}