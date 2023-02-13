package WordsNormalizer.sports;

public class Soccer extends Sports{
    @Override
    public String getName(){
        return "Soccer Class";
    }

    public int numberOfPlayers(int n){
        return n;
    }

    @Override
    public String getNumberOfTeamMembers(){
        return "Each team has "+ numberOfPlayers(11) +" players in " + getName();
    }
}
