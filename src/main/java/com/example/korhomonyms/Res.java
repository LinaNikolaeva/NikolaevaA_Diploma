package com.example.korhomonyms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Res extends AppCompatActivity {

    private String mRes;
    private TextView mNumber;
    private TextView mFeedback;
    private Button mQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        mFeedback = (TextView)findViewById(R.id.feedback);
        mQuit = (Button)findViewById(R.id.quit);

        MainActivity r = new MainActivity();
        mRes = r.mNum;
        mNumber = (TextView)findViewById(R.id.result);
        mNumber.setText(mRes);
        result_end();
        mQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Res.this, front_page.class);
                startActivity(f);
            }
        });
    }
    private void result_end(){
        int r1 = Integer.parseInt(mRes);
        if(r1>=7){
            mFeedback.setText("참 잘했어요!");
        }
        if(r1<7 && r1>=5){
            mFeedback.setText("좋습니다!");
        }
        if (r1<5){
            mFeedback.setText("힘내세요! 다시 해 보세요");
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
