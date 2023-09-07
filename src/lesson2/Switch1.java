package lesson2;

public class Switch1 {
    public static void main(String[] args) {
        switch ("piatnica") {
            case "ponedelnik":
            case "vtornik":
            case "sreda":
            case "chetverg":
            case "piatnica":
                System.out.println("Rabota do 18:00");
            break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenie":
                System.out.println("Vyhodnoi");
            default:
                System.out.println("No data");
        }
    }
}
