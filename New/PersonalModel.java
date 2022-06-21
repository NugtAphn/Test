
package New;
        
import java.util.ArrayList;

public class PersonalModel<T> {
    private ArrayList<T> ListStudent;

    public PersonalModel() {
        ListStudent = new ArrayList<T>();
    }

    public PersonalModel(ArrayList<T> ListStudent) {
        this.ListStudent = ListStudent;
    }

    public void Add(T s) {
        ListStudent.add(s);
    }
    public void Out() {
        for (T s : ListStudent)
            System.out.println(s.toString());
        
    }
}
