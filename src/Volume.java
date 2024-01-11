public class Volume {
    //psvm
    public static void main(String[] args) {
        //# of cans
        int noOfCans = 6;

        //volume of a single can
        //final makes it a const
        final double VOLUME_OF_CAN = 0.355;

        double totalVolume = noOfCans * VOLUME_OF_CAN;


        System.out.println("Total volume of a" + noOfCans + " pack is " + totalVolume);

    }
}
