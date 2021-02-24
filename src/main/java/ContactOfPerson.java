public class ContactOfPerson {

    private String firstName, lastName, address, city, state, email, zip, phoneNumber ;

    public ContactOfPerson(String firstName, String lastName, String address, String city, String state,
                           String email, String phoneNumber, String zip) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setState(state);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setZip(zip);

    }

    public ContactOfPerson() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        String addressString = "Name: " + firstName + " " + lastName +
                "\nPhone: " +phoneNumber +
                "\nAddress: " + address + ", " + city + ", " + state +
                "\nZIP: " + zip;
        return addressString;
    }

}
