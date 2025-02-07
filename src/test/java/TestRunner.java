import algunit.AlghManager;
import algunit.TaskSolver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner {

    @Test
    public void checkLeftFunction(){
        int[] actual = {1,2,3,4,5,6,7} ;
        int[] expected = {6,7,1,2,3,4,5};
        var moveLeftOn = 2;
        Assert.assertEquals(TaskSolver.moveArrayLeftOnK(actual, moveLeftOn), expected);
    }

    @Test
    public void checkLeftFunction1(){
        int[] actual = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        var moveLeftOn = 3;
        Assert.assertEquals(TaskSolver.findMaxSubarraySum(actual), expected);
    }

    @Test
    public void checkLeftFunction2(){
        int[] actual = {1,2,3,4,5,6,7} ;
        int[] expected = {7,1,2,3,4,5,6};
        var moveLeftOn = 1;
        Assert.assertEquals(AlghManager.moveElementsOnKLeft(moveLeftOn, actual), expected);
    }
}
