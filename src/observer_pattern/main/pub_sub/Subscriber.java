package observer_pattern.main.pub_sub;

import java.util.Observable;
import java.util.Observer;

public interface Subscriber extends Observer {
    void receive(Publisher publisher, String message);
}
