package oopsproductioncom.cl_ma.speakbordeaux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // load Menu Option Activity
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
