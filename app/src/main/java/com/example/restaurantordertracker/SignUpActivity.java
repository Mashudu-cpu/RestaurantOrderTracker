package com.example.restaurantordertracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    EditText edfullName, eduserName, edpassWord;
    RadioButton rbCustomer, rbStaff;
    Spinner spRestaurant;
    Button btSignUp;

    @Override
    protected void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.sign_up);

        edfullName = findViewById(R.id.txtFullName);
        eduserName = findViewById(R.id.edUserName);
        edpassWord = findViewById(R.id.txtPassword);
        rbCustomer = findViewById(R.id.radCustomer);
        rbStaff = findViewById(R.id.radStaff);
        spRestaurant = findViewById(R.id.spinnerRestaurant);
        btSignUp = findViewById(R.id.btnSignUp);

        String[] restaurant = {"KFC", "McDonalds", "Burger king"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, restaurant);
        spRestaurant.setAdapter(adapter);

        spRestaurant.setVisibility(View.GONE);

        rbStaff.setOnClickListener(view -> {
            spRestaurant.setVisibility(View.VISIBLE);
        });
        rbCustomer.setOnClickListener(view -> {
            spRestaurant.setVisibility(View.GONE);
        });

        btSignUp.setOnClickListener(view -> {
            String fullName = edfullName.getText().toString();
            String userName = eduserName.getText().toString();
            String password = edpassWord.getText().toString();

            String role = "";

            if(rbCustomer.isChecked()){
                role = "customer";
            }
            else if(rbStaff.isChecked()){
                role = "staff";
            }

            String reataurant = "";

            if(role.equals("staff")){
                reataurant = spRestaurant.getSelectedItem().toString();
            }
            Toast.makeText(SignUpActivity.this, "Account Created", Toast.LENGTH_SHORT).show();
            // Later, send data to PHP/MySQL

            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
