package DefiningClassesExercise.Google;

public class Child {
    private String childName;
    private String ChildBirthday;

    public Child(String childName, String childBirthday) {
        this.childName = childName;
        ChildBirthday = childBirthday;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildBirthday() {
        return ChildBirthday;
    }

    public void setChildBirthday(String childBirthday) {
        ChildBirthday = childBirthday;
    }
}
