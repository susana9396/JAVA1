public class StringManipulator {

    public String trimAndConcat(String a, String b) {
        return a.trim().concat(b.trim());
    }

    public Integer getIndexOrNull(String a, char c) {
        if(a.indexOf(c)!=-1){
            return a.indexOf(c);
        }
        return null;
    }

    public Integer getIndexOrNull(String a, String str) {
        if (a.indexOf(str)!=-1){
            return a.indexOf(str);
        }
        return null;
    }

    public String concatSubstring(String str, int begin, int end, String other) {
        return str.substring(begin,end).concat(other);
    }

}
