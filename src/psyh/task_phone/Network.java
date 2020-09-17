package psyh.task_phone;

import java.util.ArrayList;

public class Network {

    private static ArrayList<Phone> network = new ArrayList<>();

    public Network() {
        super();
    }

    public static ArrayList<Phone> getNetwork() {
        return network;
    }
}
