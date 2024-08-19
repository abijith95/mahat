package mahat;

public class Name extends Registration {

    private String name;
     Name(String name)
     {
         this.name = name;
     }

     public boolean analyse()
     {
         if(name.isEmpty())
         {
             return false;
         }
         else {
             return true;
         }
     }
}
