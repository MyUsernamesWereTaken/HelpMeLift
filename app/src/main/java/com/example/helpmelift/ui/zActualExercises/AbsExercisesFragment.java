package com.example.helpmelift.ui.zActualExercises;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.helpmelift.AbsMuscle;
import com.example.helpmelift.MainActivity;
import com.example.helpmelift.R;

import com.example.helpmelift.Abs_crunch;
import com.example.helpmelift.databinding.FragmentAbsExercisesBinding;
import com.example.helpmelift.ui.AbsWorkout.lsit;
import com.example.helpmelift.ui.AbsWorkout.russiantwist;
import com.example.helpmelift.ui.AbsWorkout.situps;

public class AbsExercisesFragment extends Fragment {

    private FragmentAbsExercisesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAbsExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button crunch_butt = root.findViewById(R.id.Crunches);
        Toast.makeText(requireContext(), "HERE", Toast.LENGTH_LONG).show();
        Button situpButton = root.findViewById(R.id.Situp);
        Button lsitButton = root.findViewById(R.id.Lsit);
        Button russiantwistsButton = root.findViewById(R.id.RussianTwists);

        crunch_butt.setOnClickListener(v1 -> glimpseCrunches(requireContext()));
        situpButton.setOnClickListener(v2 -> glimpseSitup(requireContext()));
        lsitButton.setOnClickListener(v3 -> glimpseLsit(requireContext()));
        russiantwistsButton.setOnClickListener(v4 -> glimpseRussiantwist(requireContext()));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void glimpseCrunches(Context context) {
        Toast.makeText(getActivity(), "HEREX2", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(context, Abs_crunch.class);
        startActivity(intent);
    }

    public void glimpseSitup(Context context) {
        Intent intent = new Intent(context, situps.class);
        startActivity(intent);
    }
    public void glimpseLsit(Context context) {
        Intent intent = new Intent(context, lsit.class);
        startActivity(intent);
   }

    public void glimpseRussiantwist(Context context) {
        Intent intent = new Intent(context, russiantwist.class);
        startActivity(intent);
    }

}