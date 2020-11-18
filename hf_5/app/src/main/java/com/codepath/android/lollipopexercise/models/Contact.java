package com.codepath.android.lollipopexercise.models;

import com.codepath.android.lollipopexercise.R;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Container class to hold Contact information.
public class Contact implements Serializable {
    private String mName;
    private int mThumbnailDrawable;


    public Contact(String name, int thumbnailDrawable) {
        mName = name;
        mThumbnailDrawable = thumbnailDrawable;

    }

    public String getName() {
        return mName;
    }

    public int getThumbnailDrawable() {
        return mThumbnailDrawable;
    }


    // Returns a list of contacts
    public static List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Cat", R.drawable.cat));
        contacts.add(new Contact("Dog", R.drawable.dog));
        contacts.add(new Contact("Rabbit", R.drawable.rabbit ));
        contacts.add(new Contact("Pig", R.drawable.disznyo));
        contacts.add(new Contact("Lion", R.drawable.lion));
        contacts.add(new Contact("Octopus", R.drawable.octopus));
        contacts.add(new Contact("Octopus", R.drawable.octopus2));
        contacts.add(new Contact("Octopus", R.drawable.octopus3));
        contacts.add(new Contact("Sheep", R.drawable.sheep));
        contacts.add(new Contact("Horse", R.drawable.horse));
        return contacts;
    }

    // Returns a random contact
    public static Contact getRandomContact(Context context) {

        Resources resources = context.getResources();

        TypedArray contactNames = resources.obtainTypedArray(R.array.contact_names);
        int name = (int) (Math.random() * contactNames.length());

        TypedArray contactThumbnails = resources.obtainTypedArray(R.array.contact_thumbnails);
        int thumbnail = (int) (Math.random() * contactThumbnails.length());


        return new Contact(contactNames.getString(name), contactThumbnails.getResourceId(thumbnail, R.drawable.cat));
    }
}
