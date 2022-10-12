public class BmiService {
    public float calculate(int height, float weight) {
        // height (рост) в см
        // weight (вес) в кг
        return weight * 10000 / (height * height);
    }
}
