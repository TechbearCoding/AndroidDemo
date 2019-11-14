package com.data.androiddemo.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.data.androiddemo.R;

public class ShareFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.share_fragment, container, false);

        WebView dogview = myView.findViewById(R.id.dogView);

        dogview.loadUrl("https://swedbank.se/");
        float scalingFactor = 0.9f; // scale down to half the size
        dogview.setScaleX(scalingFactor);
        dogview.setScaleY(scalingFactor);

        return myView;
    }


}
