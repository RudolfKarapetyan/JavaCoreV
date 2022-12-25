package chapter4;

public class HexByte {
    public static void main(String[] args) {
        char[] hex = {
                'о', '1', '2', '3',
                '4', '5', '6', '7',
                '8', '9', 'а', 'b',
                'с', 'd', 'е', 'f',
        };
        byte b = (byte) 0xfl;
        System.out.println("b = Ох" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
