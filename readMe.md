
#### How to Use

```text
List<Country> list = CountryFlag.with(getApplication())
                .sortBy(CountryFlagUtil.SORT_BY_NAME)
                .getCountries();
```

#### Country
```text
country.getCode() -> Currency Code eg - IN
country.getCurrency() -> Currency Symbol - INR
country.getDialCode() -> Country Code - +911
country.getFlag() -> Flag image
country.getName() -> Country Name - India

```


                
                