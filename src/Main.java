import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        inputData();
    }


    static void inputData(){
        System.out.println("Выбор операции с числами А и В: "
                + "\n1) + "
                + "\n2) - "
                + "\n3) * "
                + "\n4) / "
                + "\n5) % "
                + "\n6) == "
                + "\n7) > "
                + "\n8) < ");
        String choise = scanner.nextLine();
        System.out.println("Введите A:");
        double a = scanner.nextDouble();
        System.out.println("Введите B:");
        double b = scanner.nextDouble();


        switch (choise) {
            case "1":
                Operation.sum(a, b);
                break;
            case "2":
                Operation.subtraction(a, b);
                break;
            case "3":
                Operation.multiplication(a, b);
                break;
            case "4":
                Operation.division(a, b);
                break;
            case "5":
                Operation.remainderOfDiv(a, b);
                break;
            case "6":
                Operation.comparison(a, b);
                break;
            case "7":
                Operation.chooseBiggestA(a, b);
                break;
            case "8":
                Operation.chooseBiggestB(a, b);
                break;
            default:
                System.out.println("Вы ввели неверный номер!");
        }

        
    }



}
