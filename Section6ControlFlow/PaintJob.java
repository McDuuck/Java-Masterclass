package Section6ControlFlow;

public class PaintJob {
    
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, 0.75));
        System.out.println(getBucketCount(6.26, 2.2));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double requiredBuckets = Math.ceil(area / areaPerBucket);
        int bucketsToBuy = (int) Math.max(0, requiredBuckets - extraBuckets);

        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        int requiredBuckets = (int) Math.ceil(area / areaPerBucket);
        
        return requiredBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int requiredBuckets = (int) Math.ceil(area / areaPerBucket);

        return requiredBuckets;

    }
}
