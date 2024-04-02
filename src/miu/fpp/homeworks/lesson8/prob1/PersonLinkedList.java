package miu.fpp.homeworks.lesson8.prob1;

import java.util.Arrays;

public class PersonLinkedList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfPeople;

    public PersonLinkedList() {
        currentArray = new Person[INITIAL_LENGTH];
        numOfPeople = 0;
    }

    public void add(Person p) {
        if (p == null) return;
        if (numOfPeople == currentArray.length) resize();
        currentArray[numOfPeople] = p;
        numOfPeople++;
    }

    public void resize() {
        System.out.println("resizing");
        int len = currentArray.length;
        int newLen = 2 * len;
        Person[] tempArr = new Person[newLen];
        System.arraycopy(currentArray, 0, tempArr, 0, len);
        currentArray = tempArr;
    }

    public Person get(int i) {
        if (i < 0 || i >= numOfPeople) return null;
        return currentArray[i];
    }

    public boolean find(Person p) {
        if (p == null) return false;
        for (int i = 0; i < numOfPeople; i++)
            if (currentArray[i].equals(p)) return true;
        return false;
    }

    public boolean remove(Person p) {
        if (numOfPeople == 0 || p == null) return false;
        int index = -1;
        for (int i = 0; i < numOfPeople; i++) {
            if (currentArray[i].equals(p)) {
                index = i;
                break;
            }
        }

        if (index == -1) return false;
        Person[] tempArr = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, tempArr, 0, index);
        System.arraycopy(currentArray, index + 1, tempArr, index, currentArray.length - (index + 1));
        currentArray = tempArr;
        --numOfPeople;
        return true;
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(currentArray, numOfPeople);
        return temp;
    }

    public int size() {
        return numOfPeople;
    }

    public void insert(Person p, int pos) {
        if (p == null || pos > numOfPeople || pos < 0) return;
        if (numOfPeople == currentArray.length) resize();
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = p;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (pos + 1));
        currentArray = temp;
        ++numOfPeople;
    }

    public static void main(String[] args) {
        PersonLinkedList personList = new PersonLinkedList();
        personList.add(new Person("Joe", "Summer", 12));
        personList.add(new Person("Larry", "Page", 40));
        personList.add(new Person("Bill", "Gates", 64));
        System.out.println(personList.size());
        System.out.println(personList.get(0));
        personList.insert(new Person("Mark", "Zuckerberg", 40), 0);
        System.out.println(personList.get(0));
        Person personForRemove = personList.get(1);
        personList.remove(personForRemove);
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }
}
