package com.deepak.cs.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class PracticeTest1 implements PracticeTest {

    @Override
    public List<Question> getAllQuestions() {
        return Arrays.asList(new Q3(), new Q4());
    }

    public static class Q3 implements Question {
        private static final String ITEM_1 = "bad";
        private static final String ITEM2 = "ass";
        private ArrayList<String> names = resetList();

        private static ArrayList<String> resetList() {
            ArrayList<String> names = new ArrayList<String>();
            names.add(ITEM_1);
            names.add(ITEM2);
            return names;
        }

        private static class I implements Subsection {
            @Override
            public void execute() {
                ArrayList<String> names = resetList();

                int last = names.size() -1;
                String temp = names.get(last);
                names.remove(last);
                names.add(names.get(0));
                names.remove(0);
                names.add(0, temp);

                Utils.printCollectionContents(names);
            }
        }

        private static class II implements Subsection {
            @Override
            public void execute() {
                ArrayList<String> names = resetList();

                String s1 = names.get(0);
                String s2 = names.get(names.size()-1);
                names.set(0, s2);
                names.set(names.size()-1, s1);

                Utils.printCollectionContents(names);
            }
        }

        private static class III implements Subsection {

            @Override
            public void execute() {
                ArrayList<String> names = resetList();

                int last = names.size() -1;
                String n1 = names.get(0);
                names.remove(0);
                names.add(0, names.get(last));
                names.add(n1);

                Utils.printCollectionContents(names);
            }
        }

        @Override
        public void execute() {
            System.out.print("Initial Array: ");
            Utils.printCollectionContents(names);
        }

        @Override
        public boolean hasSubsections() {
            return true;
        }

        @Override
        public List<Subsection> getAllSubsections() {
            return Arrays.asList(new I(), new II(), new III());
        }
    }

    public static class Q4 implements Question {

        @Override
        public void execute() {
            int[][] arr = {
                    {1,2,3,4,5,6},
                    {7,8,9,10,11,12},
                    {13,14,15,16,17,18} };

            for (int [] list: arr)
                for (int x : list)
                    if (x % 4 == 2 && x % 3 == 0)
                        System.out.print(x + " ");
        }

        @Override
        public boolean hasSubsections() {
            return false;
        }

        @Override
        public List<Subsection> getAllSubsections() {
            return null;
        }
    }


}
