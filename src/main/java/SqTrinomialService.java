public class SqTrinomialService {
    private SqTrinomial trinomial;
    public SqTrinomialService(SqTrinomial trinomial){
        this.trinomial = trinomial;
    }
    public double maxRoots() {
        double roots[] = trinomial.solveEq();
        if (roots == null) {
            throw new IllegalArgumentException("Not roots");
        }
        if (roots[0] >= roots[1]) {
            return roots[0];
        }
        else {
            return roots[1];
        }
    }
}
