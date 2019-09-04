package com.example.task_3;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {
   EditText firstname,lastname;
   Button submitbtn;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment_first, container, false);
        // Inflate the layout for this fragment
        firstname=(EditText)rootview.findViewById(R.id.firstname);
        lastname=(EditText)rootview.findViewById(R.id.lastname);
        submitbtn=(Button)rootview.findViewById(R.id.btn);
        String first=firstname.getText().toString();
        String last=lastname.getText().toString();
        Bundle bundle=new Bundle();
        bundle.putString("FirstName",first);
        bundle.putString("LastName",last);
        FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        SecondFragment secondFragment=new SecondFragment();
        secondFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.frame_container,secondFragment);
        fragmentTransaction.commit();

        return rootview;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }



}
