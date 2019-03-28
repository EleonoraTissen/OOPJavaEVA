import po73.tissen.oop.model.Workout;
import po73.tissen.oop.model.Exercise;

public class Test
{
    public static void main(String[] args)
    {
        Workout workout = new Workout();
    }

    public static void lab1tests()
    {
        Exercise exercise1 = new Exercise("имя1", 5);
        Exercise exercise2 = new Exercise("имя2", 7);
        Exercise exercise3 = new Exercise("имя3", 9);
        Exercise exercise4 = new Exercise("имя1", 33);
        Exercise exercise5 = new Exercise("имя1", 45);
        Exercise exercise6 = new Exercise("имя3", 10);
        Exercise exercise7 = new Exercise("имя1", 99);
        Exercise exercise8 = new Exercise("имя8", 4);

        Workout workout = new Workout();
        workout.addExercise(exercise1);
        workout.addExercise(exercise2);
        workout.addExercise(exercise3);
        workout.addExercise(exercise4);
        workout.addExercise(exercise5);
        workout.addExercise(exercise6);
        workout.addExercise(exercise7);
        workout.addExercise(exercise8);
        System.out.println("Алё, э");
        System.out.println(workout.getCountExercises());

        Exercise[] exercises = workout.getExercises();
        for (int i=0; i<  workout.getCountExercises(); i++)
        {
            System.out.println(exercises[i].getExerciseName());
        }

    }

}
