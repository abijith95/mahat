package mahat;

public class Password extends Registration {
        private String password;

        Password(String password)
        {
            this.password = password;
        }

        public boolean analyse()
        {
            if(password.isEmpty() || password.length() < 6)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }


