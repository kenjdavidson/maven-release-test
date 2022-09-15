package kjd.playground;

public class Address {
    public final String address1;
    public final String address2;
    public final String city;
    public final String province;
    public final String country;
    public final String postalCode;

    public Address(
        String address1,
        String city,
        String province,
        String country,
        String postalCode
    ) {
        this(address1, null, city, province, country, postalCode);
    }

    public Address(
        String address1,
        String address2,
        String city,
        String province,
        String country,
        String postalCode
    ) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = postalCode;
    }
}
