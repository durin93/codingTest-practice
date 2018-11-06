public class Main {

    public static void main(String[] args) {
/*

        Azimuth azimuth = new Azimuth();
        String[] instructions = {"LEFT","LEFT","TURN AROUND"};
        String[] instructions2 = {"LEFT 5","RIGHT 10","LEFT 15","RIGHT 20","LEFT 25","RIGHT 30","LEFT 35","RIGHT 40"};
        String[] instructions3 = {"RIGHT 59","RIGHT","RIGHT","HALT","LEFT","LEFT","LEFT"};
        String[] instructions4 = {"TURN AROUND","HALT","LEFT 5","HALT","LEFT 5","HALT"};
        azimuth.calc(instructions4);
        System.out.println(azimuth.getResult());

        String problem1 = "This cheese is really great!!!!!";
        String problem2 = "You really like THIS cheese!?!?!?!!!?";
        String problem3 = "a??a ?!a a!?b b!?!C C?!!D D?!?EE ??? FF!!! !???!";
        String problem4 = " a b c A B ! !!C!!! ! ! !C ?!!? ?!? ??";
        String problem5 = " !!?X! ?? This is delicious!!! ??!a!?!";
        Punctuation punctuation = new Punctuation();

        System.out.println(punctuation.calc(problem1));
        System.out.println(punctuation.calc(problem2));
        System.out.println(punctuation.calc(problem3));
        System.out.println(punctuation.calc(problem4));
        System.out.println(punctuation.calc(problem5));
*/

/*
        String[] words = {"abca","zbxz","opqr"};
        SameWord sameWord = new SameWord();

        System.out.println(sameWord.calc(words));
*/

        /*SingleLinkedList<Integer> lis = new SingleLinkedList<>();
        lis.add(0, 1);
        lis.add(2);

        System.out.println(lis.get(0));
        System.out.println(lis.get(1));
*/

        int temp[] = {3, 5, 7, 9, 1, 8};
        temp = BubbleSort.bubbleSortAsc(temp);
        System.out.println("버블정렬ASC");
        for (int num : temp) {
            System.out.print(num + ",");
        }
        System.out.println();
        System.out.println("버블정렬DESC");
        temp = BubbleSort.bubbleSortDesc(temp);
        for (int num : temp) {
            System.out.print(num + ",");
        }
        System.out.println();
        System.out.println("선택정렬ASC");
        temp = SelectionSort.selectSortAsc(temp);

        for (int num : temp) {
            System.out.print(num + ",");
        }

        System.out.println();
        System.out.println("선택정렬DESC");
        temp = SelectionSort.selectSortDesc(temp);

        for (int num : temp) {
            System.out.print(num + ",");
        }

        System.out.println();
        System.out.println("퀵정렬ASC");
        temp = QuickSort.quickSort(temp, 0, temp.length - 1);

        for (int num : temp) {
            System.out.print(num + ",");
        }
        System.out.println();
        System.out.println("삽입정렬ASC");
        temp = InsertionSort.insertionSort(temp);

        for (int num : temp) {
            System.out.print(num + ",");
        }

        System.out.println();
        System.out.println("합병정렬ASC");
        MergeSort.mergeSort2(temp, 0, temp.length - 1);

        for (int num : temp) {
            System.out.print(num + ",");
        }


        System.out.println();
        MergeSort.mergeSort2(temp, 0, temp.length - 1);
        for (int num : temp) {
            System.out.print(num + ",");
        }
        System.out.println("이진탐색(정렬된배열필수) 9찾기");
        System.out.println(BinarySearch.search(temp, 9) + "인덱스 에 있다.");

        System.out.println("순차(선형)탐색 9찾기");
        System.out.println(LinearSearch.search(temp, 9) + "인덱스 에 있다.");


        System.out.println("팩토리얼 3");
        System.out.println(Recursion.factorial(3));

        System.out.println("피보나치 8");
        System.out.println(Recursion.fibonacci(8));


        System.out.println("10까지 숫자중 소수 구하기");
        Prime.getPrime(10);


    }
}
