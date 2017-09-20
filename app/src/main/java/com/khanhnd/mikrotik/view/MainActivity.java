package com.khanhnd.mikrotik.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.khanhnd.mikrotik.R;
import com.khanhnd.mikrotik.operation.SimpleCommand;

public class MainActivity extends AppCompatActivity {

    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn = (Button) findViewById(R.id.button);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 try {
                    SimpleCommand.main(new String());
                } catch (Exception e) {
                    Log.e("Mikrotik_App", "" + e.toString());
                }
            }
        });


    }
}
