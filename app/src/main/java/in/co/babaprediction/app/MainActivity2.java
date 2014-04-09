package in.co.babaprediction.app;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.VideoView;

import java.util.Random;


public class MainActivity2 extends ActionBarActivity {

    MediaPlayer m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        int[] song = new int[]{R.raw.a,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j};

        Random random = new Random(); // or create a static random field...
        int songFinal = song[random.nextInt(song.length)];
        m = MediaPlayer.create(this, songFinal);
        m.start();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
