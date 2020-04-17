package com.example.mylabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Lab3 extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.lab_3, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button prev = view.findViewById(R.id.prev);
        ImageView sun = view.findViewById(R.id.sun);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Lab3.this)
                        .navigate(R.id.action_lab3_to_lab2);
            }
        });


        Animation sunRiseAnimation = AnimationUtils.loadAnimation(getActivity()
                .getBaseContext().getApplicationContext(), R.anim.sun_rise);

        sun.startAnimation(sunRiseAnimation);
    }
}
