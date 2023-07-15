public class BonusMilesService {
    public int calculate(int price) {

        int miles = price * 5 / 100;
        return miles;
    }
}
