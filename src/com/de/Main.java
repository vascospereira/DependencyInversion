package com.de;

import com.factory.Factory;
import com.interfaces.Chore;
import com.interfaces.Person;

public class Main {

    public static void main(String[] args) {
        Person owner = Factory.createPerson();
        Chore chore = Factory.createChore(owner);

        chore.performedWork(3);
        chore.performedWork(1.5);
        chore.completeChore();
    }
}
