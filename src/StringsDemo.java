public class StringsDemo {
    public static void main(String[] args){

        String s1 = "black";
        //String s2 = s1;
        String s2 = "black";

        System.out.println(s1 == s2);

        String s3 = new String("black");
        String s4 = new String("black");

        System.out.println(s3 == s4);

        //objects are created with specific memory location
        //reason s3 and s4 returns false becuase it's comparing memory location, since they are two seperate objects
        //they do not have the same memory location
        //works in s1 and s2 because s1 and s2 point to same string literal, s2 just points to s1, same memory location so returns true

        //equals method (compares content, not memory location)
        System.out.println(s3.equals(s4));

        //lexicode graphically compares, if same then 0
        System.out.println(s3.compareTo(s4));

        //begin index is inclusive, end is not
        System.out.println(s1.substring(2,5));
    }
}
