class ParkingSystem {
    int[] limits;
    public ParkingSystem(int big, int medium, int small) {
        this.limits = new int[]{big, medium,small};
    }
    
    public boolean addCar(int carType) {
        this.limits[carType-1]--;
        if(this.limits[carType-1] < 0) return false;
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */