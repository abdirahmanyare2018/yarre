package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class fantoFragment extends Fragment {

    View view;
    ImageView imagefanto;
    TextView fantotext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.orange, container, false);
// get the reference of Button
        imagefanto = (ImageView) view.findViewById(R.id.imagefanto);
        fantotext=(TextView) view.findViewById(R.id.fantotext);

// perform setOnClickListener on second Button
        imagefanto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "breead", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}