package lesson5.noa.sharabi;

public class Pupil implements Comparable<Pupil>{
    private int id;
    private String name;
    public Pupil(int id,String name){
        this.id=id;
        this.name=name;
    }

    public Pupil() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pupil o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
