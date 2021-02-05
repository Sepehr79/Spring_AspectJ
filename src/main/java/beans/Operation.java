package beans;

public class Operation {

    public void msg(){System.out.println("msg invoked");}

    public int m(){
        System.out.println("m invoked");
        System.out.println("returning");
        return 1;
    }

    public int k(){
        System.out.println("k invoked");
        System.out.println("returning");
        return 5;
    }

    public void exceptionThrowable(int num){
        if (num < 20)
            throw new RuntimeException("Exception");
    }

}
