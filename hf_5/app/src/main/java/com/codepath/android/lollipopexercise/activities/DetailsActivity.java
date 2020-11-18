package com.codepath.android.lollipopexercise.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.android.lollipopexercise.R;
import com.codepath.android.lollipopexercise.models.Contact;

public class DetailsActivity extends AppCompatActivity {
    public static final String EXTRA_CONTACT = "EXTRA_CONTACT";
    private Contact mContact;
    private ImageView ivProfile;
    private TextView anmName;
    private View vPalette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ivProfile = (ImageView) findViewById(R.id.ivProfile);
        anmName = (TextView) findViewById(R.id.animalName);
        vPalette = findViewById(R.id.vPalette);


        mContact= (Contact)getIntent().getExtras().getSerializable(EXTRA_CONTACT);

       ivProfile.setImageResource(mContact.getThumbnailDrawable());
        anmName.setText(mContact.getName());


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

}
