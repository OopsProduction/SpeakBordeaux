package oopsproductioncom.cl_ma.speakbordeaux;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainMenu extends AppCompatActivity {

    // define elements
    private ListView listOption;
    private String[] options;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // create ListView
        listOption = (ListView) findViewById(R.id.listview_options);
        options = new String[]{"First Growths (Premiers Crus)", "Second Growths (Deuxièmes Crus)", "Third Growths (Troisièmes Crus)",
                "Fourth Growths (Quatrièmes Crus)", "Fifth Growths (Cinquièmes Crus)", "... other Bordeaux Classifications"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options);
        listOption.setAdapter(arrayAdapter);

        listOption.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // load selected option
                loadOption(position);
            }
        });

    }

    // load option by user input
    public void loadOption(int x){
        switch (x){
            case 0:
                intent = new Intent(this, Crus_1st.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this, Crus_2nd.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this, Crus_3rd.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(this, Crus_4th.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(this, Crus_5th.class);
                startActivity(intent);
                break;
            case 5:
                String url = "http://oops-production.com/BordeauxWine/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            default:
        }
    }
}
