import po73.tissen.oop.model.Exercise;

public class Main {


    public static void main (String[] args) {
        Exercise ex = new Exercise("steps", 5);
        ex.getExerciseName();
        ex.getDuration();
    }
}