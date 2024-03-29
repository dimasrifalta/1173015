public class Latihan2v16 {
    public static void main(String[]args){

        //bitwise
        byte a = 3;
        byte b, c;
        String a_bits,b_bits,c_bits;


        //shift left
        System.out.println("--Shift left {<<} --");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b = (byte) (a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits,b);

        //shift right
        System.out.println("--Shift right {>>} --");
        a=24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b = (byte) (a >> 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits,b);

        //bitwise or
        System.out.println("--Bitwise OR {|}--");
        a=24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits,b);
        System.out.println("----------OR----");
        c= (byte)(a | b );
        c_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",c_bits,c);

        //bitwise and
        System.out.println("--Bitwise AND {|}--");
        a=24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits,b);
        System.out.println("----------AND----");
        c= (byte)(a & b );
        c_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",c_bits,c);

        //bitwise xor
        System.out.println("--Bitwise XOR {^}--");
        a=24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits,b);
        System.out.println("----------XOR----");
        c= (byte)(a ^ b );
        c_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",c_bits,c);

        //operator negasi
        System.out.println("--Bitwise NOT {~}--");
        a=24;
        b= (byte) (~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits,a);
        System.out.println("----------NOT----");
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d\n",b_bits,b);
    }
}