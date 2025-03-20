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
    int number1;
    int number2;
    int number3;
    int number21;
    int number4;
    ImageView imageView;
    ImageView imageView22;
    Random ra = new Random();
    int number_of_win;
    Button button11;
    Button button22;



    TextView textView2_answer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textRandom3);
        textView2 = findViewById(R.id.random12);
        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.imageView);
        textView_get_answer = findViewById(R.id.textView_get_answer);
        textView_random_2=findViewById(R.id.textView_random_2);
        imageView22 = findViewById(R.id.imageView22);
        edit_text_2=findViewById(R.id.edit_text_2);
        button11=findViewById(R.id.button11);
        button22=findViewById(R.id.button22);
        textView_asnwer_3=findViewById(R.id.textView_asnwer_3);
        text_random_3=findViewById(R.id.text_random_3);

        number1 = ra.nextInt( 89)+10;
        textView.setText(String.valueOf(number1));

        number2 = ra.nextInt(89) + 10;
        textView2.setText(String.valueOf(number2));


    }

    public void check(View view)
    {
        String text1= editText.getText().toString();
        if (!(text1.equals(""))  )
        {
            if (number1+number2==Integer.valueOf(text1))
            {
                imageView.setVisibility(View.VISIBLE);
                number_of_win++;
                textView2.setText(number_of_win);
            }
            else
            {
                imageView.setImageResource(R.drawable.ex);
                imageView.setVisibility(View.VISIBLE);
            }
            editText.setEnabled(false);
            button11.setEnabled(false);
            textView_get_answer.setText(String.valueOf(number1 + number2));
            number3 = ra.nextInt( 89)+10;
            textView_random_2.setText(String.valueOf(number3));

            textView_get_answer.setVisibility(View.VISIBLE);
            textView_random_2.setVisibility(View.VISIBLE);
            edit_text_2.setVisibility(View.VISIBLE);
            button22.setVisibility(View.VISIBLE);

        }
    }

    public void check2(View view)
    {
        String text1= editText.getText().toString();
        if (!(text1.equals(""))  )
        {
            if ((number1+number2)+number3==Integer.valueOf(text1))
            {
                imageView22.setVisibility(View.VISIBLE);
                number_of_win++;
                textView_random_2.setText(number_of_win);
            }
            else
            {
                imageView22.setImageResource(R.drawable.ex);
                imageView22.setVisibility(View.VISIBLE);
            }
            edit_text_2.setEnabled(false);
            button22.setEnabled(false);
            textView_asnwer_3.setText(String.valueOf((number1 + number2)+number3));
            number4 = ra.nextInt( 89)+10;
            text_random_3.setText(String.valueOf(number4));
        }
    }
}
