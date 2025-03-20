package com.example.game;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    TextView textView_get_answer;
    TextView textView_random_2;
    TextView textView_asnwer_3;
    TextView text_random_3;
    EditText editText;
    EditText edit_text_2;
    EditText editText_3;
    int number1;
    int number2;
    int number3;
    int number21;
    int number4;
    ImageView imageView;
    ImageView imageView22;
    ImageView imageView_33;
    Random ra = new Random();
    int number_of_win;
    Button button11;
    Button button22;
    Button button33;
    Button button4;


    TextView textView2_answer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textRandom3);
        textView2 = findViewById(R.id.random12);
        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.imageView);
        textView_get_answer = findViewById(R.id.textView_get_answer);
        textView_random_2 = findViewById(R.id.textView_random_2);
        imageView22 = findViewById(R.id.imageView22);
        edit_text_2 = findViewById(R.id.edit_text_2);
        button11 = findViewById(R.id.button11);
        button22 = findViewById(R.id.button22);
        button4=findViewById(R.id.button4);
        textView_asnwer_3 = findViewById(R.id.textView_asnwer_3);
        text_random_3 = findViewById(R.id.text_random_3);
        button33 = findViewById(R.id.button33);
        editText_3 = findViewById(R.id.editText_3);
        imageView_33 = findViewById(R.id.imageView_33);


        number1 = ra.nextInt(89) + 10;
        textView.setText(String.valueOf(number1));

        number2 = ra.nextInt(89) + 10;
        textView2.setText(String.valueOf(number2));

        number_of_win=0;

    }

    public void check(View view)
    {
        String text1 = editText.getText().toString();
        if (!(text1.equals("")))
        {
            if (number1 + number2 == Integer.valueOf(text1))
            {
                imageView.setVisibility(View.VISIBLE);
                number_of_win++;
                textView_random_2.setText(String.valueOf(number_of_win));
            }
            else
            {
                imageView.setImageResource(R.drawable.ex);
                imageView.setVisibility(View.VISIBLE);
            }
            editText.setEnabled(false);
            button11.setEnabled(false);
            textView_get_answer.setText(String.valueOf(number1 + number2));
            number3 = ra.nextInt(89) + 10;
            textView_random_2.setText(String.valueOf(number3));

            textView_get_answer.setVisibility(View.VISIBLE);
            textView_random_2.setVisibility(View.VISIBLE);
            edit_text_2.setVisibility(View.VISIBLE);
            button22.setVisibility(View.VISIBLE);

        }
    }

    public void check2(View view)
    {
        String text1 = edit_text_2.getText().toString();
        if (!(text1.equals("")))
        {
            if ((number1 + number2) + number3 == Integer.valueOf(text1))
            {
                imageView22.setVisibility(View.VISIBLE);
                number_of_win++;
            }
            else
            {
                imageView22.setImageResource(R.drawable.ex);
                imageView22.setVisibility(View.VISIBLE);
            }
            edit_text_2.setEnabled(false);
            button22.setEnabled(false);
            textView_asnwer_3.setText(String.valueOf((number1 + number2) + number3));
            number4 = ra.nextInt(89) + 10;
            text_random_3.setText(String.valueOf(number4));

            button33.setVisibility(View.VISIBLE);
            editText_3.setVisibility(View.VISIBLE);
            text_random_3 .setVisibility(View.VISIBLE);
            textView_asnwer_3.setVisibility(View.VISIBLE);
        }
    }

    public void check3(View view) {
        String text1 = editText_3.getText().toString();
        if (!(text1.equals("")))
        {
            if ((number1 + number2 + number3) + number4 == Integer.valueOf(text1)) {
                imageView_33.setVisibility(View.VISIBLE);
                number_of_win++;
            } else {
                imageView_33.setImageResource(R.drawable.ex);
                imageView_33.setVisibility(View.VISIBLE);
            }
            editText_3.setEnabled(false);
            button33.setEnabled(false);
            button4.setText(String.format("%d/3 (%.2f%%)", number_of_win, (number_of_win / 3.0) * 100));
        }
    }

    public void ristart(View view)
    {
        number1 = ra.nextInt(89) + 10;
        number2 = ra.nextInt(89) + 10;
        number3 = ra.nextInt(89) + 10;
        number4 = ra.nextInt(89) + 10;

        number_of_win = 0;

        textView.setText(String.valueOf(number1));
        textView2.setText(String.valueOf(number2));
        textView_random_2.setText("");
        text_random_3.setText("");
        textView_get_answer.setText("");
        textView_asnwer_3.setText("");

        editText.setText("");
        edit_text_2.setText("");
        editText_3.setText("");

        editText.setEnabled(true);
        edit_text_2.setEnabled(true);
        editText_3.setEnabled(true);

        button11.setEnabled(true);
        button22.setEnabled(true);
        button33.setEnabled(true);
        button4.setText("new");

        imageView.setVisibility(View.INVISIBLE);
        imageView22.setVisibility(View.INVISIBLE);
        imageView_33.setVisibility(View.INVISIBLE);

        button22.setVisibility(View.INVISIBLE);
        button33.setVisibility(View.INVISIBLE);

        edit_text_2.setVisibility(View.INVISIBLE);
        editText_3.setVisibility(View.INVISIBLE);

    }
    }

