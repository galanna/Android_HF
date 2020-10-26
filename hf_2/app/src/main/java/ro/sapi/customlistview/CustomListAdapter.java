package ro.sapi.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pali on 10/5/2017.
 */

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;

    private final String[] cumparaArray;
    private final String[] vandArray;


    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam, String[] cumparaArray, String[] vandArray){

        super(context, R.layout.listview_row, nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
        this.cumparaArray = cumparaArray;
        this.vandArray = vandArray;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row,null,true);

        TextView nameTextFiled= rowView.findViewById(R.id.nameTextId);
        TextView infoText= rowView.findViewById(R.id.infoTextId);
        ImageView imageView= rowView.findViewById(R.id.imageViewId);
        TextView cumpText= rowView.findViewById(R.id.cumpTextId);
        TextView vandText= rowView.findViewById(R.id.vandTextId);

        nameTextFiled.setText(nameArray[position]);
        infoText.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);
        cumpText.setText(cumparaArray[position]);
        vandText.setText(vandArray[position]);

        return rowView;
    }
}
