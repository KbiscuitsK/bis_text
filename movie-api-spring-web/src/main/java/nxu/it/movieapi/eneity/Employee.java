package nxu.it.movieapi.eneity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private Integer id;
    private String name;
    private String title;
    private String gender;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private String region;
    private String phone;
    private String photo;

    public Employee() {
    }

    public Employee(Integer id, String name, String title, String gender, LocalDate birthDate, LocalDate hireDate, String region, String phone, String photo) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.region = region;
        this.phone = phone;
        this.photo = photo;
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
                '}';
    }
}
