import java.util.*;

public class C85_get_stairs_path {

    public static ArrayList<String> get_stairs_path(int n) {
        
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            return new ArrayList<>();
        }

        // Recursive calls for 1, 2, and 3 steps
        ArrayList<String> path1 = get_stairs_path(n - 1);
        ArrayList<String> path2 = get_stairs_path(n - 2);
        ArrayList<String> path3 = get_stairs_path(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        // Add "1" in front of all paths from n-1
        for (String path : path1) {
            paths.add("1" + path);
        }

        // Add "2" in front of all paths from n-2
        for (String path : path2) {
            paths.add("2" + path);
        }

        // Add "3" in front of all paths from n-3
        for (String path : path3) {
            paths.add("3" + path);
        }

        return paths;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int n = scn.nextInt();

        ArrayList<String> al = get_stairs_path(n);

        System.out.println("Possible paths: ");
        for (String path : al) {
            System.out.println(path);
        }
    }
}
