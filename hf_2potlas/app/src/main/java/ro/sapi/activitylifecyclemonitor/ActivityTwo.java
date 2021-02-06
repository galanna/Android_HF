package ro.sapi.activitylifecyclemonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Button gomb2= findViewById(R.id.button2);
        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button gomb3= findViewById(R.id.button3);
        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),ActivityThree.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "Statusz", "ActivityTwo: onStart()");

    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "Statusz", "ActivityTwo: onResume()");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "Statusz", "ActivityTwo: onPause()");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "Statusz", "ActivityTwo: onStop()");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d( "Statusz", "ActivityTwo: onDestory()");
    }


}
