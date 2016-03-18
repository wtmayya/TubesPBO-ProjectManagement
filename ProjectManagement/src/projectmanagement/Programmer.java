package projectmanagement;

public class Programmer extends Orang{
    private String id;
    
    public Programmer(String id){
        this.id=id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    public String getTugas(){
        return tugas;   
    }
     
}
