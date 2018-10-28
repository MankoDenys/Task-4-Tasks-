import java.time.LocalDate;
import java.util.function.Predicate;

public class TaskPredicates {

    public static Predicate<Task> nameContains(String substring) {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getName().contains(substring);
            }
        };
    }

    public static Predicate<Task> hasExpiredDeadline() {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return LocalDate.now().isAfter(task.getDeadline());
            }
        };
    }

    public static Predicate<Task> hasPriority(Priority priority) {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return priority.equals(task.getPriority());
            }
        };
    }
}
