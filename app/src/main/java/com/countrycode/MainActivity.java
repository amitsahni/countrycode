package com.countrycode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Country> countryList = CountryFlag.with(getApplication())
                .getCountries();

        for (Country country : countryList) {
            Log.i(getLocalClassName(), "Name = " + country.getName());
        }
    }
}
