//task #1
/*Составить алгоритм: если введенное число больше 7, то вывести “Привет”*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }
}

//task #2
/*Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

//task #3
/*Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3*/

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}

//task #4
/*Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?
*/

import java.util.Stack;

public class Main {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty() && ((ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[') || (ch == '}' && stack.peek() == '{'))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String sequence = "[((())()(())]]"; //Данная скобочная последовательность НЕ является правильной.
        if (isValid(sequence)) {
            System.out.println("Данная скобочная последовательность является правильной.");
        } else {
            System.out.println("Данная скобочная последовательность НЕ является правильной.");
        }
    }
}

/*Данная скобочная последовательность "[((())()(())]]" является неправильной, так как закрывающая 
квадратная скобка ']' не имеет открывающей скобки. Чтобы сделать эту последовательность правильной,
необходимо удалить лишнюю закрывающую скобку ']'. 
Правильная скобочная последовательность будет выглядеть так: "((())()(()))".
*/

import java.util.Stack;

public class Main {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty() && ((ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[') || (ch == '}' && stack.peek() == '{'))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String sequence = "((())()(()))"; //Данная скобочная последовательность является правильной.
        if (isValid(sequence)) {
            System.out.println("Данная скобочная последовательность является правильной.");
        } else {
            System.out.println("Данная скобочная последовательность НЕ является правильной.");
        }
    }
}


