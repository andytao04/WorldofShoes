package sg.edu.rp.c346.worldofshoes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShoeDetailActivity extends AppCompatActivity {

    TextView tvShoeModel, tvPhoneNum, tvShoeModelNo, tvPrice, tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoe_detail);

        tvShoeModel = (TextView)findViewById(R.id.textViewShoeModel);
        tvPhoneNum = (TextView)findViewById(R.id.textViewPhoneNum);
        tvPrice = (TextView)findViewById(R.id.textViewPrice);
        tvAddress = (TextView)findViewById(R.id.textViewAddress);
        tvShoeModelNo = (TextView)findViewById(R.id.textViewShoeModelNo);

        //Obtain the intent that is passed from the MainActivity
        Intent intentReceived = getIntent();
        //Obtain the shoe model by using the getStringExtra() method.
        //The argument of the getStringExtra() method is the identifier set by the putExtra() method
        //This would retrieve the value set for this identifier.
        String strShoeModel = intentReceived.getStringExtra("ShoeModel");
        //Obtain an integer value from the Intent.
        //The first argument is the identifier and the second argument is the Default Value.
        int intPhoneNum = intentReceived.getIntExtra("PhoneNumber", 0);
        double dblPrice = intentReceived.getDoubleExtra("Price", 0);
        String strAdress = intentReceived.getStringExtra("Address");
        String strShoeModelNo = intentReceived.getStringExtra("ShoeModelNo");

        tvShoeModel.setText("Shoe Model: " + strShoeModel);
        tvPhoneNum.setText("Contact Number: " + intPhoneNum);
        tvPrice.setText("Price: "+dblPrice);
        tvAddress.setText("Address: "+strAdress);
        tvShoeModelNo.setText("Shoe Model Number: "+strShoeModelNo);

        tvPhoneNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intentReceived = getIntent();
                int intPhoneNum = intentReceived.getIntExtra("PhoneNumber", 0);

                Intent intentPhone = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:"+intPhoneNum) );
                startActivity(intentPhone);
            }
        });
    }
}
