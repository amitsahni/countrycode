package com.countrycode;

import android.app.Application;
import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by clickapps on 28/3/18.
 */

public class Builder {

    private Application context;
    private int sortBy = 0;

    public Builder(Application context) {
        this.context = context;
    }

    public Builder sortBy(@NonNull int sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public List<Country> getCountries() {
        return new CountryFlagUtil().getAllCountries(sortBy);
    }

}
