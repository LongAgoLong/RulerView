package com.leo.rulerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leo.ruler.OnChooseResulterListener;
import com.leo.ruler.RulerView;

public class MainActivity extends AppCompatActivity {
    private RulerView mRulerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRulerView = findViewById(R.id.rulerView);
        mRulerView.setOnChooseResulterListener(new OnChooseResulterListener() {
            @Override
            public void onEndResult(String result) {

            }

            @Override
            public void onScrollResult(String result) {

            }
        });
    }
}
