package com.example.graduationprojectjavamain;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.graduationprojectjavamain.perfectionism_guestions.Perfectionism;


public class CoursesFragment extends Fragment {


private ImageView anixietycourse;
    private ImageView social_anixietycourse;
    private ImageView perfectionism;

    public CoursesFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view;
        Fragment fragment;
        view = inflater.inflate(R.layout.fragment_courses, container, false);
        anixietycourse = view.findViewById(R.id.imageView18);
        social_anixietycourse=view.findViewById(R.id.social_anxiety);
        perfectionism=view.findViewById(R.id.perfectionism);
        anixietycourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
               CourseDetailsFragment CF = new  CourseDetailsFragment();
                ft.replace(R.id.frameLayout, CF);
                ft.commit();
            }
        });
        social_anixietycourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),vid_social_anxiety_list.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });


        perfectionism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Perfectionism.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}