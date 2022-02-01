package edu.sdsu.cs160l;

public class InitializeStrings {
    public void createSimpleInstance(){
        String name = "String";
        System.out.println(name);
    }

    public void createStringUsingConstructor(){
        String name = new String("String");
        System.out.println(name);
    }

    public void equalityOfStrings(){
        String[] data1 = { "mz", "my", "my", "mx", "mz", "mx", "my", "mz" };
        String[] data2 = { "mz", "mz", "mz", "mx", "mx", "my", "my", "my" };

        System.out.println(data1[0]=="mz");
        System.out.println(data1[0]==data2[2]);
        System.out.println(data1[0]==new String(data2[0]));


        System.out.println(data1[0].equals("mz"));
        System.out.println(data1[0].equals(data2[2]));
        System.out.println(data1[0].equals(new String(data2[0])));
    }

}
