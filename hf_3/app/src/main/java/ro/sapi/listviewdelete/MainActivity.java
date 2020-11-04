package ro.sapi.listviewdelete;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    List<String> list = new ArrayList<String>(Arrays.asList(mobileArray));
    ArrayAdapter<String> adapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        ListView listView= findViewById(R.id.listviewID);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }



    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        TextView textView= findViewById(android.R.id.text1);

        switch (item.getItemId()) {
            case R.id.red:
                textView.setTextColor(Color.rgb(200,0,0));
               adapter.notifyDataSetInvalidated();
               return true;
            case R.id.green:
                textView.setTextColor(Color.rgb(0,200,0));
                adapter.notifyDataSetInvalidated();
                return true;
            case R.id.yellow:

                textView.setTextColor(Color.rgb(255,255,0));
                adapter.notifyDataSetInvalidated();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch (item.getItemId()) {
            case R.id.sort:
                Collections.sort(list);
                adapter.notifyDataSetInvalidated();
                return true;
            case R.id.delete:
                list.removeAll(list);
                adapter.notifyDataSetInvalidated();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }



}
