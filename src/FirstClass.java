public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World 2");

        //integer, double, String(one to multiple chac/no/# or word/use double quote),
        // character(only 1/single quote), boolean(true and false)....these are data type
        // variables (such as isTrue, name)= doesn't have to be in double quote)
        // double means franction
        // double number = 8.5;
        // int means no fraction
        // System.out.println(number);
        int number2 = 8;
        System.out.println(number2);
        int firstNumber = number2 - 2;
        System.out.println(firstNumber);
        int secondNumber = firstNumber + number2;
        System.out.println(secondNumber);

        //String name = "PeopleNTech";
        //System.out.println("PeopleNTech");

        //String name1 = "@23<";
        //System.out.println(name1);


        //String name = "2";
        boolean isTrue = false;
        boolean istrue = false;
        // line 24 and 25= two different variable....case sensitive
        isTrue = true;
        System.out.println(isTrue);

        //System.out.println(8>=8);

        //int num1 = 13;
        //int num2 = 6;

        // String name1 = "dhaka";
        //String name2 = "New York";
        //String name3 = name1+" , "+name2;
        //System.out.println(name3);

        //System.out.println(num1+" "+num2);
        //System.out.println("Sum is "+(num1+num2));

        // int ans = num1/num2;
        //System.out.println(ans);
        //double answ = num1/num2;
        //double answ1 = (double)num1/num2;
        //System.out.println(answ1);

        int num1 = 11;
        int num2 = 60;
        int num3 = 32;
        int num4 = num3+num1+2;

        //if(num1>num2){
        //System.out.println(num1+ " is larger");
        //} else {
        //    System.out.println(num2+ " is larger");
        //}

        if (num1>num2 && num1>num3) {
            System.out.println(num1 + " is the largest");
        }
        else if (num2>num1 && num2>num3){
            System.out.println(num2+ " is the largest");
        } else {
            System.out.println(num3+ " is the largest");
        }


    }
}
