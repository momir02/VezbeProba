package rs.ac.ni.pmf.oop2.mv;

public class SaveToServer implements SaveEngine{
    @Override
    public void save(String input) {
        System.out.println("Saving " + input + " To server...");
    }
}
