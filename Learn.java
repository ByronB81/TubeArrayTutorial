import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Learn {
  public static void main(String[] args) {

    ArrayList arrayListOne = new ArrayList();
    ArrayList arrayListTwo = new ArrayList();

    ArrayList<String> names = new ArrayList<String>();

    names.add("John Smith");
    names.add("Pandora Princess");
    names.add("Lou Weed");

    names.add(2, "Byron Blocker");
    names.set(0, "John Addams");
    names.remove(3);

    for(int i = 0; i < names.size(); i++){
      System.out.println(names.get(i));
    }

    System.out.println(names);
    for(String name: names){
      System.out.println(name);
    }

    Iterator indivItems = names.iterator();{

    while(indivItems.hasNext()){
      System.out.println(indivItems.next());
    }

    ArrayList nameCopy = new ArrayList();
    ArrayList nameBackup = new ArrayList();

    nameCopy.addAll(names);

    String paulYoung = "Paul Young";

    names.add(paulYoung);

    if (names.contains(paulYoung)) {
      System.out.println("paul is here");
    }

    if (names.containsAll(nameCopy)) {
      System.out.println("Yup all there");
    }

    names.clear();

    if (names.isEmpty()){
      System.out.println("Totes empty now");
    }

    Object[] moreNames = new Object[4];
    moreNames = nameCopy.toArray();

    System.out.println(Arrays.toString(moreNames));

  }


  }
}
