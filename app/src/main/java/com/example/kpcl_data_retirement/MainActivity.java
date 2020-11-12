package com.example.kpcl_data_retirement;
import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

   public class MainActivity extends AppCompatActivity {
    private static final String Tag = MainActivity.class.getSimpleName();
//        Reference to buttons and other Controls on the Layout

    Button btn_viewAll, btn_add, btn_search;
    EditText edit_name, edit_birth;
    ListView list_viewEmployee;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch sw_inService;


//    ArrayAdapter customerArrayAdapter;
//    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_viewAll = findViewById(R.id.btn_viewAll);
        btn_add =  findViewById(R.id.btn_add);
        btn_search = findViewById(R.id.btn_search_date);
        sw_inService = findViewById(R.id.sw_inService);
        list_viewEmployee = findViewById(R.id.lv_kpclEmploee);

//        btn_add.setOnClickListener(this);
//        btn_viewAll.setOnClickListener(this);
//        btn_search.setOnClickListener(this);
//        dataBaseHelper = new DataBaseHelper(MainActivity.this);
//        ArrayAdapter customerArratAdapter = new ArrayAdapter<EmployeeDetails>
//                (MainActivity.this, android.R.layout.simple_list_item_1, dataBaseHelper.getEveryOne());
//        list_viewEmployee.setAdapter(customerArrayAdapter);
//    }



        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmployeeDetails employeeDetails=new EmployeeDetails(-1,edit_name.getText().toString(), Integer.parseInt(edit_birth.getText().toString()),sw_inService.isChecked());
//             Toast.makeText(MainActivity.this,employeeDetails.toString(),Toast.LENGTH_LONG).show();
            }
        });

        btn_viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"VIEW ALL ",Toast.LENGTH_LONG).show();
            }
        });
//    @Override
//    public void onClick(View v) {
//        EmployeeDetails employeeDetails;
//
//        switch (v.getId()) {
//            case R.id.btn_add:
//            try {
//
//                employeeDetails = new EmployeeDetails(-1, edit_name.getText().toString(),
//                Integer.parseInt(edit_birth.getText().toString()), sw_inService.isChecked());
//
//
////                    Toast.makeText(MainActivity.this, employeeDetails.toString(), Toast.LENGTH_LONG).show();
//            } catch (Exception e) {
//                Toast.makeText(MainActivity.this, "Error Creating Customer ", Toast.LENGTH_LONG).show();
//                employeeDetails = new EmployeeDetails(-1, "error ", 0, false);
//
//
//            }
//
//            boolean sucess = dataBaseHelper.addOne(employeeDetails);
//            Toast.makeText(MainActivity.this, "SUCCESS " + sucess, Toast.LENGTH_LONG).show();
//
//            ArrayAdapter customerArratAdapter = new ArrayAdapter<EmployeeDetails>(MainActivity.this, android.R.layout.simple_list_item_1, dataBaseHelper.getEveryOne());
//            list_viewEmployee.setAdapter(customerArrayAdapter);
//
//            break;
//
//            case R.id.btn_viewAll:
//            DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this);
//
////                List<EmployeeDetails> everyOne = dataBaseHelper.getEveryOne();
//            ArrayAdapter customerArraAdapter = new ArrayAdapter<EmployeeDetails>(MainActivity.this, android.R.layout.simple_list_item_1, dataBaseHelper.getEveryOne());
//            list_viewEmployee.setAdapter(customerArrayAdapter);
//
////                Toast.makeText(MainActivity.this, dataBaseHelper.getEveryOne().toString(), Toast.LENGTH_LONG).show();
//            break;
//
//
//            case R.id.btn_search_date:
//
//
//            Intent intent = new Intent(this,KpclSearch.class);
//            startActivity(intent);
//            break;
//
//        }
 }
}