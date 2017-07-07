package sg.edu.rp.c346.worldofshoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvShoe1, tvShoe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShoe1 = (TextView)findViewById(R.id.textViewShoe1);
        tvShoe2 = (TextView)findViewById(R.id.textViewShoe2);


        tvShoe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intentNewAct = new Intent(getBaseContext(),
                        ShoeDetailActivity.class);

                intentNewAct.putExtra("ShoeModel", "Nike Air Jordan");
                intentNewAct.putExtra("ShoeModelNo", "A1234");
                intentNewAct.putExtra("Price", 56.5);
                intentNewAct.putExtra("Address", "12 Katong St");
                intentNewAct.putExtra("PhoneNumber", 61234567);

                startActivity(intentNewAct);
            }
        });


        tvShoe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intentNewAct = new Intent(getBaseContext(),
                        ShoeDetailActivity.class);

                intentNewAct.putExtra("ShoeModel", "Nike Light Runner");

                intentNewAct.putExtra("ShoeModelNo", "A1235");
                intentNewAct.putExtra("Price", 66.8);
                intentNewAct.putExtra("Address", "20 Yishun St");
                intentNewAct.putExtra("PhoneNumber", 67892345);

                startActivity(intentNewAct);
            }
        });
    }
}
