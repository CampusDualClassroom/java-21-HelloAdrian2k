package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        HashSet<String> setablaHash = new HashSet<>();
        addInitialElementsToSet(setablaHash);
        return setablaHash;
    }

    public static Set<String> createTreeSet() {
        TreeSet<String> rojoNegroSet = new TreeSet<>();
        addInitialElementsToSet(rojoNegroSet);
        return rojoNegroSet;
    }

    private static void printSet(Set<String> customSet) {
        int nexo = 1;
        System.out.print("\n" + customSet.getClass().getSimpleName() + ": ");
        for (String elem : customSet) {
            System.out.print(nexo != customSet.size() ? elem + ", " : elem);
            nexo++;
        }
    }

    public static void addInitialElementsToSet(Set<String> s) {
        s.add("ELEMENT KPRBC");
        s.add("ELEMENT YPBTM");
        s.add("ELEMENT AADXU");
        s.add("ELEMENT RXCGJ");
        s.add("ELEMENT WYMVD");
        s.add("ELEMENT WFGEJ");
        s.add("ELEMENT TYGBS");
        s.add("ELEMENT MAPTK");
        s.add("ELEMENT GJXVE");
        s.add("ELEMENT BAFGL");
    }

    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> setablaHash = createHashSet(); //tambien valdría : HashSet<String> setablaHash = (HashSet<String>) createHashSet();
        Set<String> rojoNegroSet = createTreeSet(); //idem

        addElementToSet(setablaHash, "ELEMENT CLAVEND");
        addElementToSet(rojoNegroSet, "ELEMENT AAAFIRST");

        printSet(setablaHash);
        printSet(rojoNegroSet);
    }

}
