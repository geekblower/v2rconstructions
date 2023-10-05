class A extends Thread {
  public void run() {
    System.out.println("Thread Block");
  }
}

public class test {
  public static void main(String[] args {
    System.out.println("Main Block");

    A a1 = new A();
    A.start();
  }
}
