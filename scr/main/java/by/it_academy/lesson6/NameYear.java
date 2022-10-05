package by.it_academy.lesson6;

public class NameYear {
    public static void main(String[] args) {
        String[] array = new String[]{"Sasha,2000", "Stanislav,1995", "Roman,2015"};
        double sum = 0;
        String longestName = "";
        for (String i : array) {
            String[] nameYear = i.split(",");
            String name = nameYear[0];
            if (longestName.length() < name.length()) {
                longestName = name;
            }
            sum += Integer.parseInt(nameYear[1]);
        }
        System.out.println(longestName);
        System.out.println(sum / array.length);
    }
}
