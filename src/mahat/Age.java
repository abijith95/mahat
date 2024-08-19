package mahat;

public class Age extends Registration {
        private String age;

       Age (String age)
        {
            this.age = age;
        }

        public boolean analyse()
        {
            int age1 = Integer.parseInt(age);
            if(age1 < 18 || age1 > 110)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }


