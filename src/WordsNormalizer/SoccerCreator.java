package WordsNormalizer;

import WordsNormalizer.sports.Soccer;
import WordsNormalizer.sports.Sports;
import com.sun.tools.javac.Main;

public class SoccerCreator {

    public static void main(String[] args){


        Sports sport = new Sports();
        Soccer soccer = new Soccer();

        System.out.println( sport.getName());
        System.out.println( sport.getNumberOfTeamMembers() );
        System.out.println( soccer.getName());
        System.out.println( soccer.getNumberOfTeamMembers());
    }
}
