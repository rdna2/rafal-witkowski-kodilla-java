package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("LibraryTest");

        for (int i = 0; i < 10; i++) {
            library.getBooks().add(new Book("TitleTest " + i, "AuthorTest " + i, LocalDate.of(1980 + i, 1 + i, 5 + i)));
        }

        //making a shallow copy of object library
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("LibraryTest ShallowCopy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("LibraryTest DeepCopy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().add(new Book("NewBook", "NewAuthor", LocalDate.of(2022,3,26)));
       // library.getBooks().remove(new Book("NewBook", "NewAuthor", LocalDate.of(2022,3,26)));

        //then
        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}