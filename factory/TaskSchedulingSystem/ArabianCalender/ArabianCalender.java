package TaskSchedulingSystem.ArabianCalender;

import TaskSchedulingSystem.Core.Calender;
import TaskSchedulingSystem.Core.Event;

import java.util.Date;

class ArabianCalender implements Calender {

    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding event in arabian time");
    }
}
