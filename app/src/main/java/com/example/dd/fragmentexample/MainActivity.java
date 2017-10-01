package com.example.dd.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView baensFragment,braedFragment,chapatiFragment,fantoFragment,limoFragment,khareFragment,spriteFragment,cococoloFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// get the reference of Button's



       baensFragment= (TextView) findViewById(R.id.baensFragment);
        braedFragment= (TextView) findViewById(R.id.braedFragment);
        chapatiFragment= (TextView) findViewById(R.id.chapatifragment);
        fantoFragment= (TextView) findViewById(R.id.fantoFragment);
       limoFragment= (TextView) findViewById(R.id.limoFragment);
        khareFragment= (TextView) findViewById(R.id.khareFragment);
        spriteFragment= (TextView) findViewById(R.id.spriteFragment);






        baensFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new baensFragment());
            }
        });
        braedFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new braedFragment());
            }
        });
        chapatiFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new braedFragment());
            }
        });


        fantoFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new fantoFragment());
            }
        });
        limoFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new limoFragment());
            }
        });
        khareFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new kharefragment());
            }
        });
        spriteFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new spritefragment());
            }
        });


    }



    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}