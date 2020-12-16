package com.factory;

import com.interfaces.Chore;
import com.interfaces.Logger;
import com.interfaces.MessageSender;
import com.interfaces.Person;
import com.model.*;

public class Factory {
    public static Person createPerson(){
        return new PersonModel("Vasco", "Pereira", "vmsp@iwu.de", "992557313");
    }

    public static Chore createChore(Person owner){
        Chore chore = new ChoreModel(createLogger(), createMessageSender());
        chore.setPerson(owner);
        chore.setChoreName("take the trash out");
        return chore;
    }

    public static MessageSender createMessageSender(){
        //return new EmailSender();
        return new TextSender();
    }

    public static Logger createLogger(){
        return new LogInfo();
    }
}
