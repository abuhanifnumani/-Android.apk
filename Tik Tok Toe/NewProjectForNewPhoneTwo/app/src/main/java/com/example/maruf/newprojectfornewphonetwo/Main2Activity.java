package com.example.maruf.newprojectfornewphonetwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    int turn = 0, test = 0, sum = 0, sum2 = 0;

    private Button reset, exit, btn1, btn2, btn3, btn4,btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        reset = (Button) findViewById(R.id.reset);
        exit = (Button) findViewById(R.id.exit);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);



        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        reset.setOnClickListener(this);


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

                /*Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);*/


                /*android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);*/

                /*finish();
                System.exit(0);*/
            }

        });


    }





    @Override
    public void onClick(View view) {

        switch (view.getId()) {


            case R.id.btn1:
                sum++;
                if (btn1.getText().toString().equals("")) {
                    if (turn == 0) {
                        btn1.setText("0");
                        turn = 1;
                        result();
                    } else if (turn == 1) {
                        btn1.setText("X");
                        turn = 0;
                        result();
                    }
                }
                break;
            case R.id.btn2:
                sum++;
                if (btn2.getText().toString().equals("")) {
                    if (turn == 0) {
                        btn2.setText("0");
                        turn = 1;
                        result();
                    } else if (turn == 1) {
                        btn2.setText("X");
                        turn = 0;
                        result();
                    }
                }
                break;
            case R.id.btn3:
                sum++;
                if (btn3.getText().toString().equals("")) {
                    if (turn == 0) {
                        btn3.setText("0");
                        turn = 1;
                        result();
                    } else if (turn == 1) {
                        btn3.setText("X");
                        turn = 0;
                        result();
                    }
                }
                break;
            case R.id.btn4:
                sum++;
                if (btn4.getText().toString().equals("")) {
                    if (turn == 0) {
                        btn4.setText("0");
                        turn = 1;
                        result();
                    } else if (turn == 1) {
                        btn4.setText("X");
                        turn = 0;
                        result();
                    }
                }
                break;
            case R.id.btn5:
                sum++;
                if (btn5.getText().toString().equals("")) {
                    //sum++;
                    if (turn == 0) {
                        btn5.setText("0");
                        turn = 1;
                        result();
                    } else if (turn == 1) {
                        btn5.setText("X");
                        turn = 0;
                        result();
                    }
                }
                break;
            case R.id.btn6:
                sum++;
                if (btn6.getText().toString().equals("")) {
                    //sum++;
                    if (turn == 0) {
                        btn6.setText("0");
                        turn = 1;
                        result();
                    } else if (turn == 1) {
                        btn6.setText("X");
                        turn = 0;
                        result();
                    }
                }
                break;
            case R.id.btn7:
                sum++;
                if (btn7.getText().toString().equals("")) {
                    //sum++;
                    if (turn == 0) {
                        btn7.setText("0");
                        turn = 1;
                        result();
                    } else if (turn == 1) {
                        btn7.setText("X");
                        turn = 0;
                        result();
                    }
                }
                break;
            case R.id.btn8:
                sum++;
                if (btn8.getText().toString().equals("")) {
                    //sum++;
                    if (turn == 0) {
                        btn8.setText("0");
                        turn = 1;
                        result();
                    } else if (turn == 1) {
                        btn8.setText("X");
                        turn = 0;
                        result();
                    }
                }
                break;
            case R.id.btn9:
                sum++;
                if (btn9.getText().toString().equals("")) {
                    //sum++;
                    if (turn == 0) {
                        btn9.setText("0");
                        turn = 1;
                        result();
                    } else if (turn == 1) {
                        btn9.setText("X");
                        turn = 0;
                        result();
                    }
                }
                break;
            case R.id.reset:
                sum = 0;
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                break;
        }
    }

    private void result() {
        //Horizantall

        if ((btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")) || (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")) || (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X"))                ||              (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")) || (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")) || (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X"))              ||              (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")) || (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X"))) {
            //sum2 = 1;
           // Toast.makeText(this, "WIN   X", Toast.LENGTH_SHORT).show();
            showToastx();

        }

        //Vertical + cornar

        else if ((btn1.getText().toString().equals("0") && btn2.getText().toString().equals("0") && btn3.getText().toString().equals("0")) || (btn4.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn6.getText().toString().equals("0")) || (btn7.getText().toString().equals("0") && btn8.getText().toString().equals("0") && btn9.getText().toString().equals("0")) || (btn1.getText().toString().equals("0") && btn4.getText().toString().equals("0") && btn7.getText().toString().equals("0")) || (btn2.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn8.getText().toString().equals("0")) || (btn3.getText().toString().equals("0") && btn6.getText().toString().equals("0") && btn9.getText().toString().equals("0")) || (btn1.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn9.getText().toString().equals("0")) || (btn3.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn7.getText().toString().equals("0"))) {
            //sum2 = 1;
           //Toast.makeText(this, "WIN   0 ", Toast.LENGTH_SHORT).show();
            showToast0();

        }

        else if (sum == 9){
            //Toast.makeText(this, "DRAW", Toast.LENGTH_SHORT).show();
            showToastdraw();
        }
    }

    public void showToastx() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);

        toastText.setText("X  is  winer");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }

    public void showToast0() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);

        toastText.setText("0  is  winer");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }

    public void showToastdraw() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);

        toastText.setText("Draw");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }
}
