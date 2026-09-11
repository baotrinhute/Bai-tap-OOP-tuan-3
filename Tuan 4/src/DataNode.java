
public class DataNode extends ATree {
    Person personalInfo;
    ATree father;
    ATree mother;
    public DataNode(Person personalInfo, ATree father, ATree mother){
        this.personalInfo = personalInfo;
        this.father = father;
        this.mother = mother;
    }
}
