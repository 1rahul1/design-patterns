package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("root");
        FileSystem file1 = new File("file1.txt");
        FileSystem file2 = new File("file2.txt");
        Directory subDir = new Directory("subDir");

        dir.add(file1);
        dir.add(file2);
        dir.add(subDir);

        subDir.add(new File("file3.txt"));
        subDir.add(new File("file4.txt"));

        dir.ls();
    }
}
