package Model;

import edu.sit.cs.db.CSDbDelegate;

public class Database {
    private CSDbDelegate db;
    public void connect() 
    {
        db = new CSDbDelegate ("localhost","3306","test","root","");
        db.connect();
    }
    public void execute(String q){
        db.executeQuery(q);  
    }
    public void disconnect(){
        db.disconnect();
    }
}
