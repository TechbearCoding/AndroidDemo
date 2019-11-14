package com.data.androiddemo.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.data.androiddemo.R;

import org.w3c.dom.Text;

public class ToolsFragment extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.tools_fragment, container, false);

        Switch sw = myView.findViewById(R.id.switchDemo);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView txt = myView.findViewById(R.id.textDemo);
                if(isChecked){
                    txt.setText("Demo 2");
                }else{
                    txt.setText("Demo 1");
                }
            }
        });

        SeekBar seekBar = myView.findViewById(R.id.seekBar);
        final TextView textStatus = myView.findViewById(R.id.textStatus);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                textStatus.setText(String.valueOf(progress));
            }
        });
        return myView;
    }

    @Override
    public void onClick(View v) {
//        if(v.getId() == R.id.switchDemo){
//            Switch sw = v.findViewById(R.id.switchDemo);
//
//        }
    }
}
