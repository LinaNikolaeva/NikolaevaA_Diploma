package com.example.korhomonyms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class Fifth_ex extends AppCompatActivity {
    public TextView mScoreView;
    private TextView mQuestion;
    private Button mButtonChoice1;//, mButtonChoice2, mButtonChoice3, mButtonChoice4;
    private int mScore = 0;
    private int mQuestionNumber = 37;
    private String mAnswer;
    public static String mNum_5;
    public EditText mAn;
    private Firebase mQuestionRef, mAnswerRef;//mChoice1Ref, mChoice2Ref, mChoice3Ref, mChoice4Ref, mAnswerRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_ex);
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestion = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mAn = (EditText)findViewById(R.id.otvet);

        updateQuestion();

        //Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable t = mAn.getText();
                String t1 = String.valueOf(t);
                if(t1.equals(mAnswer)){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                } else {
                    updateQuestion();
                }
            }
        });

    }

    public void updateScore(int score){
        mScoreView.setText("" + mScore);
    }

    public void updateQuestion() {
        mQuestionRef = new Firebase("https://korean-homonyms.firebaseio.com/" + mQuestionNumber + "/question");
        mQuestionRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String question = dataSnapshot.getValue(String.class);
                mQuestion.setText(question);
                mAn.setText("");
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });

        mAnswerRef = new Firebase("https://korean-homonyms.firebaseio.com/" + mQuestionNumber + "/answer");
        mAnswerRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                mAnswer = dataSnapshot.getValue(String.class);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mQuestionNumber += 1;
        if (mQuestionNumber > 47) {
            String num_5 = String.valueOf(mScore);
            mNum_5 = num_5;
            Intent res_5 = new Intent(".Res_5");
            startActivity(res_5);
        }
    }
}