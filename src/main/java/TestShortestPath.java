import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShortestPath {
    private ShortestPath shortest;

    private int k;
    @Before
    public void before(){
        shortest = new ShortestPath();
    }
//    @Test
//    public void test_input_Base(){
//        int[][] dirs = new int[][]{{0, 0, 0}, {1, 1, 0}, {0, 0, 0}, {0, 1, 1}, {0, 0, 0}};
//        k = 1;
//        int output = shortest.shortestPath(dirs,k);
//        assertEquals(6,output);
//    }
//    @Test
//    public void test_input_FT(){
//        int[][] dirs = new int[][]{{0}};
//        k = 1;
//        int output = shortest.shortestPath(dirs,k);
//        assertEquals(0,output);
//    }
//    @Test
//    public void test_input_TF(){
//        int[][] dirs = new int[][]{{0, 1, 0}, {1, 1, 0}, {0, 0, 0}, {0, 1, 1}, {0, 0, 0}};
//        k = 0;
//        int output = shortest.shortestPath(dirs,k);
//        assertEquals(-1,output);
//    }
//    @Test
//    public void test_graph_path1(){
//        int[][] dirs = new int[][]{{0}};
//        k = 1;
//        int output = shortest.shortestPath(dirs,k);
//        assertEquals(0,output);
//    }
//    @Test
//    public void test_graph_path2(){
//        int[][] dirs = new int[][]{{0, 1, 1}, {1, 1, 0}, {1, 1, 0},  {0, 0, 0}};
//        k = 1;
//        int output = shortest.shortestPath(dirs,k);
//        assertEquals(-1,output);
//    }
//    @Test
//    public void test_graph_path3(){
//        int[][] dirs = new int[][]{{0,0,1,1},{0,0,1,1},{0,1,0,1},{1,1,0,0}};
//        k = 2;
//        int output = shortest.shortestPath(dirs,k);
//        assertEquals(6,output);
//    }
//    @Test
//    public void test_predicate_path1(){
//        int[][] dirs = new int[][]{{0,0,1},{0,0,0}};
//        k = 1;
//        int output = shortest.shortestPath(dirs,k);
//        assertEquals(3,output);
//    }
//    @Test
//    public void test_predicate_path2(){
//        int[][] dirs = new int[][]{{0,1,0},{1,0,0}};
//        k = -1;
//        int output = shortest.shortestPath(dirs,k);
//        assertEquals(-1,output);
//    }
//
    @Test
    public void test_subElement_path1(){
        int[][] dirs = new int[][]{{0}};
        k = 1;
        int output = shortest.shortestPath(dirs,k);
        assertEquals(0,output);
    }
    @Test
    public void test_subElement_path2(){
        int[][] dirs = new int[][]{{0,1,0}};
        k = 1;
        int output = shortest.shortestPath(dirs,k);
        assertEquals(2,output);
    }
    @Test
    public void test_subElement_path3(){
        int[][] dirs = new int[][]{{0},{1},{0}};
        k = 1;
        int output = shortest.shortestPath(dirs,k);
        assertEquals(2,output);
    }
    @Test
    public void test_subElement_path4(){
        int[][] dirs = new int[][]{{0,0,1},{0,0,0}};
        k = 1;
        int output = shortest.shortestPath(dirs,k);
    }
    @Test
    public void test_subElement_path5(){
        int[][] dirs = new int[][]{{0,1,0},{1,0,0}};
        k = -1;
        int output = shortest.shortestPath(dirs,k);
        assertEquals(-1,output);
    }
    @Test
    public void test_subElement_path6(){
        int[][] dirs = new int[][]{{0,0,1,1},{0,0,1,1},{0,1,0,1},{1,1,0,0}};
        k = 2;
        int output = shortest.shortestPath(dirs,k);
        assertEquals(6,output);
    }
    @Test
    public void test_subElement_path7(){
        int[][] dirs = new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        k = 10;
        int output = shortest.shortestPath(dirs,k);
        assertEquals(5,output);
    }
    @Test
    public  void test_subElement_path8(){
        int[][] dirs = new int[][]{{0, 1, 1}, {1, 1, 0}, {1, 1, 0},  {0, 0, 0}};
        k = 1;
        int output = shortest.shortestPath(dirs,k);
        assertEquals(-1,output);
    }
}
