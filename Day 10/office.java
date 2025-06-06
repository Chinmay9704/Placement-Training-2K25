interface hr {
    int a = 10;
    void display();
}

class office implements hr {
    public void display() {
        System.out.println("This is Data Member of Interface " + a);
    }
    
    public static void main(String[] args) {
        office o = new office();
        o.display();
    }
}