package po73.tissen.oop;

import po73.tissen.oop.model.Exercise;

public class Workout {
    Exercise[] array = null;
    private int size = 0;// число элиментов

    public Workout() {
        array = new Exercise[16];
    }

    public Workout(Exercise[] array) {
        Exercise[] newArray = new Exercise[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
    }

    public Workout(int count) {
        array = new Exercise[count];
    }

    public boolean addExercise(Exercise exercise) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == null) {
                array[i] = exercise;
                size++;
                return true;
            }
        Exercise[] tmp = new Exercise[array.length * 2];
        for (int i = 0; i < array.length; i++)
            tmp[i] = array[i];
        array = tmp;
        return addExercise(exercise);
    }

    // co2
    public boolean addExercise(Exercise exercise, int number) {
        if (number >= array.length) {
            Exercise[] tmp = array;
            array = new Exercise[tmp.length * 2];
            for (int i = 0; i < tmp.length; i++)
                array[i] = tmp[i];
            //addExercise( exercise, number);
            array[number] = exercise;
            size++;
            return true;
            // return false
        } else {

            if (array[number] != null) {
                if (array[array.length - 1] != null) {
                    Exercise[] tmpm = array;
                    array = new Exercise[tmpm.length * 2];
                    for (int i = 0; i < tmpm.length; i++) {
                        array[i] = tmpm[i];
                    }
                }// движение
                for (int j = size - 1; j >= number; j--) {
                    array[j + 1] = array[j];
                }
                array[number] = exercise;
                size++;
                return true;
            } else {
                array[number] = exercise;
            }
        }
        return false;
    }

    public Exercise getExercise(int num) {
        return array[num];
    }

    public Exercise update(int num, Exercise exercise) {
        Exercise bufExercise = array[num];
        array[num] = exercise;
        return bufExercise;
    }

    public Exercise delete(int num) { // удалил по номеру и двигает
        Exercise bufExercise = array[num];
        for (int i = num; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        return bufExercise;
    }

    public int delete(String name) {
        int i = 0;
        int count = 0;
        while (i < size) {
            if (array[i].getExerciseName().equals(name))// равнение строк
            {
                delete(i); // чтобы двигал
                count++;
            } else  // не идем пока не проверит, проверяет, если совпал то удалил и занова, если не совпал то идет дальше
            {
                i++;
            }
        }
        return count;
    }

    public int getCountExercises() {
        return size;
    }

    public Exercise[] getExercises() {
        Exercise[] newArray = new Exercise[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];

        }
        return newArray;
    }

    public boolean isFounded(String name) {
        for (int i = 0; i < size; i++) {
            if (array[i].getExerciseName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int getTotalDuration() {
        int total =0;
        for (int i=0; i<size; i++){
            total += array[i].getDuration();
        }
        return  total;

    }

}




