package sterotype_annotation.Model;
import org.springframework.stereotype.Component;

@Component
public class DataStructure {

    private ExtraHours extraHours;

    public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    public void getTotalHours(){
        System.out.println("Total hours : "+ (35+extraHours.getHours()));
    }
}
