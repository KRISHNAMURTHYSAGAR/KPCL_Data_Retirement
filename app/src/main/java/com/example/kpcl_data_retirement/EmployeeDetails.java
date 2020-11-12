package com.example.kpcl_data_retirement;

public class EmployeeDetails {

    private int id;
    private String name;
    private int birth;
    private boolean IsInService;


//         Constructors.
 public EmployeeDetails(int id, String name, int birth, boolean isInService) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        IsInService = isInService;
    }

//    public EmployeeDetails(String name) {
//        this.name = name;
//    }
//to String to necessary for Printing the Contents of Class


    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", IsInService=" + IsInService +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public boolean isInService() {
        return IsInService;
    }

    public void setInService(boolean inService) {
        IsInService = inService;
    }
}
