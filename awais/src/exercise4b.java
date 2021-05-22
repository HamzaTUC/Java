public class exercise4b {
 public static void main ( String [] args ) throws Exception {
 String message = "I love your red car!" ;
String key = "041d07455719055a5a184f14544d151a1759420c171e60211155803a3e9edef1" ;

System . out . println ( "Encryption:" + hexToStr ( xorHex ( str2Hex ( message ) ,key ))) ;
}

public static String xorHex ( String a, String b ) {
 // TODO: Validation
 char [] chars = new char [ a. length ()] ;
 for ( int i = 0 ; i < chars. length ; i ++ ) {
 chars [ i ] = toHex ( fromHex ( a. charAt ( i )) ^
fromHex ( b. charAt ( i ))) ;
 }
 return new String ( chars ) ;
 }

 private static int fromHex ( char c ) {
if ( c >= '0' && c <= '9' ) {
return c - '0' ;
 }
 if ( c >= 'A' && c <= 'F' ) {
 return c - 'A' + 10 ;
 }
 if ( c >= 'a' && c <= 'f' ) {
 return c - 'a' + 10 ;
 }
 throw new IllegalArgumentException () ;
 }

 private static char toHex ( int nybble ) {
 if ( nybble < 0 || nybble > 15 ) {
 throw new IllegalArgumentException () ;
 }
 return "0123456789ABCDEF" . charAt ( nybble ) ;
 }

 public static String str2Hex ( String bin ) {
 char [] digital = "0123456789ABCDEF" . toCharArray () ;
 StringBuffer sb = new StringBuffer ( "" ) ;
 byte [] bs = bin. getBytes () ;
 int bit ;
 for ( int i = 0 ; i < bs. length ; i ++ ) {
 bit = ( bs [ i ] & 0x0f0 ) >> 4 ;
 sb. append ( digital [ bit ]) ;
 bit = bs [ i ] & 0x0f ;
 sb. append ( digital [ bit ]) ;
}
 return sb. toString () ;
 }

 public static String hexToStr ( String hex ) {
 String digital = "0123456789ABCDEF" ;
 char [] hex2char = hex. toCharArray () ;
 byte [] bytes = new byte [ hex. length () / 2 ] ;
 int temp ;
 for ( int i = 0 ; i < bytes. length ; i ++ ) {
 temp = digital. indexOf ( hex2char [ 2 * i ]) * 16 ;
 temp += digital. indexOf ( hex2char [ 2 * i + 1 ]) ;
 bytes [ i ] = ( byte ) ( temp & 0xff ) ;
 }
 return new String ( bytes ) ;
 }
}
