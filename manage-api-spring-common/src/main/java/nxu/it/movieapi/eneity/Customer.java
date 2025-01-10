package nxu.it.movieapi.eneity;

public class Customer {
    private Integer id;
    private String name;
    private String contact;
    private String province;
    private String city;
    private String address;
    private String region;
    private String phone;

    public Customer() {
    }

    public Customer(Integer id, String name, String contact, String province, String city, String address, String region, String phone) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.province = province;
        this.city = city;
        this.address = address;
        this.region = region;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", region='" + region + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
