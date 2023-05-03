
    import java.io.FileWriter;
    import java.util.Arrays;
    
    
    public class Task2 {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            int[] arr = {9, -5, -1, 0, -11, 18, 28};
            int temp;
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if (arr[j] < arr[j - 1]) {
                        temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                    sb.append(Arrays.toString(arr)).append("\n");
                    try {
                        FileWriter fw = new FileWriter("log.txt", false);
                        fw.write(sb.toString());
                        fw.close();
                    } catch (Exception e) {
                        System.out.println("ERROR!");
                    }  
                }
            }
        }
    }