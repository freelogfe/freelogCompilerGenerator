package com.freelog.cg;

public class App {
    public static void main(String[] args) {
//        CompilerGenerator cg = new CompilerGenerator("./grammar_templates", "User", "./target/test-classes/generated_grammar/resource_policy.g4", "./target/test-classes", "JavaScript");
        CompilerGenerator cg = new CompilerGenerator("./grammar_templates", "User", "./target/test-classes/generated_grammar/resource_policy.g4", "./target/test-classes", "JavaScript");
        cg.renderGrammar("Resource");
        cg.parseGrammar();
    }
}
