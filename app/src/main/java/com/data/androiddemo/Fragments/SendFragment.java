package com.data.androiddemo.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.data.androiddemo.R;

public class SendFragment extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.send_fragment, container, false);

        Button sendBtn = myView.findViewById(R.id.btnSend);
        sendBtn.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnSend){
            Toast.makeText(getActivity(), "Message sent",Toast.LENGTH_LONG).show();
        }

    }
}
