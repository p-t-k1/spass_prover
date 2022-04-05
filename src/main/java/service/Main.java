package service;
import codeGen.Prover9Lexer;
import codeGen.Prover9Parser;
import codeGen.SpassLexer;
import codeGen.SpassParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    static public void main(String args[]){

        String data = readFromInputStream();
//        System.out.println(data);

        SpassLexer lexer = new SpassLexer(CharStreams.fromString(data));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SpassParser parser = new SpassParser(tokens);
        ParseTree tree = parser.problem();

        System.out.println(" --------------------------------------------------------- ");
        System.out.println("\t\t ### Spass to Prover9 ###");

        var result = new StringBuilder();
        var visitor = new SpassToPower9Visitor(result);
        visitor.visit(tree);
        String stringAfterVisit = result.toString();


        String[] splittedTree = stringAfterVisit.split(";");
        for (String x : splittedTree ){
            System.out.println(x);
        }

        String datatwo = readFromInputStreamtwo();
//        System.out.println(data);

        Prover9Lexer prover9Lexer = new Prover9Lexer(CharStreams.fromString(datatwo));
        CommonTokenStream commonTokenStream = new CommonTokenStream(prover9Lexer);
        Prover9Parser prover9Parser = new Prover9Parser(commonTokenStream);
        ParseTree parseTree = prover9Parser.start_problem();

        System.out.println("\n\n");
        System.out.println("\t\t ### Prover9 to Spass ###");

        var resulttwo = new StringBuilder();
        var visitortwo = new Prover9ToSpassVisitor(resulttwo);
        visitortwo.visit(parseTree);
        String stringAfterVisittwo = resulttwo.toString();


        String[] splittedTreetwo = stringAfterVisittwo.split(";");
        for (String x : splittedTreetwo ){
            System.out.println(x);
        }
        System.out.println("\n\n");



    }

    private static String readFromInputStream(){
        StringBuilder resultStringBuilder = new StringBuilder();
        try {
            File currentDir = new File("C:\\Users\\Patryk\\proverspass\\src\\example\\spass\\ergo_sum.spass");
            Scanner myReader = new Scanner(currentDir );
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                resultStringBuilder.append(data).append("\n");
            }
        myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return resultStringBuilder.toString();
    }

    private static String readFromInputStreamtwo(){
        StringBuilder resultStringBuilder = new StringBuilder();
        try {
            File currentDir = new File("C:\\Users\\Patryk\\proverspass\\src\\example\\prover9\\ergo_sum.prover9");
            Scanner myReader = new Scanner(currentDir );
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                resultStringBuilder.append(data).append("\n");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return resultStringBuilder.toString();
    }

}
