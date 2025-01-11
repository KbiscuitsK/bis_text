package nxu.it.movieapi.eneity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Employee {
    private Integer  id;
    private String name;
    private String title;
    private String gender;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDate birthDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDate hireDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String region;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phone;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String photo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Order> orders;


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", hireDate=" + hireDate +
                ", region='" + region + '\'' +
                ", phone='" + phone + '\'' +
                ", photo='" + photo + '\'' +
                ", orders=" + orders +
                '}';
    }
}
