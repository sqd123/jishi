
public class Solution {
	
	/**
	 * 
	 * @param m整数
	 * @param n整数
	 * @return
	 */
	public int countBitDiff(int m,int n){
		int count=0;
		String str1 =null;
		String str2 =null;
		str1=Integer.toBinaryString(m);
		str2=Integer.toBinaryString(n);
		for(int i=0;i<32;i++){
			if (str1.length()<i+1) {
				str1="0"+str1;
			}if (str2.length()<i+1) {
				str2="0"+str2;
			}
		}
		for (int i = 0; i < 32; i++) {
			if (str1.charAt(i)!=str2.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]){
		Solution s =new Solution();
		System.out.println(s.countBitDiff(1999, 2299));
	}
}
