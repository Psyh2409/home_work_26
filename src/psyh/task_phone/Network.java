package psyh.task_phone;

import java.util.ArrayList;
import java.util.List;

public class Network {

    private final List<Phone> network; // make it final says IntelliJIDEA

    public Network() {
        super();
        this.network = new ArrayList<>();
    }

    public List<Phone> getNetwork() {
        return network;
    }
}
