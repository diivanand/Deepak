package com.deepak.cs.practice;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<PracticeTest> practiceTests = Arrays.asList(new PracticeTest1());

        for (PracticeTest practiceTest : practiceTests) {
            System.out.println("Printing: " + practiceTest.getClass().getSimpleName());

            for (Question question : practiceTest.getAllQuestions()) {
                System.out.println("Printing: " + question.getClass().getSimpleName());
                try {
                    if (question.hasSubsections()) {
                        question.execute();
                        for (Subsection subsection : question.getAllSubsections()) {
                            System.out.println("Printing: " + subsection.getClass().getSimpleName());
                            try {
                                subsection.execute();
                            } catch (Exception ex) {
                                System.out.println(ex.toString());
                            }
                        }
                    } else {
                        question.execute();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.out.println("");
            }

            System.out.println();
        }
    }
}
