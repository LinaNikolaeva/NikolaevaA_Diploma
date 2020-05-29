package com.example.korhomonyms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Res_2 extends AppCompatActivity {
    private String mRes_2;
    private TextView mNumber_2;
    private TextView mFeedback_2;
    private Button mQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_2);
        mFeedback_2 = (TextView)findViewById(R.id.feedback);

        Second_ex r = new Second_ex();
        mRes_2 = r.mNum_2;
        mNumber_2 = (TextView)findViewById(R.id.result);
        mNumber_2.setText(mRes_2);
        result_end();
        onButton();

    }
    private void result_end(){
        int r1 = Integer.parseInt(mRes_2);
        if(r1>=7){
            mFeedback_2.setText("참 잘했어요!");
        }
        if(r1<7 && r1>=5){
            mFeedback_2.setText("좋습니다!");
        }
        if (r1<5){
            mFeedback_2.setText("힘내세요! 다시 해 보세요");
        }
    }
    public void onButton(){
        mQuit = (Button)findViewById(R.id.quit);
        mQuit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent f = new Intent (Res_2.this, front_page.class);
                        startActivity(f);
                    }
                }
        );
    }
    }