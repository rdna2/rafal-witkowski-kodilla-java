package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;


public class Forum {

    public final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "Zukowski", 'M', 2006, 4, 23, 87));
        forumUsersList.add(new ForumUser(2, "Akowski", 'M', 1993, 5, 26, 0));
        forumUsersList.add(new ForumUser(3, "Bekowski", 'M', 1995, 6, 22, 7));
        forumUsersList.add(new ForumUser(4, "Ceowska", 'F', 2007, 7, 10, 27));
        forumUsersList.add(new ForumUser(5, "Dekowska", 'F', 1990, 8, 2, 37));
        forumUsersList.add(new ForumUser(6, "Fajkowski", 'M', 1997, 9, 3, 7));
        forumUsersList.add(new ForumUser(7, "Gakowska", 'F', 1999, 12, 11, 50));
        forumUsersList.add(new ForumUser(8, "Kowski", 'M', 2005, 11, 30, 85));
        forumUsersList.add(new ForumUser(9, "Lwowska", 'F', 1996, 10, 17, 47));
        forumUsersList.add(new ForumUser(10, "Pakowska", 'F', 2002, 9, 23, 37));
        forumUsersList.add(new ForumUser(11, "Wakowski", 'M', 1991, 2, 23, 17));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsersList);
    }

}
