package awais;
import java.util.* ;

 public class Cipher
 {
public static void main ( String args [])
 {
 int shift,i,n ;
 ;
 String str2 = "" ;
 char ch3,ch4 ;
 str1 = "GPEYWXLEP MW AIPP ORSAR JSV XLI SPH \r\n " +
 "GPEYWXLEP YRMZIVWMXC SJ XIGLRSPSKC ERH MXW QEKRMJMGIRX FYMPHMRKW, \r\n " +
 "ALMPI DIPPIVJIPH MW E XCTMGEP XSYVMWX VIWSVX JSV LMOIVW ERH AMRXIV \r\n " +
"WTSVXWQIR." ;
 System . out . println ( "Encrypted text is:" ) ;
 System . out . println ( str1 ) ;
 str1 = str1. toLowerCase () ;
 System . out . println ( "Value by which each letter of the string is to be shifted:" ) ;
 shift = 4 ;
 System . out . println ( shift ) ;
 System . out . println ( "Decrypted text is: " ) ;

 char ch2 [] = str1. toCharArray () ;
 for ( i = 0 ; i < str1. length () ; i ++ )
 {
	 if ( Character . isLetter ( ch2 [ i ]))
 {
 if ((( int ) ch2 [ i ] - shift ) < 97 )
 {
 ch4 = ( char )((( int ) ch2 [ i ] - shift - 97 + 26 ) % 26 + 97 ) ;
 }
 else
 {
 ch4 = ( char )((( int ) ch2 [ i ] - shift - 97 ) % 26 + 97 ) ;
 }
 str2 = str2 + ch4 ;
 }

 else if ( ch2 [ i ] == ' ' )
 {
 str2 = str2 + ch2 [ i ] ;
 }
	 }
System . out . println ( str2 ) ;
 }
 }