package com.freelog.cg;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        String[] needCopyFiles = new String[]{
                "grammar_templates/policy_grammar.st",
                "grammar_templates/coloring/exhibit_coloring.g4.st",
                "grammar_templates/coloring/resource_coloring.g4.st",
                "grammar_templates/coloring/user_group_coloring.g4.st",
        };
        for (String file : needCopyFiles) {
            CopyFile.copyFile(file, file);
        }

        System.out.println("Copy '.st' files done!");

        CompilerGenerator cg = new CompilerGenerator("./grammar_templates", "User", "generated_grammar/resourcePolicy.g4", "", "JavaScript");
        cg.renderGrammar("Resource");
        cg.parseGrammar();
        System.out.println("End!");

    }

}
