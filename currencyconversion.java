import java.text.DecimalFormat;
import java.util.*;
public class currencyconversion {
    public static void main(String[] args){
        double amount,dollar,pound,code,euro,yen,ringgit,rupee;
        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("hi, which currency you want to convert ? ");
        System.out.println("how much do you want to convert ? ");
        System.out.println("1:Rupee \t2:Dollar \t3:pound \t4:euro \t5:yen \t6:ringgit ");
        code = sc.nextInt();
        amount = sc.nextFloat();

        if (code == 1) {



            dollar = amount / 70;
            System.out.println("your" + amount + "rupee is : " + f.format(dollar) + "dollar");

            pound = amount / 88;
            System.out.println("your" + amount + "rupee is : " + f.format(pound) + "pound");

            euro = amount / 80;
            System.out.println("your" + amount + "rupee is : " + f.format(euro) + "euro");

            yen = amount / 0.63;
            System.out.println("yours" + amount + "rupee is : " + f.format(yen) + "yen");

            ringgit = amount / 16;
            System.out.println("yours" + amount + "rupee is: " + f.format(ringgit) + "ringgit");
        }

        else if (code == 2){

            rupee = amount * 70;
            System.out.println("yours" + amount + "dollar is : " + f.format(rupee) + "rupee");

            pound = amount * 0.78;
            System.out.println("yours" + amount + "dollar is : " + f.format(pound) + "pound");

            euro = amount * 0.87;
            System.out.println("yours" + amount + "dollar is : " + f.format(euro) + "euro");

            yen = amount * 111.087;
            System.out.println("yours" + amount + "dollar is : " + f.format(yen) + "yen");

            ringgit = amount * 4.17;
            System.out.println("yours" + amount + "dollar is : " + f.format(ringgit) + "ringgit");

             if (code == 3) {


                rupee = amount * 88;
                System.out.println("yours" + amount + "pound is : " + f.format(rupee) + "rupee");

                dollar = amount * 1.26;
                System.out.println("yours" + amount + "pound is: " + f.format(dollar) + "dollar");

                euro = amount * 1.10;
                System.out.println("yours" + amount + "pound is : " + f.format(euro) + "euro");

                yen = amount * 140.93;
                System.out.println("yours" + amount + "pound is : " + f.format(yen) + "yen");

                ringgit = amount * 5.29;
                System.out.println("yours" + amount + "pound is : " + f.format(ringgit) + "ringgit");
            }

            else if (code == 4) {


                rupee = amount * 80;
                System.out.println("yours" + amount + "euro is : " + f.format(rupee) + "rupee");

                dollar = amount * 1.14;
                System.out.println("yours" + amount + " euro is : " + f.format(dollar) + "dollar");

                pound = amount * 0.90;
                System.out.println("yours" + amount + " euro is : " + f.format(pound) + "pound");

                yen = amount * 127.32;
                System.out.println("yours" + amount + " euro is : " + f.format(yen) + "yen");

                ringgit = amount * 4.78;
                System.out.println("yours" + amount + "euro is" + f.format(ringgit) + "ringgit");
            }
                else if (code == 5) {

                rupee = amount * 0.63;
                System.out.println("yours" + amount + "yen is : " + f.format(rupee) + "rupee");

                dollar = amount * 0.008;
                System.out.println("yours" + amount + "yen is : " + f.format(dollar) + "dollar");

                pound = amount * 0.007;
                System.out.println("yours" + amount + "yen is : " + f.format(pound) + "pound");

                euro = amount * 0.007;
                System.out.println("yours" + amount + "yen is : " + f.format(euro) + "euro");

                ringgit = amount * 0.037;
                System.out.println("yours" + amount + "yen is : " + f.format(ringgit) + "ringgit");
            }

                else if (code == 6) {


                rupee = amount * 16.8;
                System.out.println("yours" + amount + "ringgit is : " + f.format(rupee) + "rupee");

                dollar = amount * 0.239;
                System.out.println("yours" + amount + "ringgit is : " + f.format(dollar) + "dollar");

                pound = amount * 0.188;
                System.out.println("yours" + amount + "ringgit is : " + f.format(pound) + "pound");

                euro = amount * 0.209;
                System.out.println("yours" + amount + "ringgit is : " + f.format(euro) + "euro");

                yen = amount * 26.63;
                System.out.println("yours" + amount + "ringgit is : " + f.format(yen) + "yen");


                System.out.println("invalid input ");

        }


            }









        }

    }

