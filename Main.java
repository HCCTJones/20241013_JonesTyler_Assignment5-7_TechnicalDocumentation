public class Main {
    public static void main(String[] args) {
      double tuition = 10000;
      double totalCost = 0;
  
      // Calculate the tuition in ten years.
      for (int i = 0; i < 10; i++) {
        tuition *= 1.05;
      }
      System.out.printf("Tuition in ten years: $%.2f\n", tuition);
  
      // Calculate the total cost of four years’ worth of tuition after the tenth year.
      for (int i = 0; i < 4; i++) {
        totalCost += tuition;
        tuition *= 1.05;
      }
      System.out.printf("Total cost of four years’ worth of tuition after the tenth year: $%.2f\n", totalCost);
    }
  }