package maintask;

import java.util.Objects;

@Version(version = 1.0)
public class MyService {
    private String name;
    private int digit;

    public MyService(String name, int digit) {
        this.name = name;
        this.digit = digit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }
    private void thisClassInfo(){
        System.out.println ("Номер =  " + digit + " имя - " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        MyService service = (MyService) o;
        return digit == service.digit
                && (name == service.name
                || (name != null &&name.equals(service.getName())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + digit;
        return result;
    }
}
