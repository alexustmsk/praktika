public class CommaOperator {
    public static void main(String[] args) {
        // инициализация i, j происходит один раз в начале цикла
        for (int i = 0, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + "; j = " + j);
        }
    }
}
