package observer_pattern.main.first;

/**
 * ConcreteObserver 상태를 변경할 객체의 외부
 */
public class Application {
    public static void main(String[] args) {

        // target 생성
        Button button = new Button("버튼1");

        // target에 observer 등록
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(Button button) {
                System.out.println(button.getName() + "이 클릭되었습니다.");
            }
        });

        // target이 observer에게 notify
        button.onClick();

    }
}
