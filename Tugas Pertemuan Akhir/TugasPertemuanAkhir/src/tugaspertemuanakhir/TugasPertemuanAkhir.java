package tugaspertemuanakhir;

/**
 *
 * @author Aziizah Oki Shofrina
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class TugasPertemuanAkhir {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception, IOException {
        System.out.println(
            "\nAZIIZAH OKI SHOFRINA" +
            "\n2109106004"
        );
        
        System.out.println("\nNo. 1 -#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-\n");

        System.out.print("Masukkan kalimat: ");
        String strAwal = br.readLine();
        System.out.println(
            "\nKalimat yang dimasukkan:" + 
            "\n\t" + strAwal + "\n"
        );

        // kasus 1
        System.out.println("Kasus 1: " + tampil1(strAwal));

        // kasus 2
        System.out.println("Kasus 2: " + tampil2(strAwal));

        // kasus 3
        System.out.println("Kasus 3: " + tampil3(strAwal));

        // kasus 4
        System.out.println("Kasus 4: " + tampil4(strAwal));

        // kasus 5
        System.out.println("Kasus 5: " + tampil5(strAwal));

        System.out.println("\nNo. 2 -#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-\n");

        String mk;
        int kehadiran, uts, uas;
        double finalKehadiran, finalUTS, finalUAS, total;
        char grade;

        System.out.print("Mata kuliah\t: ");
        mk = br.readLine();

        System.out.print("Kehadiran\t: ");
        kehadiran = Integer.parseInt(br.readLine());
        
        if (kehadiran < 3) {
            kehadiran = 0;
        } else if (kehadiran >= 3 && kehadiran <= 4) {
            kehadiran = 60;
        } else if (kehadiran >= 5 && kehadiran <= 6) {
            kehadiran = 80;
        } else {
            kehadiran = 100;
        }
        finalKehadiran = kehadiran * 20/100;

        System.out.print("Nilai UTS\t: ");
        uts = Integer.parseInt(br.readLine());
        finalUTS = uts * 30/100;

        System.out.print("Nilai UAS\t: ");
        uas = Integer.parseInt(br.readLine());
        finalUAS = uas * 50/100;

        total = finalKehadiran + finalUTS + finalUAS;
        
        if (total < 50) {
            grade = 'E';
        } else if (total >= 50 && total <= 59) {
            grade = 'D';
        } else if (total >= 60 && total <= 69) {
            grade = 'C';
        } else if (total >= 70 && total <= 84) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.printf(
            "\nNilai Mata Kuliah %1$s ----------- \n" +
            "Kehadiran   = %2$d * 20/100 = %5$f  \n" + 
            "UTS         = %3$d * 30/100 = %6$f  \n" + 
            "UAS         = %4$d * 50/100 = %7$f  \n" + 
            "                             ------+ \n" + 
            "Nilai Akhir =                 %8$f  \n" +
            "                                     \n" + 
            "Grade       = %9$c", 
            mk, kehadiran, uts, uas, finalKehadiran, finalUTS, finalUAS, total, grade
        );


    }

    public static String tampil1(String strAwal) {
        String[] subStr = strAwal.split(" ");
        String strAkhir = "";
        for (int i=0; i<subStr.length/2; i++) {
            strAkhir +=  subStr[i] + " ";
        }
        return strAkhir;
    }

    public static String tampil2(String strAwal) {
        String strAkhir = tampil1(strAwal).toLowerCase();
        return strAkhir;
    }

    public static String tampil3(String strAwal) {
        String strAkhir = tampil1(strAwal).toUpperCase();
        return strAkhir;
    }

    public static String tampil4(String strAwal) {
        String[] subStr = strAwal.split(" ");
        return subStr[3];
    }

    public static String tampil5(String strAwal) {
        String[] subStr = strAwal.split(" ");
        String strAkhir = "";
        for (int i = subStr.length/2; i < subStr.length; i++) {
            strAkhir += subStr[i] + " ";
        }
        return strAkhir;
    }

    

}

