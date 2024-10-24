package com.example.taskhero;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ServiceDetailsActivity extends AppCompatActivity {

    TextView serviceTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_details);

        serviceTitle = findViewById(R.id.serviceTitle);

        // Get the service name from the intent
        String serviceName = getIntent().getStringExtra("serviceName");
        serviceTitle.setText(serviceName);
    }
}
