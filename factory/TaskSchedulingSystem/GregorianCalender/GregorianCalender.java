package TaskSchedulingSystem.GregorianCalender;

import TaskSchedulingSystem.Core.Calender;
import TaskSchedulingSystem.Core.Event;

import java.util.Date;

public class GregorianCalender implements Calender {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding event in gregorian time");
    }
}
