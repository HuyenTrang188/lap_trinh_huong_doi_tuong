package lab3.bai9;

public abstract class Staff implements IPayable {
    private String Id;
    private String name;

    public Staff(String id, String name){
        this.Id = id;
        this.name = name;
    }

    public String getId(){
        return this.Id ;
    }

    public String getName(){
        return this.name;
    }

    public void setId(String id){
        this.Id = id;
    }

    public void setName(String name){
        this.name = name;
    }

}
