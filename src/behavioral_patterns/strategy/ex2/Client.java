package behavioral_patterns.strategy.ex2;

public class Client {
    public static void main(String[] args) {
        Compressor compressor = new Compressor();
        String data = "aabbccccccaaa";

        compressor.setCompressionStrategy(new RunLengthEncoding());
        System.out.println(compressor.compress(data));

        compressor.setCompressionStrategy(new SimpleReplacementCompression());
        System.out.println(compressor.compress(data));
    }
}
