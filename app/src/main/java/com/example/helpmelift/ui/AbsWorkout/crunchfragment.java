package com.example.helpmelift.ui.AbsWorkout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;
import com.example.helpmelift.databinding.FragmentCrunchfragmentBinding;
import com.example.helpmelift.R;

public class crunchfragment extends Fragment {

    private FragmentCrunchfragmentBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentCrunchfragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        MediaController mediaController = new MediaController(requireContext());
        VideoView crunch_video= (VideoView) root.findViewById(R.id.crunchesvid);
        //crunch_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ab_crunches);

        mediaController.setAnchorView(crunch_video);
        crunch_video.setMediaController(mediaController);

        crunch_video.start();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}