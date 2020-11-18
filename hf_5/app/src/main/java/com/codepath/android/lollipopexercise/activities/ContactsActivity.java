package com.codepath.android.lollipopexercise.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.codepath.android.lollipopexercise.R;
import com.codepath.android.lollipopexercise.adapters.ContactsAdapter;
import com.codepath.android.lollipopexercise.models.Contact;

import java.util.List;


public class ContactsActivity extends AppCompatActivity {
    private RecyclerView rvContacts;
    private ContactsAdapter mAdapter;
    private List<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        rvContacts.setHasFixedSize(true);

       final LinearLayoutManager layout= new LinearLayoutManager(ContactsActivity.this);

       rvContacts.setLayoutManager(layout);

        contacts = Contact.getContacts();

        mAdapter = new ContactsAdapter(ContactsActivity.this, contacts);

        rvContacts.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_contacts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}
