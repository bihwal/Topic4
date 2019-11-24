package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    TextView Capital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Capital=findViewById(R.id.tvCapital);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            String result=bundle.getString("Capital");
            Capital.setText(result);
        }
    }
}
