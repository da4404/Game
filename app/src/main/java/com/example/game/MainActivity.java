package com.example.game;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
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
    EditText editText;
    int number1;
    int number2;
    int number21;
    ImageView imageView;
    Random ra = new Random();
    int number_of_win;



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
            }
            else
            {
                imageView.setImageResource(R.drawable.ex);
                imageView.setVisibility(View.VISIBLE);
            }
            editText.setEnabled(false);
            textView_get_answer.setText(String.valueOf(number1 + number2));
        }
    }
}