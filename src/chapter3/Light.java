package chapter3;

public class Light {
    public static void main(String[] args) {
        int lightSpeed = 186000;
        long days = 1000, seconds = days * 24 * 60 * 60, distance = lightSpeed * seconds;
        System.out.println("За " + days + " дней свет пройдет около " + distance + " миль.");
    }
}
