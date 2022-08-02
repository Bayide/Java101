/*          Ödev
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart


*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int month;
        String burc = "";
        int day;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ay :");
        month = input.nextInt();

        System.out.println("Doğduğunuz gun:");
        day = input.nextInt();

        if (month==1) {
            if (day > 22)
                System.out.println("Kova Burcu" + burc);
            else
                System.out.println("Oğlak Burcu" + burc);
        }
        if (month == 2) {
            if (day > 20) {
                System.out.println("Balık Burcu" + burc);
            } else {
                System.out.println("Kova Burcu" + burc);
            } if (month == 3) {
                if (day > 20) {
                    System.out.print("Koç Burcu" + burc);
                } else {
                    System.out.print("Balık Burcu" + burc);
                }
                if (month ==4) {
                    if (day > 20) {
                        System.out.println("Boğa Burcu" + burc);
                    } else {
                        System.out.println("Koç Burcu" + burc);
                    }
                    if (month==5) {
                        if (day > 21) {
                            System.out.println("İkizler Burcu" + burc);
                        } else {
                            System.out.println("Boğa Burcu" + burc);
                        }
                        if (month ==6) {
                            if (day > 22) {
                                System.out.println("Yengeç Burcu" + burc);
                            } else {
                                System.out.println("İkizler Burcu" + burc);
                            }
                            if (month ==7) {
                                if (day > 22) {
                                    System.out.println("Aslan Burcu" + burc);
                                } else {
                                    System.out.println("Yengeç Burcu" + burc);
                                }
                                if (month ==8) {
                                    if (day > 22) {
                                        System.out.println("Başak Burcu" + burc);
                                    } else {
                                        System.out.println("Aslan Burcu" + burc);
                                    }
                                    if (month ==9) {
                                        if (day > 22) {
                                            System.out.println("Terazi burcu" + burc);
                                        } else {
                                            System.out.println("Başak Burcu" + burc);
                                        }
                                        if (month==10) {
                                            if (day > 22) {
                                                System.out.println("Akrep burcu" + burc);
                                            } else {
                                                System.out.println("Terazi Burcu" + burc);
                                            }
                                            if (month==11) {
                                                if (day > 21) {
                                                    System.out.println("Yay Burcu" + burc);
                                                } else {
                                                    System.out.println("Akrep Burcu" + burc);
                                                }
                                                if (month ==12) {
                                                    if (day > 21) {
                                                        System.out.println("Oğlak Burcu " + burc);
                                                    } else {
                                                        System.out.println("Yay  Burcu" + burc);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


