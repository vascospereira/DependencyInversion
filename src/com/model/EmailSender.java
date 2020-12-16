package com.model;

import com.interfaces.MessageSender;
import com.interfaces.Person;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(Person owner, String msg) {
        System.out.println("simulating sending an email to '" + owner.getEmail() + "' with message " + msg);
    }
}
