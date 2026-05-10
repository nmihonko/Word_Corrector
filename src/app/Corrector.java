package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;

        for (String str : strs) {
            str = str.replace("b", "o");
            stringBuilder.append(count).append(") ").append(str).append("\n");
            count++;
        }

        return stringBuilder.toString();
    }
}