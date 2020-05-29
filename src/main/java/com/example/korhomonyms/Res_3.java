package com.example.korhomonyms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Res_3 extends AppCompatActivity {
    private String mRes_3;
    private TextView mNumber_3;
    private TextView mFeedback_3;
    private Button mQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_3);
        mFeedback_3 = (TextView)findViewById(R.id.feedback);
        mQuit = (Button)findViewById(R.id.quit);

        Third_ex r = new Third_ex();
        mRes_3 = r.mNum_3;
        mNumber_3 = (TextView)findViewById(R.id.result);
        mNumber_3.setText(mRes_3);
        result_end();

        mQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent res = new Intent(Res_3.this, front_page.class);
                startActivity(res);
            }
        });
    }
    private void result_end(){
        int r1 = Integer.parseInt(mRes_3);
        if(r1>=7){
            mFeedback_3.setText("참 잘했어요!");
        }
        if(r1<7 && r1>=5){
            mFeedback_3.setText("좋습니다!");
        }
        if (r1<5){
            mFeedback_3.setText("힘내세요! 다시 해 보세요");
        }
    }
}
