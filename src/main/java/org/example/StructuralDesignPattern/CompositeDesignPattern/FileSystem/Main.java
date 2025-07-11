package org.example.StructuralDesignPattern.CompositeDesignPattern.FileSystem;

public class Main {

    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        File file = new File("Border");
        movieDirectory.add(file);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File file1 = new File("Hulchul");
        comedyMovieDirectory.add(file1);

        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
