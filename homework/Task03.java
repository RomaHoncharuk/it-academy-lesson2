class Task03 {
    public static void main(String[] args) {
        int c = 432521322;
        int s = c % 60;
        int min = (c - s) / 60;
        int m = min % 60;
        int h = (min - m) / 60;
        int H = h % 24;
        int d = (h - H) / 24;
        int D = d % 7;
        int W = (d - D) / 7;
        System.out.println(s);
        System.out.println(m);
        System.out.println(H);
        System.out.println(D);
        System.out.println(W);
    }
}