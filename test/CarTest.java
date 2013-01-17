import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CarTest {
    @Test
    public void displayOffByDefault() {
        Car car = new Car();
        assertThat(car.display(), is("Off"));
    }

    @Test
    public void shouldDisplayOffWhenCarTurnedOffAndGradeOn() {
        Car car = new Car(false);
        car.gradeOn();
        assertThat(car.display(), is("Off"));
    }

    @Test
    public void shouldDisplayOffWhenCarTurnedOffAndSpeedUp() {
        Car car = new Car(false);
        car.speedUp();
        assertThat(car.display(), is("Off"));
    }

    @Test
    public void shouldDisplayOnWhenCarTurnedOn() {
        Car car = new Car(true);
        assertThat(car.display(), is("On"));
    }

    @Test
    public void shouldDisplayGradeOnWhenCarTurnedOnAndGrade() {
        Car car = new Car(true);
        car.gradeOn();
        assertThat(car.display(), is("Grade On"));
    }

    @Test
    public void shouldDisplayFreeRunWhenCarTurnedOnAndSeedUp() {
        Car car = new Car(true);
        car.speedUp();
        assertThat(car.display(), is("Free Run"));
    }

    @Test
    public void shouldDisplayMoveWhenCarTurnedOnAndGradeAndSeedUp() {
        Car car = new Car(true);
        car.gradeOn();
        car.speedUp();
        assertThat(car.display(), is("Move"));
    }
  }
