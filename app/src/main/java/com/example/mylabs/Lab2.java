package com.example.mylabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class Lab2 extends Fragment {
    private TextView titleText;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.lab_2, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        titleText = view.findViewById(R.id.titleLab);
        Button prev = view.findViewById(R.id.prev);
        Button next = view.findViewById(R.id.next);
        ImageButton buttonYes = view.findViewById(R.id.buttonYes);
        ImageButton buttonNo = view.findViewById(R.id.buttonNo);


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Lab2.this)
                        .navigate(R.id.action_lab2_to_FirstFragment);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Lab2.this)
                        .navigate(R.id.action_lab2_to_lab3);
            }
        });

        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titleText.setText("Very good!");
            }
        });

        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titleText.setText("It's not good..");
            }
        });
    }


}
