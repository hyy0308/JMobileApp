package com.hewhywhy.jvocabapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class VocabActivity extends AppCompatActivity {
    private Button mPreButton;
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocab);

        mPreButton = (Button) findViewById(R.id.pre);
        mPreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VocabActivity.this,
                        R.string.pre_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
        mNextButton = (Button) findViewById(R.id.next);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VocabActivity.this,
                        R.string.next_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
