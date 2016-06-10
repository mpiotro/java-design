package org.bithus.bridge;

/**
 * Created by michal on 09.06.16.
 */
public class BridgeDemo {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setClassification("Horror");
        movie.setTittle("Cloverfield");
        movie.setRuntime("2:14");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        Formatter htmlFormatter = new HtmlFormatter();

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);

        printedMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(printedMaterial);

    }

}
