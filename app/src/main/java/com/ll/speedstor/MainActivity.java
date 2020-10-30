package com.ll.speedstor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * AppWidgetSample demonstrates app widgets, including:
 * - Creating a template app widget to an app.
 * - Updating the app widget periodically (every 30 minutes).
 * - Adding a button to the app widget that updates on demand.
 * <p>
 * MainActivity is unused and includes a message to add the app widget to
 * the user's home screen.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
