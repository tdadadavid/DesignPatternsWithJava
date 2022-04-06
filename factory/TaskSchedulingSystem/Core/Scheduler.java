package TaskSchedulingSystem.Core;

import java.util.Date;

public abstract class Scheduler {

    private final Calender calender = createCalender();

    public void schedule(Event event){
        var today = new Date();
        calender.addEvent(event , today);
    }

    public abstract Calender createCalender();

}