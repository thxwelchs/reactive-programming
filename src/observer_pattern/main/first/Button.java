package observer_pattern.main.first;

/**
 * Observable
 */
public class Button {
    private String name;
    private OnClickListener onClickListener;

    public Button(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // OnClickListener가 Observer
    // Target(Button)이 Observer(OnClickListener)를 등록하는 과정
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    // notify (Observer에게 상태가 변경되었음을 알린다.)
    public void onClick() {
        // observer가 등록되어 있지 않다면 notify 하지 않는다.
        if(this.onClickListener == null) return;

        onClickListener.onClick(this);
    }
}
