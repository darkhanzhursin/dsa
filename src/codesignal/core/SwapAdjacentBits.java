package codesignal.core;
/*
For n = 13, the output should be
solution(n) = 14.

1310 = 11012 ~> {11}{01}2 ~> 11102 = 1410.

For n = 74, the output should be
solution(n) = 133.

7410 = 010010102 ~> {01}{00}{10}{10}2 ~> 100001012 = 13310.
 */
public class SwapAdjacentBits {

    /*
    Binary Masks:

0x55555555: This hexadecimal mask represents the binary number 01010101010101010101010101010101. It's used to extract the odd-indexed bits from the input integer n.
0xAAAAAAAA: This hexadecimal mask represents the binary number 10101010101010101010101010101010. It's used to extract the even-indexed bits from n.

Extracting Even and Odd Bits:
(n & 0x55555555): This bitwise AND operation with 0x55555555 extracts the odd-indexed bits from n.
(n & 0xAAAAAAAA): This bitwise AND operation with 0xAAAAAAAA extracts the even-indexed bits from n.

Shifting Bits:
((n & 0x55555555) << 1): This shifts the extracted odd-indexed bits one position to the left, effectively moving them into the even-indexed positions.
((n & 0xAAAAAAAA) >>> 1): This shifts the extracted even-indexed bits one position to the right, effectively moving them into the odd-indexed positions. We use the unsigned right shift operator >>> to fill the vacated position with a zero.

Combining Bits:
|: This bitwise OR operation combines the shifted even-indexed bits and shifted odd-indexed bits, effectively swapping adjacent bits in pairs.

Return:
The result of the bitwise OR operation is returned, which represents the integer with its bits swapped in pairs.
By performing these bitwise operations, the solution efficiently swaps adjacent bits in pairs within the input integer n.
     */
    int solution(int n) {
        return ((n & 0x55555555) << 1) | ((n & 0xAAAAAAAA) >>> 1);
    }

}
