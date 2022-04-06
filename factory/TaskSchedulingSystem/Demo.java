package TaskSchedulingSystem;


import TaskSchedulingSystem.Core.Event;
import TaskSchedulingSystem.Core.Scheduler;
import TaskSchedulingSystem.GregorianCalender.GregorianScheduler;
import TaskSchedulingSystem.UniversalCalender.UniversalScheduler;

public class Demo {
    public static void main(String[] args){
        show();
    }

    public static void show() {

        Scheduler scheduler = new GregorianScheduler();
        scheduler.schedule(new Event());

    }
}
