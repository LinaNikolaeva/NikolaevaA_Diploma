package com.example.korhomonyms;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class front_page extends AppCompatActivity {

    private Button bt_ex1, bt_ex2, bt_ex3, bt_ex4, bt_ex5, btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        bt_ex1 = (Button)findViewById(R.id.ex1);
        bt_ex2 = (Button)findViewById(R.id.ex2);
        bt_ex3 = (Button)findViewById(R.id.ex3);
        bt_ex4 = (Button)findViewById(R.id.ex4);
        bt_ex5 = (Button)findViewById(R.id.ex5);
        btn_exit = (Button)findViewById(R.id.exit);

        bt_ex1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent ex1 = new Intent(".MainActivity");
                        startActivity(ex1);
                    }
                }
        );
        bt_ex2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent ex2 = new Intent(".Second_ex");
                        startActivity(ex2);
                    }
                }
        );
        bt_ex3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent ex3 = new Intent(".Third_ex");
                        startActivity(ex3);
                    }
                }
        );
        bt_ex4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent ex4 = new Intent(".Fourth_ex");
                        startActivity(ex4);
                    }
                }
        );
        bt_ex5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent ex5 = new Intent(".Fifth_ex");
                        startActivity(ex5);
                    }
                }
        );
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder exit_build = new AlertDialog.Builder(front_page.this);
                exit_build.setMessage("Вы хотите выйти из приложения?")
                        .setCancelable(false)
                        .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog to_exit = exit_build.create();
                to_exit.setTitle("Выход");
                to_exit.show();
            }
        });
    }

}
