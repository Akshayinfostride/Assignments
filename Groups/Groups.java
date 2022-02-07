package Groups;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = {"Sanity","regression"})
    public void test(){
        System.out.println("Test 1 executed");
    }
    @Test(groups = {"Sanity","regression"})
    public void test2(){
        System.out.println("test 2 executed");
    }
    @Test(groups = {"Sanity","regression"})
    public void test3(){
        System.out.println("test 3 executed");
    }
    @Test(groups = {"Sanity","regression"})
    public void test4(){
        System.out.println("test 4 executed");
    }
}
