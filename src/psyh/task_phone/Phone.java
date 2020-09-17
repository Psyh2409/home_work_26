package psyh.task_phone;

public class Phone {
    private int number;

    public Phone(){super();}

    public Phone(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                '}';
    }

    public void signUp(){

        if (Network.getNetwork().contains(this)){
            System.out.println("This number is already registered!");
        }else {
            Network.getNetwork().add(this);
            System.out.println("Your registration is successfully!");
        }
    }

    public void makeCall(int subscriberNumber){
        boolean call = false;
        if(Network.getNetwork().contains(this)){
            for (Phone phone: Network.getNetwork()) {
                if (phone.getNumber() == subscriberNumber){
                    System.out.println("You made call to " + subscriberNumber);
                    call = true;
                }
            }
            if (!call) {
                System.out.println("This number isn't registered in uor Network.");
            }
        }else System.out.println("You can't make any call until your phone is unregistered in our Network.");
    }
}
