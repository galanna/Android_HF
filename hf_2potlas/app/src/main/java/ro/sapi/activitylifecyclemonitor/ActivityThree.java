package ro.sapi.activitylifecyclemonitor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class ActivityThree  extends AppCompatActivity {
    final String TAG = "States";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }
        @Override
        protected void onStart() {
            super.onStart();
            Log.d( "Statusz", "ActivityThree: onStart()");

        }

        /** Called when the activity has become visible. */
        @Override
        protected void onResume() {
            super.onResume();
            Log.d( "Statusz", "ActivityThree: onResume()");
        }

        /** Called when another activity is taking focus. */
        @Override
        protected void onPause() {
            super.onPause();
            Log.d( "Statusz", "ActivityThree: onPause()");
        }

        /** Called when the activity is no longer visible. */
        @Override
        protected void onStop() {
            super.onStop();
            Log.d( "Statusz", "ActivityThree: onStop()");
        }

        /** Called just before the activity is destroyed. */
        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d( "Statusz", "ActivityThree: onDestory()");
        }

}
