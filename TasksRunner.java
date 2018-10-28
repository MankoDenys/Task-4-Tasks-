import java.time.LocalDate;

public class TasksRunner {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        tasks.add(new Task(001, "Learn", "Homework English", LocalDate.of(2018, 10, 29), Priority.MAJOR));
        tasks.add(new Task(002, "Learn", "Homework on java", LocalDate.of(2018, 10, 30), Priority.MAJOR));
        tasks.add(new Task(003, "Shop", "Buy milk", LocalDate.of(2018, 10, 26), Priority.NORMAL));
        tasks.add(new Task(004, "Football", "Watch Football", LocalDate.of(2018, 11, 01), Priority.MINOR));

        tasks.sort(TaskComparators.byPriority());
        System.out.println("Tasks sorted by priority: " + "\n" + tasks);
        System.out.println();
        tasks.sort(TaskComparators.byDeadline());
        System.out.println("Tasks sorted by deadline: " + "\n" + tasks);
        System.out.println();

        System.out.println("Tasks filtered name " + "\n"+ tasks.filter(TaskPredicates.nameContains("Football")));
        System.out.println();
        System.out.println("Tasks that has priority " + "\n" + tasks.filter(TaskPredicates.hasPriority(Priority.MAJOR)));
        System.out.println();
        System.out.println("Tasks with expired deadline " + "\n" + tasks.filter(TaskPredicates.hasExpiredDeadline()));
        System.out.println();

    }

}
