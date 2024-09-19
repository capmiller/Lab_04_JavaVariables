public class Main {
    public static void main(String[] args)
    {
        int intOperandA = 28;
        int intOperandB = 10;

        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using two ints of " + intOperandA + " and " +intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using two ints of " + intOperandA + " and " +intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using two ints of " + intOperandA + " and " +intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using two ints of " + intOperandA + " and " +intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using two ints of " + intOperandA + " and " +intOperandB + " is " + intModulo);


    }
}