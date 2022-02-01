package edu.sdsu.cs160l;

public class StringsVsStringBuilders {

    public void creatingAStringBuilder(){
        StringBuilder s = new StringBuilder();
        System.out.println(s);

        //or

        StringBuilder a = new StringBuilder("Some prefilled value");
        System.out.println(a);
    }

    public void concatenateInStringBuilder(){
        StringBuilder s = new StringBuilder();
        s.append("Hello");
        s.append(" ");
        s.append("World");

        System.out.println(s);
    }

    public void replaceInStringBuilders(){
        StringBuilder s = new StringBuilder("Hello World");
        s.replace(0,1,"M");
        System.out.println(s);

        s.replace(6, 11, "Time");
        System.out.println(s);
    }

    public static void main(String[] args) {
        StringsVsStringBuilders s = new StringsVsStringBuilders();
        s.replaceInStringBuilders();
    }
}
