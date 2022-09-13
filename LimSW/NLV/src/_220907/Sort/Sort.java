package _220907.Sort;

public class Sort {
    public static void main(String[] args) {
        int[] sample = {1, 5, 7, 10, 2, 4, 6, 3, 9, 8};
        int[] result;
        
        /* 선택정렬
        SelectionSort SelS = new SelectionSort();
        result = SelS.Sort(sample);
        */

        /* 퀵정렬
        QuickSort QuiS = new QuickSort();
        result = QuiS.Sort(sample);
        */

        // 셸정렬
        ShellSort SheS = new ShellSort();
        result = SheS.Sort(sample);
        /**/
    }
}
