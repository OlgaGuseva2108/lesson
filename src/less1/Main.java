package less1;

import ru.homework.project.Cat;

public class Main {

    public static void main(String[] args) {

        Team [] firstTeam = { new Team("Roman", 36, 2.3, 1.0, 0.7), new Team("Ivan", 32, 2.1, 1.1, 0.5), new Team("Olga", 31, 1.9, 0.9, 0.6), new Team("Michel", 20, 2.1, 1.3,1)
        };

        Course course = new Course(5,1.2, 2);

        for (Team team:firstTeam) {
            team.run(course);
            team.jump(course);
            team.swim(course);

        }

        /*public double doIt(Team) {
        double timeToRunning;
        double timeToDoIT = timeToRunning+ timeToJumping + timeToSwiming;
            System.out.println(timeToDoIT);
        }*/
    }
}
