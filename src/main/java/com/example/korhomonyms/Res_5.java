package com.example.korhomonyms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Res_5 extends AppCompatActivity {
    private String mRes_5;
    private TextView mNumber_5;
    private TextView mFeedback_5;
    private Button mQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_5);
        mFeedback_5 = (TextView)findViewById(R.id.feedback);
        mQuit = (Button)findViewById(R.id.quit);

        Fifth_ex r = new Fifth_ex();
        mRes_5 = r.mNum_5;
        mNumber_5 = (TextView)findViewById(R.id.result);
        mNumber_5.setText(mRes_5);
        result_end();
        mQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent res = new Intent(Res_5.this, front_page.class);
                startActivity(res);
            }
        });
    }
    private void result_end(){
        int r1 = Integer.parseInt(mRes_5);
        if(r1>=7){
            mFeedback_5.setText("참 잘했어요!");
        }
        if(r1<7 && r1>=5){
            mFeedback_5.setText("좋습니다!");
        }
        if (r1<5){
            mFeedback_5.setText("힘내세요! 다시 해 보세요");
        }
    }
}
