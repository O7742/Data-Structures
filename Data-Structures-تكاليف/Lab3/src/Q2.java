import java.util.Arrays;
//Q2
public class TEACHER implements Cloneable {
    private int id;
    private String name;

    public TEACHER(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "TEACHER{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        TEACHER[] arr1 = {new TEACHER(1, "Fatima"), new TEACHER(2, "Mohammed"), new TEACHER(3, "Bob")};
        TEACHER[] arr2 = arr1.clone();

        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Cloned array: " + Arrays.toString(arr2));
    }
}