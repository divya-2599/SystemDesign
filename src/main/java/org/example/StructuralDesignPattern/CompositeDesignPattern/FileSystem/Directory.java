package org.example.StructuralDesignPattern.CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Filesystem {

    String directoryName;
    List<Filesystem> filesystemList;

    public Directory(String name) {
        this.filesystemList = new ArrayList<>();
        this.directoryName = name;
    }

    public void add(Filesystem filesystemObj) {
        filesystemList.add(filesystemObj);
    }

    @Override
    public void ls() {
       for(Filesystem filesystem : filesystemList) {
           System.out.println("Directory name is : " + directoryName);
           filesystem.ls();
       }
    }
}
