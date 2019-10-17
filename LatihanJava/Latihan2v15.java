public class Latihan2v15 {
    public static void main(String[]args){
        boolean a,b,c;

        System.out.println("----OR{||}---");
        a= false;
        b= false;
        c=(a||b);
        System.out.println(a+ " || " +b+ "=" +c);


        a= false;
        b= true;
        c=(a||b);
        System.out.println(a+ " || " +b+ "=" +c);

        a= true;
        b= false;
        c=(a||b);
        System.out.println(a+ " || " +b+ "=" +c);

        a= true;
        b= true;
        c=(a||b);
        System.out.println(a+ " || " +b+ "=" +c);



        System.out.println("----AND{||}---");
        a= false;
        b= false;
        c=(a&&b);
        System.out.println(a+ " && " +b+ "=" +c);


        a= false;
        b= true;
        c=(a&&b);
        System.out.println(a+ " && " +b+ "=" +c);

        a= true;
        b= false;
        c=(a&&b);
        System.out.println(a+ " && " +b+ "=" +c);

        a= true;
        b= true;
        c=(a&&b);
        System.out.println(a+ " && " +b+ "=" +c);



         System.out.println("----XOR{^}---");
        a= false;
        b= false;
        c=(a^b);
        System.out.println(a+ " ^ " +b+ "=" +c);


        a= false;
        b= true;
        c=(a^b);
        System.out.println(a+ " ^ " +b+ "=" +c);

        a= true;
        b= false;
        c=(a^b);
        System.out.println(a+ " ^ " +b+ "=" +c);

        a= true;
        b= true;
        c=(a^b);
        System.out.println(a+ " ^ " +b+ "=" +c);



        System.out.println("----NOT{!}---");
        a= false;
        c=!a;
        System.out.println(a+ " ! " +b+ "=" +c);

        a= false;
        c=!a;
        System.out.println(a+ " ! " +b+ "=" +c);


        




    }


}