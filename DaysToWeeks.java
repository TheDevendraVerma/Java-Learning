 public class DaysToWeeks {
    public static void main(String[] args) {
        int totalDays = 45;

        // 1 hafte me 7 din hote hain
        int weeks = totalDays / 7;       // Division (/) se total weeks milenge
        int remainingDays = totalDays % 7; // Modulus (%) se bache hue din milenge

        // Result print karwaya
        System.out.println("Total Days: " + totalDays);
        System.out.println("Weeks: " + weeks);
        System.out.println("Remaining Days: " + remainingDays);
    }
}