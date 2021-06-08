package com.example.basicfunctions;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.basicfunctions.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    EditText Aname;
    EditText hours;
    EditText minutes;
    Button Aset;

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
        Aset=view.findViewById(R.id.Aset);
        Aname=view.findViewById(R.id.Aname);
        hours=view.findViewById(R.id.hours);
        minutes=view.findViewById(R.id.minutes);

        Aset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Alarmname= Aname.getText().toString();
                int hour=Integer.parseInt(hours.getText().toString());
                int minute=Integer.parseInt(minutes.getText().toString());
//                Toast.makeText(getActivity(),Alarmname+" "+hour+" "+minute, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                        .putExtra(AlarmClock.EXTRA_MESSAGE, Alarmname)
                        .putExtra(AlarmClock.EXTRA_HOUR, hour)
                        .putExtra(AlarmClock.EXTRA_MINUTES, minute);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);
                }


            }
        });

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}