package com.example.helpmelift.ui.MuscleGroups;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.helpmelift.DeltMuscle;
import com.example.helpmelift.BicepMuscle;
import com.example.helpmelift.TricepMuscle;
import com.example.helpmelift.AbsMuscle;
import com.example.helpmelift.TrapsMuscle;
import com.example.helpmelift.LatsMuscle;
import com.example.helpmelift.LowerBackMuscle;
import com.example.helpmelift.GlutesMuscle;
import com.example.helpmelift.QuadsMuscle;
import com.example.helpmelift.HamstringMuscle;
import com.example.helpmelift.CalvesMuscle;
import com.example.helpmelift.ForearmsMuscle;
import com.example.helpmelift.R;
import com.example.helpmelift.databinding.FragmentMusclegroupsBinding;


//CONNECTED TO fragment_musclegroups.xml
public class MuscleGroupsFragment extends Fragment {

    private FragmentMusclegroupsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMusclegroupsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Initialize buttons
        Button delt_butt = root.findViewById(R.id.Delts);
        Button bicep_butt = root.findViewById(R.id.Biceps);
        Button tricep_butt = root.findViewById(R.id.Triceps);
        Button abs_butt = root.findViewById(R.id.Abs);
        Button traps_butt = root.findViewById(R.id.Trapezius);
        Button lats_butt = root.findViewById(R.id.Lats);
        Button lowerback_butt = root.findViewById(R.id.Lower_back);
        Button glute_butt = root.findViewById(R.id.Glutes);
        Button quads_butt = root.findViewById(R.id.Quadriceps);
        Button hamstring_butt = root.findViewById(R.id.Hamstrings);
        Button calves_butt = root.findViewById(R.id.Calves);
        Button forearms_butt = root.findViewById(R.id.Forearms);

        delt_butt.setOnClickListener(v1 -> viewDelts(requireContext()));
        bicep_butt.setOnClickListener(v2 -> viewBiceps(requireContext()));
        tricep_butt.setOnClickListener(v3 -> viewTriceps(requireContext()));
        abs_butt.setOnClickListener(v4 -> viewAbs(requireContext()));
        traps_butt.setOnClickListener(v5 -> viewTraps(requireContext()));
        lats_butt.setOnClickListener(v6 -> viewLats(requireContext()));
        lowerback_butt.setOnClickListener(v7 -> viewLowerBack(requireContext()));
        glute_butt.setOnClickListener(v8 -> viewGlutes(requireContext()));
        quads_butt.setOnClickListener(v9 -> viewQuads(requireContext()));
        hamstring_butt.setOnClickListener(v10 -> viewHamstring(requireContext()));
        calves_butt.setOnClickListener(v11 -> viewCalves(requireContext()));
        forearms_butt.setOnClickListener(v12 -> viewForearms(requireContext()));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void viewDelts(Context context) {
        Intent intent = new Intent(context, DeltMuscle.class);
        intent.putExtra("Muscle", "Deltoids/Shoulders");
        startActivity(intent);
    }
    private void viewBiceps(Context context) {
        Intent intent = new Intent(context, BicepMuscle.class);
        intent.putExtra("Muscle", "Biceps");
        startActivity(intent);
    }
    private void viewTriceps(Context context) {
        Intent intent = new Intent(context, TricepMuscle.class);
        intent.putExtra("Muscle", "Triceps");
        startActivity(intent);
    }
    private void viewAbs(Context context) {
        Intent intent = new Intent(context, AbsMuscle.class);
        intent.putExtra("Muscle", "Abs");
        startActivity(intent);
    }
    private void viewTraps(Context context) {
        Intent intent = new Intent(context, TrapsMuscle.class);
        intent.putExtra("Muscle", "Trapezius");
        startActivity(intent);
    }
    private void viewLats(Context context) {
        Intent intent = new Intent(context, LatsMuscle.class);
        intent.putExtra("Muscle", "Latissimus Dorsi");
        startActivity(intent);
    }
    private void viewLowerBack(Context context) {
        Intent intent = new Intent(context, LowerBackMuscle.class);
        intent.putExtra("Muscle", "Lower Back");
        startActivity(intent);
    }
    private void viewGlutes(Context context) {
        Intent intent = new Intent(context, GlutesMuscle.class);
        intent.putExtra("Muscle", "Glutes");
        startActivity(intent);
    }
    private void viewQuads(Context context) {
        Intent intent = new Intent(context, QuadsMuscle.class);
        intent.putExtra("Muscle", "Quadriceps");
        startActivity(intent);
    }
    private void viewHamstring(Context context) {
        Intent intent = new Intent(context, HamstringMuscle.class);
        intent.putExtra("Muscle", "Hamstrings");
        startActivity(intent);
    }
    private void viewCalves(Context context) {
        Intent intent = new Intent(context, CalvesMuscle.class);
        intent.putExtra("Muscle", "Calves");
        startActivity(intent);
    }
    private void viewForearms(Context context) {
        Intent intent = new Intent(context, ForearmsMuscle.class);
        intent.putExtra("Muscle", "Forearms");
        startActivity(intent);
    }


}
