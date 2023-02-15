

public class ServerNameGenerator {

    private static String [] nouns = {"table","car","banana","money","music","love","dog","cat","time","family"};
    private static String [] adjectives;

//    public static void main(String[] args) {
//        ServerNameGenerator sng = new ServerNameGenerator();
//    }
    public ServerNameGenerator(String[] adjs, String[] nouns) {
        this.adjectives = new String[]{"adorable", "adventurous", "aggressive", "busy", "beautiful", "bright", "calm", "cautious", "crazy", "dangerous"};
        this.nouns = nouns;
    }

    // accessors

    public String[] getAdjs() {
        return adjectives;
    }

    public void setAdjs(String[] adjs) {
        this.adjectives = adjs;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    public String getSingleString(String[] stringArr){
        int randomIndex = (int)Math.random() * (stringArr.length) + 1;
        return stringArr[randomIndex];
    }
}
