public class ClassForSortCompare implements Comparable<ClassForSortCompare>{
    private String name;

    public ClassForSortCompare(String name) {
        this.name = name;
    }
    public int compareTo(ClassForSortCompare o){
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
