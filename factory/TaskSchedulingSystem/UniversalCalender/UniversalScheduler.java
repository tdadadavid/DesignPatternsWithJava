package TaskSchedulingSystem.UniversalCalender;

import TaskSchedulingSystem.Core.Calender;
import TaskSchedulingSystem.Core.Scheduler;

public class UniversalScheduler extends Scheduler {

    public Calender createCalender() {
        return new UniversalCalender();
    }
}
