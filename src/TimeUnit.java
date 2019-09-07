public class TimeUnit {
    void hour(int a){
        int hToM = a * 60;
        int b = hToM ;
        int mToS= b*60;
        int c = mToS;
        int sToMs = c * 1000;
        int d = sToMs;
        System.out.println(a+" godzin to "+b+" minut."+b+" minut to "+c+" sekund. "+c+" sekund to " +d+" milisekund");
    }
}
