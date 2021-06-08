package com.example.basicfunctions;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.basicfunctions.databinding.FragmentFirstBinding;

import static com.example.basicfunctions.R.id.action_FirstFragment_to_SecondFragment;

public class FirstFragment extends Fragment {
    Button alarmbt;
    Button camerabt;
    Button emailbt;
    Button phonebt;
    Button browserbt;
    Button mapbt;

    private FragmentFirstBinding binding;

    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        s
//    }
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.alarmbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

//        super.onViewCreated(view, savedInstanceState);

        binding.camerabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
//                    startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
                    startActivity(intent);
                }
            }
        });

        binding.emailbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), emailwrite.class);
                startActivity(intent);
            }
        });

        binding.phonebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), PhoneCall.class);
                startActivity(intent);
            }
        });

        binding.browserbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), webopen.class);
                startActivity(intent);
            }
        });

        binding.mapbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}