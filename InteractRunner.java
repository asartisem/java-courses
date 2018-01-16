import java.util.Scanner;

/**
    Класс для запуска калькулятора
*/
public class InteractRunner {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Тест: ");
        try {
            System.out.println("Тест2: ");
            Calculator calculator = new Calculator();
            
            System.out.println("Тест3: ");
            
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Введите первое число: ");
                String first = reader.next();
                System.out.println("Введите второе число: ");
                String second = reader.next();
                calculator.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Результат: " + calculator.getResult());
                calculator.clearResult();
                System.out.println("Выйти из кальулятора? yes/no");
                exit = reader.next();     
            }           
        } finally {
            reader.close();
        }
    }    
}
