package Model;

import edu.sit.cs.db.CSDbDelegate;

public class Database {
    CSDbDelegate db;
    public Database(){
        db = new CSDbDelegate ("localhost","3306","se","root","");
        db.connect();
    }
}
