package ro.sapi.customlistview;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView nameText= findViewById(R.id.nameId);
        TextView valueText= findViewById(R.id.valueId);
        nameText.setText(getIntent().getStringExtra("money"));
        valueText.setText(getIntent().getStringExtra("value"));


    }

}