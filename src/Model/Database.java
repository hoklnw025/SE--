package Model;

import com.mysql.jdbc.PreparedStatement;
import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import java.util.HashMap;

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
    public ArrayList<HashMap> rows(String s){
        return db.queryRows(s);
    }
}
