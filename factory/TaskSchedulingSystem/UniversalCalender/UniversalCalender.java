package TaskSchedulingSystem.UniversalCalender;

import TaskSchedulingSystem.Core.Calender;
import TaskSchedulingSystem.Core.Event;

import java.util.Date;

class UniversalCalender implements Calender {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding event in universal time");
    }
}
