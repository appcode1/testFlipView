package net.netbing.testflipview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eu.davidea.flipview.FlipView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlipView flipView = (FlipView) findViewById(R.id.flipView);

    }
}
