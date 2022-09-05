import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.y_lab.homework_1.task_1.Task1;

import static org.junit.Assert.assertEquals;


public class Task1_test {
    Task1 task1 = new Task1();

    public static final int[][] arrTest = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
    };
    int expMin = 1;
    int expMax = 25;
    double expAvg = 13.0;

    @Test
    public void doTaskTest() {
        assertEquals(task1.findMin(arrTest), expMin);
        assertEquals(task1.findMax(arrTest), expMax);
        assertEquals(task1.findAvg(arrTest), expAvg,0.00001);
    }


}
