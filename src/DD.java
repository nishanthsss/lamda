interface Details{
    public String say(String DS);
}

public class DD{
    public static void main(String[] args) {

        Details s1=(name)->{
            return "first name is "+name;
        };
        System.out.println(s1.say("Nishanth"));

        // You can omit function parentheses
        Details s2= name ->{
            return "Last name is  "+name;
        };
        System.out.println(s2.say("shankar"));
        Details s3=(name)->{
            return "Email is "+name;
        };
        System.out.println(s3.say("nss@gmail.com"));
        Details s4=(name)->{
            return "Mobile is "+name;
        };
        System.out.println(s4.say("944567890"));
        Details s5=(name)->{
            return "password is"+name;
        };
        System.out.println(s5.say("Nish2324"));
    }
}