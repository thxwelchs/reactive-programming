package observer_pattern.main.second;

import java.util.Observable;

/**
 * Observable
 */
public class Button extends Observable {
    private String name;
    private Object state;

    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void onClick() {
        // 이 객체는 관찰이 가능한 객체이고,
        // 이 객체를 관찰하고 있는 Observer 객체에게 notify한다.

        // changed 값을 true로 변경해주지 않으면 Observer들은 update 하지 않는다.
        setChanged();
        notifyObservers(this);
    }
}
