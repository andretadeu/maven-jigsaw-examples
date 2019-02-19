package com.andretadeu.example.args4j.app;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class Main {

    @Option(name = "-i", aliases = { "--input" }, required = true, usage = "Input folder")
    private String inputFolder;

    @Option(name = "-o", aliases = { "--output" }, required = true, usage = "Output folder")
    private String outputFolder;

    public static void main(String ... args) {
        new Main().doMain(args);
    }

    void doMain(String ... args) {
        CmdLineParser parser = new CmdLineParser(this);

        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            System.err.println(
                    "java -jar app-<versao>.jar -i <Input folder> -o <Output folder>");
            parser.printUsage(System.err);
            System.err.println();

            return;
        }

        System.out.println("Input folder: " + inputFolder);
        System.out.println("Output folder: " + outputFolder);
    }
}
