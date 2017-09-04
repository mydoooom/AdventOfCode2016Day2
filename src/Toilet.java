public class Toilet {

    public int[][] numpad = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    private int currentXPosition;
    private int currentYPosition;

    public Toilet() {
        this.currentXPosition = 1;
        this.currentYPosition = 1;
    }

    /**
     * @param directions
     * @return Returns a number of a key
     */
    public int keyNum(String directions) {

        char[] direction = directions.toCharArray();

        for (int i = 0; i < direction.length; i++) {
                switch (direction[i]) {
                    case 'U':
                        if (currentYPosition != 0)
                            currentYPosition -= 1;
                            break;
                    case 'D':
                        if (currentYPosition != 2)
                            currentYPosition += 1;
                            break;
                    case 'L':
                        if (currentXPosition != 0)
                            currentXPosition -= 1;
                            break;
                    case 'R':
                        if (currentXPosition != 2)
                        currentXPosition += 1;
                        break;
                }
        }
        return numpad[currentYPosition][currentXPosition];
    }

}

