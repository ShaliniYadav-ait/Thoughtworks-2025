public class IndexOutOfBound {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            int nums[] = {10, 20, 30};
            System.out.println(nums[4]);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound!");
        }

        catch (Exception e){
            System.out.println("Exception");
        }

//        catch (IndexOutOfBoundsException e) {
//            System.out.println("Index out of bound!");
//        }

        System.out.println("End");
    }

}
