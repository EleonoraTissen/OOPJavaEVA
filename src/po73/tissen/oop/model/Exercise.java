package po73.tissen.oop.model;

public class Exercise {
    private String exerciseName;
    private int duration = 3;

    public Exercise(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Exercise(String exerciseName, int duration) {
        this.exerciseName = exerciseName;
        this.duration = duration;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
