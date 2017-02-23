package com.example.jonathanlam.googlemapstest;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,View.OnClickListener
{

    private GoogleMap mMap;
    Button button_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        button_reset = (Button)findViewById(R.id.button_reset);
        button_reset.setOnClickListener(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
      /*  LatLng sydney = new LatLng(-34, 151);

        LatLngBounds YorkU = new LatLngBounds(
                new LatLng(43.764532, -79.515086), new LatLng(43.781977, -79.490990));


      //  mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
      //  mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(YorkU,1000));
      //  mMap.setLatLngBoundsForCameraTarget(YorkU);
        mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(YorkU, 0));

*/


        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(new LatLng(43.769893, -79.504573));
        builder.include(new LatLng(43.777470, -79.501011));
        LatLngBounds bounds = builder.build();

// begin new code:
        int width = getResources().getDisplayMetrics().widthPixels;
        int height = getResources().getDisplayMetrics().heightPixels;
        int padding = (int) (width * 0.12); // offset from edges of the map 12% of screen

        CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, width, height, padding);
// end of new code

        mMap.animateCamera(cu);

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(43.7726958,-79.5023169))
                .title("STARBUCKS"));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(43.774374, -79.501421))
                .title("YORK LANES"));

    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.button_reset)
        {

            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            builder.include(new LatLng(43.769893, -79.504573));
            builder.include(new LatLng(43.777470, -79.501011));
            LatLngBounds bounds = builder.build();

// begin new code:
            int width = getResources().getDisplayMetrics().widthPixels;
            int height = getResources().getDisplayMetrics().heightPixels;
            int padding = (int) (width * 0.12); // offset from edges of the map 12% of screen

            CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, width, height, padding);
// end of new code

            mMap.animateCamera(cu);
        }
    }
}
