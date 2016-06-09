package org.bithus.singleton;

import javax.sound.midi.Soundbank;

/**
 * Created by michal on 08.06.16.
 */
public class DbSingletonDemo {

    public static void main(String arg[]) {

        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(anotherInstance);

    }

}
