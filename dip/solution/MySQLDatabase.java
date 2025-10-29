package dip.solution;

interface Database {
    public void save(String data);
}
public class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}




