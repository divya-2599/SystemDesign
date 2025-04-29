package org.example.StructuralDesignPattern.CompositeDesignPattern.FileSystem;

public class File implements Filesystem {

    private String filename;

    public File(String name) {
        this.filename=name;
    }

    @Override
    public void ls() {
        System.out.println("File name is : " + filename);
    }
}
