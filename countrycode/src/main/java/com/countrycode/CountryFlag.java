package com.countrycode;

import android.app.Application;
import android.support.annotation.NonNull;

/**
 * Created by clickapps on 28/3/18.
 */

public class CountryFlag {
    private static volatile CountryFlag sWebConnect;

    private CountryFlag() {

    }

    public static Builder with(@NonNull Application context) {
        return new Builder(context);
    }
}
