import java.util.Random;

public class Philosopher extends Thread {

    public static boolean eat_0 = false;
    public static boolean eat_1 = false;
    public static boolean eat_2 = false;
    public static boolean eat_3 = false;
    public static boolean eat_4 = false;

    public void run(){
        while(1==1) {
            String state = String.valueOf(s.thinking);
            System.out.println("Philosopher #" + this.getName().substring(7) + " is thinking");
            Random random = new Random();
            try {
                sleep(random.nextInt(10000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            state = String.valueOf(s.waiting);
            int starvation = 0;
            while(state.equals(String.valueOf(s.waiting))) {
                System.out.println("Philosopher #" + this.getName().substring(7) + " has been waiting for " + starvation + " seconds");
                starvation++;
                if(this.getName().substring(7).equals("0")) {
                    if(eat_1 == false && eat_4 == false) {
                        eat_0 = true;
                        state = String.valueOf(s.eating);
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is eating");
                        try {
                            sleep(random.nextInt(5000));
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        state = String.valueOf(s.thinking);
                        eat_0 = false;
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is thinking");
                        starvation = 0;
                    }
                    else {
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                else if(this.getName().substring(7).equals("1"))  {
                    if(eat_0 == false && eat_2 == false) {
                        eat_1 = true;
                        state = String.valueOf(s.eating);
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is eating");
                        try {
                            sleep(random.nextInt(5000));
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        state = String.valueOf(s.thinking);
                        eat_1 = false;
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is thinking");
                        starvation = 0;
                    }
                    else {
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                else if(this.getName().substring(7).equals("2")) {
                    if(eat_1 == false && eat_3 == false) {
                        eat_2 = true;
                        state = String.valueOf(s.eating);
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is eating");
                        try {
                            sleep(random.nextInt(5000));
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        state = String.valueOf(s.thinking);
                        eat_2 = false;
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is thinking");
                        starvation = 0;
                    }
                    else {
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                else if(this.getName().substring(7).equals("3")) {
                    if(eat_2 == false && eat_4 == false) {
                        eat_3 = true;
                        state = String.valueOf(s.eating);
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is eating");
                        try {
                            sleep(random.nextInt(5000));
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        state = String.valueOf(s.thinking);
                        eat_3 = false;
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is thinking");
                        starvation = 0;
                    }
                    else {
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                else if(this.getName().substring(7).equals("4")) {
                    if(eat_3 == false && eat_0 == false) {
                        eat_4 = true;
                        state = String.valueOf(s.eating);
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is eating");
                        try {
                            sleep(random.nextInt(5000));
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        state = String.valueOf(s.thinking);
                        eat_4 = false;
                        System.out.println("Philosopher #" + this.getName().substring(7) + " is thinking");
                        starvation = 0;
                    }
                    else {
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Philosopher P0 = new Philosopher();
        Philosopher P1 = new Philosopher();
        Philosopher P2 = new Philosopher();
        Philosopher P3 = new Philosopher();
        Philosopher P4 = new Philosopher();
        P0.start();
        P1.start();
        P2.start();
        P3.start();
        P4.start();
    }

}
