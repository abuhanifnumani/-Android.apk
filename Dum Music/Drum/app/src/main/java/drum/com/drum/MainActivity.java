package drum.com.drum;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton one, two, three, four, five, six;
    private MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer1 = MediaPlayer.create(this, R.raw.drum1clap);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.drum2crash01);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.drum3crash02);
        mediaPlayer4 = MediaPlayer.create(this, R.raw.drumhi_hat_open);
        mediaPlayer5 = MediaPlayer.create(this, R.raw.drumlow_tom);
        mediaPlayer6 = MediaPlayer.create(this, R.raw.drumride);

        one = (ImageButton) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();

            }
        });

        two = (ImageButton) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();

            }
        });

        three = (ImageButton) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();

            }
        });

        four = (ImageButton) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();

            }
        });

        five = (ImageButton) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();

            }
        });

        six = (ImageButton) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();

            }
        });
    }
}
