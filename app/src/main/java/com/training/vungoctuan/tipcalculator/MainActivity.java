package com.training.vungoctuan.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
    }

    private void initWidget(){
        EditText etBillAmount = findViewById(R.id.etBillAmount);
        EditText etTipPercent = findViewById(R.id.etTipPercent);
        EditText etNoOfPeople = findViewById(R.id.etNoOfPeople);
        EditText etTipAmount = findViewById(R.id.etTipAmount);
        EditText etTotalAmount = findViewById(R.id.etTotalAmount);
        EditText etEachPersonPays = findViewById(R.id.etEachPersonPays);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_tip_calculator,menu);
        return true;
    }
}
