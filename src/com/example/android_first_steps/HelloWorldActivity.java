package com.example.android_first_steps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class HelloWorldActivity extends Activity
{
    private TextView message;
    private ImageView image;

    private View.OnClickListener imageTapListener;

    private int counter = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.main);

        InitializeApp();
    }

    private void InitializeApp() {
        message = (TextView) findViewById(R.id.textView);
        image = (ImageView) findViewById(R.id.imageView);

        imageTapListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TapImage();
            }
        };
        image.setOnClickListener(imageTapListener);
    }

    private void TapImage() {
        counter++;
        String temp;
        switch (counter) {
            case 1:
                temp = "once";
                break;
            case 2:
                temp = "twice";
                break;
            default:
                temp = String.format("%d times", counter);
        }
        message.setText(String.format("You tapped %s", temp));
    }

}
