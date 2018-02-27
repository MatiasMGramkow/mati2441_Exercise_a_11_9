import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise9
{

    /*
    Write a method hasEven that accepts a set of integers as a parameter and returns
    true if the set contains at least
    one even integer and false otherwise. If passed the empty set,
    your method should return false.
     */
    public static void main(String[] args)
    {
        // Laver et boolean som tjekker om de er lige
        boolean erLige;

        // Laver en linkedlist som et set som kan holde på Integers
        Set<Integer> set = new HashSet<Integer>();

        // Tilføjer tal til listen
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(9);

        // Sætter "erLige" til at være lig med metoden
        erLige = harEtLigeTal(set);

        // Printer
        System.out.println("Hvis 'True' = et lige tal på listen \n" +
                            "Hvis 'False' = ikke et lige tal på listen\n" +
                            erLige);
    }

    private static boolean harEtLigeTal(Set <Integer> set)
    {
        // starter som false
        boolean fundetLigeTal = false;

        // Laver en linkedlist som iterator som holder på integers
        Iterator<Integer> iterator = set.iterator();

        // Hvis setter er tomt
        if(set.isEmpty())
        {
            return fundetLigeTal;
        }
        else
        {
            while (iterator.hasNext())
            {
                int rediger = iterator.next();

                // Dette tjekker hvis der er et lige tal
                if ( rediger % 2 == 0)
                {
                    fundetLigeTal = true;
                    break;
                }
            }
        }
        return fundetLigeTal;
    }
}
