package com.data.androiddemo.Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.data.androiddemo.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.home_fragment, container, false);

        Button showText = myView.findViewById(R.id.btnToast);
        showText.setOnClickListener(this);

        Button color = myView.findViewById(R.id.btnColor);
        color.setOnClickListener(this);
        return myView;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnToast){
            Toast.makeText(getActivity(), "Some demo text",Toast.LENGTH_LONG).show();
        }

        if(v.getId() == R.id.btnColor){
            Button btn = v.findViewById(R.id.btnColor);
            btn.setBackgroundColor(Color.RED);
        }
    }
}
