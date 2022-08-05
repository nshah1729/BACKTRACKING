import java.util.ArrayList;

public class GetSubsequence {
    public static void main(String[] args) {
        String s="pep";
        System.out.println(getss(s));
    }

    private static ArrayList<String> getss(String s) {
        if(s.isEmpty()){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char c=s.charAt(0);
        ArrayList<String> ros=getss(s.substring(1));
        ArrayList<String> ans=new ArrayList<>();
        for(String x:ros){
            ans.add(c+x);
            ans.add(x);
        }
        return ans;
    }
}
