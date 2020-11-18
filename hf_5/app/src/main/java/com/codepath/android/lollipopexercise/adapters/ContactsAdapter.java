package com.codepath.android.lollipopexercise.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.android.lollipopexercise.R;
import com.codepath.android.lollipopexercise.activities.DetailsActivity;
import com.codepath.android.lollipopexercise.models.Contact;

import java.util.List;

// Provide the underlying view for an individual list item.
public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.VH> {
    private Activity mContext;
    private List<Contact> mContacts;

    public ContactsAdapter(Activity context, List<Contact> contacts) {
        mContext = context;
        if (contacts == null) {
            throw new IllegalArgumentException("contacts must not be null");
        }
        mContacts = contacts;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_linear, parent, false);
        return new VH(itemView, mContext);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        Contact contact = mContacts.get(position);
        holder.rootView.setTag(contact);
        holder.anmName.setText(contact.getName());
        Glide.with(mContext).load(contact.getThumbnailDrawable()).centerCrop().into(holder.ivProfile);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        final View rootView;
        final ImageView ivProfile;
        final TextView anmName;
        final View vPalette;

        public VH(View itemView, final Context context) {
            super(itemView);
            rootView = itemView;
            ivProfile = (ImageView)itemView.findViewById(R.id.ivProfile);
            anmName = (TextView)itemView.findViewById(R.id.animalName);
            vPalette = itemView.findViewById(R.id.vPalette);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Contact contact = (Contact)v.getTag();
                    if (contact != null) {
                        Intent i = new Intent(mContext, DetailsActivity.class);
                        i.putExtra("EXTRA_CONTACT", contact);
                        mContext.startActivity(i);

                    }
                }
            });
        }
    }
}
