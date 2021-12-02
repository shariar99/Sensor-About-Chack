package com.example.sensorpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private SensorManager sensorManager;
    private Sensor sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);   //here you can chack all sensor name for example i use gyroscope sensor (Sensor.TYPE_GYROSCOPE);

        textView.setText("   "+ "Sensor Name : "+ String.valueOf(sensor.getName())+"\n"+
                "   "+ "Sensor Power : "+String.valueOf(sensor.getPower())+"\n"
        +"   "+ "Sensor Version : "+String.valueOf(sensor.getVersion())+"\n"
        + "   "+"Sensor Vendor : "+String.valueOf(sensor.getVendor())+"\n"
                + "   "+"Sensor Maximun Range : "+ String.valueOf(sensor.getMaximumRange()));
    }
}