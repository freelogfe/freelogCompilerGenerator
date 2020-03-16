package com.freelog.cg;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        CompilerGenerator cg = new CompilerGenerator("./grammar_templates", "User", "generated_grammar/resource_policy.g4", "", "JavaScript");
        cg.renderGrammar("Resource");
        cg.parseGrammar();
        System.out.println("End!");

    }

}
