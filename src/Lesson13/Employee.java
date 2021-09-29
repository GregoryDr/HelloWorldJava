package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("ponedelnik") {
            case "ponedelnik":
            case "vtornik":
            case "sreda":
            case "chetverg":
            case "patniza":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenie":
                System.out.println("Raboti net!!!");
                break;
            default:
                System.out.println("Takogo dna ne sushestvuet");
        }
    }
}
