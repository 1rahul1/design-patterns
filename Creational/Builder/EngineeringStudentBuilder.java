package Creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Data Structures and Algorithms");
        subs.add("Operating Systems");
        subs.add("Computer Networks");
        this.subjects = subs;
        return this;
    }

}
