package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        Forum theUsers = new Forum();


final LocalDate now = LocalDate.now();
final LocalDate twentyYearsBack = now.minusYears(20);


        Map<Integer, ForumUser> theUsersMap = theUsers.getUserList().stream()
                .filter(user -> user.getGender()=='M')
                .filter(user -> user.getDob().isBefore(twentyYearsBack))
                .filter(user -> user.getPostsQty()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

                theUsersMap.entrySet().stream()
                        .map(entry->entry.getKey() + ": " +entry.getValue())
                        .forEach(System.out::println);



    }     }

