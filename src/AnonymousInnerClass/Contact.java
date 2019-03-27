package AnonymousInnerClass;

public class Contact {


    public Contact(String name, String mobile, int age, GENDER gender){
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.gender = gender;
    }

    public enum GENDER {MALE, FEMALE}

    ;

    private String name;

    private String mobile;

    private int age;

    private GENDER gender;


    public GENDER getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

}
