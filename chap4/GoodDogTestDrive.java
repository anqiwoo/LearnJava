class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(85);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println(one.getSize());
        one.bark();
        System.out.println(two.getSize());
        two.bark();
        System.out.println(one.test);
    }
}
