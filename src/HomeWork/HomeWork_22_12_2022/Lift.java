package HomeWork.HomeWork_22_12_2022;
import java.util.Scanner;
public class Lift {
    public static void main(String[] args) {
        /* Cломанный лифт:
        лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
        Каждый раз он поднимается на N этажей и спускается на M этажей.
        Если на последнем подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх.
        Найдите количество подьемов, которые понадобятся лифту.
        */

        System.out.println("Лифт превысил колличество этажей на " + Methods.numberOfLifts() + " подъеме");
    }
}