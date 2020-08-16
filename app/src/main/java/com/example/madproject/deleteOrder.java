package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class deleteOrder extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_order);

    }

    public void displayToast(View view) {
        Toast.makeText(deleteOrder.this,"Your cancellation is successfully. Thank you!.",Toast.LENGTH_SHORT).show();
    }
}