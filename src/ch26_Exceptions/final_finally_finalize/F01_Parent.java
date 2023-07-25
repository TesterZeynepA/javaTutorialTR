package ch26_Exceptions.final_finally_finalize;

public class F01_Parent {

    public void testMethod(){

        System.out.println("güven kontrole mani değildir");

    }
    /**
     * Final method cannot be overridden
     */
    public final void finalMethod(){

        System.out.println("final methoddan gelirlerse");

    }

}
