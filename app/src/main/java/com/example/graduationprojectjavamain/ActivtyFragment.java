package com.example.graduationprojectjavamain;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ActivtyFragment extends Fragment {

    private ImageView activityBtn;
    private ImageView tipsBtn;
    private ImageView getHelpBtn;


    public ActivtyFragment() {
        // Required empty public constructor
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view;
        view = inflater.inflate(R.layout.fragment_activty, container, false);
        activityBtn=view.findViewById(R.id.imageView15);
        tipsBtn=view.findViewById(R.id.imageView16);
        getHelpBtn=view.findViewById(R.id.imageView18);

        activityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                JournalsActivity CF = new JournalsFragment();
//                ft.replace(R.id.frameLayout, CF);
//                ft.commit();

                Intent intent = new Intent(getActivity(),Records_list.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });
        tipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                JournalsActivity CF = new JournalsFragment();
//                ft.replace(R.id.frameLayout, CF);
//                ft.commit();

                Intent intent = new Intent(getActivity(),TipsActivity.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });


        getHelpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                JournalsActivity CF = new JournalsFragment();
//                ft.replace(R.id.frameLayout, CF);
//                ft.commit();

                Intent intent = new Intent(getActivity(),GetHelp.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });

        return view;

    }
}