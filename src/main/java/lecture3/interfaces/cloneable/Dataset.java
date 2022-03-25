package lecture3.interfaces.cloneable;

public class Dataset implements Cloneable {
    private String[] rows;
    private double averageLength;
    private String[] mostFrequentTokens;

    public Dataset(String[] rows) {
        this.rows = rows;
        calculateAverageLength();
        findMostFrequentRows();
    }

    private Dataset(String[] rows, double averageLength, String[] mostFrequentRows) {
        this.rows = rows;
        this.averageLength = averageLength;
        this.mostFrequentTokens = mostFrequentRows;
    }

    private void calculateAverageLength() {
        double totalLength = 0.0;
        int tokenCounter = 0;
        for (String row : rows) {
            // how you can do it better?
            for (String token : row.split(" ")) {
                totalLength += token.length();
                tokenCounter++;
            }
        }
        averageLength = tokenCounter == 0 ? 0 : totalLength / tokenCounter;
    }

    private void findMostFrequentRows() {
        // todo try to do it :-)
    }

    public double getAverageLength() {
        return averageLength;
    }

    @Override
    public Dataset clone() {
        // create new Object and fill all needed data
        return new Dataset(rows, averageLength, mostFrequentTokens);
    }
}
