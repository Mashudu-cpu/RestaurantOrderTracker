package com.example.restaurantordertracker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StaffDashboardActivity extends AppCompatActivity {
    Button btnAddOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.staff_dashboard);

        btnAddOrder = findViewById(R.id.btnAddOrder);

        btnAddOrder.setOnClickListener(view -> {
            Intent intent = new Intent(StaffDashboardActivity.this, AddOrderActivity.class);
            startActivity(intent);
        });
    }
}
