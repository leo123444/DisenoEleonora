
 
import android.widget.TextView;
public class Mediator{

 private Integer counter;
    private TextView display;
    public Mediator() {
        counter=0;

    }

    public Integer getCounter() {
        return counter;
    }

    public void increment() {
        this.counter++;
    }

    public void decrement() {
        this.counter--;
    }

public void setDisplay(String text) {
        display.setText(text);
    }


}
