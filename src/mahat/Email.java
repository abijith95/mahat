package mahat;

import java.util.regex.Pattern;

public class Email extends Registration {
    private String email;

    Email(String email)
    {
        this.email = email;
    }

    public boolean analyse()
    {
        if(email.isEmpty() || email.contains("@") || email.matches("^(.+)@(.+)$") || email.length() > 10)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
