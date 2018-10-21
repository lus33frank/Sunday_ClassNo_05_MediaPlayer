package tw.com.frankchang.houli.sunday_classno_05_mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playOnClick(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.onepiece_telbug);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }

    public void stopOnClick(View view) {
        if (mediaPlayer != null){
            mediaPlayer.stop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
