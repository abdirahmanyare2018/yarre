package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class spritefragment extends Fragment {

    View view;
    ImageView imagesprite;
    TextView spritetext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.orange, container, false);
// get the reference of Button
        imagesprite = (ImageView) view.findViewById(R.id.imagesprite);
       spritetext=(TextView) view.findViewById(R.id.spritetext);

// perform setOnClickListener on second Button
        imagesprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "breead", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}