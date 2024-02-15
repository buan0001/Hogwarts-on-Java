package edu.hogwarts.data.school;

import edu.hogwarts.data.school.TeachingMaterial;

public class TextBook extends TeachingMaterial {
    String title;
    String author;
    String publisher;
    int publishedYear;

    public TextBook(
            String title, String author, String publisher, int publishedYear,
            boolean onShoppingList,
            boolean required,
            boolean provided,
            String notes
    ) {
        super(onShoppingList,
                required,
                provided,
                notes);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
    }
}