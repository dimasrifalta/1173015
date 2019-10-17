public class Latihan2v11 {
    public static void main(String[]args){

        int nilaiInt = 450;
        System.out.println("Nilai int = " + nilaiInt);


        long nilaiLong = nilaiInt;
        System.out.println("Nilai Long = " + nilaiLong);


        byte nilaiLByte =(byte) nilaiInt;
        System.out.println("Nilai Byte = " + nilaiLByte);
        System.out.println(" Nilai MAX byte = " + Byte.MAX_VALUE);
        System.out.println(" Nilai MIN byte = " + Byte.MIN_VALUE);


        //casting pembagian
        int a=10;
        float b= 4;
        float c =a/b ;

        System.out.printf(" %d / %f = %f\n" ,a,b,c);
        int x =10;
        int y = 4;
        float z = (float) x/y;
        System.out.printf(" %d /%d = %f\n" ,x,y,z);







    }


}