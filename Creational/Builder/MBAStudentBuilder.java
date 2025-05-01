package Creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Marketing Management");
        subs.add("Financial Management");
        subs.add("Human Resource Management");
        this.subjects = subs;
        return this;
    }

}
