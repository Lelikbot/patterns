package kolokolov.creational.prototype;

public class MyPrototypeObject {

    private String field;

    private Integer myNumber;

    private String getField() {
        return field;
    }

    private void setField(String field) {
        this.field = field;
    }

    private Integer getMyNumber() {
        return myNumber;
    }

    private void setMyNumber(Integer myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new MyPrototypeObject(this);
    }

    private MyPrototypeObject(MyPrototypeObject source) {
        this.setField(source.getField());
        this.setMyNumber(source.getMyNumber());
    }
}


