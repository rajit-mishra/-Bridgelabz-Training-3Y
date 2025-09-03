public class Main{
    public static void main(String[] args) {
        int[] borrowings = {12, 15, 0, 9, 20, 5, 13};
        int total = 0;
        int max = borrowings[0];
        int maxDay = 0;
        boolean holiday = false;
        for (int i = 0; i < borrowings.length; i++) {
            total += borrowings[i];
            if (borrowings[i] > max) {
                max = borrowings[i];
                maxDay = i;
            }
            if (borrowings[i] == 0) {
                holiday = true;
            }
        }
        double average = (double) total / borrowings.length;
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("📚 Total books borrowed: " + total);
        System.out.println("📈 Highest borrowings on: " + days[maxDay] + " (" + max + " books)");
        System.out.println("🏖️ Was there a holiday? " + (holiday ? "Yes" : "No"));
        System.out.printf("Average daily borrowings: %.2f\n", average);
    }
}