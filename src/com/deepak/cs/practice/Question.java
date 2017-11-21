package com.deepak.cs.practice;

import java.util.List;

public interface Question {
    void execute();

    boolean hasSubsections();

    List<Subsection> getAllSubsections();
}
