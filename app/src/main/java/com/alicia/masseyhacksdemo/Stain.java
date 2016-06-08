package com.alicia.masseyhacksdemo;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Spinner;
        import android.widget.TextView;

        import java.util.ArrayList;

/**
 * Created by Sam on 5/22/2016.
 */
public class Stain extends AppCompatActivity {

    Spinner s1, s2, s3;
    Button go;
    String str1, str2, str3;

    @Override
    protected void onCreate(final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stain);

        s1 = (Spinner) findViewById(R.id.clothingSpinner);
        s2 = (Spinner) findViewById(R.id.textileSpinner);
        s3 = (Spinner) findViewById(R.id.stainSpinner);

        go = (Button) findViewById(R.id.goButton);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = s1.getSelectedItem().toString();
                str2 = s2.getSelectedItem().toString();
                str3 = s3.getSelectedItem().toString();
                Intent i = new Intent(Stain.this, StainInformation.class);

                i.putExtra("str1", str1); //clothing
                i.putExtra("str2", str2); //material
                i.putExtra("str3", str3); //stain type
                startActivity(i);


            }
        });
    }

}
