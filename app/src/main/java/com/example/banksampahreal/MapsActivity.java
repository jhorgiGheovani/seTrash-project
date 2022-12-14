package com.example.banksampahreal;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.banksampahreal.databinding.ActivityMapsBinding;

import java.util.ArrayList;
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    // Add a marker in Sydney and move the camera
    LatLng BankSampah1 = new LatLng(-7.8256995, 110.3904599);
    LatLng BankSampah2 = new LatLng(-7.8251864, 110.3660618);
    LatLng BankSampah3 = new LatLng(-7.8299897, 110.3824447);
    LatLng BankSampah4 = new LatLng(-7.7812987, 110.4015561);


//    private ActivityMapsBinding binding;

    // creating array list for adding all our locations.
    private ArrayList<LatLng> locationArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

//        binding = ActivityMapsBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // in below line we are initializing our array list.
        locationArrayList = new ArrayList<>();

        // on below line we are adding our
        // locations in our array list.
        locationArrayList.add(BankSampah1);
        locationArrayList.add(BankSampah2);
        locationArrayList.add(BankSampah3);
        locationArrayList.add(BankSampah4);
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
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        for (int i = 0; i < locationArrayList.size(); i++) {

            // below line is use to add marker to each location of our array list.
            mMap.addMarker(new MarkerOptions().position(locationArrayList.get(i)).title("Marker"));

            // below line is use to move our camera to the specific location.
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locationArrayList.get(i),13));
        }
//        mMap.addMarker(new MarkerOptions().position(BankSampah1).title("Universitas Ahmad Dhani"));
//        mMap.addMarker(new MarkerOptions().position(BankSampah2).title("Universitas Ahmad Dhani"));
//        mMap.addMarker(new MarkerOptions().position(BankSampah3).title("Universitas Ahmad Dhani"));
//        mMap.addMarker(new MarkerOptions().position(BankSampah4).title("Universitas Ahmad Dhani"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BankSampah1, 15));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BankSampah2, 15));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BankSampah3, 15));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BankSampah4, 15));

    }
}