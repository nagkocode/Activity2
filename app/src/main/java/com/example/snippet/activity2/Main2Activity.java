
// Create the Second Activity
//
// 1. In the Project window, right-click the app folder.
// 2. Select New > Activity > Empty Activity.
// 3. In New Android Activity window, click finish.

package com.example.snippet.activity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    // control
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // reference control
        textView = findViewById(R.id.textView);

        // Get intent, use it to retrieve the string from the first activity.
        Intent intent = getIntent();
        String str = intent.getStringExtra("Any_Name");

        // display it
        textView.setText(str);
    }
}
