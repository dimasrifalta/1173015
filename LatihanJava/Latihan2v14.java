public class Latihan2v11 {
    public static void main(String[]args){

        int a,b;
        boolean hasilKomparasi;
        System.out.printf("===PERSAMAAN====");

        a=10;
        b=10;

        hasilKomparasi=(a==b);
        System.out.printf(" %d === /%d -->  %s\n" ,a,b,hasilKomparasi);

        a=12;
        b=10;
        hasilKomparasi= (a==b);
        System.out.printf(" %d === /%d -->  %s\n" ,a,b,hasilKomparasi);



        System.out.printf("===PERTIDAKSAMAAN====");
        a=10;
        b=10;

        hasilKomparasi=(a!=b);
        System.out.printf(" %d != /%d -->  %s\n" ,a,b,hasilKomparasi);

        a=12;
        b=10;
        hasilKomparasi= (a!=b);
        System.out.printf(" %d != /%d -->  %s\n" ,a,b,hasilKomparasi);



        System.out.printf("===KURANG DARI====");
        a=10;
        b=10;

        hasilKomparasi=(a<b);
        System.out.printf(" %d < /%d -->  %s\n" ,a,b,hasilKomparasi);

        a=12;
        b=10;
        hasilKomparasi= (a<b);
        System.out.printf(" %d >/%d -->  %s\n" ,a,b,hasilKomparasi);

        System.out.printf("===LEBIH DARI====");
        a=10;
        b=10;

        hasilKomparasi=(a>b);
        System.out.printf(" %d > /%d -->  %s\n" ,a,b,hasilKomparasi);

        a=12;
        b=10;
        hasilKomparasi= (a>b);
        System.out.printf(" %d > /%d -->  %s\n" ,a,b,hasilKomparasi);



        

        System.out.printf("===KURANG DARI SAMA DENGAN====");
        a=10;
        b=10;

        hasilKomparasi=(a<=b);
        System.out.printf(" %d <= /%d -->  %s\n" ,a,b,hasilKomparasi);
        a=12;
        b=10;
        hasilKomparasi= (a<=b);
        System.out.printf(" %d < /%d -->  %s\n" ,a,b,hasilKomparasi);

        System.out.printf("===LEBIH DARI SAMA DENGAN====");
        a=10;
        b=10;

        hasilKomparasi=(a>=b);
        System.out.printf(" %d >= /%d -->  %s\n" ,a,b,hasilKomparasi);

        a=12;
        b=10;
        hasilKomparasi= (a>b);
        System.out.printf(" %d >= /%d -->  %s\n" ,a,b,hasilKomparasi);




    }

}