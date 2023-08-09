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


public class ArticlesFragment extends Fragment {

private Button worry;
private Button anxiety;

private Button social_anxiety;

    public ArticlesFragment() {
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
        view = inflater.inflate(R.layout.fragment_articles, container, false);
       worry = view.findViewById(R.id.btn_worry);
        anxiety = view.findViewById(R.id.btn_anixiety2);
        social_anxiety = view.findViewById(R.id.btn_phopia);

        worry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                WorryFragment CF = new WorryFragment();
                ft.replace(R.id.frameLayout, CF);
                ft.commit();
            }
        });
        anxiety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ArticlesList.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });

        social_anxiety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Social_anixiety_list_articles.class);
                //  intent.putExtra("Hello","Nisar");
                getActivity().startActivity(intent);
            }
        });

        return view;
    }
}