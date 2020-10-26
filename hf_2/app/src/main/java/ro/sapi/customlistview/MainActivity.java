package ro.sapi.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"EUR","USD","GBP","AUD","CAD","CHF",
            "DKK", "HUF"
            };

    String[] infoArray = {
            "Euro",
            "Dolar american",
            "Lira sterlina",
            "Dolar australian",
            "Dolar canadian",
            "Franc elvetian",
            "Corona daneza",
            "Forint maghiar"
    };

    Integer[] imageArray = {R.drawable.eu,
            R.drawable.usa,
            R.drawable.gpb,
            R.drawable.aud,
            R.drawable.cad,
            R.drawable.chf,
            R.drawable.dkk,
            R.drawable.huf
    };

    String[] cumparaArray = {
         "4,8100 Ron",
            "3,9750 Ron",
            "6,1250 Ron",
            "2,9600 Ron",
            "3,0950 Ron",
            "4,2300 Ron",
            "0,5850 Ron",
            "0,0136 Ron"
    };

    String[] vandArray = {
            "4,8100 Ron",
            "3,8200 Ron",
            "6,1350 Ron",
            "2,9800 Ron",
            "3,1010 Ron",
            "4,2360 Ron",
            "0,5980 Ron",
            "0,0146 Ron"
    };


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomListAdapter whatever= new CustomListAdapter(this,nameArray,infoArray,imageArray,cumparaArray,vandArray);
        listView = findViewById(R.id.listviewID);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,View view, int position, long id) {

                Toast.makeText(getApplicationContext(),"valami",Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(MainActivity.this, DetailActivity.class);
                String message= nameArray[position];
                String message2= cumparaArray[position];
                intent.putExtra("money", message);
                intent.putExtra("value", message2);

                startActivity(intent);
            }
        });
    }
}
