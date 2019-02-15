package com.test.spg.applicationtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private Button btn_set;
    private Button btn_skip;
    private EditText edt;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        txt = findViewById(R.id.txt_1);
        txt.setText(getMApplication().master.getName());
        edt = findViewById(R.id.edt);
        btn_set = findViewById(R.id.btn_set);
        btn_skip = findViewById(R.id.btn_skip);

        btn_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = edt.getText().toString();
                getMApplication().master.setName(temp);
                txt.setText(getMApplication().master.getName());
            }
        });

        btn_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        init();
    }

    private MApplication getMApplication(){
        return (MApplication)getApplicationContext();
    }
}
