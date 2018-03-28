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
            Log.i(getLocalClassName(), "getName = " + country.getName());
            Log.i(getLocalClassName(), "getCode = " + country.getCode());
            Log.i(getLocalClassName(), "getCurrency = " + country.getCurrency());
            Log.i(getLocalClassName(), "getDialCode = " + country.getDialCode());
            Log.i(getLocalClassName(), "getFlag = " + country.getFlag());
            Log.i(getLocalClassName(), "getName = " + country.getName());

        }
    }
}
