package lecture3.interfaces.cloneable;

public class LetsCloneDataset {
    public static void main(String[] args) {
        String[] rows = new String[]{
                "Sentence number 1.",
                "Sentence number 2.",
                "lala lala laalalal"
        };
        Dataset dataset = new Dataset(rows);
        System.out.println(dataset.getAverageLength());
        Dataset clonedDataset = dataset.clone();
        System.out.println(clonedDataset.getAverageLength());

        System.out.println(dataset);
        System.out.println(clonedDataset);
    }

}
