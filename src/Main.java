public class Main {

  public static void main(String[] args) {
    long[] arr = {1, 200, 300};
    SalesManager salesManager = new SalesManager(arr);
    long max = salesManager.max();
    System.out.println(max);
  }
}