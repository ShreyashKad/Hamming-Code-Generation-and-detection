# Hamming-Code-Generation-and-detection
Java program to generate hamming code and to detect one bit error using hamming code (Even Parity)


Hamming code is a set of error-correction codes that can be used to detect and correct the errors that can occur when the data is moved or stored from the sender to the receiver. It is technique developed by R.W. Hamming for error correction.

Redundant bits –

Redundant bits are extra binary bits that are generated and added to the information-carrying bits of data transfer to ensure that no bits were lost during the data transfer.
The number of redundant bits can be calculated using the following formula:
2^r > m + r + 1 
 where, r = redundant bit, m = data bit
Suppose the number of data bits is 7, then the number of redundant bits can be calculated using:
= 2^4 > 7 + 4 + 1
Thus, the number of redundant bits= 4
