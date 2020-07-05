package observer_pattern.main.second;


public class Application {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        ButtonEvent startEvent = new ButtonEvent("start", button);
        ButtonEvent stopEvent = new ButtonEvent("stop", button);

        button.onClick();


    }
}
