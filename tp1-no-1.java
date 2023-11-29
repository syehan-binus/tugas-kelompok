public class ManipulasiString {
    public static void main(String[] args) {
        // String A dan B
        String stringA = "Saya Belajar Java";
        String stringB = "Java itu Sangat Mudah";

        // a. Mengubah huruf kecil menjadi huruf besar dan sebaliknya
        String resultA = stringCaseConverter(stringA);
        String resultB = stringCaseConverter(stringB);

        System.out.println("a. Mengubah huruf kecil menjadi huruf besar dan sebaliknya:");
        System.out.println("String A: " + resultA);
        System.out.println("String B: " + resultB);

        // b. Menghitung jumlah huruf (tidak termasuk spasi)
        int countA = stringA.replace(" ", "").length();
        int countB = stringB.replace(" ", "").length();

        System.out.println("");
        System.out.println("b. Menghitung jumlah huruf (tidak termasuk spasi):");
        System.out.println("Jumlah huruf String A: " + countA);
        System.out.println("Jumlah huruf String B: " + countB);

        // c. Menggabungkan String A dan B dengan tanda koma dan spasi di antaranya
        String mergedString = String.join(", ", stringA, stringB);

        System.out.println("");
        System.out.println("c. Menggabungkan String A dan B dengan tanda koma dan spasi di antaranya:");
        System.out.println("Hasil penggabungan: " + mergedString);

        // d. Membalik String A dan B
        String reversedA = new StringBuilder(stringA).reverse().toString();
        String reversedB = new StringBuilder(stringB).reverse().toString();


        System.out.println("");
        System.out.println("d. Membalik String A dan B:");
        System.out.println("String A: " + reversedA);
        System.out.println("String B: " + reversedB);
    }
    
    public static String stringCaseConverter(String input){
        if (input.length() == 0) return "";
    
        if (input.length() == 1) return input.toUpperCase();
    
        return input.substring(0,1).toLowerCase()
            + input.substring(1).toUpperCase();
    }
}
