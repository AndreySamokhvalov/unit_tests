package Calculator;

public class Calculator {
    public static void main(String[] args) {


        int result = calculation(10, 5, '/');
        System.out.println(result);
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }


//   вычисления суммы покупки со скидкой.
//   принимает сумму покупки, скидку

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {

        // с учетом скидки
        double discountedAmount = 0; 

        if (purchaseAmount >= 0) {

            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException("Размер скидеи должен быть не больше 100%, но не меньше 0%");
            }

        } else {
            throw new ArithmeticException("Сумма покупок - неотрицательное число");
        }

        return discountedAmount;
    }
}
