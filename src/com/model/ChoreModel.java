package com.model;

import com.interfaces.Chore;
import com.interfaces.Logger;
import com.interfaces.MessageSender;
import com.interfaces.Person;

public class ChoreModel implements Chore {

    private final Logger logger;
    private final MessageSender messageSender;

    private String choreName;
    private Person owner;
    private double hoursWorked;
    private boolean isComplete;

    public ChoreModel(Logger logger, MessageSender messageSender) {
        this.logger = logger;
        this.messageSender = messageSender;
    }

    @Override
    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public boolean isComplete() {
        return isComplete;
    }

    @Override
    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public void performedWork(double hours){
        this.hoursWorked = hours;
        logger.log("performed work on '" + choreName + "' in " + getHoursWorked() + " hours.");
    }

    @Override
    public void completeChore(){
        setComplete(true);
        logger.log("completed '" + choreName + "'");
        messageSender.sendMessage(owner, "chore '" + choreName + "' is complete.");
    }

    @Override
    public void setPerson(Person owner) {
        this.owner = owner;
    }

    @Override
    public void setChoreName(String choreName) {
        this.choreName = choreName;
    }
}
