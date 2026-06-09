package OverlApping;


public class SineWave {
    public static void main(String[] args) throws InterruptedException {
        final int WIDTH = 80;
        final int HEIGHT = 24;
        final double AMPLITUDE = (HEIGHT / 2.0) - 1;
        final double FREQUENCY = 0.2;
        double offset = 0;

        while (true) {
            StringBuilder frame = new StringBuilder();

            // Move cursor to top-left without clearing (flicker-free)
            frame.append("\033[H");

            for (int row = 0; row < HEIGHT; row++) {
                for (int col = 0; col < WIDTH; col++) {
                    double y = AMPLITUDE * Math.sin(FREQUENCY * col + offset);
                    int waveRow = (int) Math.round(AMPLITUDE + y);

                    if (row == waveRow) {
                        // Color gradient based on position
                        int r = (int) (128 + 127 * Math.sin(FREQUENCY * col + offset));
                        int g = (int) (128 + 127 * Math.sin(FREQUENCY * col + offset + 2));
                        int b = (int) (128 + 127 * Math.sin(FREQUENCY * col + offset + 4));
                        frame.append(String.format("\033[38;2;%d;%d;%dm█\033[0m", r, g, b));
                    } else if (row == HEIGHT / 2) {
                        frame.append("\033[90m·\033[0m"); // dim center axis
                    } else {
                        frame.append(' ');
                    }
                }
                frame.append('\n');
            }

            System.out.print(frame);
            offset += 0.15;
            Thread.sleep(40); // ~25 FPS
        }
    }
}

