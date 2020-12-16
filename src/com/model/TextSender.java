package com.model;

import com.interfaces.MessageSender;
import com.interfaces.Person;

public class TextSender implements MessageSender {
    @Override
    public void sendMessage(Person owner, String msg) {
        System.out.println("Texting a message to " + owner.getFirstName() +
                " " + owner.getLastName() + " to say: " + msg);
    }
}
