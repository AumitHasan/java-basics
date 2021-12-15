
class Quiz {
    public static void main(String[] args) throws IllegalAccessException {
        try {
            throw new IllegalAccessException("Illegal access exception");
        }
        catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }
}


