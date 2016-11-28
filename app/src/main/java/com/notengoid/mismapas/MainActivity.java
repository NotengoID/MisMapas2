package com.notengoid.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View v){
        Intent i = new Intent(this, MapsActivity.class);
        double lng = 0.0f;
        double lat = 0.0f;
        String titulo = "";
        float color = BitmapDescriptorFactory.HUE_AZURE;


        switch (v.getId()){
            case R.id.lyOpcion1:
                lat = -12.0485824;
                lng = -76.9999448;
                titulo = "Municipalidad";
                color = BitmapDescriptorFactory.HUE_YELLOW;
                break;
            case R.id.lyOpcion2:
                lat = -12.0497232;
                lng = -76.9988973;
                titulo = "Parque Central";
                color = BitmapDescriptorFactory.HUE_GREEN;
                break;
            case R.id.lyOpcion3:
                lat = -12.0509795;
                lng = -76.9982591;
                titulo = "Colegio Husares";
                color = BitmapDescriptorFactory.HUE_BLUE;
                break;
            case R.id.lyOpcion4:
                lat = -12.048304;
                lng = -76.9967103;
                titulo = "Colegio Gutemberg";
                color = BitmapDescriptorFactory.HUE_BLUE;
                break;
        }

        i.putExtra("lng",lng);
        i.putExtra("lat",lat);
        i.putExtra("titulo",titulo);
        i.putExtra("color", color);

        startActivity(i);
    }
}
