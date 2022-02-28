public class PrimitiveDataTypes {

    // Примитивные типы данных
    byte aByte; // 8 bit -128 ... 127
    short aShort = 100; // 16 bit -32768 ... 32767
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1   самый используемый
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    double aDouble = 0.0; // 64 bit   самый используемый (если просто хранить, но не использовать арифметику)

    char aChar = 'w';
    boolean aBoolean = false;

    // Ссылочный тип данных
    String aString = "hello, qa.guru!";

// + -- сложение
// - -- вычитание
// * -- умножение
// / -- целочисленное деление
// % -- остаток от деления
// инкремент ++
// декремент --

// >
// <
// >=
// <=
// ==
// !=

// =
// +=
// -=

// && (&)
// || (|)
// !

    public static void main(String[] args) {

/*Переполнение типа данных byte
byte a = 10;
byte b = 1100;
System.out.println(a + b);*/

/*Переполнение типа данных int
System.out.println(c + 100000000000000000000000);*/
        int c = 50, d = 7;
        System.out.println(c + d > c - d);
        System.out.println(d * c);
        System.out.println(c / d);
        System.out.println(c % d);

        System.out.println(d++);
        System.out.println(d);
        System.out.println(++d);
        System.out.println(d);


        float i = 1.5F;
        double f = 2.84;

        System.out.println(((f - i) > 0) && ((d - i) > 0));
        System.out.println(((f - i) > 0) || ((d - i) > 0));
        System.out.println(d / f);
        System.out.println(d % f);

        char g = 'q', t = 'a';
        boolean bol = false;

        System.out.println(g + t); // char + char
        System.out.println(!bol);
//
    }
}
