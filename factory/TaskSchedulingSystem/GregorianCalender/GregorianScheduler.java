package TaskSchedulingSystem.GregorianCalender;

import TaskSchedulingSystem.Core.Calender;
import TaskSchedulingSystem.Core.Scheduler;

public class GregorianScheduler extends Scheduler {
    @Override
    public Calender createCalender() {
        return new GregorianCalender();
    }
}
