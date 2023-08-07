package com.example.netclanexplorertrail;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class Explore extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_explore, container, false);
        tabLayout = rootView.findViewById(R.id.tabLayout);
        viewPager = rootView.findViewById(R.id.viewPager);

        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);

        return rootView;
    }
    private void setupViewPager() {
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getChildFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new IndividualFragment();
                    case 1:
                        return new ProfessionalFragment();
                    case 2:
                        return new MerchantFragment();
                    default:
                        throw new IllegalArgumentException("Invalid position: " + position);
                }
            }

            @Override
            public int getCount() {
                return 3; // Number of sections
            }


            public CharSequence getPageTitle(int position) {
                Context context = getContext(); // Replace with the appropriate context if needed

                switch (position) {
                    case 0:
                        Drawable individualIcon = ContextCompat.getDrawable(context, R.drawable.group);
                        return getTabTitleWithIcon(context, individualIcon);
                    case 1:
                        Drawable professionalIcon = ContextCompat.getDrawable(context, R.drawable.portfolio);
                        return getTabTitleWithIcon(context, professionalIcon);
                    case 2:
                        Drawable merchantIcon = ContextCompat.getDrawable(context, R.drawable.shop);
                        return getTabTitleWithIcon(context, merchantIcon);
                    default:
                        return null;
                }
            }
        };

        viewPager.setAdapter(adapter);
    }
    private SpannableString getTabTitleWithIcon(Context context, Drawable icon) {
        icon.setBounds(0, 0, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
        ImageSpan imageSpan = new ImageSpan(icon, ImageSpan.ALIGN_BOTTOM);
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }
}