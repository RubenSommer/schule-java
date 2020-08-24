import java.util.Scanner;

public class Rechnen
{
    public void aufgabe0()
    {
        int a = 3;  //Definierung und Initialisierung der Variable a
        int b = 4;  //Definierung und Initialisierung der Variable b
        int x;  //Definierung der Variable x
        x = a+b+5;  //Addition der Variablen a,b und der Zahl 5
        System.out.println("Ergebnis: " + x);   //Ausgabe eines String und der Variable x in der Java console
    }
    
    public void aufgabe1()
    {
        int y = 344*777;    //Definierung und Initialisierung einer Variable indem zwei Zahlen multipliziert werden
        int q = y-34;   //Definierung und Initialisierung einer Variable indem eine Variable mit einer Zahl suptrahiert wird
        System.out.println("Ergebnis Aufgabe 2: " + q); //Ausgabe eines String und der Variable q in der Java console
    }
    
    public void aufgabe2(int a) 
    {
        int doppelMoppel = a*2; //Definierung und Initialisierung der Variable doppelMoppel
        System.out.println("Das Doppelte von " + a + " ist " + doppelMoppel);   //Ausgabe von zwei Strings und zwei Variablen a, doppelMoppel in die Java console
    }
    
    public void aufgabe3() {
        int k = 5*7;
        System.out.println("5*7 ist: " + k);
    }
    
      public void aufgabe4() {
        int l = (7-4)*123+(8/2);
        System.out.println("Ergebnis: " + l);
    }
    
    public void quadratzahl() {
        Scanner userinput = new Scanner(System.in);
        int userinputnumber;
        
        userinputnumber = userinput.nextInt();
        
        System.out.println("Please enter a valid number");
        
        int result;
        
        result = userinputnumber*userinputnumber;
        System.out.println("Die Quadratzahl von " + userinputnumber + " ist: " + result);
    }
    
    public void modulo() {
        Scanner userinput = new Scanner(System.in);
        int userinputnumber;
        
        userinputnumber = userinput.nextInt();
        
        System.out.println("Please enter a valid number");
        
        int result;
        
        result = userinputnumber % 3;
        System.out.println("Ergebnis: " + result);
        System.out.println("Rest: " + result);
    }
}