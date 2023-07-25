package ch26_Exceptions.final_finally_finalize;

public class F01_Child extends F01_Parent{


    @Override
    public void testMethod() {
        System.out.println("child da override edildi");
    }


  // @Override//
  // public final void finalMethod(){//'finalMethod()' cannot override 'finalMethod()' in 'ch26_Exceptions.
  //     // final_finally_finalize.F01_Parent'; overridden method is final

  //     System.out.println("final methoddan gelirlerse");
  // }





}
