package com.example.mcqs;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Main2 extends AppCompatActivity {

    private questions aquestions = new questions();
    private TextToSpeech textToSpeech;

    private TextView ascoreview, aquestionview;
    private Button abuttonchoice1, abuttonchoice2, abuttonchoice3, abuttonchoice4;
    private String aanswer;
    private int ascore = 0;
    private int aquetionnumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ascoreview = (TextView) findViewById(R.id.score);
        aquestionview = (TextView) findViewById(R.id.question);
        abuttonchoice1 = (Button) findViewById(R.id.answer1);
        abuttonchoice2 = (Button) findViewById(R.id.answer2);
        abuttonchoice3 = (Button) findViewById(R.id.answer3);
        abuttonchoice4 = (Button) findViewById(R.id.answer4);


        textToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });

        updatequestion();
        updatescore(ascore);


        abuttonchoice1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                if (abuttonchoice1.getText() == aanswer) {

                    ascore = ascore + 1;
                    updatescore(ascore);
                    updatequestion();
                    Toast.makeText(Main2.this, "correct", Toast.LENGTH_SHORT).show();
                    textToSpeech.speak("the answer is correct",TextToSpeech.QUEUE_FLUSH,null,null);

                } else {

                    Toast.makeText(Main2.this, "false", Toast.LENGTH_SHORT).show();
                    textToSpeech.speak("the answer is incorrect",TextToSpeech.QUEUE_FLUSH,null,null);
                    updatequestion();
                }
            }
        });

        abuttonchoice2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                if (abuttonchoice2.getText() == aanswer) {

                    ascore = ascore + 1;
                    updatescore(ascore);
                    updatequestion();
                    Toast.makeText(Main2.this, "correct", Toast.LENGTH_SHORT).show();
                    textToSpeech.speak("the answer is correct",TextToSpeech.QUEUE_FLUSH,null,null);
                } else {

                    Toast.makeText(Main2.this, "false", Toast.LENGTH_SHORT).show();
                    textToSpeech.speak("the answer is incorrect",TextToSpeech.QUEUE_FLUSH,null,null);
                    updatequestion();
                }
            }
        });

        abuttonchoice3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                if (abuttonchoice3.getText() == aanswer) {

                    ascore = ascore + 1;
                    updatescore(ascore);
                    updatequestion();
                    Toast.makeText(Main2.this, "correct", Toast.LENGTH_SHORT).show();
                    textToSpeech.speak("the answer is correct",TextToSpeech.QUEUE_FLUSH,null,null);

                }
                else {

                    Toast.makeText(Main2.this, "false", Toast.LENGTH_SHORT).show();
                    textToSpeech.speak("the answer is incorrect",TextToSpeech.QUEUE_FLUSH,null,null);
                    updatequestion();
                }
            }
        });

        abuttonchoice4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                if (abuttonchoice4.getText() == aanswer) {

                    ascore = ascore + 1;
                    updatescore(ascore);
                    updatequestion();
                    Toast.makeText(Main2.this, "correct", Toast.LENGTH_SHORT).show();
                    textToSpeech.speak("the answer is correct",TextToSpeech.QUEUE_FLUSH,null,null);


                } else {

                    Toast.makeText(Main2.this, "false", Toast.LENGTH_SHORT).show();
                    textToSpeech.speak("the answer is incorrect",TextToSpeech.QUEUE_FLUSH,null,null);
                    updatequestion();
                }
            }
        });



    }

    private void updatequestion() {

        aquestionview.setText(aquestions.getQuestion(aquetionnumber));
        abuttonchoice1.setText(aquestions.getchoice1(aquetionnumber));
        abuttonchoice2.setText(aquestions.getchoice2(aquetionnumber));
        abuttonchoice3.setText(aquestions.getchoice3(aquetionnumber));
        abuttonchoice4.setText(aquestions.getchoice4(aquetionnumber));
        aanswer = aquestions.getcorrectans(aquetionnumber);
        aquetionnumber++;

    }

    private void updatescore(int point) {

        ascoreview.setText("" + ascore);
    }


}