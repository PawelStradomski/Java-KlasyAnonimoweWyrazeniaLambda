

package klasyanonimowe.wyrazenialambda;
/**
 * 
 * @author pawelstradomski
 */

public class KlasyAnonimoweWyrazeniaLambda {

    
    public static void main(String[] args) {
        
        ZachowaniePrzycisku1 z = () -> {
            System.out.println("jestem z klasy anonimowej");
        };
        
        ZachowaniePrzycisku2 z2 = (int a, int b) -> 
        {
            System.out.println(a + b);    
        };
        
        ZachowaniePrzycisku3 z3 = (int c, int d) ->
        {
            return c + d;
        };
        
        ZachowaniePrzycisku4 z4 = (c, d) -> c + d;
        
        
        
        Przycisk p = new Przycisk();
        p.dodajAkcje(z);
        
        p.dodajAkcje2(5, 10, z2);
        
        int wynik = p.dodajAkcje3(7, 7, z3);
        System.out.println(wynik);
        
        
        System.out.println(p.dodajAkcje4(5, 5, z4));
        
        
    }
    
}
interface ZachowaniePrzycisku1
{
    void akcja();
}

interface ZachowaniePrzycisku2
{
    void akcja2(int a, int b);
}

interface ZachowaniePrzycisku3
{
    int akcja3(int c, int d);
}

interface ZachowaniePrzycisku4
{
    int akcja4(int e, int f);
}

class Przycisk
{
    void dodajAkcje(ZachowaniePrzycisku1 z)
    {
        z.akcja();
    }
    
    void dodajAkcje2(int a, int b, ZachowaniePrzycisku2 z)
    {
        z.akcja2(a, b);
    }
    
    int dodajAkcje3(int c, int d, ZachowaniePrzycisku3 z)
    {
        return z.akcja3(c, d);
    }
    
    int dodajAkcje4(int e, int f, ZachowaniePrzycisku4 z)
    {
        return z.akcja4(e, f);
    }
}