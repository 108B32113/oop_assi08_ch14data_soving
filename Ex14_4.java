import java.io.FileReader; //載入io類別庫的檔案讀取類別
import java.io.IOException; //載入io類別庫的IO例外類別

public class Ex14_4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("donkey.txt"); //如果在同個資料夾裡可以不用打前面的位置

//(a) print out text of file
            int readFile;

//(b) calculating count of char
            int count = 0;

//main loop to solve this program
            while ((readFile = fr.read()) != -1) { // 意思是指: 給讀取到的所有文字定一個整數變數i  i導入剛剛建立的已讀取到文件的fr變數然後調用read()方法(來自io) 然後只要所有文字沒有被讀取到字尾 就會不斷的打印出所有在i當中的文字
                System.out.print((char) readFile); // 打印出所有在i裡的值 並將變數在print()中轉成字串
                
                count ++; //用這個指令"++"去做每讀取一個字元就多計算一次的
            }
            System.out.println("");

            System.out.println("讀取了" + count + "個字元");
            fr.close(); //關閉導入的io類別close方法

        } catch (IOException e) {
            e.printStackTrace(); //用拋出的類別的變數e 來調用printStackTrace印出異常堆疊跟蹤的方法
        }
    }
}
