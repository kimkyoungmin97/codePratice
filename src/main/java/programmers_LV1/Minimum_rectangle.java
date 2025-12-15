package programmers_LV1;
//프로그래머스(최소 직사각형)
public class Minimum_rectangle {
	public static void main(String[] args) {
		int answer = 0;
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
	    int[][] arr = sortArr(sizes);
	    answer = getWallet(arr);
	    System.out.println(answer);
	}
	
	private static int[][] sortArr(int[][] sizes) {
        int temp = 0;
        for(int i = 0; i < sizes.length; ++i) {
            if(sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        return sizes;
	}
    private static int getWallet(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        for(int i = 0; i <sizes.length; ++i) {
            if(maxW < sizes[i][0]){
                maxW = sizes[i][0];
            }
            if(maxH < sizes[i][1]){
                maxH = sizes[i][1];
            }
        }
        return maxW * maxH;
        
    }

}
