package com.freelog.cg;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        String[] files = new String[]{
                "grammar_templates/policy_grammar.st",
                "grammar_templates/coloring/exhibit_coloring.g4.st",
                "grammar_templates/coloring/resource_coloring.g4.st",
                "grammar_templates/coloring/user_group_coloring.g4.st",
        };
        for (String file : files) {
            CopyFile.copyFile(file, file);
        }

        System.out.println("Copy '.st' files done!");

        CompilerGenerator cg = new CompilerGenerator("./grammar_templates", "User", "generated_grammar/resource_policy.g4", "", "JavaScript");
        cg.renderGrammar("Resource");
        cg.parseGrammar();
        System.out.println("End!");

    }

}
