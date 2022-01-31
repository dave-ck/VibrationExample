package com.example.vibrationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private long[] playable_seq_A;
    private long[] playable_seq_B;
    private long[] playable_seq_C;
    private long[] playable_seq_D;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        // The first number is how long to wait after the button is pressed (always 200ms)
        // The second number is how long to make the first vibration (200 ms for A, 600ms for the others)
        // The third number is how long to wait between the first and second vibration (always 200ms)
        // The fourth number is how long to make the second vibration (600ms for A, 200ms for all the others)
        // etc.
        playable_seq_A = new long[] {200, 200, 200, 600}; // A is .-
        playable_seq_B = new long[] {200, 600, 200, 200, 200, 200, 200, 200}; // B is -...
        playable_seq_C = new long[] {200, 600, 200, 200, 200, 600, 200, 200}; // C is -.-.
        playable_seq_D = new long[] {200, 600, 200, 200, 200, 200}; // D is -..
    }

    public void aPress(View view) {
        vibrator.vibrate(playable_seq_A, -1);
    }


    public void bPress(View view) {
        vibrator.vibrate(playable_seq_B, -1);
    }


    public void cPress(View view) {
        vibrator.vibrate(playable_seq_C, -1);
    }


    public void dPress(View view) {
        vibrator.vibrate(playable_seq_D, -1);
    }
}