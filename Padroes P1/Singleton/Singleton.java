package ProjetoCars;

public class Singleton {
private volatile static Singleton uniqueInstance;

private Singleton () {

}
    public static Singleton getInstance () {

        Singleton uniqueInstance = Singleton.uniqueInstance;

            if (uniqueInstance == null) {
                synchronized(Singleton.class){
                    uniqueInstance = Singleton.uniqueInstance;
                    if(uniqueInstance==null){
                        Singleton.uniqueInstance=uniqueInstance = new Singleton();
                        }
                }
            }

    return uniqueInstance;
    }





}
