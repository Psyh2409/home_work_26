package psyh.task_phone;

import java.util.Objects;

public class Phone {
    private int number;
    private Network network;

    public Phone() {
        super();
    }

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

    public void signUp(Network network) {
        if (network.getNetwork().contains(this)) {
            System.out.println("This number is already registered!");
        } else {
            network.getNetwork().add(this);
            this.network = network;
            System.out.println("Your registration is successfully!");
        }
    }

    public void makeCall(int subscriberNumber) {
        boolean isCallMade = false;
        if (network != null && network.getNetwork() != null && network.getNetwork().contains(this)) {
            for (Phone phone : network.getNetwork()) {
                if (phone.getNumber() == subscriberNumber) {
                    System.out.println("You call to " + subscriberNumber + ". Connecting...");
                    phone.takeCall(this.number);
                    System.out.println("You made call to " + subscriberNumber);
                    isCallMade = true;
                }
            }
            if (!isCallMade) {
                System.out.println("This number isn't registered in our Network.");
            }
        } else System.out.println("You can't make any call till your phone is unregistered in our Network.");
    }

    public void takeCall(int incomingNumber) {
        System.out.println("Call from " + incomingNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
