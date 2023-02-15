import java.util.Random;

public class ServerNameGenerator {
    private static Random random = new Random();
    private static String [] nouns = {"table","car","banana","money","music","love","dog","cat","time","family"};
    private static String [] adjectives = {"adorable", "adventurous", "aggressive", "busy", "beautiful", "bright", "calm", "cautious", "crazy", "dangerous"};

    public static String getRandomString(String[] strings){
        int rndNum = random.nextInt(strings.length);
        return strings[rndNum];
    }
    public static void main(String[] args) {
        String rndNoun = (getRandomString(nouns));
        String rndAdj = (getRandomString(adjectives));

        System.out.printf("""
                Here is your server name:
                %s-%s""", rndAdj, rndNoun);
    }
}
