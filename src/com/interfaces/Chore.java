package com.interfaces;

public interface Chore {
    double getHoursWorked();

    boolean isComplete();

    void setComplete(boolean complete);

    void performedWork(double hours);

    void completeChore();

    void setPerson(Person owner);

    void setChoreName(String choreName);
}
