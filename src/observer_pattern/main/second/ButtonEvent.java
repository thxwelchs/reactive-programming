package observer_pattern.main.second;

import java.util.Observable;
import java.util.Observer;

public class ButtonEvent implements Observer {

    private String eventType;


    // Observer 등록
    public ButtonEvent(String eventType, Observable observable) {
        this.eventType = eventType;
        observable.addObserver(this);
    }

    // 상태변화에 반응
    @Override
    public void update(Observable o, Object arg) {
        Button button = (Button) o;
        System.out.println(button.getName() + " " + eventType +  "  이벤트 발생");
    }
}
