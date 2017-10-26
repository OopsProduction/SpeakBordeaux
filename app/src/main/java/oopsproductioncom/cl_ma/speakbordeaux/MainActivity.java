package oopsproductioncom.cl_ma.speakbordeaux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image_wineregion;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // load Menu Option Activity
        intent = new Intent(this, MainMenu.class);
        startActivity(intent);

        image_wineregion = (ImageView) findViewById(R.id.img_wineregion);

        image_wineregion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }
}
