package projectmanagement;

public class Programmer extends Orang{
    private String id;
    
    public Programmer(String id){
        this.id=id;
    }

    Programmer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    public String getTugas(String tugas){
        return tugas;   
    }
     
}
