package com.example.graduationprojectjavamain;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class CourseDetailsFragment extends Fragment {

private Button vid1;
private Button vid2;

private Button vid3;

private Button vid4;


    public CourseDetailsFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view;
        Fragment fragment;
        view = inflater.inflate(R.layout.fragment_course_details, container, false);
        vid1=view.findViewById(R.id.vid1);
        vid2=view.findViewById(R.id.vid2);
        vid3=view.findViewById(R.id.vid3);
        vid4=view.findViewById(R.id.vid4);


        vid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                JournalsActivity CF = new JournalsFragment();
//                ft.replace(R.id.frameLayout, CF);
//                ft.commit();

                Intent intent = new Intent(getActivity(),vid1Activity.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });

        vid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                JournalsActivity CF = new JournalsFragment();
//                ft.replace(R.id.frameLayout, CF);
//                ft.commit();

                Intent intent = new Intent(getActivity(),vid2_anixiety.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });
        vid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                JournalsActivity CF = new JournalsFragment();
//                ft.replace(R.id.frameLayout, CF);
//                ft.commit();

                Intent intent = new Intent(getActivity(),vid3_anxiety.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });
        vid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                JournalsActivity CF = new JournalsFragment();
//                ft.replace(R.id.frameLayout, CF);
//                ft.commit();

                Intent intent = new Intent(getActivity(),vid4_anxiety.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });

        return view;
    }
}