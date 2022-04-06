package TaskSchedulingSystem.ArabianCalender;

import TaskSchedulingSystem.ArabianCalender.ArabianCalender;
import TaskSchedulingSystem.Core.Calender;
import TaskSchedulingSystem.Core.Scheduler;

public class ArabianScheduler extends Scheduler {
    @Override
    public Calender createCalender() {
        return new ArabianCalender();
    }
}
