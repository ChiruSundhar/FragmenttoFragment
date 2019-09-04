package com.example.task_3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment_second, container, false);
        Bundle bundle=new Bundle();
        String firstname=bundle.getString("FirstName");
        String lasstname=bundle.getString("lasstName");
        TextView firstext=(TextView)rootview.findViewById(R.id.firstname);
        TextView lasstext=(TextView)rootview.findViewById(R.id.lastname);
        firstext.setText(firstname);
        lasstext.setText(lasstname);
        // Inflate the layout for this fragment
        return rootview;
    }


}
