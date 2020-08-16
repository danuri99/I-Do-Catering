package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class updateOrder extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_order);

    }
    public void displayToast(View view) {
        Toast.makeText(updateOrder.this,"Your changes saved successfully!.",Toast.LENGTH_SHORT).show();
    }
}