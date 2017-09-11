package com.test;

public class TestIntToByte {
	public static void main(String[] args) {
		Integer i = 256;
		byte s = 92;
		System.out.println(i>>8); // right shift means  2^8(this number here 8) and divied by that number
		System.out.println(s<<2); // left shift means  2^2(this number here 2) and multiply by that number
		
		
		System.out.println((byte)s<<24);
		
		// System.out.println(i.bitCount(paramInt));
		byte a1[] = intToByteArray(s);
		
		byte a[] = intToByteArray(1544200000);
		for (byte single : a) {
			System.out.print(single);
		}
		System.out.println(fromByteArray(a));
		
		// 1543503872 655360 40704 64
		int2byte(1540);
	}

	public static byte[] intToByteArray(int value) {
		return new byte[] { (byte) (value >>> 24), (byte) (value >>> 16), (byte) (value >>> 8), (byte) value };
	}

	public static int fromByteArray(byte[] bytes) {
		return bytes[0] << 24 | (bytes[1] & 0xFF) << 16 | (bytes[2] & 0xFF) << 8 | (bytes[3] & 0xFF);
	}
	
	 private static byte[] int2byte(
	            int number) {
	        if ((number & 0xFF) == number) {   // 1540 >    0001 0101 0100 0000  &&  0000 0000 1111 1111  == 0100
	            return new byte[]{(byte) (number)};
	        }
	        if ((number & 0xFFFF) == number) {   // 1540 >    0001 0101 0100 0000  && 1111 1111 1111 1111  ==  0001 0101 0100 0000 i.e. 1540
	            return new byte[]{(byte) (number >>> 8),
	                (byte) (number)};
	        }
	        if ((number & 0xFFFFFF) == number) {
	            return new byte[]{(byte) (number >>> 16),
	                (byte) (number >>> 8),
	                (byte) (number)};
	        }
	        if ((number & 0xFFFFFFFF) == number) {
	            return new byte[]{(byte) (number >>> 24),
	                (byte) (number >>> 16),
	                (byte) (number >>> 8),
	                (byte) (number)};
	        } else {
	            return new byte[]{(byte) (0)};
	        }
	    }

}
