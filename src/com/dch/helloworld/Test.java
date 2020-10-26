
package com.dch.helloworld;

public class Test {

    public static void main(String[] args) {
//       Tank t1 = new Tank();
//       Tank t2 = new Tank();
//       t1.level = 9;
//       t2.level = 47;
//       System.out.println("t1.level:"+t1.level+"，"+"t2.level:"+t2.level);
//       t1.level = t2.level;
//       System.out.println("t1.level:"+t1.level+"，"+"t2.level:"+t2.level);
//       t1.level = 27;
//       System.out.println("t1.level:"+t1.level+"，"+"t2.level:"+t2.level);
        Tank t1 = new Tank();
        t1.level = 32;
        System.out.println("t1.level:"+t1.level);
        f(t1);
        System.out.println("t1.level:"+t1.level);
    }

    public static void f(Tank tank){
        tank.level = 51;
    }

}
