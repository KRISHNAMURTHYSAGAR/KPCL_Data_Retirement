package com.example.kpcl_data_retirement;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class KpclSearch extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kpcl_search);
        Button btnSearch;
        EditText startDate, endDate;

        btnSearch = findViewById(R.id.btn_search_date);
        startDate = findViewById(R.id.et_StartDate);
        endDate = findViewById(R.id.et_EndDate);

        btnSearch.setOnClickListener(this);
        startDate.setOnClickListener(this);
        endDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.et_StartDate:
                Toast.makeText(this,"Enter Start Date",Toast.LENGTH_LONG).show();
                break;
            case R.id.et_EndDate:
                Toast.makeText(this,"Enter End Date",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_search_date:
                Toast.makeText(this,"Search Date",Toast.LENGTH_LONG).show();
                break;

        }

    }
}