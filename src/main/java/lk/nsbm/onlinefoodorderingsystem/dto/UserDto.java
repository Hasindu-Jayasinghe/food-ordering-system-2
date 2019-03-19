package lk.nsbm.onlinefoodorderingsystem.dto;

public class UserDto {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private int userType;



    public UserDto() {
    }

    public UserDto(String firstName, String lastName, String email, int userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userType = userType;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

}
