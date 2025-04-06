package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> fileSystems = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem fs) {
        fileSystems.add(fs);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        System.out.println("------------------");
        for (FileSystem fileSystem : fileSystems) {
            fileSystem.ls();
        }
    }

}
