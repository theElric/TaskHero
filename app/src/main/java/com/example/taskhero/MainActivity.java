package com.example.taskhero;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView servicesGrid;
    ArrayList<Service> serviceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        servicesGrid = findViewById(R.id.servicesGrid);
        serviceList = new ArrayList<>();

        // Add services
        serviceList.add(new Service("AC Service & Repair", R.drawable.ic_ac_service));
        serviceList.add(new Service("Appliance Repair & Service", R.drawable.ic_appliance_service));
        // Add other services similarly...

        ServiceAdapter adapter = new ServiceAdapter(this, serviceList);
        servicesGrid.setAdapter(adapter);

        // Click listener for service items
        servicesGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ServiceDetailsActivity.class);
                intent.putExtra("serviceName", serviceList.get(position).getName());
                startActivity(intent);
            }
        });
    }
}
