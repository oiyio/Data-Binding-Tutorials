package com.smarttoolfactory.tutorial4recyclerviewwithclicklistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        Toast.makeText(this, this.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();

    }


}
