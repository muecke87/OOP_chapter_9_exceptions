package repitition_before_chapter_10;

/**
 * Repetition in nächster Vorlesung
 */
public class Auto {
    public void drive(int speed) {
        if(speed >= 140) {
            throw new RuntimeException("Too fast!");
        } else {
            System.out.println("fahre mit " + speed + " km/h");
        }
    }
}
