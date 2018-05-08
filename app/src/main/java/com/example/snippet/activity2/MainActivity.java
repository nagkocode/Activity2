
// Start second activity and send data to second activity.

package com.example.snippet.activity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // control
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference control
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        // button click event
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startSecondActivity();
            }
        });
    }

    // start second activity
    private void startSecondActivity(){

        // get string from edit box
        String str = editText.getText().toString();

        // Create intent, pass the string (name-value pairs) and start activity.
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Any_Name", str);
        startActivity(intent);
    }
}
