package TD4MACA.e1;

public interface State {

    void next1(Context ct);
    void next2(Context ct);
    void prev(Context ct);
    void printStatus();
}
