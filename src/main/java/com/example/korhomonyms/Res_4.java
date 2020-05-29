package com.example.korhomonyms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Res_4 extends AppCompatActivity {
    private String mRes_4;
    private TextView mNumber_4;
    private TextView mFeedback_4;
    private Button mQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_4);
        mFeedback_4 = (TextView)findViewById(R.id.feedback);
        mQuit = (Button)findViewById(R.id.quit);

        Fourth_ex r = new Fourth_ex();
        mRes_4 = r.mNum_4;
        mNumber_4 = (TextView)findViewById(R.id.result);
        mNumber_4.setText(mRes_4);
        result_end();
        mQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent res = new Intent(Res_4.this, front_page.class);
                startActivity(res);
            }
        });
    }
    private void result_end(){
        int r1 = Integer.parseInt(mRes_4);
        if(r1>=7){
            mFeedback_4.setText("참 잘했어요!");
        }
        if(r1<7 && r1>=5){
            mFeedback_4.setText("좋습니다!");
        }
        if (r1<5){
            mFeedback_4.setText("힘내세요! 다시 해 보세요");
        }
    }
}
