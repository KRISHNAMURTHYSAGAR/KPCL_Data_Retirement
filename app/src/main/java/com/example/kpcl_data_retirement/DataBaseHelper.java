package com.example.kpcl_data_retirement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
    public static final String COLUMN_CUSTOMER_NAME = "CUSTOMER_NAME";
    public static final String COLUMN_CUSTOMER_BIRTH = "CUSTOMER_BIRTH";
    public static final String COLUMN_IS_ACTIVE_CUSTOMER = "IS_ACTIVE_CUSTOMER";
    public static final String COLUMN_ID = "ID";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "customer.db", null, 1);
    }

    @Override

//    This is called first time Data accesses. There must be code in here to create new Database.
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement= "CREATE TABLE  " + CUSTOMER_TABLE + "" +
                "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_CUSTOMER_NAME + " TEXT,"
                + COLUMN_CUSTOMER_BIRTH + " INT," + COLUMN_IS_ACTIVE_CUSTOMER + " BOOL)";










//        String creatTableStatement = "CREATE TABLE " + CUSTOMER_TABLE + "" +
////                "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
////                COLUMN_CUSTOMER_NAME + " TEXT," +
////                COLOUMN_CUSTOMER_BIRTH + " INT," +
////                COLUMN_IS_IN_SERVICE_CUSTOMER + " BOOL)";
        db.execSQL(createTableStatement);

    }
// This called if the Database version number changes. It prevents previous users apps from breacking when you change the Database design.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


//    public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
//    public static final String COLUMN_CUSTOMER_NAME = "CUSTOMER_NAME";
//    public static final String COLOUMN_CUSTOMER_BIRTH = "CUSTOMER_BIRTH";
//    public static final String COLUMN_IS_IN_SERVICE_CUSTOMER = "IS_IN_SERVICE_CUSTOMER";
//    public static final String COLUMN_ID = "ID";
//
//    public DataBaseHelper(@Nullable Context context) {
//        super(context, "Customer.db", null, 1);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        String creatTableStatement = "CREATE TABLE " + CUSTOMER_TABLE + "" +
//                "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                COLUMN_CUSTOMER_NAME + " TEXT," +
//                COLOUMN_CUSTOMER_BIRTH + " INT," +
//                COLUMN_IS_IN_SERVICE_CUSTOMER + " BOOL)";
//        db.execSQL(creatTableStatement);
//
//    }
//
//    @Override
//
//    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
//
//    }
//
//    public boolean addOne(EmployeeDetails employeeDetails) {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues cv = new ContentValues();
//
//        cv.put(COLUMN_CUSTOMER_NAME, employeeDetails.getName());
//        cv.put(COLOUMN_CUSTOMER_BIRTH, employeeDetails.getBirth());
//
//        cv.put(COLUMN_IS_IN_SERVICE_CUSTOMER, employeeDetails.isInService());
//        long insert = db.insert(CUSTOMER_TABLE, null, cv);
//
//        if (insert == -1) {
//            return false;
//        } else {
//            return true;
//
//
//        }
//    }
//
//    public List<EmployeeDetails> getEveryOne() {
//
//        List<EmployeeDetails> returnList = new ArrayList<>();
//        String quearyString = "SELECT * FROM " + CUSTOMER_TABLE;
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.rawQuery(quearyString, null);
//        if (cursor.moveToNext()) {
//            do {
//                int customerId = cursor.getInt(0);
//                String customerName = cursor.getString(1);
//                int customerBirth = cursor.getInt(2);
//
//                boolean customerService = cursor.getInt(3) == 1 ? true : false;
//
//                EmployeeDetails newcustomer = new EmployeeDetails(customerId, customerName, customerBirth, customerService);
//
//                returnList.add(newcustomer);
//            } while (cursor.moveToNext());
//
//        } else {
//
//
//        }
//        cursor.close();
//        db.close();
//        return returnList;
//    }
}