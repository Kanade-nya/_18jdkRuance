import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
//        int[][] dirs1 = new int[][]{{0, 0, 0}, {1, 1, 0}, {0, 0, 0}, {0, 1, 1}, {0, 0, 0}};
//        int[][] dirs2 = new int[][]{{0, 1, 1}, {1, 1, 1}, {1, 0, 0}};
//        ShortestPath shortest = new ShortestPath();
//        int ret = shortest.shortestPath(dirs2, 1);
//        System.out.println(ret);



        Result result = JUnitCore.runClasses(TestShortestPath.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());


    }
}
