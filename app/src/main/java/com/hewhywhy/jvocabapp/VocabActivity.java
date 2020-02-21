package com.hewhywhy.jvocabapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class VocabActivity extends AppCompatActivity {
    private Button mPreButton;
    private Button mNextButton;
    private TextView exampleVocabTextView;

    private Vocab[] vocabDataBase = new Vocab[] {
            new Vocab(R.string.example_vocab1, R.string.example_vocab1_trans1),
            new Vocab(R.string.example_vocab2, R.string.example_vocab1_trans2),
            new Vocab(R.string.example_vocab3, R.string.example_vocab1_trans3),
            new Vocab(R.string.example_vocab4, R.string.example_vocab1_trans4),
    };
    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocab);

        exampleVocabTextView = (TextView) findViewById(R.id.vocab_text_view);

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
                mCurrentIndex = (mCurrentIndex + 1) % vocabDataBase.length;
                updateQuestion();
            }
        });
    }
    private void updateQuestion() {
        int question = vocabDataBase[mCurrentIndex].getVocabId();
        exampleVocabTextView.setText(question);
    }
}
