package ro.sapi.activitylifecyclemonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnActTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "Statusz", "MainActivity: onClick()");
        btnActTwo= findViewById(R.id.buttonA2);
        btnActTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(),ActivityTwo.class);
                startActivity(intent);
            }
        });

    }



    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "Statusz", "MainActivity: onStart()");

    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "Statusz", "MainActivity: onResume()");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "Statusz", "MainActivity: onPause()");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "Statusz", "MainActivity: onStop()");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d( "Statusz", "MainActivity: onDestory()");
    }

    public void startActivityTwo(View view) {
        Intent intent= new Intent(this,ActivityTwo.class);
        startActivity(intent);
    }
}
