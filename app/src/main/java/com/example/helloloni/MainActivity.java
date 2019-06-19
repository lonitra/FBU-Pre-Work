package com.example.helloloni;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorAccent));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.backgroundView).setBackgroundColor(
                        getResources().getColor(R.color.customOrange));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                //((TextView) findViewById(R.id.textView)).setText("Loni says goodbye!");

                if(TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Loni says hello!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }

            }
        });

        findViewById(R.id.backgroundView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.customWhite));
                findViewById(R.id.backgroundView).setBackgroundColor(
                        getResources().getColor(R.color.customCyan));
                ((TextView) findViewById(R.id.textView)).setText("Loni says hello!");
            }
        });


    }
}
