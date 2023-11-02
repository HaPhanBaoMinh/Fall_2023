package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class SinVienActivity extends AppCompatActivity {

    Database database;
    RecyclerView recyclerView;
    ArrayList<SinhVien> sinhVienArrayList;
    SinhVienAdapter sinhVienAdapter;
    EditText edtName, edtDate, edtIdBoMon;
    RadioButton maleChoose, femaleChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinvien);

        // Khởi tạo database
        database = new Database(SinVienActivity.this, "SE160216Lite", null, 1);
        database.QueryData("CREATE TABLE if not exists SinhVien (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, date DATE NOT NULL, gender TEXT NOT NULL, idBM INTEGER NOT NULL);");

        /*
        database.QueryData("INSERT INTO SinhVien VALUES (null, 'Nguyen Anh Minh', '01-01-2002', 'Nam', 1)");
        database.QueryData("INSERT INTO SinhVien VALUES (null, 'Nguyen Bao Long', '01-02-2002', 'Nam', 2)");
        database.QueryData("INSERT INTO SinhVien VALUES (null, 'Do Hoang Huy', '01-03-2002', 'Nam', 3)");
        database.QueryData("INSERT INTO SinhVien VALUES (null, 'Ho Ngoc Bao Tram', '01-04-2002', 'Nam', 1)");
        database.QueryData("INSERT INTO SinhVien VALUES (null, 'Tran Thi Hoang Anh', '01-05-2002', 'Nam', 2)");
        database.QueryData("INSERT INTO SinhVien VALUES (null, 'Tran Dai Anh Minh', '01-06-2002', 'Nam', 3)");
        */

        // Ánh xạ
        recyclerView = findViewById(R.id.rcvSinhVien);
        edtName = findViewById(R.id.txtSinhVienName);
        edtDate = findViewById(R.id.txtSinhVienDate);
        edtIdBoMon = findViewById(R.id.txtSinhVienIdBoMon);



    }

    private void getData() {

    }

    public void editSinhVien(SinhVien sinhVien) {
    }

    public void deleteSinhVien(SinhVien sinhVien) {
    }
}