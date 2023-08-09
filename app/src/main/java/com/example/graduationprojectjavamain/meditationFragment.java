package com.example.graduationprojectjavamain;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class meditationFragment extends Fragment {

    private Button courses;
    private Button articles;
    private Button notes;

    private Button community;
    public meditationFragment() {
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
        view = inflater.inflate(R.layout.fragment_meditation, container, false);
       courses=view.findViewById(R.id.btn_courses);
       articles=view.findViewById(R.id.btn_try_again);
       notes=view.findViewById(R.id.btn_notes);
       community=view.findViewById(R.id.btn_community);
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                CoursesFragment CF = new CoursesFragment();
                ft.replace(R.id.frameLayout, CF);
                ft.commit();
            }
        });

        articles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ArticlesFragment CF = new ArticlesFragment();
                ft.replace(R.id.frameLayout, CF);
                ft.commit();
            }
        });

       notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                JournalsActivity CF = new JournalsFragment();
//                ft.replace(R.id.frameLayout, CF);
//                ft.commit();

                Intent intent = new Intent(getActivity(),NoteDetailsActivity.class);
              //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });


        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                JournalsActivity CF = new JournalsFragment();
//                ft.replace(R.id.frameLayout, CF);
//                ft.commit();

                Intent intent = new Intent(getActivity(),communityActivity.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });

        return view;
    }



}