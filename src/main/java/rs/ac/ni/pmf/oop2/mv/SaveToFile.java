package rs.ac.ni.pmf.oop2.mv;

public class SaveToFile implements SaveEngine {

    @Override
    public void save(String input) {
        System.out.println("Saving "+ input+ " to file...");
    }
}
